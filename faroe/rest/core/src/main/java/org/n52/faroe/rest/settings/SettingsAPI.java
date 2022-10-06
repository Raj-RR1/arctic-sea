/*
 * Copyright (C) 2015-2022 52°North Spatial Information Research GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.faroe.rest.settings;

import java.util.Collection;
import java.util.Set;

import org.n52.faroe.SettingDefinition;
import org.n52.faroe.SettingValue;

public interface SettingsAPI {

    Collection<SettingValue<?>> getSettingValues();

    Collection<SettingDefinition<?>> getSettingDefinitions();

    Set<String> getGroups();

    Collection<SettingDefinition<?>> getSettingsByTitle(String groupTitle);

    void addSettingDefinitions(Collection<SettingDefinition<?>> group);

    void updateSettingValue(SettingValue<?> group);

    void deleteSettingValue(String setting);

    Collection<SettingValue<?>> getSettingValuesByGroup(String title);
}
