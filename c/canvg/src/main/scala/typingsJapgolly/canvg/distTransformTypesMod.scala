package typingsJapgolly.canvg

import japgolly.scalajs.react.Callback
import typingsJapgolly.canvg.distPointMod.Point
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformTypesMod {
  
  trait ITransform extends StObject {
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D): Unit
    
    def applyToPoint(point: Point): Unit
    
    var `type`: String
    
    def unapply(ctx: RenderingContext2D): Unit
  }
  object ITransform {
    
    inline def apply(
      apply: RenderingContext2D => Callback,
      applyToPoint: Point => Callback,
      `type`: String,
      unapply: RenderingContext2D => Callback
    ): ITransform = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: RenderingContext2D) => apply(t0).runNow()), applyToPoint = js.Any.fromFunction1((t0: Point) => applyToPoint(t0).runNow()), unapply = js.Any.fromFunction1((t0: RenderingContext2D) => unapply(t0).runNow()))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITransform]
    }
    
    extension [Self <: ITransform](x: Self) {
      
      inline def setApply(value: RenderingContext2D => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: RenderingContext2D) => value(t0).runNow()))
      
      inline def setApplyToPoint(value: Point => Callback): Self = StObject.set(x, "applyToPoint", js.Any.fromFunction1((t0: Point) => value(t0).runNow()))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnapply(value: RenderingContext2D => Callback): Self = StObject.set(x, "unapply", js.Any.fromFunction1((t0: RenderingContext2D) => value(t0).runNow()))
    }
  }
}
