package typingsJapgolly.std.Intl

import typingsJapgolly.std.anon.TypeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFormat extends StObject {
  
  /**
    * Returns a string with a language-specific representation of the list.
    *
    * @param list - An iterable object, such as an [Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array).
    *
    * @throws `TypeError` if `list` includes something other than the possible values.
    *
    * @returns {string} A language-specific formatted string representing the elements of the list.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/format).
    */
  /* standard es2021.intl */
  def format(list: js.Iterable[String]): String
  
  /**
    * Returns an Array of objects representing the different components that can be used to format a list of values in a locale-aware fashion.
    *
    * @param list - An iterable object, such as an [Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array), to be formatted according to a locale.
    *
    * @throws `TypeError` if `list` includes something other than the possible values.
    *
    * @returns {{ type: "element" | "literal", value: string; }[]} An Array of components which contains the formatted parts from the list.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/formatToParts).
    */
  /* standard es2021.intl */
  def formatToParts(list: js.Iterable[String]): js.Array[TypeValue]
}
object ListFormat {
  
  inline def apply(format: js.Iterable[String] => String, formatToParts: js.Iterable[String] => js.Array[TypeValue]): ListFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatToParts = js.Any.fromFunction1(formatToParts))
    __obj.asInstanceOf[ListFormat]
  }
  
  extension [Self <: ListFormat](x: Self) {
    
    inline def setFormat(value: js.Iterable[String] => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatToParts(value: js.Iterable[String] => js.Array[TypeValue]): Self = StObject.set(x, "formatToParts", js.Any.fromFunction1(value))
  }
}
