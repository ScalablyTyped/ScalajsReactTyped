package typingsJapgolly.slate

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.slate.distInterfacesOperationMod.Operation
import typingsJapgolly.slate.distInterfacesPathMod.Path
import typingsJapgolly.slate.slateStrings.backward
import typingsJapgolly.slate.slateStrings.forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesPathRefMod {
  
  trait PathRef extends StObject {
    
    var affinity: forward | backward | Null
    
    var current: Path | Null
    
    def unref(): Path | Null
  }
  object PathRef {
    
    @JSImport("slate/dist/interfaces/path-ref", "PathRef")
    @js.native
    val ^ : PathRefInterface = js.native
    
    extension [Self <: PathRef](x: Self) {
      
      inline def setAffinity(value: forward | backward): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setCurrent(value: Path): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setCurrentVarargs(value: Double*): Self = StObject.set(x, "current", js.Array(value*))
      
      inline def setUnref(value: CallbackTo[Path | Null]): Self = StObject.set(x, "unref", value.toJsFn)
    }
  }
  
  trait PathRefInterface extends StObject {
    
    def transform(ref: PathRef, op: Operation): Unit
  }
  object PathRefInterface {
    
    inline def apply(transform: (PathRef, Operation) => Callback): PathRefInterface = {
      val __obj = js.Dynamic.literal(transform = js.Any.fromFunction2((t0: PathRef, t1: Operation) => (transform(t0, t1)).runNow()))
      __obj.asInstanceOf[PathRefInterface]
    }
    
    extension [Self <: PathRefInterface](x: Self) {
      
      inline def setTransform(value: (PathRef, Operation) => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction2((t0: PathRef, t1: Operation) => (value(t0, t1)).runNow()))
    }
  }
}
