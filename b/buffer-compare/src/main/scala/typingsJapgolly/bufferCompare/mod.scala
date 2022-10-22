package typingsJapgolly.bufferCompare

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cmp: typingsJapgolly.bufferCompare.mod.List, to: typingsJapgolly.bufferCompare.mod.List): Double = (^.asInstanceOf[js.Dynamic].apply(cmp.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply[T](cmp: T, to: T): Double = (^.asInstanceOf[js.Dynamic].apply(cmp.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("buffer-compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait List
    extends StObject
       with /* index */ NumberDictionary[Any] {
    
    var length: Double
  }
  object List {
    
    inline def apply(length: Double): typingsJapgolly.bufferCompare.mod.List = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.bufferCompare.mod.List]
    }
    
    extension [Self <: typingsJapgolly.bufferCompare.mod.List](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
