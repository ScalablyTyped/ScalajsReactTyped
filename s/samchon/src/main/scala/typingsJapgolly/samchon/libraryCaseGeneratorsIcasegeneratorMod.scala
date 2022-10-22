package typingsJapgolly.samchon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryCaseGeneratorsIcasegeneratorMod {
  
  trait ICaseGenerator extends StObject {
    
    /**
      * Get index'th case.
      *
      * @param index Index number
      * @return The row of the index'th in combined permuation case
      */
    def at(index: Double): js.Array[Double]
    
    /**
      * Get size of all cases.
      *
      * @return Get a number of the all cases.
      */
    def size(): Double
  }
  object ICaseGenerator {
    
    inline def apply(at: Double => js.Array[Double], size: CallbackTo[Double]): ICaseGenerator = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), size = size.toJsFn)
      __obj.asInstanceOf[ICaseGenerator]
    }
    
    extension [Self <: ICaseGenerator](x: Self) {
      
      inline def setAt(value: Double => js.Array[Double]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
    }
  }
}
