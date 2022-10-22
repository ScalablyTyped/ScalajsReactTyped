package typingsJapgolly.jqueryBootstrapWizard

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wizard extends StObject {
  
  def activeTab(): Any
  
  def currentIndex(): Double
  
  def first(): Unit
  
  def firstIndex(): Double
  
  def getIndex(element: Any): Double
  
  def last(): Unit
  
  def lastIndex(): Double
  
  def navigationLength(): Double
  
  def next(): Unit
  
  def nextIndex(): Double
  
  def nextTab(): Any
  
  def previous(): Unit
  
  def previousIndex(): Double
  
  def previousTab(): Any
  
  def show(index: Double): Any
}
object Wizard {
  
  inline def apply(
    activeTab: CallbackTo[Any],
    currentIndex: CallbackTo[Double],
    first: Callback,
    firstIndex: CallbackTo[Double],
    getIndex: Any => Double,
    last: Callback,
    lastIndex: CallbackTo[Double],
    navigationLength: CallbackTo[Double],
    next: Callback,
    nextIndex: CallbackTo[Double],
    nextTab: CallbackTo[Any],
    previous: Callback,
    previousIndex: CallbackTo[Double],
    previousTab: CallbackTo[Any],
    show: Double => Any
  ): Wizard = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.toJsFn, currentIndex = currentIndex.toJsFn, first = first.toJsFn, firstIndex = firstIndex.toJsFn, getIndex = js.Any.fromFunction1(getIndex), last = last.toJsFn, lastIndex = lastIndex.toJsFn, navigationLength = navigationLength.toJsFn, next = next.toJsFn, nextIndex = nextIndex.toJsFn, nextTab = nextTab.toJsFn, previous = previous.toJsFn, previousIndex = previousIndex.toJsFn, previousTab = previousTab.toJsFn, show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[Wizard]
  }
  
  extension [Self <: Wizard](x: Self) {
    
    inline def setActiveTab(value: CallbackTo[Any]): Self = StObject.set(x, "activeTab", value.toJsFn)
    
    inline def setCurrentIndex(value: CallbackTo[Double]): Self = StObject.set(x, "currentIndex", value.toJsFn)
    
    inline def setFirst(value: Callback): Self = StObject.set(x, "first", value.toJsFn)
    
    inline def setFirstIndex(value: CallbackTo[Double]): Self = StObject.set(x, "firstIndex", value.toJsFn)
    
    inline def setGetIndex(value: Any => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
    
    inline def setLast(value: Callback): Self = StObject.set(x, "last", value.toJsFn)
    
    inline def setLastIndex(value: CallbackTo[Double]): Self = StObject.set(x, "lastIndex", value.toJsFn)
    
    inline def setNavigationLength(value: CallbackTo[Double]): Self = StObject.set(x, "navigationLength", value.toJsFn)
    
    inline def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
    
    inline def setNextIndex(value: CallbackTo[Double]): Self = StObject.set(x, "nextIndex", value.toJsFn)
    
    inline def setNextTab(value: CallbackTo[Any]): Self = StObject.set(x, "nextTab", value.toJsFn)
    
    inline def setPrevious(value: Callback): Self = StObject.set(x, "previous", value.toJsFn)
    
    inline def setPreviousIndex(value: CallbackTo[Double]): Self = StObject.set(x, "previousIndex", value.toJsFn)
    
    inline def setPreviousTab(value: CallbackTo[Any]): Self = StObject.set(x, "previousTab", value.toJsFn)
    
    inline def setShow(value: Double => Any): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
