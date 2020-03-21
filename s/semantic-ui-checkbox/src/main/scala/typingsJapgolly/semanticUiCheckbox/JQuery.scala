package typingsJapgolly.semanticUiCheckbox

import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox
import typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings
import typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings
import typingsJapgolly.semanticUiCheckbox.SemanticUI.CheckboxSettings
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`attach events`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`can change`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`can uncheck`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`is checked`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`is radio`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`is unchecked`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`set checked`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`set determinate`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`set disabled`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`set enabled`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`set indeterminate`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`set unchecked`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow check`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow determinate`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow indeterminate`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow uncheck`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.beforeChecked
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.beforeDeterminate
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.beforeIndeterminate
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.beforeUnchecked
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.check
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.className
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.debug
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.destroy
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.determinate
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.enable
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.error
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.fireOnInit
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.indeterminate
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.name
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.namespace
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.onChange
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.onChecked
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.onDeterminate
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.onDisable
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.onDisabled
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.onEnable
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.onEnabled
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.onIndeterminate
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.onUnchecked
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.performance
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.selector
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.setting
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.silent
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.toggle
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.uncheck
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.uncheckable
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("checkbox")
  var checkbox_Original: Checkbox = js.native
  def checkbox(): JQuery = js.native
  def checkbox(behavior: setting, name: beforeChecked): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = js.native
  def checkbox(
    behavior: setting,
    name: beforeChecked,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit | `false`]
  ): JQuery = js.native
  def checkbox(behavior: setting, name: beforeDeterminate): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = js.native
  def checkbox(
    behavior: setting,
    name: beforeDeterminate,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit | `false`]
  ): JQuery = js.native
  def checkbox(behavior: setting, name: beforeIndeterminate): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = js.native
  def checkbox(
    behavior: setting,
    name: beforeIndeterminate,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit | `false`]
  ): JQuery = js.native
  def checkbox(behavior: setting, name: beforeUnchecked): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = js.native
  def checkbox(
    behavior: setting,
    name: beforeUnchecked,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit | `false`]
  ): JQuery = js.native
  def checkbox(behavior: setting, name: className): ClassNameSettings = js.native
  def checkbox(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def checkbox(behavior: setting, name: debug): Boolean = js.native
  def checkbox(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def checkbox(behavior: setting, name: error): ErrorSettings = js.native
  def checkbox(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def checkbox(behavior: setting, name: fireOnInit): Boolean = js.native
  def checkbox(behavior: setting, name: fireOnInit, value: Boolean): JQuery = js.native
  def checkbox(behavior: setting, name: name): String = js.native
  def checkbox(behavior: setting, name: namespace): String = js.native
  def checkbox(behavior: setting, name: namespace, value: String): JQuery = js.native
  def checkbox(behavior: setting, name: name, value: String): JQuery = js.native
  def checkbox(behavior: setting, name: onChange): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def checkbox(
    behavior: setting,
    name: onChange,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit]
  ): JQuery = js.native
  def checkbox(behavior: setting, name: onChecked): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def checkbox(
    behavior: setting,
    name: onChecked,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit]
  ): JQuery = js.native
  def checkbox(behavior: setting, name: onDeterminate): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def checkbox(
    behavior: setting,
    name: onDeterminate,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit]
  ): JQuery = js.native
  def checkbox(behavior: setting, name: onDisable): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def checkbox(behavior: setting, name: onDisabled): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def checkbox(
    behavior: setting,
    name: onDisabled,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit]
  ): JQuery = js.native
  def checkbox(
    behavior: setting,
    name: onDisable,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit]
  ): JQuery = js.native
  def checkbox(behavior: setting, name: onEnable): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def checkbox(behavior: setting, name: onEnabled): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def checkbox(
    behavior: setting,
    name: onEnabled,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit]
  ): JQuery = js.native
  def checkbox(
    behavior: setting,
    name: onEnable,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit]
  ): JQuery = js.native
  def checkbox(behavior: setting, name: onIndeterminate): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def checkbox(
    behavior: setting,
    name: onIndeterminate,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit]
  ): JQuery = js.native
  def checkbox(behavior: setting, name: onUnchecked): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
  def checkbox(
    behavior: setting,
    name: onUnchecked,
    value: js.ThisFunction0[/* this */ typingsJapgolly.std.HTMLInputElement, Unit]
  ): JQuery = js.native
  def checkbox(behavior: setting, name: performance): Boolean = js.native
  def checkbox(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def checkbox(behavior: setting, name: selector): SelectorSettings = js.native
  def checkbox(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def checkbox(behavior: setting, name: silent): Boolean = js.native
  def checkbox(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def checkbox(behavior: setting, name: uncheckable): auto | Boolean = js.native
  def checkbox(behavior: setting, name: uncheckable, value: Boolean): JQuery = js.native
  def checkbox(behavior: setting, name: uncheckable, value: auto): JQuery = js.native
  def checkbox(behavior: setting, name: verbose): Boolean = js.native
  def checkbox(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def checkbox(settings: CheckboxSettings): JQuery = js.native
  /**
    * Attach checkbox events to another element
    */
  @JSName("checkbox")
  def checkbox_attachevents(behavior: `attach events`, selector: String): JQuery = js.native
  @JSName("checkbox")
  def checkbox_attachevents(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  @JSName("checkbox")
  def checkbox_attachevents(behavior: `attach events`, selector: JQuery): JQuery = js.native
  @JSName("checkbox")
  def checkbox_attachevents(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  /**
    * Returns whether element is able to be changed
    */
  @JSName("checkbox")
  def checkbox_canchange(behavior: `can change`): Boolean = js.native
  /**
    * Returns whether element is able to be unchecked
    */
  @JSName("checkbox")
  def checkbox_canuncheck(behavior: `can uncheck`): Boolean = js.native
  /**
    * Set a checkbox state to checked
    */
  @JSName("checkbox")
  def checkbox_check(behavior: check): JQuery = js.native
  @JSName("checkbox")
  def checkbox_destroy(behavior: destroy): JQuery = js.native
  /**
    * Set as determinate checkbox
    */
  @JSName("checkbox")
  def checkbox_determinate(behavior: determinate): JQuery = js.native
  /**
    * Enable interaction with a checkbox
    */
  @JSName("checkbox")
  def checkbox_enable(behavior: enable): JQuery = js.native
  /**
    * Set as indeterminate checkbox
    */
  @JSName("checkbox")
  def checkbox_indeterminate(behavior: indeterminate): JQuery = js.native
  /**
    * Returns whether element is currently checked
    */
  @JSName("checkbox")
  def checkbox_ischecked(behavior: `is checked`): Boolean = js.native
  /**
    * Returns whether element is radio selection
    */
  @JSName("checkbox")
  def checkbox_isradio(behavior: `is radio`): Boolean = js.native
  /**
    * Returns whether element is not checked
    */
  @JSName("checkbox")
  def checkbox_isunchecked(behavior: `is unchecked`): Boolean = js.native
  /**
    * Set a checkbox state to checked without callbacks
    */
  @JSName("checkbox")
  def checkbox_setchecked(behavior: `set checked`): JQuery = js.native
  /**
    * Set as determinate checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setdeterminate(behavior: `set determinate`): JQuery = js.native
  /**
    * Disable interaction with a checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setdisabled(behavior: `set disabled`): JQuery = js.native
  /**
    * Enable interaction with a checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setenabled(behavior: `set enabled`): JQuery = js.native
  /**
    * Set as indeterminate checkbox without callbacks
    */
  @JSName("checkbox")
  def checkbox_setindeterminate(behavior: `set indeterminate`): JQuery = js.native
  @JSName("checkbox")
  def checkbox_setting(behavior: setting, value: CheckboxSettings): JQuery = js.native
  /**
    * Set a checkbox state to unchecked without callbacks
    */
  @JSName("checkbox")
  def checkbox_setunchecked(behavior: `set unchecked`): JQuery = js.native
  /**
    * Returns whether element can be checked (checking if already checked or `beforeChecked` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowcheck(behavior: `should allow check`): Boolean = js.native
  /**
    * Returns whether element can be determinate (checking if already determinate or `beforeDeterminate` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowdeterminate(behavior: `should allow determinate`): Boolean = js.native
  /**
    * Returns whether element can be indeterminate (checking if already indeterminate or `beforeIndeterminate` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowindeterminate(behavior: `should allow indeterminate`): Boolean = js.native
  /**
    * Returns whether element can be unchecked (checking if already unchecked or `beforeUnchecked` would cancel)
    */
  @JSName("checkbox")
  def checkbox_shouldallowuncheck(behavior: `should allow uncheck`): Boolean = js.native
  /**
    * Switches a checkbox from current state
    */
  @JSName("checkbox")
  def checkbox_toggle(behavior: toggle): JQuery = js.native
  /**
    * Set a checkbox state to unchecked
    */
  @JSName("checkbox")
  def checkbox_uncheck(behavior: uncheck): JQuery = js.native
}

