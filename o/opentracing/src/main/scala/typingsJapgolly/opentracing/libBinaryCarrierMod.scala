package typingsJapgolly.opentracing

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBinaryCarrierMod {
  
  @JSImport("opentracing/lib/binary_carrier", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BinaryCarrier {
    def this(buffer: ArrayLike[Double]) = this()
    
    /* CompleteClass */
    var buffer: ArrayLike[Double] = js.native
  }
  
  trait BinaryCarrier extends StObject {
    
    var buffer: ArrayLike[Double]
  }
  object BinaryCarrier {
    
    inline def apply(buffer: ArrayLike[Double]): BinaryCarrier = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryCarrier]
    }
    
    extension [Self <: BinaryCarrier](x: Self) {
      
      inline def setBuffer(value: ArrayLike[Double]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
}
