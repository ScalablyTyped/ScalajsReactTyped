package typingsJapgolly.reactJsonschemaForm.mod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.jsonSchema.mod.JSONSchema6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldTemplateProps extends StObject {
  
  var children: Element
  
  var classNames: String
  
  var description: Element
  
  var disabled: Boolean
  
  var displayLabel: Boolean
  
  var errors: Element
  
  var fields: js.Array[Field]
  
  var formContext: Any
  
  var help: Element
  
  var hidden: Boolean
  
  var id: String
  
  var label: String
  
  var rawDescription: String
  
  var rawErrors: js.Array[String]
  
  var rawHelp: String
  
  var readonly: Boolean
  
  var required: Boolean
  
  var schema: JSONSchema6
  
  var uiSchema: UiSchema
}
object FieldTemplateProps {
  
  inline def apply(
    children: VdomElement,
    classNames: String,
    description: VdomElement,
    disabled: Boolean,
    displayLabel: Boolean,
    errors: VdomElement,
    fields: js.Array[Field],
    formContext: Any,
    help: VdomElement,
    hidden: Boolean,
    id: String,
    label: String,
    rawDescription: String,
    rawErrors: js.Array[String],
    rawHelp: String,
    readonly: Boolean,
    required: Boolean,
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): FieldTemplateProps = {
    val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], description = description.rawElement.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayLabel = displayLabel.asInstanceOf[js.Any], errors = errors.rawElement.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], help = help.rawElement.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], rawDescription = rawDescription.asInstanceOf[js.Any], rawErrors = rawErrors.asInstanceOf[js.Any], rawHelp = rawHelp.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTemplateProps]
  }
  
  extension [Self <: FieldTemplateProps](x: Self) {
    
    inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassNames(value: String): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: VdomElement): Self = StObject.set(x, "description", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisplayLabel(value: Boolean): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: VdomElement): Self = StObject.set(x, "errors", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFormContext(value: Any): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: VdomElement): Self = StObject.set(x, "help", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRawDescription(value: String): Self = StObject.set(x, "rawDescription", value.asInstanceOf[js.Any])
    
    inline def setRawErrors(value: js.Array[String]): Self = StObject.set(x, "rawErrors", value.asInstanceOf[js.Any])
    
    inline def setRawErrorsVarargs(value: String*): Self = StObject.set(x, "rawErrors", js.Array(value*))
    
    inline def setRawHelp(value: String): Self = StObject.set(x, "rawHelp", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: JSONSchema6): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
  }
}
