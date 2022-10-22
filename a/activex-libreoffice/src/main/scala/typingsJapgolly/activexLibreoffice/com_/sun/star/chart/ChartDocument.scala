package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XDrawPageSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the service for a chart document.
  *
  * A chart document consists of a reference to the data source, the diagram and some additional elements like a main title, a sub-title or a legend.
  * @see Diagram
  * @see ChartLegend
  * @see ChartTitle
  * @see ChartDataArray
  */
trait ChartDocument
  extends StObject
     with UserDefinedAttributesSupplier
     with XChartDocument
     with XPropertySet
     with XDrawPageSupplier {
  
  /** determines if the legend is shown or hidden. */
  var HasLegend: Boolean
  
  /** determines if the main title is shown or hidden. */
  var HasMainTitle: Boolean
  
  /** determines if the subtitle is shown or hidden. */
  var HasSubTitle: Boolean
}
object ChartDocument {
  
  inline def apply(
    Area: XPropertySet,
    Args: SafeArray[PropertyValue],
    CurrentController: XController,
    CurrentSelection: XInterface,
    Data: XChartData,
    Diagram: XDiagram,
    DrawPage: XDrawPage,
    HasLegend: Boolean,
    HasMainTitle: Boolean,
    HasSubTitle: Boolean,
    Legend: XShape,
    PropertySetInfo: XPropertySetInfo,
    SubTitle: XShape,
    Title: XShape,
    URL: String,
    UserDefinedAttributes: XNameContainer,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
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
    getDrawPage: CallbackTo[XDrawPage],
    getLegend: CallbackTo[XShape],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getSubTitle: CallbackTo[XShape],
    getTitle: CallbackTo[XShape],
    getURL: CallbackTo[String],
    hasControllersLocked: CallbackTo[Boolean],
    lockControllers: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setCurrentController: XController => Callback,
    setDiagram: XDiagram => Callback,
    setPropertyValue: (String, Any) => Callback,
    unlockControllers: Callback
  ): ChartDocument = {
    val __obj = js.Dynamic.literal(Area = Area.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Diagram = Diagram.asInstanceOf[js.Any], DrawPage = DrawPage.asInstanceOf[js.Any], HasLegend = HasLegend.asInstanceOf[js.Any], HasMainTitle = HasMainTitle.asInstanceOf[js.Any], HasSubTitle = HasSubTitle.asInstanceOf[js.Any], Legend = Legend.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SubTitle = SubTitle.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), attachData = js.Any.fromFunction1((t0: XChartData) => attachData(t0).runNow()), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1((t0: XController) => connectController(t0).runNow()), disconnectController = js.Any.fromFunction1((t0: XController) => disconnectController(t0).runNow()), dispose = dispose.toJsFn, getArea = getArea.toJsFn, getArgs = getArgs.toJsFn, getCurrentController = getCurrentController.toJsFn, getCurrentSelection = getCurrentSelection.toJsFn, getData = getData.toJsFn, getDiagram = getDiagram.toJsFn, getDrawPage = getDrawPage.toJsFn, getLegend = getLegend.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSubTitle = getSubTitle.toJsFn, getTitle = getTitle.toJsFn, getURL = getURL.toJsFn, hasControllersLocked = hasControllersLocked.toJsFn, lockControllers = lockControllers.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setCurrentController = js.Any.fromFunction1((t0: XController) => setCurrentController(t0).runNow()), setDiagram = js.Any.fromFunction1((t0: XDiagram) => setDiagram(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), unlockControllers = unlockControllers.toJsFn)
    __obj.asInstanceOf[ChartDocument]
  }
  
  extension [Self <: ChartDocument](x: Self) {
    
    inline def setHasLegend(value: Boolean): Self = StObject.set(x, "HasLegend", value.asInstanceOf[js.Any])
    
    inline def setHasMainTitle(value: Boolean): Self = StObject.set(x, "HasMainTitle", value.asInstanceOf[js.Any])
    
    inline def setHasSubTitle(value: Boolean): Self = StObject.set(x, "HasSubTitle", value.asInstanceOf[js.Any])
  }
}
