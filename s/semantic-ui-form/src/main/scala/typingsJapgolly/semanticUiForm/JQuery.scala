package typingsJapgolly.semanticUiForm

import typingsJapgolly.semanticUiForm.SemanticUI.Form
import typingsJapgolly.semanticUiForm.SemanticUI.Form.Fields
import typingsJapgolly.semanticUiForm.SemanticUI.Form.Rule
import typingsJapgolly.semanticUiForm.SemanticUI.Form.Rules
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
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`is valid`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`remove field`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`remove fields`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`remove rule`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`remove rules`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`set value`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`set values`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`validate form`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.destroy
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.setting
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def form(): JQuery
  def form(settings: Fields): JQuery
  def form(settings: FormSettings): JQuery
  @JSName("form")
  var form_Original: Form
  /**
    * Adds errors to form, given an array errors
    */
  @JSName("form")
  def form_adderrors(behavior: `add errors`, errors: js.Array[String]): JQuery
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  @JSName("form")
  def form_addfield(behavior: `add field`, field: String, rules: String): JQuery
  @JSName("form")
  def form_addfield(behavior: `add field`, field: String, rules: js.Array[String]): JQuery
  @JSName("form")
  def form_addfield(behavior: `add field`, field: String, rules: Rules): JQuery
  /**
    * Adds fields object to existing fields
    * @since 2.2.11
    */
  @JSName("form")
  def form_addfields(behavior: `add fields`, fields: Fields): JQuery
  /**
    * Adds error prompt to the field with the given identifier
    */
  @JSName("form")
  def form_addprompt(behavior: `add prompt`, identifier: String, errors: String): JQuery
  @JSName("form")
  def form_addprompt(behavior: `add prompt`, identifier: String, errors: js.Array[String]): JQuery
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  @JSName("form")
  def form_addrule(behavior: `add rule`, field: String, rules: String): JQuery
  @JSName("form")
  def form_addrule(behavior: `add rule`, field: String, rules: js.Array[String]): JQuery
  @JSName("form")
  def form_addrule(behavior: `add rule`, field: String, rules: Rules): JQuery
  @JSName("form")
  def form_destroy(behavior: destroy): JQuery
  /**
    * gets browser property change event
    */
  @JSName("form")
  def form_getchangeevent(behavior: `get change event`): String
  /**
    * Returns element with matching name, id, or data-validate metadata to ID
    */
  @JSName("form")
  def form_getfield(behavior: `get field`, id: String): JQuery
  /**
    * Returns validation rules for a given jQuery-referenced input field
    */
  @JSName("form")
  def form_getvalidation(behavior: `get validation`, element: JQuery): Any
  /**
    * Returns value of element with id
    */
  @JSName("form")
  def form_getvalue(behavior: `get value`, id: String): Any
  /**
    * Returns object of element values that match array of ids. If no IDS are passed will return all fields
    */
  @JSName("form")
  def form_getvalues(behavior: `get values`): Any
  @JSName("form")
  def form_getvalues(behavior: `get values`, ids: js.Array[String]): Any
  /**
    * Returns whether a field exists
    */
  @JSName("form")
  def form_hasfield(behavior: `has field`, identifier: String): Boolean
  /**
    * Returns true/false whether a form passes its validation rules
    */
  @JSName("form")
  def form_isvalid(behavior: `is valid`): Boolean
  /**
    * Returns true/false whether a field passes its validation rules
    */
  @JSName("form")
  def form_isvalid(behavior: `is valid`, field: String): Boolean
  /**
    * Remove all validation for a field
    * @since 2.2.11
    */
  @JSName("form")
  def form_removefield(behavior: `remove field`, field: String): JQuery
  /**
    * @since 2.2.11
    */
  @JSName("form")
  def form_removefields(behavior: `remove fields`, fields: js.Array[String]): JQuery
  /**
    * Removes specific rule from field leaving other rules
    * @since 2.2.11
    */
  @JSName("form")
  def form_removerule(behavior: `remove rule`, field: String, rule: Rule): JQuery
  /**
    * @since 2.2.11
    */
  @JSName("form")
  def form_removerules(behavior: `remove rules`, fields: String, rules: js.Array[Rule]): JQuery
  @JSName("form")
  def form_removerules(behavior: `remove rules`, fields: js.Array[String], rules: js.Array[Rule]): JQuery
  @JSName("form")
  def form_setting(behavior: setting, value: FormSettings): JQuery
  @JSName("form")
  def form_setting[K /* <: /* keyof semantic-ui-form.SemanticUI.FormSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-form.SemanticUI.FormSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("form")
  def form_setting[K /* <: /* keyof semantic-ui-form.SemanticUI.FormSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-form.SemanticUI.FormSettings._Impl[K] */ js.Any
  /**
    * Sets value of element with id
    */
  @JSName("form")
  def form_setvalue(behavior: `set value`, id: String): JQuery
  /**
    * Sets key/value pairs from passed values object to matching ids
    */
  @JSName("form")
  def form_setvalues(behavior: `set values`, values: Any): JQuery
  /**
    * Submits selected form
    */
  @JSName("form")
  def form_submit(behavior: submit): JQuery
  /**
    * Validates form and calls onSuccess or onFailure
    */
  @JSName("form")
  def form_validateform(behavior: `validate form`): JQuery
}
object JQuery {
  
  inline def apply(form: Form): JQuery = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
  }
}
