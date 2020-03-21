package typingsJapgolly.semanticUiForm.SemanticUI.FormSettings

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_.TriggeredEvent
import typingsJapgolly.semanticUiForm.SemanticUI.Form.ClassNameSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.ErrorSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.Field
import typingsJapgolly.semanticUiForm.SemanticUI.Form.MetadataSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.PromptSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.SelectorSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.TemplatesSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.TextSettings
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.blur
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.change
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: Boolean
  var defaults: StringDictionary[Field]
  /**
    * Delay from last typed letter to validate a field when using on: change or when revalidating a field.
    *
    * @default true
    */
  var delay: Boolean
  /**
    * Animation speed for inline prompt
    *
    * @default 150
    */
  var duration: Double
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  var fields: StringDictionary[String | js.Array[String] | Field]
  /**
    * Adds inline error on field validation error
    *
    * @default false
    */
  var `inline`: Boolean
  // region Form Settings
  /**
    * Adds keyboard shortcuts for enter and escape keys to submit form and blur fields respectively
    *
    * @default true
    */
  var keyboardShortcuts: Boolean
  /**
    * HTML5 metadata attributes
    */
  var metadata: MetadataSettings
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
    * Event used to trigger validation. Can be either submit, blur or change.
    *
    * @default 'submit'
    */
  var on: submit | blur | change
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  var prompt: PromptSettings
  /**
    * If set to true will revalidate fields with errors on input change
    *
    * @default true
    */
  var revalidate: Boolean
  // endregion
  // region Rules
  var rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]
  // endregion
  // region DOM Settings
  /**
    * Selectors used to match functionality to DOM
    */
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  // endregion
  // region Templates
  var templates: TemplatesSettings
  // endregion
  // region Form Prompts
  var text: TextSettings
  /**
    * Named transition to use when animating validation errors. Fade and slide down are available without including ui transitions
    *
    * @default 'scale'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Callback if any form field is invalid
    */
  def onFailure(formErrors: js.Array[String], fields: js.Any): Unit
  /**
    * Callback on each invalid field
    */
  def onInvalid(): Unit
  /**
    * Callback if a form is all valid
    */
  def onSuccess(event: TriggeredEvent[HTMLElement, _, _, _], fields: js.Any): Unit
  // endregion
  // region Callbacks
  /**
    * Callback on each valid field
    */
  def onValid(): Unit
}

object Impl {
  @scala.inline
  def apply(
    className: ClassNameSettings,
    debug: Boolean,
    defaults: StringDictionary[Field],
    delay: Boolean,
    duration: Double,
    error: ErrorSettings,
    fields: StringDictionary[String | js.Array[String] | Field],
    `inline`: Boolean,
    keyboardShortcuts: Boolean,
    metadata: MetadataSettings,
    name: String,
    namespace: String,
    on: submit | blur | change,
    onFailure: (js.Array[String], js.Any) => Callback,
    onInvalid: Callback,
    onSuccess: (TriggeredEvent[HTMLElement, js.Any, js.Any, js.Any], js.Any) => Callback,
    onValid: Callback,
    performance: Boolean,
    prompt: PromptSettings,
    revalidate: Boolean,
    rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]],
    selector: SelectorSettings,
    silent: Boolean,
    templates: TemplatesSettings,
    text: TextSettings,
    transition: String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], revalidate = revalidate.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.updateDynamic("onFailure")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Any) => onFailure(t0, t1).runNow()))
    __obj.updateDynamic("onInvalid")(onInvalid.toJsFn)
    __obj.updateDynamic("onSuccess")(js.Any.fromFunction2((t0: typingsJapgolly.jquery.JQuery_.TriggeredEvent[org.scalajs.dom.raw.HTMLElement, js.Any, js.Any, js.Any], t1: js.Any) => onSuccess(t0, t1).runNow()))
    __obj.updateDynamic("onValid")(onValid.toJsFn)
    __obj.asInstanceOf[Impl]
  }
}

