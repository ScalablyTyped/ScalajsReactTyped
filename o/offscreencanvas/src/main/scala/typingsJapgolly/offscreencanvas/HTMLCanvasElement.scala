package typingsJapgolly.offscreencanvas

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLCanvasElement extends StObject {
  
  def transferControlToOffscreen(): OffscreenCanvas
}
object HTMLCanvasElement {
  
  inline def apply(transferControlToOffscreen: CallbackTo[OffscreenCanvas]): HTMLCanvasElement = {
    val __obj = js.Dynamic.literal(transferControlToOffscreen = transferControlToOffscreen.toJsFn)
    __obj.asInstanceOf[HTMLCanvasElement]
  }
  
  extension [Self <: HTMLCanvasElement](x: Self) {
    
    inline def setTransferControlToOffscreen(value: CallbackTo[OffscreenCanvas]): Self = StObject.set(x, "transferControlToOffscreen", value.toJsFn)
  }
}
