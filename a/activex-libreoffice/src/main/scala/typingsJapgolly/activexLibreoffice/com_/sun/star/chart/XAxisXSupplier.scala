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
  * gives access to the **x** -axis of a chart.
  *
  * Note that not all diagrams are capable of displaying an **x** -axis, e.g., the {@link PieDiagram} .
  * @see XDiagram
  */
trait XAxisXSupplier
  extends StObject
     with XInterface {
  
  /**
    * @returns the properties of the **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val XAxis: XPropertySet
  
  /**
    * @returns the **x** -axis title shape.
    * @see ChartTitle
    */
  val XAxisTitle: XShape
  
  /**
    * @returns the properties of the help grid (minor grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  val XHelpGrid: XPropertySet
  
  /**
    * @returns the properties of the main grid (major grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  val XMainGrid: XPropertySet
  
  /**
    * @returns the properties of the **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getXAxis(): XPropertySet
  
  /**
    * @returns the **x** -axis title shape.
    * @see ChartTitle
    */
  def getXAxisTitle(): XShape
  
  /**
    * @returns the properties of the help grid (minor grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  def getXHelpGrid(): XPropertySet
  
  /**
    * @returns the properties of the main grid (major grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  def getXMainGrid(): XPropertySet
}
object XAxisXSupplier {
  
  inline def apply(
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    acquire: Callback,
    getXAxis: CallbackTo[XPropertySet],
    getXAxisTitle: CallbackTo[XShape],
    getXHelpGrid: CallbackTo[XPropertySet],
    getXMainGrid: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): XAxisXSupplier = {
    val __obj = js.Dynamic.literal(XAxis = XAxis.asInstanceOf[js.Any], XAxisTitle = XAxisTitle.asInstanceOf[js.Any], XHelpGrid = XHelpGrid.asInstanceOf[js.Any], XMainGrid = XMainGrid.asInstanceOf[js.Any], acquire = acquire.toJsFn, getXAxis = getXAxis.toJsFn, getXAxisTitle = getXAxisTitle.toJsFn, getXHelpGrid = getXHelpGrid.toJsFn, getXMainGrid = getXMainGrid.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAxisXSupplier]
  }
  
  extension [Self <: XAxisXSupplier](x: Self) {
    
    inline def setGetXAxis(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getXAxis", value.toJsFn)
    
    inline def setGetXAxisTitle(value: CallbackTo[XShape]): Self = StObject.set(x, "getXAxisTitle", value.toJsFn)
    
    inline def setGetXHelpGrid(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getXHelpGrid", value.toJsFn)
    
    inline def setGetXMainGrid(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getXMainGrid", value.toJsFn)
    
    inline def setXAxis(value: XPropertySet): Self = StObject.set(x, "XAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisTitle(value: XShape): Self = StObject.set(x, "XAxisTitle", value.asInstanceOf[js.Any])
    
    inline def setXHelpGrid(value: XPropertySet): Self = StObject.set(x, "XHelpGrid", value.asInstanceOf[js.Any])
    
    inline def setXMainGrid(value: XPropertySet): Self = StObject.set(x, "XMainGrid", value.asInstanceOf[js.Any])
  }
}
