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

package java.util.regex;

/**
 * This class gives us a hashtable that contains information about
 * symbols that are one symbol decompositions that is 
 * generated from
 * http://www.unicode.org/Public/4.0-Update/UnicodeData-4.0.0.txt.
 */
class SingleDecompositions{

    private static IntHash table = null;

    private SingleDecompositions() {
    }

    public static IntHash getHashSingleDecompositions() {
        if (table != null) {
            return table;
        } else {
            table = new IntHash(1030);
            table.put(0x6688, 0);
            table.put(0x00B7, 0);
            table.put(0x86A9, 0);
            table.put(0x00B4, 0);
            table.put(0x7409, 0);
            table.put(0x559D, 0);
            table.put(0x884C, 0);
            table.put(0x523B, 0);
            table.put(0x6DCB, 0);
            table.put(0x8AFE, 0);
            table.put(0x523A, 0);
            table.put(0x7406, 0);
            table.put(0x53F1, 0);
            table.put(0x5599, 0);
            table.put(0x6F6E, 0);
            table.put(0x8AF8, 0);
            table.put(0x3862, 0);
            table.put(0x5B28, 0);
            table.put(0x53EB, 0);
            table.put(0x2300A, 0);
            table.put(0x9929, 0);
            table.put(0x9928, 0);
            table.put(0x6674, 0);
            table.put(0x8046, 0);
            table.put(0x53E5, 0);
            table.put(0x8AED, 0);
            table.put(0x2054B, 0);
            table.put(0x5229, 0);
            table.put(0x64C4, 0);
            table.put(0x278AE, 0);
            table.put(0x53DF, 0);
            table.put(0x5587, 0);
            table.put(0x2335F, 0);
            table.put(0x5584, 0);
            table.put(0x92D8, 0);
            table.put(0x92D7, 0);
            table.put(0x5E74, 0);
            table.put(0x774A, 0);
            table.put(0x911B, 0);
            table.put(0x81ED, 0);
            table.put(0x78FB, 0);
            table.put(0x5CC0, 0);
            table.put(0x7740, 0);
            table.put(0x81E8, 0);
            table.put(0x9111, 0);
            table.put(0x9D67, 0);
            table.put(0x5217, 0);
            table.put(0x2A20E, 0);
            table.put(0x5B08, 0);
            table.put(0x5E69, 0);
            table.put(0x8AD6, 0);
            table.put(0x267B5, 0);
            table.put(0x412F, 0);
            table.put(0x53CA, 0);
            table.put(0x8AD2, 0);
            table.put(0x881F, 0);
            table.put(0x53C3, 0);
            table.put(0x2940A, 0);
            table.put(0x8ACB, 0);
            table.put(0x256C5, 0);
            table.put(0x4BCE, 0);
            table.put(0x81D8, 0);
            table.put(0x5207, 0);
            table.put(0x267A7, 0);
            table.put(0x3AE4, 0);
            table.put(0x5203, 0);
            table.put(0x5563, 0);
            table.put(0x7295, 0);
            table.put(0x20525, 0);
            table.put(0x6649, 0);
            table.put(0x23F8E, 0);
            table.put(0x382F, 0);
            table.put(0x295B6, 0);
            table.put(0x67FA, 0);
            table.put(0x8ABF, 0);
            table.put(0x2051C, 0);
            table.put(0x03CE, 0);
            table.put(0x67F3, 0);
            table.put(0x9EFE, 0);
            table.put(0x03CD, 0);
            table.put(0x03CC, 0);
            table.put(0x5555, 0);
            table.put(0x5553, 0);
            table.put(0x771F, 0);
            table.put(0x8801, 0);
            table.put(0x771E, 0);
            table.put(0x446B, 0);
            table.put(0x7280, 0);
            table.put(0x9EF9, 0);
            table.put(0x8005, 0);
            table.put(0x70D9, 0);
            table.put(0x8363, 0);
            table.put(0x8001, 0);
            table.put(0x5FF9, 0);
            table.put(0x6F23, 0);
            table.put(0x6F22, 0);
            table.put(0x8C55, 0);
            table.put(0x5E3D, 0);
            table.put(0x5FF5, 0);
            table.put(0x8AAA, 0);
            table.put(0x78CC, 0);
            table.put(0x78CA, 0);
            table.put(0x4D56, 0);
            table.put(0x6190, 0);
            table.put(0x8AA0, 0);
            table.put(0x618E, 0);
            table.put(0x03B9, 0);
            table.put(0x56F9, 0);
            table.put(0x273CA, 0);
            table.put(0x70C8, 0);
            table.put(0x8353, 0);
            table.put(0x8C48, 0);
            table.put(0x8352, 0);
            table.put(0x03B0, 0);
            table.put(0x25044, 0);
            table.put(0x7701, 0);
            table.put(0x03AF, 0);
            table.put(0x03AE, 0);
            table.put(0x6F0F, 0);
            table.put(0x03AD, 0);
            table.put(0x03AC, 0);
            table.put(0x5E28, 0);
            table.put(0x8F9E, 0);
            table.put(0x3009, 0);
            table.put(0x7262, 0);
            table.put(0x3008, 0);
            table.put(0x23F5E, 0);
            table.put(0x8DF0, 0);
            table.put(0x03A9, 0);
            table.put(0x42A0, 0);
            table.put(0x5099, 0);
            table.put(0x262D9, 0);
            table.put(0x617A, 0);
            table.put(0x6613, 0);
            table.put(0x84FC, 0);
            table.put(0x8DEF, 0);
            table.put(0x5FD7, 0);
            table.put(0x26D6B, 0);
            table.put(0x27CA8, 0);
            table.put(0x9ECE, 0);
            table.put(0x22B0C, 0);
            table.put(0x3C4E, 0);
            table.put(0x84F3, 0);
            table.put(0x25C80, 0);
            table.put(0x45F9, 0);
            table.put(0x84F1, 0);
            table.put(0x70AD, 0);
            table.put(0x5FCD, 0);
            table.put(0x7250, 0);
            table.put(0x4EE4, 0);
            table.put(0x8336, 0);
            table.put(0x84EE, 0);
            table.put(0x6168, 0);
            table.put(0x9415, 0);
            table.put(0x24735, 0);
            table.put(0x6160, 0);
            table.put(0x9EBB, 0);
            table.put(0x507A, 0);
            table.put(0x5510, 0);
            table.put(0x8688, 0);
            table.put(0x8323, 0);
            table.put(0x7CE8, 0);
            table.put(0x8DCB, 0);
            table.put(0x7CE7, 0);
            table.put(0x7CE3, 0);
            table.put(0x4ECC, 0);
            table.put(0x831D, 0);
            table.put(0x7235, 0);
            table.put(0x45D7, 0);
            table.put(0x95B7, 0);
            table.put(0x5FAD, 0);
            table.put(0x614E, 0);
            table.put(0x614C, 0);
            table.put(0x7B20, 0);
            table.put(0x6942, 0);
            table.put(0x4EC0, 0);
            table.put(0x585E, 0);
            table.put(0x5FA9, 0);
            table.put(0x8DBC, 0);
            table.put(0x585A, 0);
            table.put(0x722B, 0);
            table.put(0x6148, 0);
            table.put(0x8F62, 0);
            table.put(0x23A8D, 0);
            table.put(0x7CD6, 0);
            table.put(0x9756, 0);
            table.put(0x95AD, 0);
            table.put(0x62FE, 0);
            table.put(0x6144, 0);
            table.put(0x62FC, 0);
            table.put(0x7CD2, 0);
            table.put(0x7228, 0);
            table.put(0x73DE, 0);
            table.put(0x25AA7, 0);
            table.put(0x440B, 0);
            table.put(0x8669, 0);
            table.put(0x34DF, 0);
            table.put(0x649D, 0);
            table.put(0x8667, 0);
            table.put(0x3C18, 0);
            table.put(0x649A, 0);
            table.put(0x9748, 0);
            table.put(0x721B, 0);
            table.put(0x98FC, 0);
            table.put(0x4EAE, 0);
            table.put(0x6D85, 0);
            table.put(0x865C, 0);
            table.put(0x5840, 0);
            table.put(0x20804, 0);
            table.put(0x90FD, 0);
            table.put(0x7210, 0);
            table.put(0x7CBE, 0);
            table.put(0x7570, 0);
            table.put(0x24263, 0);
            table.put(0x0060, 0);
            table.put(0x8650, 0);
            table.put(0x29B30, 0);
            table.put(0x98EF, 0);
            table.put(0x90F1, 0);
            table.put(0x6D78, 0);
            table.put(0x9732, 0);
            table.put(0x6D77, 0);
            table.put(0x51F5, 0);
            table.put(0x6A13, 0);
            table.put(0x2A392, 0);
            table.put(0x59EC, 0);
            table.put(0x5832, 0);
            table.put(0x7565, 0);
            table.put(0x5831, 0);
            table.put(0x5C8D, 0);
            table.put(0x8F3B, 0);
            table.put(0x647E, 0);
            table.put(0x2569A, 0);
            table.put(0x62D4, 0);
            table.put(0x62D3, 0);
            table.put(0x28BFA, 0);
            table.put(0x6914, 0);
            table.put(0x98E2, 0);
            table.put(0x34BB, 0);
            table.put(0x8F38, 0);
            table.put(0x6D6A, 0);
            table.put(0x73B2, 0);
            table.put(0x34B9, 0);
            table.put(0x62CF, 0);
            table.put(0x6477, 0);
            table.put(0x226D4, 0);
            table.put(0x25F86, 0);
            table.put(0x6D69, 0);
            table.put(0x9723, 0);
            table.put(0x863F, 0);
            table.put(0x004B, 0);
            table.put(0x7559, 0);
            table.put(0x502B, 0);
            table.put(0x6A02, 0);
            table.put(0x6BBB, 0);
            table.put(0x6BBA, 0);
            table.put(0x62C9, 0);
            table.put(0x8F2A, 0);
            table.put(0x7E45, 0);
            table.put(0x7E41, 0);
            table.put(0x7FFA, 0);
            table.put(0x51DE, 0);
            table.put(0x59D8, 0);
            table.put(0x8996, 0);
            table.put(0x51DC, 0);
            table.put(0x8F26, 0);
            table.put(0x73A5, 0);
            table.put(0x6108, 0);
            table.put(0x6469, 0);
            table.put(0x927C, 0);
            table.put(0x9B6F, 0);
            table.put(0x537F, 0);
            table.put(0x6BAE, 0);
            table.put(0x003B, 0);
            table.put(0x862D, 0);
            table.put(0x537D, 0);
            table.put(0x2921A, 0);
            table.put(0x898B, 0);
            table.put(0x87E1, 0);
            table.put(0x5C6E, 0);
            table.put(0x90CE, 0);
            table.put(0x9276, 0);
            table.put(0x7E37, 0);
            table.put(0x62B1, 0);
            table.put(0x8986, 0);
            table.put(0x5375, 0);
            table.put(0x51CC, 0);
            table.put(0x5373, 0);
            table.put(0x580D, 0);
            table.put(0x0390, 0);
            table.put(0x753E, 0);
            table.put(0x5C65, 0);
            table.put(0x5C64, 0);
            table.put(0x76F4, 0);
            table.put(0x21D0B, 0);
            table.put(0x40E3, 0);
            table.put(0x753B, 0);
            table.put(0x5C62, 0);
            table.put(0x5C60, 0);
            table.put(0x51C9, 0);
            table.put(0x038F, 0);
            table.put(0x038E, 0);
            table.put(0x6452, 0);
            table.put(0x038C, 0);
            table.put(0x038A, 0);
            table.put(0x6D41, 0);
            table.put(0x5AB5, 0);
            table.put(0x28D77, 0);
            table.put(0x0389, 0);
            table.put(0x7891, 0);
            table.put(0x0388, 0);
            table.put(0x0386, 0);
            table.put(0x0385, 0);
            table.put(0x265A8, 0);
            table.put(0x6D3E, 0);
            table.put(0x7099, 0);
            table.put(0x5002, 0);
            table.put(0x8612, 0);
            table.put(0x76E7, 0);
            table.put(0x788C, 0);
            table.put(0x51B7, 0);
            table.put(0x2284A, 0);
            table.put(0x51B5, 0);
            table.put(0x6D34, 0);
            table.put(0x535A, 0);
            table.put(0x3F1B, 0);
            table.put(0x7524, 0);
            table.put(0x76DB, 0);
            table.put(0x22844, 0);
            table.put(0x8606, 0);
            table.put(0x9CFD, 0);
            table.put(0x51AC, 0);
            table.put(0x8964, 0);
            table.put(0x87BA, 0);
            table.put(0x5351, 0);
            table.put(0x5DFD, 0);
            table.put(0x6797, 0);
            table.put(0x9E9F, 0);
            table.put(0x51A4, 0);
            table.put(0x6EDB, 0);
            table.put(0x5C3F, 0);
            table.put(0x707D, 0);
            table.put(0x7E09, 0);
            table.put(0x76CA, 0);
            table.put(0x5F9A, 0);
            table.put(0x7FBD, 0);
            table.put(0x5349, 0);
            table.put(0x9E97, 0);
            table.put(0x65E3, 0);
            table.put(0x7E02, 0);
            table.put(0x65E2, 0);
            table.put(0x6D1E, 0);
            table.put(0x7077, 0);
            table.put(0x3A6C, 0);
            table.put(0x6D1B, 0);
            table.put(0x6ED1, 0);
            table.put(0x93F9, 0);
            table.put(0x7070, 0);
            table.put(0x786B, 0);
            table.put(0x6785, 0);
            table.put(0x6422, 0);
            table.put(0x533F, 0);
            table.put(0x6D16, 0);
            table.put(0x54F6, 0);
            table.put(0x6ECB, 0);
            table.put(0x7506, 0);
            table.put(0x9238, 0);
            table.put(0x5DE2, 0);
            table.put(0x5F8B, 0);
            table.put(0x9234, 0);
            table.put(0x5DE1, 0);
            table.put(0x641C, 0);
            table.put(0x677B, 0);
            table.put(0x6EC7, 0);
            table.put(0x243AB, 0);
            table.put(0x2346D, 0);
            table.put(0x8941, 0);
            table.put(0x4CF8, 0);
            table.put(0x5C22, 0);
            table.put(0x958B, 0);
            table.put(0x9E7F, 0);
            table.put(0x6EBA, 0);
            table.put(0x65C5, 0);
            table.put(0x4CED, 0);
            table.put(0x4B33, 0);
            table.put(0x813E, 0);
            table.put(0x232B8, 0);
            table.put(0x9B12, 0);
            table.put(0x784E, 0);
            table.put(0x25626, 0);
            table.put(0x285ED, 0);
            table.put(0x704A, 0);
            table.put(0x5F6B, 0);
            table.put(0x2063A, 0);
            table.put(0x2597C, 0);
            table.put(0x4E86, 0);
            table.put(0x675E, 0);
            table.put(0x82E6, 0);
            table.put(0x5317, 0);
            table.put(0x82E5, 0);
            table.put(0x4E82, 0);
            table.put(0x5674, 0);
            table.put(0x5F69, 0);
            table.put(0x5C06, 0);
            table.put(0x7AEE, 0);
            table.put(0x5DBA, 0);
            table.put(0x5F62, 0);
            table.put(0x6756, 0);
            table.put(0x7C92, 0);
            table.put(0x6753, 0);
            table.put(0x3D96, 0);
            table.put(0x393A, 0);
            table.put(0x8D77, 0);
            table.put(0x4227, 0);
            table.put(0x5DB2, 0);
            table.put(0x79EB, 0);
            table.put(0x4CCE, 0);
            table.put(0x674E, 0);
            table.put(0x349E, 0);
            table.put(0x5668, 0);
            table.put(0x5306, 0);
            table.put(0x7039, 0);
            table.put(0x3A2E, 0);
            table.put(0x5305, 0);
            table.put(0x54BD, 0);
            table.put(0x43D9, 0);
            table.put(0x8910, 0);
            table.put(0x43D5, 0);
            table.put(0x5F53, 0);
            table.put(0x285D2, 0);
            table.put(0x6B9F, 0);
            table.put(0x738B, 0);
            table.put(0x26B3C, 0);
            table.put(0x7C7B, 0);
            table.put(0x26247, 0);
            table.put(0x0313, 0);
            table.put(0x7387, 0);
            table.put(0x5651, 0);
            table.put(0x23D1E, 0);
            table.put(0x456B, 0);
            table.put(0x7ACB, 0);
            table.put(0x23ED1, 0);
            table.put(0x82BD, 0);
            table.put(0x391C, 0);
            table.put(0x8103, 0);
            table.put(0x24FB8, 0);
            table.put(0x701E, 0);
            table.put(0x54A2, 0);
            table.put(0x701B, 0);
            table.put(0x737A, 0);
            table.put(0x4202, 0);
            table.put(0x71D0, 0);
            table.put(0x79CA, 0);
            table.put(0x4561, 0);
            table.put(0x82B3, 0);
            table.put(0x0301, 0);
            table.put(0x82B1, 0);
            table.put(0x0300, 0);
            table.put(0x71CE, 0);
            table.put(0x7375, 0);
            table.put(0x455D, 0);
            table.put(0x96F7, 0);
            table.put(0x96F6, 0);
            table.put(0x8457, 0);
            table.put(0x22331, 0);
            table.put(0x60E1, 0);
            table.put(0x7C60, 0);
            table.put(0x6721, 0);
            table.put(0x57F4, 0);
            table.put(0x26CD5, 0);
            table.put(0x24FA1, 0);
            table.put(0x6B79, 0);
            table.put(0x6B77, 0);
            table.put(0x7AB1, 0);
            table.put(0x26228, 0);
            table.put(0x671B, 0);
            table.put(0x4E41, 0);
            table.put(0x6B72, 0);
            table.put(0x60D8, 0);
            table.put(0x9094, 0);
            table.put(0x5F22, 0);
            table.put(0x6717, 0);
            table.put(0x27667, 0);
            table.put(0x8449, 0);
            table.put(0x96E3, 0);
            table.put(0x4E3D, 0);
            table.put(0x96E2, 0);
            table.put(0x5197, 0);
            table.put(0x9E1E, 0);
            table.put(0x5195, 0);
            table.put(0x5192, 0);
            table.put(0x85FA, 0);
            table.put(0x79AE, 0);
            table.put(0x908F, 0);
            table.put(0x4E39, 0);
            table.put(0x25133, 0);
            table.put(0x4E38, 0);
            table.put(0x4E32, 0);
            table.put(0x843D, 0);
            table.put(0x518D, 0);
            table.put(0x60C7, 0);
            table.put(0x291DF, 0);
            table.put(0x6700, 0);
            table.put(0x5180, 0);
            table.put(0x24C92, 0);
            table.put(0x7C3E, 0);
            table.put(0x907C, 0);
            table.put(0x4E26, 0);
            table.put(0x7DF4, 0);
            table.put(0x7F9A, 0);
            table.put(0x6B54, 0);
            table.put(0x21B18, 0);
            table.put(0x57CE, 0);
            table.put(0x2003, 0);
            table.put(0x2002, 0);
            table.put(0x4096, 0);
            table.put(0x5973, 0);
            table.put(0x8ED4, 0);
            table.put(0x2872E, 0);
            table.put(0x8D1B, 0);
            table.put(0x5F04, 0);
            table.put(0x452B, 0);
            table.put(0x625D, 0);
            table.put(0x7F95, 0);
            table.put(0x9072, 0);
            table.put(0x20A2C, 0);
            table.put(0x96C3, 0);
            table.put(0x5177, 0);
            table.put(0x8786, 0);
            table.put(0x25119, 0);
            table.put(0x3D33, 0);
            table.put(0x5A66, 0);
            table.put(0x2A600, 0);
            table.put(0x5A62, 0);
            table.put(0x8ECA, 0);
            table.put(0x68A8, 0);
            table.put(0x27F2F, 0);
            table.put(0x516D, 0);
            table.put(0x5606, 0);
            table.put(0x5962, 0);
            table.put(0x96B8, 0);
            table.put(0x985E, 0);
            table.put(0x7F85, 0);
            table.put(0x5169, 0);
            table.put(0x8779, 0);
            table.put(0x4E0D, 0);
            table.put(0x5168, 0);
            table.put(0x5167, 0);
            table.put(0x85CD, 0);
            table.put(0x5164, 0);
            table.put(0x8D08, 0);
            table.put(0x6E9C, 0);
            table.put(0x20122, 0);
            table.put(0x732A, 0);
            table.put(0x4FBF, 0);
            table.put(0x7F7A, 0);
            table.put(0x25BAB, 0);
            table.put(0x4FBB, 0);
            table.put(0x24814, 0);
            table.put(0x876B, 0);
            table.put(0x5954, 0);
            table.put(0x46C7, 0);
            table.put(0x5951, 0);
            table.put(0x7F79, 0);
            table.put(0x96A3, 0);
            table.put(0x7F72, 0);
            table.put(0x6CE5, 0);
            table.put(0x5154, 0);
            table.put(0x3781, 0);
            table.put(0x5BFF, 0);
            table.put(0x46BE, 0);
            table.put(0x6599, 0);
            table.put(0x7DC7, 0);
            table.put(0x99FE, 0);
            table.put(0x6234, 0);
            table.put(0x4FAE, 0);
            table.put(0x5948, 0);
            table.put(0x514D, 0);
            table.put(0x5944, 0);
            table.put(0x6B21, 0);
            table.put(0x2219F, 0);
            table.put(0x5BF3, 0);
            table.put(0x74CA, 0);
            table.put(0x7DBE, 0);
            table.put(0x622E, 0);
            table.put(0x63E4, 0);
            table.put(0x983B, 0);
            table.put(0x99F1, 0);
            table.put(0x5145, 0);
            table.put(0x52FA, 0);
            table.put(0x5BEE, 0);
            table.put(0x5140, 0);
            table.put(0x3EB8, 0);
            table.put(0x549E, 0);
            table.put(0x52F5, 0);
            table.put(0x6CCD, 0);
            table.put(0x7669, 0);
            table.put(0x6CCC, 0);
            table.put(0x5BE7, 0);
            table.put(0x26523, 0);
            table.put(0x9038, 0);
            table.put(0x27966, 0);
            table.put(0x621B, 0);
            table.put(0x6E6E, 0);
            table.put(0x5A27, 0);
            table.put(0x3EAC, 0);
            table.put(0x88FA, 0);
            table.put(0x9829, 0);
            table.put(0x6578, 0);
            table.put(0x22183, 0);
            table.put(0x88F8, 0);
            table.put(0x6CBF, 0);
            table.put(0x7DA0, 0);
            table.put(0x6210, 0);
            table.put(0x6B04, 0);
            table.put(0x52E4, 0);
            table.put(0x5BD8, 0);
            table.put(0x216EA, 0);
            table.put(0x4046, 0);
            table.put(0x5922, 0);
            table.put(0x5D7C, 0);
            table.put(0x5A1B, 0);
            table.put(0x9023, 0);
            table.put(0x63C5, 0);
            table.put(0x63C4, 0);
            table.put(0x656C, 0);
            table.put(0x829D, 0);
            table.put(0x52DE, 0);
            table.put(0x24C36, 0);
            table.put(0x591A, 0);
            table.put(0x9818, 0);
            table.put(0x8B8A, 0);
            table.put(0x7F3E, 0);
            table.put(0x26FB1, 0);
            table.put(0x91D1, 0);
            table.put(0x6200, 0);
            table.put(0x4039, 0);
            table.put(0x238A7, 0);
            table.put(0x8291, 0);
            table.put(0x52D2, 0);
            table.put(0x88E1, 0);
            table.put(0x5D6E, 0);
            table.put(0x91CF, 0);
            table.put(0x5BC3, 0);
            table.put(0x2541D, 0);
            table.put(0x49E6, 0);
            table.put(0x8B80, 0);
            table.put(0x7642, 0);
            table.put(0x5D6B, 0);
            table.put(0x91CC, 0);
            table.put(0x980B, 0);
            table.put(0x8728, 0);
            table.put(0x99C2, 0);
            table.put(0x88DE, 0);
            table.put(0x828B, 0);
            table.put(0x3B9D, 0);
            table.put(0x6556, 0);
            table.put(0x52C9, 0);
            table.put(0x52C7, 0);
            table.put(0x88D7, 0);
            table.put(0x2A105, 0);
            table.put(0x6FFE, 0);
            table.put(0x5906, 0);
            table.put(0x719C, 0);
            table.put(0x63A9, 0);
            table.put(0x654F, 0);
            table.put(0x9C57, 0);
            table.put(0x5468, 0);
            table.put(0x88CF, 0);
            table.put(0x63A0, 0);
            table.put(0x798F, 0);
            table.put(0x798E, 0);
            table.put(0x798D, 0);
            table.put(0x91B4, 0);
            table.put(0x8279, 0);
            table.put(0x5D50, 0);
            table.put(0x7A81, 0);
            table.put(0x870E, 0);
            table.put(0x38E3, 0);
            table.put(0x4018, 0);
            table.put(0x52B3, 0);
            table.put(0x6FEB, 0);
            table.put(0x88C2, 0);
            table.put(0x66F8, 0);
            table.put(0x99A7, 0);
            table.put(0x66F4, 0);
            table.put(0x826F, 0);
            table.put(0x6E2F, 0);
            table.put(0x9DFA, 0);
            table.put(0x22BF1, 0);
            table.put(0x9C40, 0);
            table.put(0x761F, 0);
            table.put(0x797F, 0);
            table.put(0x761D, 0);
            table.put(0x5EFE, 0);
            table.put(0x5D43, 0);
            table.put(0x934A, 0);
            table.put(0x4AB2, 0);
            table.put(0x9F9C, 0);
            table.put(0x8B58, 0);
            table.put(0x52A3, 0);
            table.put(0x4008, 0);
            table.put(0x6094, 0);
            table.put(0x7610, 0);
            table.put(0x688E, 0);
            table.put(0x216A8, 0);
            table.put(0x5448, 0);
            table.put(0x80B2, 0);
            table.put(0x233D5, 0);
            table.put(0x6E1A, 0);
            table.put(0x5442, 0);
            table.put(0x5EEC, 0);
            table.put(0x02B9, 0);
            table.put(0x6885, 0);
            table.put(0x38C7, 0);
            table.put(0x9F8E, 0);
            table.put(0x80AD, 0);
            table.put(0x9F8D, 0);
            table.put(0x6881, 0);
            table.put(0x4359, 0);
            table.put(0x716E, 0);
            table.put(0x7965, 0);
            table.put(0x23CBC, 0);
            table.put(0x5438, 0);
            table.put(0x6081, 0);
            table.put(0x6FC6, 0);
            table.put(0x261DA, 0);
            table.put(0x233C3, 0);
            table.put(0x795E, 0);
            table.put(0x795D, 0);
            table.put(0x250F3, 0);
            table.put(0x250F2, 0);
            table.put(0x8B39, 0);
            table.put(0x5ED9, 0);
            table.put(0x578B, 0);
            table.put(0x55E2, 0);
            table.put(0x7956, 0);
            table.put(0x7A4F, 0);
            table.put(0x9686, 0);
            table.put(0x5ED3, 0);
            table.put(0x5ED2, 0);
            table.put(0x66C6, 0);
            table.put(0x7950, 0);
            table.put(0x7A4A, 0);
            table.put(0x5D19, 0);
            table.put(0x83F1, 0);
            table.put(0x77A7, 0);
            table.put(0x5ECA, 0);
            table.put(0x967C, 0);
            table.put(0x83EF, 0);
            table.put(0x3B49, 0);
            table.put(0x7A40, 0);
            table.put(0x4F8B, 0);
            table.put(0x541D, 0);
            table.put(0x7949, 0);
            table.put(0x5EC9, 0);
            table.put(0x7948, 0);
            table.put(0x9678, 0);
            table.put(0x4334, 0);
            table.put(0x9675, 0);
            table.put(0x4F86, 0);
            table.put(0x66B4, 0);
            table.put(0x83E7, 0);
            table.put(0x7149, 0);
            table.put(0x4F80, 0);
            table.put(0x7145, 0);
            table.put(0x8CD3, 0);
            table.put(0x793E, 0);
            table.put(0x72FC, 0);
            table.put(0x793C, 0);
            table.put(0x9DB4, 0);
            table.put(0x540F, 0);
            table.put(0x6852, 0);
            table.put(0x83DC, 0);
            table.put(0x55C2, 0);
            table.put(0x5EB6, 0);
            table.put(0x55C0, 0);
            table.put(0x5EB3, 0);
            table.put(0x9304, 0);
            table.put(0x5EB0, 0);
            table.put(0x219C8, 0);
            table.put(0x5406, 0);
            table.put(0x8CC8, 0);
            table.put(0x7498, 0);
            table.put(0x208DE, 0);
            table.put(0x8CC2, 0);
            table.put(0x8CC1, 0);
            table.put(0x792A, 0);
            table.put(0x83CC, 0);
            table.put(0x83CA, 0);
            table.put(0x55B3, 0);
            table.put(0x5EA6, 0);
            table.put(0x8B01, 0);
            table.put(0x83C9, 0);
            table.put(0x7A1C, 0);
            table.put(0x9F43, 0);
            table.put(0x7489, 0);
            table.put(0x4F60, 0);
            table.put(0x27ED3, 0);
            table.put(0x55AB, 0);
            table.put(0x7485, 0);
            table.put(0x26C36, 0);
            table.put(0x61F6, 0);
            table.put(0x964D, 0);
            table.put(0x964B, 0);
            table.put(0x61F2, 0);
            table.put(0x3B19, 0);
            table.put(0x8204, 0);
            table.put(0x83BD, 0);
            table.put(0x69EA, 0);
            table.put(0x2633E, 0);
            table.put(0x8564, 0);
            table.put(0x9F3B, 0);
            table.put(0x8201, 0);
            table.put(0x7BC9, 0);
            table.put(0x8CAB, 0);
            table.put(0x97FF, 0);
            table.put(0x7BC6, 0);
            table.put(0x24608, 0);
            table.put(0x4301, 0);
            table.put(0x20B63, 0);
            table.put(0x6C88, 0);
            table.put(0x7BC0, 0);
            table.put(0x6ADB, 0);
            table.put(0x7471, 0);
            table.put(0x7D63, 0);
            table.put(0x3B08, 0);
            table.put(0x29145, 0);
            table.put(0x83AD, 0);
            table.put(0x58F7, 0);
            table.put(0x6AD3, 0);
            table.put(0x25249, 0);
            table.put(0x58F2, 0);
            table.put(0x72C0, 0);
            table.put(0x61DE, 0);
            table.put(0x681F, 0);
            table.put(0x7D5B, 0);
            table.put(0x6383, 0);
            table.put(0x7469, 0);
            table.put(0x58EE, 0);
            table.put(0x529B, 0);
            table.put(0x2A291, 0);
            table.put(0x9199, 0);
            table.put(0x264DA, 0);
            table.put(0x962E, 0);
            table.put(0x6817, 0);
            table.put(0x601C, 0);
            table.put(0x637B, 0);
            table.put(0x29496, 0);
            table.put(0x97E0, 0);
            table.put(0x21DE6, 0);
            table.put(0x21DE4, 0);
            table.put(0x5B85, 0);
            table.put(0x745C, 0);
            table.put(0x97DB, 0);
            table.put(0x6012, 0);
            table.put(0x50E7, 0);
            table.put(0x6C67, 0);
            table.put(0x9F16, 0);
            table.put(0x58DF, 0);
            table.put(0x72AF, 0);
            table.put(0x5289, 0);
            table.put(0x9F0F, 0);
            table.put(0x58D8, 0);
            table.put(0x214E4, 0);
            table.put(0x25CD0, 0);
            table.put(0x50DA, 0);
            table.put(0x3FFC, 0);
            table.put(0x6368, 0);
            table.put(0x4635, 0);
            table.put(0x4995, 0);
            table.put(0x2A0CE, 0);
            table.put(0x9F05, 0);
            table.put(0x5717, 0);
            table.put(0x9A6A, 0);
            table.put(0x5716, 0);
            table.put(0x7447, 0);
            table.put(0x86E2, 0);
            table.put(0x236A3, 0);
            table.put(0x23AFA, 0);
            table.put(0x6AA8, 0);
            table.put(0x61B2, 0);
            table.put(0x5277, 0);
            table.put(0x50CF, 0);
            table.put(0x36FC, 0);
            table.put(0x6C4E, 0);
            table.put(0x808B, 0);
            table.put(0x5272, 0);
            table.put(0x7D2F, 0);
            table.put(0x61AF, 0);
            table.put(0x916A, 0);
            table.put(0x69A3, 0);
            table.put(0x6350, 0);
            table.put(0x4A76, 0);
            table.put(0x61A4, 0);
            table.put(0x6DF9, 0);
            table.put(0x807E, 0);
            table.put(0x7D22, 0);
            table.put(0x36EE, 0);
            table.put(0x8516, 0);
            table.put(0x58B3, 0);
            table.put(0x2339C, 0);
            table.put(0x75E2, 0);
            table.put(0x778B, 0);
            table.put(0x4A6E, 0);
            table.put(0x8070, 0);
            table.put(0x8FB6, 0);
            table.put(0x6DEA, 0);
            table.put(0x58AC, 0);
            table.put(0x23393, 0);
            table.put(0x7422, 0);
            table.put(0x8FB0, 0);
            table.put(0x633D, 0);
            table.put(0x806F, 0);
            table.put(0x669C, 0);
            table.put(0x7D10, 0);
            table.put(0x58A8, 0);
            table.put(0x8863, 0);
            table.put(0x8860, 0);
            table.put(0x26F2C, 0);
            table.put(0x00C5, 0);
            table.put(0x6691, 0);
            table.put(0x387C, 0);
            table.put(0x8060, 0);
            table.put(0x6DDA, 0);
            table.put(0x5B3E, 0);
            table.put(0x3515, 0);
            table.put(0x270D2, 0);
            table.put(0x5246, 0);
            table.put(0x7D00, 0);
            return table;
        }
    }
}
