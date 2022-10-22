package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XChartShapeContainer
  extends StObject
     with XInterface {
  
  val Shape: XShape
  
  /** a renderer creates ChartShapes and adds it to this container */
  def addShape(xShape: XShape): Unit
  
  def getShape(): XShape
  
  /** a renderer can remove ChartShapes from this container (e.g. if the visible range has changed) */
  def removeShape(xShape: XShape): Unit
}
object XChartShapeContainer {
  
  inline def apply(
    Shape: XShape,
    acquire: Callback,
    addShape: XShape => Callback,
    getShape: CallbackTo[XShape],
    queryInterface: `type` => Any,
    release: Callback,
    removeShape: XShape => Callback
  ): XChartShapeContainer = {
    val __obj = js.Dynamic.literal(Shape = Shape.asInstanceOf[js.Any], acquire = acquire.toJsFn, addShape = js.Any.fromFunction1((t0: XShape) => addShape(t0).runNow()), getShape = getShape.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeShape = js.Any.fromFunction1((t0: XShape) => removeShape(t0).runNow()))
    __obj.asInstanceOf[XChartShapeContainer]
  }
  
  extension [Self <: XChartShapeContainer](x: Self) {
    
    inline def setAddShape(value: XShape => Callback): Self = StObject.set(x, "addShape", js.Any.fromFunction1((t0: XShape) => value(t0).runNow()))
    
    inline def setGetShape(value: CallbackTo[XShape]): Self = StObject.set(x, "getShape", value.toJsFn)
    
    inline def setRemoveShape(value: XShape => Callback): Self = StObject.set(x, "removeShape", js.Any.fromFunction1((t0: XShape) => value(t0).runNow()))
    
    inline def setShape(value: XShape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
  }
}
