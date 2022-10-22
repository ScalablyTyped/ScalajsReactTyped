package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the **y** -axis of a chart.
  *
  * Note that not all diagrams are capable of displaying a **y** -axis, e.g., the {@link PieDiagram} .
  * @see XDiagram
  */
trait XAxisYSupplier
  extends StObject
     with XInterface {
  
  /**
    * @returns the properties of the **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val YAxis: XPropertySet
  
  /**
    * @returns the **y** -axis title shape.
    * @see ChartTitle
    */
  val YAxisTitle: XShape
  
  /**
    * @returns the properties of the help grid (minor grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  val YHelpGrid: XPropertySet
  
  /**
    * @returns the properties of the main grid (major grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  val YMainGrid: XPropertySet
  
  /**
    * @returns the properties of the **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getYAxis(): XPropertySet
  
  /**
    * @returns the **y** -axis title shape.
    * @see ChartTitle
    */
  def getYAxisTitle(): XShape
  
  /**
    * @returns the properties of the help grid (minor grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  def getYHelpGrid(): XPropertySet
  
  /**
    * @returns the properties of the main grid (major grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  def getYMainGrid(): XPropertySet
}
object XAxisYSupplier {
  
  inline def apply(
    YAxis: XPropertySet,
    YAxisTitle: XShape,
    YHelpGrid: XPropertySet,
    YMainGrid: XPropertySet,
    acquire: Callback,
    getYAxis: CallbackTo[XPropertySet],
    getYAxisTitle: CallbackTo[XShape],
    getYHelpGrid: CallbackTo[XPropertySet],
    getYMainGrid: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): XAxisYSupplier = {
    val __obj = js.Dynamic.literal(YAxis = YAxis.asInstanceOf[js.Any], YAxisTitle = YAxisTitle.asInstanceOf[js.Any], YHelpGrid = YHelpGrid.asInstanceOf[js.Any], YMainGrid = YMainGrid.asInstanceOf[js.Any], acquire = acquire.toJsFn, getYAxis = getYAxis.toJsFn, getYAxisTitle = getYAxisTitle.toJsFn, getYHelpGrid = getYHelpGrid.toJsFn, getYMainGrid = getYMainGrid.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAxisYSupplier]
  }
  
  extension [Self <: XAxisYSupplier](x: Self) {
    
    inline def setGetYAxis(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getYAxis", value.toJsFn)
    
    inline def setGetYAxisTitle(value: CallbackTo[XShape]): Self = StObject.set(x, "getYAxisTitle", value.toJsFn)
    
    inline def setGetYHelpGrid(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getYHelpGrid", value.toJsFn)
    
    inline def setGetYMainGrid(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getYMainGrid", value.toJsFn)
    
    inline def setYAxis(value: XPropertySet): Self = StObject.set(x, "YAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisTitle(value: XShape): Self = StObject.set(x, "YAxisTitle", value.asInstanceOf[js.Any])
    
    inline def setYHelpGrid(value: XPropertySet): Self = StObject.set(x, "YHelpGrid", value.asInstanceOf[js.Any])
    
    inline def setYMainGrid(value: XPropertySet): Self = StObject.set(x, "YMainGrid", value.asInstanceOf[js.Any])
  }
}
