/*
 * Copyright (c) 2008-2016 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.haulmont.cuba.security.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

/**
 * Type of access to an entity attribute.
 */
public enum EntityAttrAccess implements EnumClass<Integer> {
    DENY(0),
    VIEW(1),
    MODIFY(2);

    private int id;

    EntityAttrAccess(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static EntityAttrAccess fromId(Integer id) {
        if (id == null) return null;
        switch (id) {
            case 0: return DENY;
            case 1: return VIEW;
            case 2: return MODIFY;
            default: return null;
        }
    }
}