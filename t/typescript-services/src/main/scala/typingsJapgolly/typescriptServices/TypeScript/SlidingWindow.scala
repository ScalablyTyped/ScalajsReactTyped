package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlidingWindow extends StObject {
  
  /* private */ var _pinCount: Any
  
  def absoluteIndex(): Double
  
  /* private */ def addMoreItemsToWindow(argument: Any): Any
  
  def currentItem(argument: Any): Any
  
  var currentRelativeItemIndex: Double
  
  /* private */ var defaultValue: Any
  
  def disgardAllItemsFromCurrentIndexOnwards(): Unit
  
  /* private */ var firstPinnedAbsoluteIndex: Any
  
  def getAndPinAbsoluteIndex(): Double
  
  def isAtEndOfSource(): Boolean
  
  def moveToNextItem(): Unit
  
  def peekItemN(n: Double): Any
  
  def pinCount(): Double
  
  def releaseAndUnpinAbsoluteIndex(absoluteIndex: Double): Unit
  
  def rewindToPinnedIndex(absoluteIndex: Double): Unit
  
  def setAbsoluteIndex(absoluteIndex: Double): Unit
  
  /* private */ var source: Any
  
  /* private */ var sourceLength: Any
  
  /* private */ def tryShiftOrGrowWindow(): Any
  
  var window: js.Array[Any]
  
  /* private */ def windowAbsoluteEndIndex(): Any
  
  var windowAbsoluteStartIndex: Double
  
  var windowCount: Double
}
object SlidingWindow {
  
  inline def apply(
    _pinCount: Any,
    absoluteIndex: CallbackTo[Double],
    addMoreItemsToWindow: Any => Any,
    currentItem: Any => Any,
    currentRelativeItemIndex: Double,
    defaultValue: Any,
    disgardAllItemsFromCurrentIndexOnwards: Callback,
    firstPinnedAbsoluteIndex: Any,
    getAndPinAbsoluteIndex: CallbackTo[Double],
    isAtEndOfSource: CallbackTo[Boolean],
    moveToNextItem: Callback,
    peekItemN: Double => Any,
    pinCount: CallbackTo[Double],
    releaseAndUnpinAbsoluteIndex: Double => Callback,
    rewindToPinnedIndex: Double => Callback,
    setAbsoluteIndex: Double => Callback,
    source: Any,
    sourceLength: Any,
    tryShiftOrGrowWindow: CallbackTo[Any],
    window: js.Array[Any],
    windowAbsoluteEndIndex: CallbackTo[Any],
    windowAbsoluteStartIndex: Double,
    windowCount: Double
  ): SlidingWindow = {
    val __obj = js.Dynamic.literal(_pinCount = _pinCount.asInstanceOf[js.Any], absoluteIndex = absoluteIndex.toJsFn, addMoreItemsToWindow = js.Any.fromFunction1(addMoreItemsToWindow), currentItem = js.Any.fromFunction1(currentItem), currentRelativeItemIndex = currentRelativeItemIndex.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], disgardAllItemsFromCurrentIndexOnwards = disgardAllItemsFromCurrentIndexOnwards.toJsFn, firstPinnedAbsoluteIndex = firstPinnedAbsoluteIndex.asInstanceOf[js.Any], getAndPinAbsoluteIndex = getAndPinAbsoluteIndex.toJsFn, isAtEndOfSource = isAtEndOfSource.toJsFn, moveToNextItem = moveToNextItem.toJsFn, peekItemN = js.Any.fromFunction1(peekItemN), pinCount = pinCount.toJsFn, releaseAndUnpinAbsoluteIndex = js.Any.fromFunction1((t0: Double) => releaseAndUnpinAbsoluteIndex(t0).runNow()), rewindToPinnedIndex = js.Any.fromFunction1((t0: Double) => rewindToPinnedIndex(t0).runNow()), setAbsoluteIndex = js.Any.fromFunction1((t0: Double) => setAbsoluteIndex(t0).runNow()), source = source.asInstanceOf[js.Any], sourceLength = sourceLength.asInstanceOf[js.Any], tryShiftOrGrowWindow = tryShiftOrGrowWindow.toJsFn, window = window.asInstanceOf[js.Any], windowAbsoluteEndIndex = windowAbsoluteEndIndex.toJsFn, windowAbsoluteStartIndex = windowAbsoluteStartIndex.asInstanceOf[js.Any], windowCount = windowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlidingWindow]
  }
  
  extension [Self <: SlidingWindow](x: Self) {
    
    inline def setAbsoluteIndex(value: CallbackTo[Double]): Self = StObject.set(x, "absoluteIndex", value.toJsFn)
    
    inline def setAddMoreItemsToWindow(value: Any => Any): Self = StObject.set(x, "addMoreItemsToWindow", js.Any.fromFunction1(value))
    
    inline def setCurrentItem(value: Any => Any): Self = StObject.set(x, "currentItem", js.Any.fromFunction1(value))
    
    inline def setCurrentRelativeItemIndex(value: Double): Self = StObject.set(x, "currentRelativeItemIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDisgardAllItemsFromCurrentIndexOnwards(value: Callback): Self = StObject.set(x, "disgardAllItemsFromCurrentIndexOnwards", value.toJsFn)
    
    inline def setFirstPinnedAbsoluteIndex(value: Any): Self = StObject.set(x, "firstPinnedAbsoluteIndex", value.asInstanceOf[js.Any])
    
    inline def setGetAndPinAbsoluteIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getAndPinAbsoluteIndex", value.toJsFn)
    
    inline def setIsAtEndOfSource(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAtEndOfSource", value.toJsFn)
    
    inline def setMoveToNextItem(value: Callback): Self = StObject.set(x, "moveToNextItem", value.toJsFn)
    
    inline def setPeekItemN(value: Double => Any): Self = StObject.set(x, "peekItemN", js.Any.fromFunction1(value))
    
    inline def setPinCount(value: CallbackTo[Double]): Self = StObject.set(x, "pinCount", value.toJsFn)
    
    inline def setReleaseAndUnpinAbsoluteIndex(value: Double => Callback): Self = StObject.set(x, "releaseAndUnpinAbsoluteIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRewindToPinnedIndex(value: Double => Callback): Self = StObject.set(x, "rewindToPinnedIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetAbsoluteIndex(value: Double => Callback): Self = StObject.set(x, "setAbsoluteIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceLength(value: Any): Self = StObject.set(x, "sourceLength", value.asInstanceOf[js.Any])
    
    inline def setTryShiftOrGrowWindow(value: CallbackTo[Any]): Self = StObject.set(x, "tryShiftOrGrowWindow", value.toJsFn)
    
    inline def setWindow(value: js.Array[Any]): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowAbsoluteEndIndex(value: CallbackTo[Any]): Self = StObject.set(x, "windowAbsoluteEndIndex", value.toJsFn)
    
    inline def setWindowAbsoluteStartIndex(value: Double): Self = StObject.set(x, "windowAbsoluteStartIndex", value.asInstanceOf[js.Any])
    
    inline def setWindowCount(value: Double): Self = StObject.set(x, "windowCount", value.asInstanceOf[js.Any])
    
    inline def setWindowVarargs(value: Any*): Self = StObject.set(x, "window", js.Array(value*))
    
    inline def set_pinCount(value: Any): Self = StObject.set(x, "_pinCount", value.asInstanceOf[js.Any])
  }
}
