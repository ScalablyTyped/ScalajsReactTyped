package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideLocale extends StObject {
  
  /**
    * Returns the decimal separator.
    *
    * @returns The decimal separator.
    * @example
    *
    * var locale = GlideLocale.get();
    * var decimalSeparator = locale.getDecimalSeparator();
    * gs.info( "The decimal separator is " + decimalSeparator);
    * // The decimal separator is .
    */
  def getDecimalSeparator(): String
  
  /**
    * Returns the grouping separator.
    *
    * @returns The grouping separator.
    * @example
    *
    * var locale = GlideLocale.get();
    * var groupingSeparator = locale.getGroupingSeparator();
    * gs.info( "The grouping separator is " + groupingSeparator);
    */
  def getGroupingSeparator(): String
}
object GlideLocale {
  
  inline def apply(getDecimalSeparator: CallbackTo[String], getGroupingSeparator: CallbackTo[String]): GlideLocale = {
    val __obj = js.Dynamic.literal(getDecimalSeparator = getDecimalSeparator.toJsFn, getGroupingSeparator = getGroupingSeparator.toJsFn)
    __obj.asInstanceOf[GlideLocale]
  }
  
  extension [Self <: GlideLocale](x: Self) {
    
    inline def setGetDecimalSeparator(value: CallbackTo[String]): Self = StObject.set(x, "getDecimalSeparator", value.toJsFn)
    
    inline def setGetGroupingSeparator(value: CallbackTo[String]): Self = StObject.set(x, "getGroupingSeparator", value.toJsFn)
  }
}
