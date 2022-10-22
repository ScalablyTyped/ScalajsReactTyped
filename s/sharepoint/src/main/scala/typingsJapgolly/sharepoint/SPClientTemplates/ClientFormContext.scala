package typingsJapgolly.sharepoint.SPClientTemplates

import japgolly.scalajs.react.Callback
import typingsJapgolly.sharepoint.SPClientForms.ClientValidation.ValidatorSet
import typingsJapgolly.sharepoint.anon.AllowScriptableWebParts
import typingsJapgolly.sharepoint.anon.BaseType
import typingsJapgolly.sharepoint.anon.ExternalListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientFormContext extends StObject {
  
  var controlMode: Double
  
  var fieldName: String
  
  var fieldSchema: FieldSchemaInForm
  
  var fieldValue: Any
  
  var itemAttributes: ExternalListItem
  
  var listAttributes: BaseType
  
  def registerClientValidator(fieldname: String, validator: ValidatorSet): Unit
  
  def registerFocusCallback(fieldname: String, callback: js.Function0[Unit]): Unit
  
  def registerGetValueCallback(fieldname: String, callback: js.Function0[Any]): Unit
  
  def registerHasValueChangedCallback(fieldname: String, callback: js.Function1[/* eventArg */ js.UndefOr[Any], Unit]): Unit
  
  def registerInitCallback(fieldname: String, callback: js.Function0[Unit]): Unit
  
  def registerValidationErrorCallback(fieldname: String, callback: js.Function1[/* error */ Any, Unit]): Unit
  
  def updateControlValue(fieldname: String, value: Any): Unit
  
  var webAttributes: AllowScriptableWebParts
}
object ClientFormContext {
  
  inline def apply(
    controlMode: Double,
    fieldName: String,
    fieldSchema: FieldSchemaInForm,
    fieldValue: Any,
    itemAttributes: ExternalListItem,
    listAttributes: BaseType,
    registerClientValidator: (String, ValidatorSet) => Callback,
    registerFocusCallback: (String, js.Function0[Unit]) => Callback,
    registerGetValueCallback: (String, js.Function0[Any]) => Callback,
    registerHasValueChangedCallback: (String, js.Function1[/* eventArg */ js.UndefOr[Any], Unit]) => Callback,
    registerInitCallback: (String, js.Function0[Unit]) => Callback,
    registerValidationErrorCallback: (String, js.Function1[/* error */ Any, Unit]) => Callback,
    updateControlValue: (String, Any) => Callback,
    webAttributes: AllowScriptableWebParts
  ): ClientFormContext = {
    val __obj = js.Dynamic.literal(controlMode = controlMode.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fieldSchema = fieldSchema.asInstanceOf[js.Any], fieldValue = fieldValue.asInstanceOf[js.Any], itemAttributes = itemAttributes.asInstanceOf[js.Any], listAttributes = listAttributes.asInstanceOf[js.Any], registerClientValidator = js.Any.fromFunction2((t0: String, t1: ValidatorSet) => (registerClientValidator(t0, t1)).runNow()), registerFocusCallback = js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (registerFocusCallback(t0, t1)).runNow()), registerGetValueCallback = js.Any.fromFunction2((t0: String, t1: js.Function0[Any]) => (registerGetValueCallback(t0, t1)).runNow()), registerHasValueChangedCallback = js.Any.fromFunction2((t0: String, t1: js.Function1[/* eventArg */ js.UndefOr[Any], Unit]) => (registerHasValueChangedCallback(t0, t1)).runNow()), registerInitCallback = js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (registerInitCallback(t0, t1)).runNow()), registerValidationErrorCallback = js.Any.fromFunction2((t0: String, t1: js.Function1[/* error */ Any, Unit]) => (registerValidationErrorCallback(t0, t1)).runNow()), updateControlValue = js.Any.fromFunction2((t0: String, t1: Any) => (updateControlValue(t0, t1)).runNow()), webAttributes = webAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientFormContext]
  }
  
  extension [Self <: ClientFormContext](x: Self) {
    
    inline def setControlMode(value: Double): Self = StObject.set(x, "controlMode", value.asInstanceOf[js.Any])
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldSchema(value: FieldSchemaInForm): Self = StObject.set(x, "fieldSchema", value.asInstanceOf[js.Any])
    
    inline def setFieldValue(value: Any): Self = StObject.set(x, "fieldValue", value.asInstanceOf[js.Any])
    
    inline def setItemAttributes(value: ExternalListItem): Self = StObject.set(x, "itemAttributes", value.asInstanceOf[js.Any])
    
    inline def setListAttributes(value: BaseType): Self = StObject.set(x, "listAttributes", value.asInstanceOf[js.Any])
    
    inline def setRegisterClientValidator(value: (String, ValidatorSet) => Callback): Self = StObject.set(x, "registerClientValidator", js.Any.fromFunction2((t0: String, t1: ValidatorSet) => (value(t0, t1)).runNow()))
    
    inline def setRegisterFocusCallback(value: (String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "registerFocusCallback", js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setRegisterGetValueCallback(value: (String, js.Function0[Any]) => Callback): Self = StObject.set(x, "registerGetValueCallback", js.Any.fromFunction2((t0: String, t1: js.Function0[Any]) => (value(t0, t1)).runNow()))
    
    inline def setRegisterHasValueChangedCallback(value: (String, js.Function1[/* eventArg */ js.UndefOr[Any], Unit]) => Callback): Self = StObject.set(x, "registerHasValueChangedCallback", js.Any.fromFunction2((t0: String, t1: js.Function1[/* eventArg */ js.UndefOr[Any], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setRegisterInitCallback(value: (String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "registerInitCallback", js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setRegisterValidationErrorCallback(value: (String, js.Function1[/* error */ Any, Unit]) => Callback): Self = StObject.set(x, "registerValidationErrorCallback", js.Any.fromFunction2((t0: String, t1: js.Function1[/* error */ Any, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setUpdateControlValue(value: (String, Any) => Callback): Self = StObject.set(x, "updateControlValue", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setWebAttributes(value: AllowScriptableWebParts): Self = StObject.set(x, "webAttributes", value.asInstanceOf[js.Any])
  }
}
