package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a date field. */
trait XDateField
  extends StObject
     with XInterface {
  
  /** returns the date value which is currently displayed in the date field. */
  var Date: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
  
  /** returns the currently set first value which is set on POS1 key. */
  var First: Date
  
  /** returns the currently set last value which is set on END key. */
  var Last: Date
  
  /** returns the currently set maximum date value that can be entered by the user. */
  var Max: Date
  
  /** returns the currently set minimum date value that can be entered by the user. */
  var Min: Date
  
  /** returns the date value which is currently displayed in the date field. */
  def getDate(): Date
  
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): Date
  
  /** returns the currently set last value which is set on END key. */
  def getLast(): Date
  
  /** returns the currently set maximum date value that can be entered by the user. */
  def getMax(): Date
  
  /** returns the currently set minimum date value that can be entered by the user. */
  def getMin(): Date
  
  /** returns whether currently an empty value is set for the date. */
  def isEmpty(): Boolean
  
  /** determines if the long date format is currently used. */
  def isLongFormat(): Boolean
  
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean
  
  /** sets the date value which is displayed in the date field. */
  def setDate(Date: Date): Unit
  
  /** sets an empty value for the date. */
  def setEmpty(): Unit
  
  /** sets the first value to be set on POS1 key. */
  def setFirst(Date: Date): Unit
  
  /** sets the last value to be set on END key. */
  def setLast(Date: Date): Unit
  
  /** determines if the long date format is to be used. */
  def setLongFormat(bLong: Boolean): Unit
  
  /** sets the maximum date value that can be entered by the user. */
  def setMax(Date: Date): Unit
  
  /** sets the minimum date value that can be entered by the user. */
  def setMin(Date: Date): Unit
  
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit
}
object XDateField {
  
  inline def apply(
    Date: Date,
    First: Date,
    Last: Date,
    Max: Date,
    Min: Date,
    acquire: Callback,
    getDate: CallbackTo[Date],
    getFirst: CallbackTo[Date],
    getLast: CallbackTo[Date],
    getMax: CallbackTo[Date],
    getMin: CallbackTo[Date],
    isEmpty: CallbackTo[Boolean],
    isLongFormat: CallbackTo[Boolean],
    isStrictFormat: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setDate: Date => Callback,
    setEmpty: Callback,
    setFirst: Date => Callback,
    setLast: Date => Callback,
    setLongFormat: Boolean => Callback,
    setMax: Date => Callback,
    setMin: Date => Callback,
    setStrictFormat: Boolean => Callback
  ): XDateField = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], First = First.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDate = getDate.toJsFn, getFirst = getFirst.toJsFn, getLast = getLast.toJsFn, getMax = getMax.toJsFn, getMin = getMin.toJsFn, isEmpty = isEmpty.toJsFn, isLongFormat = isLongFormat.toJsFn, isStrictFormat = isStrictFormat.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDate = js.Any.fromFunction1((t0: Date) => setDate(t0).runNow()), setEmpty = setEmpty.toJsFn, setFirst = js.Any.fromFunction1((t0: Date) => setFirst(t0).runNow()), setLast = js.Any.fromFunction1((t0: Date) => setLast(t0).runNow()), setLongFormat = js.Any.fromFunction1((t0: Boolean) => setLongFormat(t0).runNow()), setMax = js.Any.fromFunction1((t0: Date) => setMax(t0).runNow()), setMin = js.Any.fromFunction1((t0: Date) => setMin(t0).runNow()), setStrictFormat = js.Any.fromFunction1((t0: Boolean) => setStrictFormat(t0).runNow()))
    __obj.asInstanceOf[XDateField]
  }
  
  extension [Self <: XDateField](x: Self) {
    
    inline def setDate(value: Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Date): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    inline def setGetDate(value: CallbackTo[Date]): Self = StObject.set(x, "getDate", value.toJsFn)
    
    inline def setGetFirst(value: CallbackTo[Date]): Self = StObject.set(x, "getFirst", value.toJsFn)
    
    inline def setGetLast(value: CallbackTo[Date]): Self = StObject.set(x, "getLast", value.toJsFn)
    
    inline def setGetMax(value: CallbackTo[Date]): Self = StObject.set(x, "getMax", value.toJsFn)
    
    inline def setGetMin(value: CallbackTo[Date]): Self = StObject.set(x, "getMin", value.toJsFn)
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setIsLongFormat(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLongFormat", value.toJsFn)
    
    inline def setIsStrictFormat(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStrictFormat", value.toJsFn)
    
    inline def setLast(value: Date): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Date): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Date): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setSetDate(value: Date => Callback): Self = StObject.set(x, "setDate", js.Any.fromFunction1((t0: Date) => value(t0).runNow()))
    
    inline def setSetEmpty(value: Callback): Self = StObject.set(x, "setEmpty", value.toJsFn)
    
    inline def setSetFirst(value: Date => Callback): Self = StObject.set(x, "setFirst", js.Any.fromFunction1((t0: Date) => value(t0).runNow()))
    
    inline def setSetLast(value: Date => Callback): Self = StObject.set(x, "setLast", js.Any.fromFunction1((t0: Date) => value(t0).runNow()))
    
    inline def setSetLongFormat(value: Boolean => Callback): Self = StObject.set(x, "setLongFormat", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetMax(value: Date => Callback): Self = StObject.set(x, "setMax", js.Any.fromFunction1((t0: Date) => value(t0).runNow()))
    
    inline def setSetMin(value: Date => Callback): Self = StObject.set(x, "setMin", js.Any.fromFunction1((t0: Date) => value(t0).runNow()))
    
    inline def setSetStrictFormat(value: Boolean => Callback): Self = StObject.set(x, "setStrictFormat", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
