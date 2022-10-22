package typingsJapgolly.microsoftAjax

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String extends StObject {
  
  //#region Extensions
  /**
    * Formats a number by using the invariant culture.
    * @returns true if the end of the String object matches suffix; otherwise, false.
    */
  def endsWith(suffix: java.lang.String): Boolean
  
  /**
    * Removes leading and trailing white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the start and end of the string.
    */
  def trim(): java.lang.String
  
  /**
    * Removes trailing white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the end of the string.
    */
  def trimEnd(): java.lang.String
  
  /**
    * Removes leading white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the start of the string.
    */
  def trimStart(): java.lang.String
}
object String {
  
  inline def apply(
    endsWith: java.lang.String => Boolean,
    trim: CallbackTo[java.lang.String],
    trimEnd: CallbackTo[java.lang.String],
    trimStart: CallbackTo[java.lang.String]
  ): String = {
    val __obj = js.Dynamic.literal(endsWith = js.Any.fromFunction1(endsWith), trim = trim.toJsFn, trimEnd = trimEnd.toJsFn, trimStart = trimStart.toJsFn)
    __obj.asInstanceOf[String]
  }
  
  extension [Self <: String](x: Self) {
    
    inline def setEndsWith(value: java.lang.String => Boolean): Self = StObject.set(x, "endsWith", js.Any.fromFunction1(value))
    
    inline def setTrim(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "trim", value.toJsFn)
    
    inline def setTrimEnd(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "trimEnd", value.toJsFn)
    
    inline def setTrimStart(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "trimStart", value.toJsFn)
  }
}
