package typingsJapgolly.fabric.fabricImplMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUtilImage extends StObject {
  
  def setImageSmoothing(ctx: CanvasRenderingContext2D, value: Any): Unit
}
object IUtilImage {
  
  inline def apply(setImageSmoothing: (CanvasRenderingContext2D, Any) => Callback): IUtilImage = {
    val __obj = js.Dynamic.literal(setImageSmoothing = js.Any.fromFunction2((t0: CanvasRenderingContext2D, t1: Any) => (setImageSmoothing(t0, t1)).runNow()))
    __obj.asInstanceOf[IUtilImage]
  }
  
  extension [Self <: IUtilImage](x: Self) {
    
    inline def setSetImageSmoothing(value: (CanvasRenderingContext2D, Any) => Callback): Self = StObject.set(x, "setImageSmoothing", js.Any.fromFunction2((t0: CanvasRenderingContext2D, t1: Any) => (value(t0, t1)).runNow()))
  }
}
