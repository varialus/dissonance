#!/bin/sh
#!
# @file ./getsvndata.sh
#
# @brief Report unique list of all versions of all source files
# compiled into a binary.
#
# Generate report of all versions of source files that have been
# compiled and are found in a compiled object file or a linked binary.
# A sorted, unique list of URL-based file names and revision numbers
# is displayed, showing @e exactly which revisions of which files
# are present in the binary.
#
# @note Notice that there should @e never be two different revisions
#       of @e any file found in a static or dynamic library.  However,
#       a linked binary @e may have such difference, either by design
#       or accidentally.  Use @link
#       ./getsvndups.sh getsvndups.sh@endlink
#       to show this type of analysis.
#
# The @link #ARCH_HEADER_COPYRIGHT_APACHE() ARCH_HEADER_COPYRIGHT_APACHE@endlink
# and
# @link #ARCH_SOURCE_COPYRIGHT_APACHE() ARCH_SOURCE_COPYRIGHT_APACHE@endlink
# macros generate the appropriate data from the expansion of SubVersion
# (SVN) keywords that are stored in a static string in each compiled
# object file.  This data is promoted at link time to be stored in the
# linked binary explicitly for use by this reporting script.
#
# @see getsvndups.sh
#
# @todo  HARMONY-6-getsvndata.sh-1 A Windows .BAT version of this
#        script needs to be written
#
#
# @section Control
#
# \$URL$
#
# \$Id$
#
# Copyright 2005 The Apache Software Foundation
# or its licensors, as applicable.
#
# Licensed under the Apache License, Version 2.0 ("the License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
# either express or implied.
#
# See the License for the specific language governing permissions
# and limitations under the License.
#
# @version \$LastChangedRevision$
#
# @date \$LastChangedDate$
#
# @author \$LastChangedBy$
#
#         Original code contributed by Daniel Lydick on 09/28/2005.
#
# @section Reference
#
#/ /* 
# (Use  #! and #/ with dox_filter.sh to fool Doxygen into
# parsing this non-source text file for the documentation set.
# Use the above open comment to force termination of parsing
# since it is not a Doxygen-style 'C' comment.)
#
#
########################################################################
#
# Script setup
#
# `dirname $0` for shells without that utility
PGMDIR=`expr "${0:-.}/" : '\(/\)/*[^/]*//*$'  \| \
             "${0:-.}/" : '\(.*[^/]\)//*[^/][^/]*//*$' \| .`
PGMDIR=`cd $PGMDIR; pwd`

. $PGMDIR/config/config_build_steps.sh

########################################################################
#
# Check script syntax
#
if test 0 -eq $#
then
    echo "Usage:  $0 object_or_binary_filename [...]"
    exit 1
fi
 
########################################################################
#
# Scan requested file(s) and report SVN 
#
DOLLAR='$'
SEARCHFOR="^\\\$URL: |^\\\$HeadURL: "

strings $* | sed "s,$CONFIG_REPOSITORY,," | \
             egrep "$SEARCHFOR" | \
             sort -u | \
             cut -f2,6 -d' '

########################################################################
#
# EOF
