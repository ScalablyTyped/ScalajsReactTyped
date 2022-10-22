package typingsJapgolly.microsoftAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Provides extensions to the base ECMAScript (JavaScript) Boolean object.
* Boolean Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb397557(v=vs.100).aspx}
*/
trait BooleanConstructor extends StObject {
  
  //#region Extensions
  /**
    * Converts a string representation of a logical value to its Boolean object equivalent.
    */
  def parse(value: java.lang.String): Boolean
}
object BooleanConstructor {
  
  inline def apply(parse: java.lang.String => Boolean): BooleanConstructor = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[BooleanConstructor]
  }
  
  extension [Self <: BooleanConstructor](x: Self) {
    
    inline def setParse(value: java.lang.String => Boolean): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
