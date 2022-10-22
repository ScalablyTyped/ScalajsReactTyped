package typingsJapgolly.isNaturalNumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(number: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(number: String, option: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  /**
    * Rreturns true if the first argument is one of the natural numbers.
    * If not, or the argument is not a number, it returns false.
    */
  inline def apply(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(number: Double, option: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("is-natural-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Setting this option true makes 0 regarded as a natural number.
      */
    var includeZero: Boolean
  }
  object Options {
    
    inline def apply(includeZero: Boolean): Options = {
      val __obj = js.Dynamic.literal(includeZero = includeZero.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIncludeZero(value: Boolean): Self = StObject.set(x, "includeZero", value.asInstanceOf[js.Any])
    }
  }
}
