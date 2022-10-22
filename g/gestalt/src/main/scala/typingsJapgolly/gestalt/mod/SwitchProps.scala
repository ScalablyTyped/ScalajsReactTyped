package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.gestalt.anon.ValueBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchProps extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var name: js.UndefOr[String] = js.undefined
  
  def onChange(args: ValueBoolean): Unit
  
  var switched: js.UndefOr[Boolean] = js.undefined
}
object SwitchProps {
  
  inline def apply(id: String, onChange: ValueBoolean => Callback): SwitchProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: ValueBoolean) => onChange(t0).runNow()))
    __obj.asInstanceOf[SwitchProps]
  }
  
  extension [Self <: SwitchProps](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: ValueBoolean => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ValueBoolean) => value(t0).runNow()))
    
    inline def setSwitched(value: Boolean): Self = StObject.set(x, "switched", value.asInstanceOf[js.Any])
    
    inline def setSwitchedUndefined: Self = StObject.set(x, "switched", js.undefined)
  }
}
