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
  * gives access to the **z** -axis of a chart.
  * @see XDiagram
  */
trait XAxisZSupplier
  extends StObject
     with XInterface {
  
  /**
    * @returns the properties of the **z** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val ZAxis: XPropertySet
  
  /**
    * @returns the **z** -axis title shape.
    * @see ChartTitle
    */
  val ZAxisTitle: XShape
  
  /**
    * @returns the properties of the help grid (minor grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  val ZHelpGrid: XPropertySet
  
  /**
    * @returns the properties of the main grid (major grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  val ZMainGrid: XPropertySet
  
  /**
    * @returns the properties of the **z** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getZAxis(): XPropertySet
  
  /**
    * @returns the **z** -axis title shape.
    * @see ChartTitle
    */
  def getZAxisTitle(): XShape
  
  /**
    * @returns the properties of the help grid (minor grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  def getZHelpGrid(): XPropertySet
  
  /**
    * @returns the properties of the main grid (major grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  def getZMainGrid(): XPropertySet
}
object XAxisZSupplier {
  
  inline def apply(
    ZAxis: XPropertySet,
    ZAxisTitle: XShape,
    ZHelpGrid: XPropertySet,
    ZMainGrid: XPropertySet,
    acquire: Callback,
    getZAxis: CallbackTo[XPropertySet],
    getZAxisTitle: CallbackTo[XShape],
    getZHelpGrid: CallbackTo[XPropertySet],
    getZMainGrid: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): XAxisZSupplier = {
    val __obj = js.Dynamic.literal(ZAxis = ZAxis.asInstanceOf[js.Any], ZAxisTitle = ZAxisTitle.asInstanceOf[js.Any], ZHelpGrid = ZHelpGrid.asInstanceOf[js.Any], ZMainGrid = ZMainGrid.asInstanceOf[js.Any], acquire = acquire.toJsFn, getZAxis = getZAxis.toJsFn, getZAxisTitle = getZAxisTitle.toJsFn, getZHelpGrid = getZHelpGrid.toJsFn, getZMainGrid = getZMainGrid.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAxisZSupplier]
  }
  
  extension [Self <: XAxisZSupplier](x: Self) {
    
    inline def setGetZAxis(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getZAxis", value.toJsFn)
    
    inline def setGetZAxisTitle(value: CallbackTo[XShape]): Self = StObject.set(x, "getZAxisTitle", value.toJsFn)
    
    inline def setGetZHelpGrid(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getZHelpGrid", value.toJsFn)
    
    inline def setGetZMainGrid(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getZMainGrid", value.toJsFn)
    
    inline def setZAxis(value: XPropertySet): Self = StObject.set(x, "ZAxis", value.asInstanceOf[js.Any])
    
    inline def setZAxisTitle(value: XShape): Self = StObject.set(x, "ZAxisTitle", value.asInstanceOf[js.Any])
    
    inline def setZHelpGrid(value: XPropertySet): Self = StObject.set(x, "ZHelpGrid", value.asInstanceOf[js.Any])
    
    inline def setZMainGrid(value: XPropertySet): Self = StObject.set(x, "ZMainGrid", value.asInstanceOf[js.Any])
  }
}
