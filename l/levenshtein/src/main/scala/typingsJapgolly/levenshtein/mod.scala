package typingsJapgolly.levenshtein

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("levenshtein", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Levenshtein {
    /**
      * Levenshtein string difference
      * @param m First string
      * @param n Second string
      */
    def this(m: String, n: String) = this()
    
    /**
      * Distance between strings
      */
    /* CompleteClass */
    var distance: Double = js.native
    
    /**
      * Return the Levenshtein table.
      */
    /* CompleteClass */
    override def getMatrix(): js.Array[js.Array[Double]] = js.native
    
    /**
      * Pretty print Levenshtein table.
      */
    /* CompleteClass */
    override def inspect(): String = js.native
  }
  
  trait Levenshtein extends StObject {
    
    /**
      * Distance between strings
      */
    var distance: Double
    
    /**
      * Return the Levenshtein table.
      */
    def getMatrix(): js.Array[js.Array[Double]]
    
    /**
      * Pretty print Levenshtein table.
      */
    def inspect(): String
  }
  object Levenshtein {
    
    inline def apply(distance: Double, getMatrix: CallbackTo[js.Array[js.Array[Double]]], inspect: CallbackTo[String]): Levenshtein = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], getMatrix = getMatrix.toJsFn, inspect = inspect.toJsFn)
      __obj.asInstanceOf[Levenshtein]
    }
    
    extension [Self <: Levenshtein](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setGetMatrix(value: CallbackTo[js.Array[js.Array[Double]]]): Self = StObject.set(x, "getMatrix", value.toJsFn)
      
      inline def setInspect(value: CallbackTo[String]): Self = StObject.set(x, "inspect", value.toJsFn)
    }
  }
}
