package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allow for different positioning options for a diagram
  * @see Diagram
  */
trait XDiagramPositioning
  extends StObject
     with XInterface {
  
  /** @returns the position rectangle of the inner diagram part excluding any axes, labels and titles. Position and size are given in 100/th mm. It might be nec */
  def calculateDiagramPositionExcludingAxes(): Rectangle
  
  /** @returns the position rectangle of the diagram including the axes and axes labels, but excluding the axes titles. Position and size are given in 100/th mm */
  def calculateDiagramPositionIncludingAxes(): Rectangle
  
  /** @returns the position rectangle of the diagram including the axes, axes labels and axes titles. Position and size are given in 100/th mm. It might be nece */
  def calculateDiagramPositionIncludingAxesAndAxisTitles(): Rectangle
  
  /** @returns whether the diagram is placed automatically */
  def isAutomaticDiagramPositioning(): Boolean
  
  /** @returns true in case the diagram position was set with method setDiagramPositionExcludingAxes */
  def isExcludingDiagramPositioning(): Boolean
  
  /** the diagram will be placed automatically */
  def setAutomaticDiagramPositioning(): Unit
  
  /**
    * place the inner diagram part excluding any axes, labels and titles
    * @param PositionRect specifies the position and size in 100/th mm
    */
  def setDiagramPositionExcludingAxes(PositionRect: Rectangle): Unit
  
  /**
    * place the outer diagram part including the axes and axes labels, but excluding the axes titles.
    * @param PositionRect specifies the position and size in 100/th mm
    */
  def setDiagramPositionIncludingAxes(PositionRect: Rectangle): Unit
  
  /**
    * place the diagram including the axes, axes labels and axes titles. For the placement the current axis titles are taken into account, so the titles
    * must be initialized properly before this method is called.
    * @param PositionRect specifies the position and size in 100/th mm
    */
  def setDiagramPositionIncludingAxesAndAxisTitles(PositionRect: Rectangle): Unit
}
object XDiagramPositioning {
  
  inline def apply(
    acquire: Callback,
    calculateDiagramPositionExcludingAxes: CallbackTo[Rectangle],
    calculateDiagramPositionIncludingAxes: CallbackTo[Rectangle],
    calculateDiagramPositionIncludingAxesAndAxisTitles: CallbackTo[Rectangle],
    isAutomaticDiagramPositioning: CallbackTo[Boolean],
    isExcludingDiagramPositioning: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setAutomaticDiagramPositioning: Callback,
    setDiagramPositionExcludingAxes: Rectangle => Callback,
    setDiagramPositionIncludingAxes: Rectangle => Callback,
    setDiagramPositionIncludingAxesAndAxisTitles: Rectangle => Callback
  ): XDiagramPositioning = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, calculateDiagramPositionExcludingAxes = calculateDiagramPositionExcludingAxes.toJsFn, calculateDiagramPositionIncludingAxes = calculateDiagramPositionIncludingAxes.toJsFn, calculateDiagramPositionIncludingAxesAndAxisTitles = calculateDiagramPositionIncludingAxesAndAxisTitles.toJsFn, isAutomaticDiagramPositioning = isAutomaticDiagramPositioning.toJsFn, isExcludingDiagramPositioning = isExcludingDiagramPositioning.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setAutomaticDiagramPositioning = setAutomaticDiagramPositioning.toJsFn, setDiagramPositionExcludingAxes = js.Any.fromFunction1((t0: Rectangle) => setDiagramPositionExcludingAxes(t0).runNow()), setDiagramPositionIncludingAxes = js.Any.fromFunction1((t0: Rectangle) => setDiagramPositionIncludingAxes(t0).runNow()), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1((t0: Rectangle) => setDiagramPositionIncludingAxesAndAxisTitles(t0).runNow()))
    __obj.asInstanceOf[XDiagramPositioning]
  }
  
  extension [Self <: XDiagramPositioning](x: Self) {
    
    inline def setCalculateDiagramPositionExcludingAxes(value: CallbackTo[Rectangle]): Self = StObject.set(x, "calculateDiagramPositionExcludingAxes", value.toJsFn)
    
    inline def setCalculateDiagramPositionIncludingAxes(value: CallbackTo[Rectangle]): Self = StObject.set(x, "calculateDiagramPositionIncludingAxes", value.toJsFn)
    
    inline def setCalculateDiagramPositionIncludingAxesAndAxisTitles(value: CallbackTo[Rectangle]): Self = StObject.set(x, "calculateDiagramPositionIncludingAxesAndAxisTitles", value.toJsFn)
    
    inline def setIsAutomaticDiagramPositioning(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAutomaticDiagramPositioning", value.toJsFn)
    
    inline def setIsExcludingDiagramPositioning(value: CallbackTo[Boolean]): Self = StObject.set(x, "isExcludingDiagramPositioning", value.toJsFn)
    
    inline def setSetAutomaticDiagramPositioning(value: Callback): Self = StObject.set(x, "setAutomaticDiagramPositioning", value.toJsFn)
    
    inline def setSetDiagramPositionExcludingAxes(value: Rectangle => Callback): Self = StObject.set(x, "setDiagramPositionExcludingAxes", js.Any.fromFunction1((t0: Rectangle) => value(t0).runNow()))
    
    inline def setSetDiagramPositionIncludingAxes(value: Rectangle => Callback): Self = StObject.set(x, "setDiagramPositionIncludingAxes", js.Any.fromFunction1((t0: Rectangle) => value(t0).runNow()))
    
    inline def setSetDiagramPositionIncludingAxesAndAxisTitles(value: Rectangle => Callback): Self = StObject.set(x, "setDiagramPositionIncludingAxesAndAxisTitles", js.Any.fromFunction1((t0: Rectangle) => value(t0).runNow()))
  }
}
