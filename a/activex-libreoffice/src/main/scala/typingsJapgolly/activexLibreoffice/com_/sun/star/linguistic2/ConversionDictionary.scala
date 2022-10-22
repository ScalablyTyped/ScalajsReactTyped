package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XFlushListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XFlushable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a dictionary used in a conversion dictionary list.
  *
  * Specific implementations may put some restrictions for the dictionary or it's entries. Namely usually the order for the string pairs within a single
  * entry will be defined.
  * @see com.sun.star.linguistic2.ConversionDictionaryList
  * @see com.sun.star.linguistic2.HangulHanjaConversionDictionary
  * @see com.sun.star.linguistic2.XConversionDictionary
  * @see com.sun.star.linguistic2.XConversionPropertyType
  * @since OOo 1.1.2
  */
trait ConversionDictionary
  extends StObject
     with XConversionDictionary
     with XFlushable
     with XConversionPropertyType
object ConversionDictionary {
  
  inline def apply(
    ConversionType: Double,
    Locale: Locale,
    Name: String,
    acquire: Callback,
    addEntry: (String, String) => Callback,
    addFlushListener: XFlushListener => Callback,
    clear: Callback,
    flush: Callback,
    getConversionEntries: ConversionDirection => SafeArray[String],
    getConversionType: CallbackTo[Double],
    getConversions: (String, Double, Double, ConversionDirection, Double) => SafeArray[String],
    getLocale: CallbackTo[Locale],
    getMaxCharCount: ConversionDirection => Double,
    getName: CallbackTo[String],
    getPropertyType: (String, String) => Double,
    isActive: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEntry: (String, String) => Callback,
    removeFlushListener: XFlushListener => Callback,
    setActive: Boolean => Callback,
    setPropertyType: (String, String, Double) => Callback
  ): ConversionDictionary = {
    val __obj = js.Dynamic.literal(ConversionType = ConversionType.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEntry = js.Any.fromFunction2((t0: String, t1: String) => (addEntry(t0, t1)).runNow()), addFlushListener = js.Any.fromFunction1((t0: XFlushListener) => addFlushListener(t0).runNow()), clear = clear.toJsFn, flush = flush.toJsFn, getConversionEntries = js.Any.fromFunction1(getConversionEntries), getConversionType = getConversionType.toJsFn, getConversions = js.Any.fromFunction5(getConversions), getLocale = getLocale.toJsFn, getMaxCharCount = js.Any.fromFunction1(getMaxCharCount), getName = getName.toJsFn, getPropertyType = js.Any.fromFunction2(getPropertyType), isActive = isActive.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEntry = js.Any.fromFunction2((t0: String, t1: String) => (removeEntry(t0, t1)).runNow()), removeFlushListener = js.Any.fromFunction1((t0: XFlushListener) => removeFlushListener(t0).runNow()), setActive = js.Any.fromFunction1((t0: Boolean) => setActive(t0).runNow()), setPropertyType = js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (setPropertyType(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[ConversionDictionary]
  }
}
