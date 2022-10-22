package typingsJapgolly.slate

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.slate.distInterfacesOperationMod.Operation
import typingsJapgolly.slate.distInterfacesPointMod.Point
import typingsJapgolly.slate.distInterfacesTypesMod.TextDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesPointRefMod {
  
  trait PointRef extends StObject {
    
    var affinity: TextDirection | Null
    
    var current: Point | Null
    
    def unref(): Point | Null
  }
  object PointRef {
    
    @JSImport("slate/dist/interfaces/point-ref", "PointRef")
    @js.native
    val ^ : PointRefInterface = js.native
    
    extension [Self <: PointRef](x: Self) {
      
      inline def setAffinity(value: TextDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setCurrent(value: Point): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setUnref(value: CallbackTo[Point | Null]): Self = StObject.set(x, "unref", value.toJsFn)
    }
  }
  
  trait PointRefInterface extends StObject {
    
    def transform(ref: PointRef, op: Operation): Unit
  }
  object PointRefInterface {
    
    inline def apply(transform: (PointRef, Operation) => Callback): PointRefInterface = {
      val __obj = js.Dynamic.literal(transform = js.Any.fromFunction2((t0: PointRef, t1: Operation) => (transform(t0, t1)).runNow()))
      __obj.asInstanceOf[PointRefInterface]
    }
    
    extension [Self <: PointRefInterface](x: Self) {
      
      inline def setTransform(value: (PointRef, Operation) => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction2((t0: PointRef, t1: Operation) => (value(t0, t1)).runNow()))
    }
  }
}
