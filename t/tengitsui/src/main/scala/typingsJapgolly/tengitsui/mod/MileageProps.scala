package typingsJapgolly.tengitsui.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MileageProps extends StObject {
  
  def onChange(value: String): Unit
  
  var opts: js.UndefOr[js.Object] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object MileageProps {
  
  inline def apply(onChange: String => Callback): MileageProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: String) => onChange(t0).runNow()))
    __obj.asInstanceOf[MileageProps]
  }
  
  extension [Self <: MileageProps](x: Self) {
    
    inline def setOnChange(value: String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setOpts(value: js.Object): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
