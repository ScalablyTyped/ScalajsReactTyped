package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDismissStart extends StObject {
  
  def onDismissStart(): Unit
}
object OnDismissStart {
  
  inline def apply(onDismissStart: Callback): OnDismissStart = {
    val __obj = js.Dynamic.literal(onDismissStart = onDismissStart.toJsFn)
    __obj.asInstanceOf[OnDismissStart]
  }
  
  extension [Self <: OnDismissStart](x: Self) {
    
    inline def setOnDismissStart(value: Callback): Self = StObject.set(x, "onDismissStart", value.toJsFn)
  }
}
