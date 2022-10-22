package typingsJapgolly.tengitsui.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormProps extends StObject {
  
  var children: js.UndefOr[Any] = js.undefined
  
  var errors: Errros
  
  var fields: Fields
  
  def onChange(value: Any): Unit
  
  var schema: FormSchema
}
object FormProps {
  
  inline def apply(errors: Errros, fields: Fields, onChange: Any => Callback, schema: FormSchema): FormProps = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: Any) => onChange(t0).runNow()), schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps]
  }
  
  extension [Self <: FormProps](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setErrors(value: Errros): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Any => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSchema(value: FormSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
