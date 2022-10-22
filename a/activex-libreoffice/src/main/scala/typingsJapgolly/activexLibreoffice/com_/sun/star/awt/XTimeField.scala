package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and settings of a time field. */
trait XTimeField
  extends StObject
     with XInterface {
  
  /** returns the currently set first value which is set on POS1 key. */
  var First: Time
  
  /** returns the currently set last value which is set on END key. */
  var Last: Time
  
  /** returns the currently set maximum time value that can be entered by the user. */
  var Max: Time
  
  /** returns the currently set minimum time value that can be entered by the user. */
  var Min: Time
  
  /** returns the time value which is currently displayed in the time field. */
  var Time: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
  
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): Time
  
  /** returns the currently set last value which is set on END key. */
  def getLast(): Time
  
  /** returns the currently set maximum time value that can be entered by the user. */
  def getMax(): Time
  
  /** returns the currently set minimum time value that can be entered by the user. */
  def getMin(): Time
  
  /** returns the time value which is currently displayed in the time field. */
  def getTime(): Time
  
  /** returns whether currently an empty value is set for the time. */
  def isEmpty(): Boolean
  
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean
  
  /** sets an empty value for the time. */
  def setEmpty(): Unit
  
  /** sets the first value to be set on POS1 key. */
  def setFirst(Time: Time): Unit
  
  /** sets the last value to be set on END key. */
  def setLast(Time: Time): Unit
  
  /** sets the maximum time value that can be entered by the user. */
  def setMax(Time: Time): Unit
  
  /** sets the minimum time value that can be entered by the user. */
  def setMin(Time: Time): Unit
  
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit
  
  /** sets the time value which is displayed in the time field. */
  def setTime(Time: Time): Unit
}
object XTimeField {
  
  inline def apply(
    First: Time,
    Last: Time,
    Max: Time,
    Min: Time,
    Time: Time,
    acquire: Callback,
    getFirst: CallbackTo[Time],
    getLast: CallbackTo[Time],
    getMax: CallbackTo[Time],
    getMin: CallbackTo[Time],
    getTime: CallbackTo[Time],
    isEmpty: CallbackTo[Boolean],
    isStrictFormat: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setEmpty: Callback,
    setFirst: Time => Callback,
    setLast: Time => Callback,
    setMax: Time => Callback,
    setMin: Time => Callback,
    setStrictFormat: Boolean => Callback,
    setTime: Time => Callback
  ): XTimeField = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFirst = getFirst.toJsFn, getLast = getLast.toJsFn, getMax = getMax.toJsFn, getMin = getMin.toJsFn, getTime = getTime.toJsFn, isEmpty = isEmpty.toJsFn, isStrictFormat = isStrictFormat.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setEmpty = setEmpty.toJsFn, setFirst = js.Any.fromFunction1((t0: Time) => setFirst(t0).runNow()), setLast = js.Any.fromFunction1((t0: Time) => setLast(t0).runNow()), setMax = js.Any.fromFunction1((t0: Time) => setMax(t0).runNow()), setMin = js.Any.fromFunction1((t0: Time) => setMin(t0).runNow()), setStrictFormat = js.Any.fromFunction1((t0: Boolean) => setStrictFormat(t0).runNow()), setTime = js.Any.fromFunction1((t0: Time) => setTime(t0).runNow()))
    __obj.asInstanceOf[XTimeField]
  }
  
  extension [Self <: XTimeField](x: Self) {
    
    inline def setFirst(value: Time): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    inline def setGetFirst(value: CallbackTo[Time]): Self = StObject.set(x, "getFirst", value.toJsFn)
    
    inline def setGetLast(value: CallbackTo[Time]): Self = StObject.set(x, "getLast", value.toJsFn)
    
    inline def setGetMax(value: CallbackTo[Time]): Self = StObject.set(x, "getMax", value.toJsFn)
    
    inline def setGetMin(value: CallbackTo[Time]): Self = StObject.set(x, "getMin", value.toJsFn)
    
    inline def setGetTime(value: CallbackTo[Time]): Self = StObject.set(x, "getTime", value.toJsFn)
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setIsStrictFormat(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStrictFormat", value.toJsFn)
    
    inline def setLast(value: Time): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Time): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Time): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setSetEmpty(value: Callback): Self = StObject.set(x, "setEmpty", value.toJsFn)
    
    inline def setSetFirst(value: Time => Callback): Self = StObject.set(x, "setFirst", js.Any.fromFunction1((t0: Time) => value(t0).runNow()))
    
    inline def setSetLast(value: Time => Callback): Self = StObject.set(x, "setLast", js.Any.fromFunction1((t0: Time) => value(t0).runNow()))
    
    inline def setSetMax(value: Time => Callback): Self = StObject.set(x, "setMax", js.Any.fromFunction1((t0: Time) => value(t0).runNow()))
    
    inline def setSetMin(value: Time => Callback): Self = StObject.set(x, "setMin", js.Any.fromFunction1((t0: Time) => value(t0).runNow()))
    
    inline def setSetStrictFormat(value: Boolean => Callback): Self = StObject.set(x, "setStrictFormat", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetTime(value: Time => Callback): Self = StObject.set(x, "setTime", js.Any.fromFunction1((t0: Time) => value(t0).runNow()))
    
    inline def setTime(value: Time): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
  }
}
