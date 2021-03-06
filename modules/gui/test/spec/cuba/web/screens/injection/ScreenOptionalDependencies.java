/*
 * Copyright (c) 2008-2018 Haulmont.
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
 */

package spec.cuba.web.screens.injection;

import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.TextInputField;
import com.haulmont.cuba.gui.screen.Install;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;

public class ScreenOptionalDependencies extends Screen {

    @Autowired(required = false)
    protected TextField<String> textField;

    @Subscribe(id = "textField", required = false)
    protected void onTextChange(TextInputField.TextChangeEvent event) {

    }

    @Install(to = "label", subject = "formatter", required = false)
    protected String formatValue(Integer value) {
        return "";
    }
}