/*
 * Copyright (c) 2017, 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.svm.truffle.nfi;

import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.TargetClass;

@TargetClass(className = "com.oracle.truffle.nfi.impl.NativeArgumentBuffer", innerClass = "TypeTag", onlyWith = TruffleNFIFeature.IsEnabled.class)
final class Target_com_oracle_truffle_nfi_impl_NativeArgumentBuffer_TypeTag {
    @Alias static Target_com_oracle_truffle_nfi_impl_NativeArgumentBuffer_TypeTag OBJECT;

    @Alias static Target_com_oracle_truffle_nfi_impl_NativeArgumentBuffer_TypeTag STRING;

    @Alias static Target_com_oracle_truffle_nfi_impl_NativeArgumentBuffer_TypeTag CLOSURE;

    @Alias static Target_com_oracle_truffle_nfi_impl_NativeArgumentBuffer_TypeTag ENV;

    @Alias
    static native Target_com_oracle_truffle_nfi_impl_NativeArgumentBuffer_TypeTag getTag(int encoded);

    @Alias
    static native int getOffset(int encoded);
}
