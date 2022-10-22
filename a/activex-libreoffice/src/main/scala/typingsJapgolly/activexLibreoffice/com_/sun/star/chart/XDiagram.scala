package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * manages the diagram of the chart document.
  * @see XChartDocument
  */
trait XDiagram
  extends StObject
     with XShape {
  
  /** @returns a string representing the diagram type. This string contains the fully qualified name of the corresponding service. */
  val DiagramType: String
  
  /**
    * @param nCol the index of the data point of a series (0-based).
    * @param nRow the index of a series (0-based).
    * @returns the properties of the specified data point.
    * @see ChartDataPointProperties
    */
  def getDataPointProperties(nCol: Double, nRow: Double): XPropertySet
  
  /**
    * @param nRow the index of the series (0-based)
    * @returns the properties of the specified data row (series).
    * @see ChartDataRowProperties
    */
  def getDataRowProperties(nRow: Double): XPropertySet
  
  /** @returns a string representing the diagram type. This string contains the fully qualified name of the corresponding service. */
  def getDiagramType(): String
}
object XDiagram {
  
  inline def apply(
    DiagramType: String,
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: Callback,
    getDataPointProperties: (Double, Double) => XPropertySet,
    getDataRowProperties: Double => XPropertySet,
    getDiagramType: CallbackTo[String],
    getPosition: CallbackTo[Point],
    getShapeType: CallbackTo[String],
    getSize: CallbackTo[Size],
    queryInterface: `type` => Any,
    release: Callback,
    setPosition: Point => Callback,
    setSize: Size => Callback
  ): XDiagram = {
    val __obj = js.Dynamic.literal(DiagramType = DiagramType.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDataPointProperties = js.Any.fromFunction2(getDataPointProperties), getDataRowProperties = js.Any.fromFunction1(getDataRowProperties), getDiagramType = getDiagramType.toJsFn, getPosition = getPosition.toJsFn, getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()))
    __obj.asInstanceOf[XDiagram]
  }
  
  extension [Self <: XDiagram](x: Self) {
    
    inline def setDiagramType(value: String): Self = StObject.set(x, "DiagramType", value.asInstanceOf[js.Any])
    
    inline def setGetDataPointProperties(value: (Double, Double) => XPropertySet): Self = StObject.set(x, "getDataPointProperties", js.Any.fromFunction2(value))
    
    inline def setGetDataRowProperties(value: Double => XPropertySet): Self = StObject.set(x, "getDataRowProperties", js.Any.fromFunction1(value))
    
    inline def setGetDiagramType(value: CallbackTo[String]): Self = StObject.set(x, "getDiagramType", value.toJsFn)
  }
}
