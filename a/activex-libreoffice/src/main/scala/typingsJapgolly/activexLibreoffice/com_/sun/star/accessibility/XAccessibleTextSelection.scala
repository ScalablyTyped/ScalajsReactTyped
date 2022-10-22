package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAccessibleTextSelection
  extends StObject
     with XInterface {
  
  val SelectedPortionCount: Double
  
  def addSelection(selectionIndex: Double, startOffset: Double, endOffset: Double): Double
  
  def getSelectedPortionCount(): Double
  
  def getSeletedPositionEnd(nSelectedPortionIndex: Double): Double
  
  def getSeletedPositionStart(nSelectedPortionIndex: Double): Double
  
  def removeSelection(selectionIndex: Double): Boolean
  
  def scrollToPosition(aPoint: Point, isLeftTop: Boolean): Boolean
}
object XAccessibleTextSelection {
  
  inline def apply(
    SelectedPortionCount: Double,
    acquire: Callback,
    addSelection: (Double, Double, Double) => Double,
    getSelectedPortionCount: CallbackTo[Double],
    getSeletedPositionEnd: Double => Double,
    getSeletedPositionStart: Double => Double,
    queryInterface: `type` => Any,
    release: Callback,
    removeSelection: Double => Boolean,
    scrollToPosition: (Point, Boolean) => Boolean
  ): XAccessibleTextSelection = {
    val __obj = js.Dynamic.literal(SelectedPortionCount = SelectedPortionCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, addSelection = js.Any.fromFunction3(addSelection), getSelectedPortionCount = getSelectedPortionCount.toJsFn, getSeletedPositionEnd = js.Any.fromFunction1(getSeletedPositionEnd), getSeletedPositionStart = js.Any.fromFunction1(getSeletedPositionStart), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSelection = js.Any.fromFunction1(removeSelection), scrollToPosition = js.Any.fromFunction2(scrollToPosition))
    __obj.asInstanceOf[XAccessibleTextSelection]
  }
  
  extension [Self <: XAccessibleTextSelection](x: Self) {
    
    inline def setAddSelection(value: (Double, Double, Double) => Double): Self = StObject.set(x, "addSelection", js.Any.fromFunction3(value))
    
    inline def setGetSelectedPortionCount(value: CallbackTo[Double]): Self = StObject.set(x, "getSelectedPortionCount", value.toJsFn)
    
    inline def setGetSeletedPositionEnd(value: Double => Double): Self = StObject.set(x, "getSeletedPositionEnd", js.Any.fromFunction1(value))
    
    inline def setGetSeletedPositionStart(value: Double => Double): Self = StObject.set(x, "getSeletedPositionStart", js.Any.fromFunction1(value))
    
    inline def setRemoveSelection(value: Double => Boolean): Self = StObject.set(x, "removeSelection", js.Any.fromFunction1(value))
    
    inline def setScrollToPosition(value: (Point, Boolean) => Boolean): Self = StObject.set(x, "scrollToPosition", js.Any.fromFunction2(value))
    
    inline def setSelectedPortionCount(value: Double): Self = StObject.set(x, "SelectedPortionCount", value.asInstanceOf[js.Any])
  }
}
