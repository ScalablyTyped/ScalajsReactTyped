package typingsJapgolly.semanticUiForm

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_.TriggeredEvent
import typingsJapgolly.semanticUiForm.SemanticUI.Form
import typingsJapgolly.semanticUiForm.SemanticUI.Form.ClassNameSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.ErrorSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.Field
import typingsJapgolly.semanticUiForm.SemanticUI.Form.Fields
import typingsJapgolly.semanticUiForm.SemanticUI.Form.MetadataSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.PromptSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.Rule
import typingsJapgolly.semanticUiForm.SemanticUI.Form.Rules
import typingsJapgolly.semanticUiForm.SemanticUI.Form.SelectorSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.TemplatesSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.TextSettings
import typingsJapgolly.semanticUiForm.SemanticUI.FormSettings
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`add errors`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`add field`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`add fields`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`add prompt`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`add rule`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`get change event`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`get field`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`get validation`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`get value`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`get values`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`has field`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`inline`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`is valid`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`remove field`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`remove fields`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`remove rule`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`remove rules`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`set value`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`set values`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`validate form`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.blur
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.change
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.className
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.debug
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.defaults
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.delay
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.destroy
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.duration
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.error
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.fields
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.keyboardShortcuts
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.metadata
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.name
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.namespace
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.on
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.onFailure
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.onInvalid
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.onSuccess
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.onValid
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.performance
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.prompt
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.revalidate
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.rules
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.selector
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.setting
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.silent
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.submit
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.templates
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.text
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.transition
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("form")
  var form_Original: Form = js.native
  def form(): JQuery = js.native
  def form(behavior: setting, name: `inline`): Boolean = js.native
  def form(behavior: setting, name: `inline`, value: Boolean): JQuery = js.native
  def form(behavior: setting, name: className): ClassNameSettings = js.native
  def form(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def form(behavior: setting, name: debug): Boolean = js.native
  def form(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def form(behavior: setting, name: defaults): StringDictionary[Field] = js.native
  def form(behavior: setting, name: defaults, value: StringDictionary[Field]): JQuery = js.native
  def form(behavior: setting, name: delay): Boolean = js.native
  def form(behavior: setting, name: delay, value: Boolean): JQuery = js.native
  def form(behavior: setting, name: duration): Double = js.native
  def form(behavior: setting, name: duration, value: Double): JQuery = js.native
  def form(behavior: setting, name: error): ErrorSettings = js.native
  def form(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def form(behavior: setting, name: fields): StringDictionary[String | js.Array[String] | Field] = js.native
  def form(behavior: setting, name: fields, value: StringDictionary[String | js.Array[String] | Field]): JQuery = js.native
  def form(behavior: setting, name: keyboardShortcuts): Boolean = js.native
  def form(behavior: setting, name: keyboardShortcuts, value: Boolean): JQuery = js.native
  def form(behavior: setting, name: metadata): MetadataSettings = js.native
  def form(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def form(behavior: setting, name: name): String = js.native
  def form(behavior: setting, name: namespace): String = js.native
  def form(behavior: setting, name: namespace, value: String): JQuery = js.native
  def form(behavior: setting, name: name, value: String): JQuery = js.native
  def form(behavior: setting, name: on): submit | blur | change = js.native
  def form(behavior: setting, name: onFailure): js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit] = js.native
  def form(
    behavior: setting,
    name: onFailure,
    value: js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
  ): JQuery = js.native
  def form(behavior: setting, name: onInvalid): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def form(behavior: setting, name: onInvalid, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def form(behavior: setting, name: onSuccess): js.ThisFunction2[
    /* this */ JQuery, 
    /* event */ TriggeredEvent[HTMLElement, _, _, _], 
    /* fields */ js.Any, 
    Unit
  ] = js.native
  def form(
    behavior: setting,
    name: onSuccess,
    value: js.ThisFunction2[
      /* this */ JQuery, 
      /* event */ TriggeredEvent[typingsJapgolly.std.HTMLElement, _, _, _], 
      /* fields */ js.Any, 
      Unit
    ]
  ): JQuery = js.native
  def form(behavior: setting, name: onValid): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def form(behavior: setting, name: onValid, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def form(behavior: setting, name: on, value: blur): JQuery = js.native
  def form(behavior: setting, name: on, value: change): JQuery = js.native
  def form(behavior: setting, name: on, value: submit): JQuery = js.native
  def form(behavior: setting, name: performance): Boolean = js.native
  def form(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def form(behavior: setting, name: prompt): PromptSettings = js.native
  def form(behavior: setting, name: prompt, value: PromptSettings): JQuery = js.native
  def form(behavior: setting, name: revalidate): Boolean = js.native
  def form(behavior: setting, name: revalidate, value: Boolean): JQuery = js.native
  def form(behavior: setting, name: rules): StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]] = js.native
  def form(
    behavior: setting,
    name: rules,
    value: StringDictionary[
      js.ThisFunction1[/* this */ typingsJapgolly.std.HTMLElement, /* repeated */ js.Any, Boolean]
    ]
  ): JQuery = js.native
  def form(behavior: setting, name: selector): SelectorSettings = js.native
  def form(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def form(behavior: setting, name: silent): Boolean = js.native
  def form(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def form(behavior: setting, name: templates): TemplatesSettings = js.native
  def form(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
  def form(behavior: setting, name: text): TextSettings = js.native
  def form(behavior: setting, name: text, value: TextSettings): JQuery = js.native
  def form(behavior: setting, name: transition): String = js.native
  def form(behavior: setting, name: transition, value: String): JQuery = js.native
  def form(behavior: setting, name: verbose): Boolean = js.native
  def form(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def form(settings: Fields): JQuery = js.native
  def form(settings: FormSettings): JQuery = js.native
  /**
    * Adds errors to form, given an array errors
    */
  @JSName("form")
  def form_adderrors(behavior: `add errors`, errors: js.Array[String]): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  @JSName("form")
  def form_addfield(behavior: `add field`, field: String, rules: String): JQuery = js.native
  @JSName("form")
  def form_addfield(behavior: `add field`, field: String, rules: js.Array[String]): JQuery = js.native
  @JSName("form")
  def form_addfield(behavior: `add field`, field: String, rules: Rules): JQuery = js.native
  /**
    * Adds fields object to existing fields
    * @since 2.2.11
    */
  @JSName("form")
  def form_addfields(behavior: `add fields`, fields: Fields): JQuery = js.native
  /**
    * Adds error prompt to the field with the given identifier
    */
  @JSName("form")
  def form_addprompt(behavior: `add prompt`, identifier: String, errors: String): JQuery = js.native
  @JSName("form")
  def form_addprompt(behavior: `add prompt`, identifier: String, errors: js.Array[String]): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  @JSName("form")
  def form_addrule(behavior: `add rule`, field: String, rules: String): JQuery = js.native
  @JSName("form")
  def form_addrule(behavior: `add rule`, field: String, rules: js.Array[String]): JQuery = js.native
  @JSName("form")
  def form_addrule(behavior: `add rule`, field: String, rules: Rules): JQuery = js.native
  @JSName("form")
  def form_destroy(behavior: destroy): JQuery = js.native
  /**
    * gets browser property change event
    */
  @JSName("form")
  def form_getchangeevent(behavior: `get change event`): String = js.native
  /**
    * Returns element with matching name, id, or data-validate metadata to ID
    */
  @JSName("form")
  def form_getfield(behavior: `get field`, id: String): JQuery = js.native
  /**
    * Returns validation rules for a given jQuery-referenced input field
    */
  @JSName("form")
  def form_getvalidation(behavior: `get validation`, element: JQuery): js.Any = js.native
  /**
    * Returns value of element with id
    */
  @JSName("form")
  def form_getvalue(behavior: `get value`, id: String): js.Any = js.native
  /**
    * Returns object of element values that match array of ids. If no IDS are passed will return all fields
    */
  @JSName("form")
  def form_getvalues(behavior: `get values`): js.Any = js.native
  @JSName("form")
  def form_getvalues(behavior: `get values`, ids: js.Array[String]): js.Any = js.native
  /**
    * Returns whether a field exists
    */
  @JSName("form")
  def form_hasfield(behavior: `has field`, identifier: String): Boolean = js.native
  /**
    * Returns true/false whether a form passes its validation rules
    */
  @JSName("form")
  def form_isvalid(behavior: `is valid`): Boolean = js.native
  /**
    * Returns true/false whether a field passes its validation rules
    */
  @JSName("form")
  def form_isvalid(behavior: `is valid`, field: String): Boolean = js.native
  /**
    * Remove all validation for a field
    * @since 2.2.11
    */
  @JSName("form")
  def form_removefield(behavior: `remove field`, field: String): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("form")
  def form_removefields(behavior: `remove fields`, fields: js.Array[String]): JQuery = js.native
  /**
    * Removes specific rule from field leaving other rules
    * @since 2.2.11
    */
  @JSName("form")
  def form_removerule(behavior: `remove rule`, field: String, rule: Rule): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("form")
  def form_removerules(behavior: `remove rules`, fields: String, rules: js.Array[Rule]): JQuery = js.native
  @JSName("form")
  def form_removerules(behavior: `remove rules`, fields: js.Array[String], rules: js.Array[Rule]): JQuery = js.native
  @JSName("form")
  def form_setting(behavior: setting, value: FormSettings): JQuery = js.native
  /**
    * Sets value of element with id
    */
  @JSName("form")
  def form_setvalue(behavior: `set value`, id: String): JQuery = js.native
  /**
    * Sets key/value pairs from passed values object to matching ids
    */
  @JSName("form")
  def form_setvalues(behavior: `set values`, values: js.Any): JQuery = js.native
  /**
    * Submits selected form
    */
  @JSName("form")
  def form_submit(behavior: submit): JQuery = js.native
  /**
    * Validates form and calls onSuccess or onFailure
    */
  @JSName("form")
  def form_validateform(behavior: `validate form`): JQuery = js.native
}

