package typingsJapgolly.semanticUiCheckbox.SemanticUI.CheckboxSettings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings
import typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * Class names used to determine element state
    */
  var className: ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: Boolean
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Whether callbacks for checked status should be fired on init as well as change
    *
    * @default false
    */
  var fireOnInit: Boolean
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  // endregion
  // region DOM Settings
  /**
    * Selectors used to find parts of a module
    */
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  // region Behavior
  /**
    * Setting to true/false will determine whether an input will allow no selection. Auto will set disallow this behavior only for radio boxes
    *
    * @default 'auto'
    */
  var uncheckable: auto | Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Callback before a checkbox is checked. Can cancel change by returning false
    */
  def beforeChecked(): Unit | `false`
  /**
    * Callback before a checkbox is set to determinate. Can cancel change by returning false
    */
  def beforeDeterminate(): Unit | `false`
  /**
    * Callback before a checkbox is set to undeterminate. Can cancel change by returning false
    */
  def beforeIndeterminate(): Unit | `false`
  /**
    * Callback before a checkbox is unchecked. Can cancel change by returning false
    */
  def beforeUnchecked(): Unit | `false`
  // endregion
  // region Callbacks
  /**
    * Callback after a checkbox is either checked or unchecked.
    */
  def onChange(): Unit
  /**
    * Callback after a checkbox is checked.
    */
  def onChecked(): Unit
  /**
    * Callback after a checkbox is set to determinate.
    */
  def onDeterminate(): Unit
  /**
    * Callback after a checkbox is disabled.
    */
  def onDisable(): Unit
  /**
    * Callback after a checkbox is disabled.
    *
    * @deprecated
    */
  def onDisabled(): Unit
  /**
    * Callback after a checkbox is enabled.
    */
  def onEnable(): Unit
  /**
    * Callback after a checkbox is enabled.
    *
    * @deprecated
    */
  def onEnabled(): Unit
  /**
    * Callback after a checkbox is set to undeterminate.
    */
  def onIndeterminate(): Unit
  /**
    * Callback after a checkbox is unchecked.
    */
  def onUnchecked(): Unit
}

object Impl {
  @scala.inline
  def apply(
    beforeChecked: CallbackTo[Unit | `false`],
    beforeDeterminate: CallbackTo[Unit | `false`],
    beforeIndeterminate: CallbackTo[Unit | `false`],
    beforeUnchecked: CallbackTo[Unit | `false`],
    className: ClassNameSettings,
    debug: Boolean,
    error: ErrorSettings,
    fireOnInit: Boolean,
    name: String,
    namespace: String,
    onChange: Callback,
    onChecked: Callback,
    onDeterminate: Callback,
    onDisable: Callback,
    onDisabled: Callback,
    onEnable: Callback,
    onEnabled: Callback,
    onIndeterminate: Callback,
    onUnchecked: Callback,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    uncheckable: auto | Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fireOnInit = fireOnInit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], uncheckable = uncheckable.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("beforeChecked")(beforeChecked.toJsFn)
    __obj.updateDynamic("beforeDeterminate")(beforeDeterminate.toJsFn)
    __obj.updateDynamic("beforeIndeterminate")(beforeIndeterminate.toJsFn)
    __obj.updateDynamic("beforeUnchecked")(beforeUnchecked.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onChecked")(onChecked.toJsFn)
    __obj.updateDynamic("onDeterminate")(onDeterminate.toJsFn)
    __obj.updateDynamic("onDisable")(onDisable.toJsFn)
    __obj.updateDynamic("onDisabled")(onDisabled.toJsFn)
    __obj.updateDynamic("onEnable")(onEnable.toJsFn)
    __obj.updateDynamic("onEnabled")(onEnabled.toJsFn)
    __obj.updateDynamic("onIndeterminate")(onIndeterminate.toJsFn)
    __obj.updateDynamic("onUnchecked")(onUnchecked.toJsFn)
    __obj.asInstanceOf[Impl]
  }
}

