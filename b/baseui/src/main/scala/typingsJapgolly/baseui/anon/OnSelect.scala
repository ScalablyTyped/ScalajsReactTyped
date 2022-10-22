package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSelect extends StObject {
  
  def onSelect(): Unit
}
object OnSelect {
  
  inline def apply(onSelect: Callback): OnSelect = {
    val __obj = js.Dynamic.literal(onSelect = onSelect.toJsFn)
    __obj.asInstanceOf[OnSelect]
  }
  
  extension [Self <: OnSelect](x: Self) {
    
    inline def setOnSelect(value: Callback): Self = StObject.set(x, "onSelect", value.toJsFn)
  }
}
