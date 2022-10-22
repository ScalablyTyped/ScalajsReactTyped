package typingsJapgolly.slate

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.slate.distInterfacesOperationMod.Operation
import typingsJapgolly.slate.distInterfacesRangeMod.Range
import typingsJapgolly.slate.slateStrings.backward
import typingsJapgolly.slate.slateStrings.forward
import typingsJapgolly.slate.slateStrings.inward
import typingsJapgolly.slate.slateStrings.outward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesRangeRefMod {
  
  trait RangeRef extends StObject {
    
    var affinity: forward | backward | outward | inward | Null
    
    var current: Range | Null
    
    def unref(): Range | Null
  }
  object RangeRef {
    
    @JSImport("slate/dist/interfaces/range-ref", "RangeRef")
    @js.native
    val ^ : RangeRefInterface = js.native
    
    extension [Self <: RangeRef](x: Self) {
      
      inline def setAffinity(value: forward | backward | outward | inward): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setCurrent(value: Range): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setUnref(value: CallbackTo[Range | Null]): Self = StObject.set(x, "unref", value.toJsFn)
    }
  }
  
  trait RangeRefInterface extends StObject {
    
    def transform(ref: RangeRef, op: Operation): Unit
  }
  object RangeRefInterface {
    
    inline def apply(transform: (RangeRef, Operation) => Callback): RangeRefInterface = {
      val __obj = js.Dynamic.literal(transform = js.Any.fromFunction2((t0: RangeRef, t1: Operation) => (transform(t0, t1)).runNow()))
      __obj.asInstanceOf[RangeRefInterface]
    }
    
    extension [Self <: RangeRefInterface](x: Self) {
      
      inline def setTransform(value: (RangeRef, Operation) => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction2((t0: RangeRef, t1: Operation) => (value(t0, t1)).runNow()))
    }
  }
}
