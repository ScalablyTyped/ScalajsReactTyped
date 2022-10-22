package typingsJapgolly.uikit.distJsUikitMod.UIkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitCountdownElement extends StObject {
  
  def start(): Unit
  
  def stop(): Unit
}
object UIkitCountdownElement {
  
  inline def apply(start: Callback, stop: Callback): UIkitCountdownElement = {
    val __obj = js.Dynamic.literal(start = start.toJsFn, stop = stop.toJsFn)
    __obj.asInstanceOf[UIkitCountdownElement]
  }
  
  extension [Self <: UIkitCountdownElement](x: Self) {
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
