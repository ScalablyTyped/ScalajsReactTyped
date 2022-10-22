package typingsJapgolly.antdMobile.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcFieldForm.esInterfaceMod.FormInstance
import typingsJapgolly.rcFieldForm.esInterfaceMod.NamePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Form extends StObject {
  
  var form: FormInstance[Any]
  
  var namePath: NamePath
  
  def onChange(): Unit
}
object Form {
  
  inline def apply(form: FormInstance[Any], namePath: NamePath, onChange: Callback): Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], namePath = namePath.asInstanceOf[js.Any], onChange = onChange.toJsFn)
    __obj.asInstanceOf[Form]
  }
  
  extension [Self <: Form](x: Self) {
    
    inline def setForm(value: FormInstance[Any]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setNamePath(value: NamePath): Self = StObject.set(x, "namePath", value.asInstanceOf[js.Any])
    
    inline def setNamePathVarargs(value: (String | Double)*): Self = StObject.set(x, "namePath", js.Array(value*))
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
  }
}
