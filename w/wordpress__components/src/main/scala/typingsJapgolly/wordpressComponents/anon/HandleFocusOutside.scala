package typingsJapgolly.wordpressComponents.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleFocusOutside extends StObject {
  
  def handleFocusOutside(): Unit
}
object HandleFocusOutside {
  
  inline def apply(handleFocusOutside: Callback): HandleFocusOutside = {
    val __obj = js.Dynamic.literal(handleFocusOutside = handleFocusOutside.toJsFn)
    __obj.asInstanceOf[HandleFocusOutside]
  }
  
  extension [Self <: HandleFocusOutside](x: Self) {
    
    inline def setHandleFocusOutside(value: Callback): Self = StObject.set(x, "handleFocusOutside", value.toJsFn)
  }
}
