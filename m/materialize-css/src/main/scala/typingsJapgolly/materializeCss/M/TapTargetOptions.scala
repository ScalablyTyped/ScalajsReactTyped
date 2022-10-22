package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapTargetOptions extends StObject {
  
  /**
    * Callback function called when Tap Target is closed
    * @default null
    */
  def onClose(origin: Element): Unit
  
  /**
    * Callback function called when Tap Target is opened
    * @default null
    */
  def onOpen(origin: Element): Unit
}
object TapTargetOptions {
  
  inline def apply(onClose: Element => Callback, onOpen: Element => Callback): TapTargetOptions = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1((t0: Element) => onClose(t0).runNow()), onOpen = js.Any.fromFunction1((t0: Element) => onOpen(t0).runNow()))
    __obj.asInstanceOf[TapTargetOptions]
  }
  
  extension [Self <: TapTargetOptions](x: Self) {
    
    inline def setOnClose(value: Element => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnOpen(value: Element => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
  }
}
