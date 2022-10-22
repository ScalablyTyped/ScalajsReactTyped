package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * manages the chart document.
  * @see XDiagram
  * @see XChartData
  */
trait XChartDocument
  extends StObject
     with XModel {
  
  /**
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    * @see ChartArea
    * @see X3DDisplay
    */
  val Area: XPropertySet
  
  /**
    * @returns the data of the chart.  The returned object supports interface {@link XChartDataArray} which can be used to access the concrete data.  Since OOo
    * @see XChartData
    * @see XChartDataArray
    * @see XComplexDescriptionAccess
    * @see XDateCategories
    */
  val Data: XChartData
  
  /**
    * @returns the diagram of the chart document.
    * @see Diagram
    */
  var Diagram: XDiagram
  
  /**
    * @returns the shape of the legend of the chart document.
    * @see ChartLegend
    */
  val Legend: XShape
  
  /**
    * @returns the shape of the subtitle of the chart document.  Usually the subtitle is smaller than the main title by default. And it is most commonly placed
    * @see ChartTitle
    */
  val SubTitle: XShape
  
  /**
    * @returns the shape of the main title of the chart document.
    * @see ChartTitle
    */
  val Title: XShape
  
  /**
    * attaches data to the chart.
    *
    * The given object needs to support interface {@link XChartDataArray} .
    *
    * Since OOo 3.3 if the given object might support interface {@link XComplexDescriptionAccess} which allows to set complex hierarchical axis
    * descriptions.
    *
    * Since OOo 3.4 if the given object might support interface {@link XDateCategories} which allows to set date values as x values for category charts.
    *
    * The given data is copied before it is applied to the chart. So changing xData after this call will have no effect on the chart.
    * @param xData the object that provides the new data.
    * @see XChartData
    * @see XChartDataArray
    * @see XComplexDescriptionAccess
    * @see XDateCategories
    */
  def attachData(xData: XChartData): Unit
  
  /**
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    * @see ChartArea
    * @see X3DDisplay
    */
  def getArea(): XPropertySet
  
  /**
    * @returns the data of the chart.  The returned object supports interface {@link XChartDataArray} which can be used to access the concrete data.  Since OOo
    * @see XChartData
    * @see XChartDataArray
    * @see XComplexDescriptionAccess
    * @see XDateCategories
    */
  def getData(): XChartData
  
  /**
    * @returns the diagram of the chart document.
    * @see Diagram
    */
  def getDiagram(): XDiagram
  
  /**
    * @returns the shape of the legend of the chart document.
    * @see ChartLegend
    */
  def getLegend(): XShape
  
  /**
    * @returns the shape of the subtitle of the chart document.  Usually the subtitle is smaller than the main title by default. And it is most commonly placed
    * @see ChartTitle
    */
  def getSubTitle(): XShape
  
  /**
    * @returns the shape of the main title of the chart document.
    * @see ChartTitle
    */
  def getTitle(): XShape
  
  /**
    * sets the diagram for the chart document.
    *
    * Setting a new diagram implicitly disposes the previous diagram.
    * @param xDiagram the new diagram that should be set for the chart. To create such a diagram component, you can use the {@link com.sun.star.lang.XMultiSer
    */
  def setDiagram(xDiagram: XDiagram): Unit
}
object XChartDocument {
  
  inline def apply(
    Area: XPropertySet,
    Args: SafeArray[PropertyValue],
    CurrentController: XController,
    CurrentSelection: XInterface,
    Data: XChartData,
    Diagram: XDiagram,
    Legend: XShape,
    SubTitle: XShape,
    Title: XShape,
    URL: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attachData: XChartData => Callback,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    connectController: XController => Callback,
    disconnectController: XController => Callback,
    dispose: Callback,
    getArea: CallbackTo[XPropertySet],
    getArgs: CallbackTo[SafeArray[PropertyValue]],
    getCurrentController: CallbackTo[XController],
    getCurrentSelection: CallbackTo[XInterface],
    getData: CallbackTo[XChartData],
    getDiagram: CallbackTo[XDiagram],
    getLegend: CallbackTo[XShape],
    getSubTitle: CallbackTo[XShape],
    getTitle: CallbackTo[XShape],
    getURL: CallbackTo[String],
    hasControllersLocked: CallbackTo[Boolean],
    lockControllers: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setCurrentController: XController => Callback,
    setDiagram: XDiagram => Callback,
    unlockControllers: Callback
  ): XChartDocument = {
    val __obj = js.Dynamic.literal(Area = Area.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Diagram = Diagram.asInstanceOf[js.Any], Legend = Legend.asInstanceOf[js.Any], SubTitle = SubTitle.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attachData = js.Any.fromFunction1((t0: XChartData) => attachData(t0).runNow()), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1((t0: XController) => connectController(t0).runNow()), disconnectController = js.Any.fromFunction1((t0: XController) => disconnectController(t0).runNow()), dispose = dispose.toJsFn, getArea = getArea.toJsFn, getArgs = getArgs.toJsFn, getCurrentController = getCurrentController.toJsFn, getCurrentSelection = getCurrentSelection.toJsFn, getData = getData.toJsFn, getDiagram = getDiagram.toJsFn, getLegend = getLegend.toJsFn, getSubTitle = getSubTitle.toJsFn, getTitle = getTitle.toJsFn, getURL = getURL.toJsFn, hasControllersLocked = hasControllersLocked.toJsFn, lockControllers = lockControllers.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setCurrentController = js.Any.fromFunction1((t0: XController) => setCurrentController(t0).runNow()), setDiagram = js.Any.fromFunction1((t0: XDiagram) => setDiagram(t0).runNow()), unlockControllers = unlockControllers.toJsFn)
    __obj.asInstanceOf[XChartDocument]
  }
  
  extension [Self <: XChartDocument](x: Self) {
    
    inline def setArea(value: XPropertySet): Self = StObject.set(x, "Area", value.asInstanceOf[js.Any])
    
    inline def setAttachData(value: XChartData => Callback): Self = StObject.set(x, "attachData", js.Any.fromFunction1((t0: XChartData) => value(t0).runNow()))
    
    inline def setData(value: XChartData): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDiagram(value: XDiagram): Self = StObject.set(x, "Diagram", value.asInstanceOf[js.Any])
    
    inline def setGetArea(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getArea", value.toJsFn)
    
    inline def setGetData(value: CallbackTo[XChartData]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setGetDiagram(value: CallbackTo[XDiagram]): Self = StObject.set(x, "getDiagram", value.toJsFn)
    
    inline def setGetLegend(value: CallbackTo[XShape]): Self = StObject.set(x, "getLegend", value.toJsFn)
    
    inline def setGetSubTitle(value: CallbackTo[XShape]): Self = StObject.set(x, "getSubTitle", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[XShape]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setLegend(value: XShape): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setSetDiagram(value: XDiagram => Callback): Self = StObject.set(x, "setDiagram", js.Any.fromFunction1((t0: XDiagram) => value(t0).runNow()))
    
    inline def setSubTitle(value: XShape): Self = StObject.set(x, "SubTitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: XShape): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
