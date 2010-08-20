/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

#define SSLv2_CIPHER_COUNT 7
char *SSLv2_SpecNames[SSLv2_CIPHER_COUNT] = { "SSL_CK_RC4_128_WITH_MD5", "SSL_CK_RC4_128_EXPORT40_WITH_MD5", "SSL_CK_RC2_128_CBC_WITH_MD5", 
    "SSL_CK_RC2_128_CBC_EXPORT40_WITH_MD5", "SSL_CK_IDEA_128_CBC_WITH_MD5", "SSL_CK_DES_64_CBC_WITH_MD5", "SSL_CK_DES_192_EDE3_CBC_WITH_MD5" };

char *SSLv2_openSSLNames[SSLv2_CIPHER_COUNT] = { "RC4-MD5", "EXP-RC4-MD5", "RC2-MD5", "EXP-RC2-MD5", "IDEA-CBC-MD5", "DES-CBC-MD5", "DES-CBC3-MD5" };

#define SSLv3_CIPHER_COUNT 21
char *SSLv3_SpecNames[SSLv3_CIPHER_COUNT] = { "SSL_RSA_WITH_NULL_MD5", "SSL_RSA_WITH_NULL_SHA", "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 
    "SSL_RSA_WITH_RC4_128_MD5", "SSL_RSA_WITH_RC4_128_SHA", "SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5", "SSL_RSA_WITH_IDEA_CBC_SHA", 
    "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", "SSL_RSA_WITH_DES_CBC_SHA", "SSL_RSA_WITH_3DES_EDE_CBC_SHA", "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 
    "SSL_DHE_DSS_WITH_DES_CBC_SHA", "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "SSL_DHE_RSA_WITH_DES_CBC_SHA", 
    "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", "SSL_DH_anon_WITH_RC4_128_MD5", "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 
    "SSL_DH_anon_WITH_DES_CBC_SHA", "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA" };

char *SSLv3_openSSLNames[SSLv3_CIPHER_COUNT] = { "NULL-MD5", "NULL-SHA", "EXP-RC4-MD5", "RC4-MD5", "RC4-SHA", "EXP-RC2-CBC-MD5", "IDEA-CBC-SHA", 
    "EXP-DES-CBC-SHA", "DES-CBC-SHA", "DES-CBC3-SHA", "EXP-EDH-DSS-DES-CBC-SHA", "EDH-DSS-CBC-SHA", "EDH-DSS-DES-CBC3-SHA", "EXP-EDH-RSA-DES-CBC-SHA", 
    "EDH-RSA-DES-CBC-SHA", "EDH-RSA-DES-CBC3-SHA", "EXP-ADH-RC4-MD5", "ADH-RC4-MD5", "EXP-ADH-DES-CBC-SHA", "ADH-DES-CBC-SHA", "ADH-DES-CBC3-SHA" };

#define TLSv1_CIPHER_COUNT 50
char *TLSv1_SpecNames[TLSv1_CIPHER_COUNT] = { "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", 
    "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_RC2_CBC_40_MD5", "TLS_RSA_WITH_IDEA_CBC_SHA", 
    "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 
    "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_DES_CBC_SHA", 
    "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 
    "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", 
    "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 
    "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 
    "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 
    "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA", "TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA", 
    "TLS_RSA_WITH_SEED_CBC_SHA", "TLS_DHE_DSS_WITH_SEED_CBC_SHA", "TLS_DHE_RSA_WITH_SEED_CBC_SHA", "TLS_DH_anon_WITH_SEED_CBC_SHA", 
    "TLS_GOSTR341094_WITH_28147_CNT_IMIT", "TLS_GOSTR341001_WITH_28147_CNT_IMIT", "TLS_GOSTR341094_WITH_NULL_GOSTR3411", 
    "TLS_GOSTR341001_WITH_NULL_GOSTR3411", "TLS_RSA_EXPORT1024_WITH_DES_CBC_SHA", "TLS_RSA_EXPORT1024_WITH_RC4_56_SHA", 
    "TLS_DHE_DSS_EXPORT1024_WITH_DES_CBC_SHA", "TLS_DHE_DSS_EXPORT1024_WITH_RC4_56_SHA", "TLS_DHE_DSS_WITH_RC4_128_SHA" };

char *TLSv1_openSSLNames[TLSv1_CIPHER_COUNT] = { "NULL-MD5", "NULL-SHA", "EXP-RC4-MD5", "RC4-MD5", "RC4-SHA", "EXP-RC2-CBC-MD5", "IDEA-CBC-SHA", 
    "EXP-DES-CBC-SHA", "DES-CBC-SHA", "DES-CBC3-SHA", "EXP-EDH-DSS-DES-CBC-SHA", "EDH-DSS-CBC-SHA", "EDH-DSS-DES-CBC3-SHA", "EXP-EDH-RSA-DES-CBC-SHA", 
    "EDH-RSA-DES-CBC-SHA", "EDH-RSA-DES-CBC3-SHA", "EXP-ADH-RC4-MD5", "ADH-RC4-MD5", "EXP-ADH-DES-CBC-SHA", "ADH-DES-CBC-SHA", "ADH-DES-CBC3-SHA", 
    "AES128-SHA", "AES256-SHA", "DHE-DSS-AES128-SHA", "DHE-DSS-AES256-SHA", "DHE-RSA-AES128-SHA", "DHE-RSA-AES256-SHA", "ADH-AES128-SHA", 
    "ADH-AES256-SHA", "CAMELLIA128-SHA", "CAMELLIA256-SHA", "DHE-DSS-CAMELLIA128-SHA", "DHE-DSS-CAMELLIA256-SHA", "DHE-RSA-CAMELLIA128-SHA", 
    "DHE-RSA-CAMELLIA256-SHA", "ADH-CAMELLIA128-SHA", "ADH-CAMELLIA256-SHA", "SEED-SHA", "DHE-DSS-SEED-SHA", "DHE-RSA-SEED-SHA", "ADH-SEED-SHA", 
    "GOST94-GOST89-GOST89", "GOST2001-GOST89-GOST89", "GOST94-NULL-GOST94", "GOST2001-NULL-GOST94", "EXP1024-DES-CBC-SHA", "EXP1024-RC4-SHA", 
    "EXP1024-DHE-DSS-DES-CBC-SHA", "EXP1024-DHE-DSS-RC4-SHA", "DHE-DSS-RC4-SHA" };
