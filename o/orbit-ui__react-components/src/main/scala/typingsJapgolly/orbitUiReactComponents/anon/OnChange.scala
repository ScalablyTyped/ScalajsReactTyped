package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  def onChange(): Unit
}
object OnChange {
  
  inline def apply(onChange: Callback): OnChange = {
    val __obj = js.Dynamic.literal(onChange = onChange.toJsFn)
    __obj.asInstanceOf[OnChange]
  }
  
  extension [Self <: OnChange](x: Self) {
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
  }
}
