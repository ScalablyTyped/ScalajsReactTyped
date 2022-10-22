package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XDataProvider
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XChartDocument
  extends StObject
     with XModel {
  
  /** retrieves the component that is able to create different chart type templates (components of type {@link ChartTypeTemplate} ) */
  var ChartTypeManager: XChartTypeManager
  
  /**
    * Returns the currently set data provider. This may be an internal one, if {@link createInternalDataProvider()} has been called before, or an external
    * one if XDataReceiver::attachDataProvider() has been called.
    */
  val DataProvider: XDataProvider
  
  /**
    * Notes: this is preliminary, we need an API that supports more than one diagram. The method name getDiagram exists in the css.chart API, so there is
    * would be no way to chose either this or the other method from Basic (it would chose one or the other by random).
    */
  var FirstDiagram: XDiagram
  
  /**
    * Gives access to the page background appearance.
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    */
  val PageBackground: XPropertySet
  
  /** Creates a default chart type for a brand-new chart object. */
  def createDefaultChart(): Unit
  
  /**
    * creates an internal com::sun::star::chart2::XDataProvider that is handled by the chart document itself.
    *
    * When the model is stored, the data provider will also be stored in a sub-storage.
    * @param bCloneExistingData if `TRUE` and a data provider was previously attached, its referred data will be copied to the new internal data provider. Not
    * @throws com::sun::star::util:CloseVetoException If the new data provider could not be created due to a failed removal of the former data provider.
    */
  def createInternalDataProvider(bCloneExistingData: Boolean): Unit
  
  /** retrieves the component that is able to create different chart type templates (components of type {@link ChartTypeTemplate} ) */
  def getChartTypeManager(): XChartTypeManager
  
  /**
    * Returns the currently set data provider. This may be an internal one, if {@link createInternalDataProvider()} has been called before, or an external
    * one if XDataReceiver::attachDataProvider() has been called.
    */
  def getDataProvider(): XDataProvider
  
  /**
    * Notes: this is preliminary, we need an API that supports more than one diagram. The method name getDiagram exists in the css.chart API, so there is
    * would be no way to chose either this or the other method from Basic (it would chose one or the other by random).
    */
  def getFirstDiagram(): XDiagram
  
  /**
    * Gives access to the page background appearance.
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    */
  def getPageBackground(): XPropertySet
  
  /** @returns `TRUE` if the data provider set at the chart document is an internal one.  This is the case directly after {@link createInternalDataProvider()} h */
  def hasInternalDataProvider(): Boolean
  
  /** Returns true if the chart is based on OpenGL */
  def isOpenGLChart(): Boolean
  
  /** sets a new component that is able to create different chart type templates (components of type {@link ChartTypeTemplate} ) */
  def setChartTypeManager(xNewManager: XChartTypeManager): Unit
  
  /**
    * Notes: this is preliminary, we need an API that supports more than one diagram. The method name setDiagram exists in the css.chart API, so there is
    * would be no way to chose either this or the other method from Basic (it would chose one or the other by random).
    */
  def setFirstDiagram(xDiagram: XDiagram): Unit
}
object XChartDocument {
  
  inline def apply(
    Args: SafeArray[PropertyValue],
    ChartTypeManager: XChartTypeManager,
    CurrentController: XController,
    CurrentSelection: XInterface,
    DataProvider: XDataProvider,
    FirstDiagram: XDiagram,
    PageBackground: XPropertySet,
    URL: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    connectController: XController => Callback,
    createDefaultChart: Callback,
    createInternalDataProvider: Boolean => Callback,
    disconnectController: XController => Callback,
    dispose: Callback,
    getArgs: CallbackTo[SafeArray[PropertyValue]],
    getChartTypeManager: CallbackTo[XChartTypeManager],
    getCurrentController: CallbackTo[XController],
    getCurrentSelection: CallbackTo[XInterface],
    getDataProvider: CallbackTo[XDataProvider],
    getFirstDiagram: CallbackTo[XDiagram],
    getPageBackground: CallbackTo[XPropertySet],
    getURL: CallbackTo[String],
    hasControllersLocked: CallbackTo[Boolean],
    hasInternalDataProvider: CallbackTo[Boolean],
    isOpenGLChart: CallbackTo[Boolean],
    lockControllers: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setChartTypeManager: XChartTypeManager => Callback,
    setCurrentController: XController => Callback,
    setFirstDiagram: XDiagram => Callback,
    unlockControllers: Callback
  ): XChartDocument = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], ChartTypeManager = ChartTypeManager.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], DataProvider = DataProvider.asInstanceOf[js.Any], FirstDiagram = FirstDiagram.asInstanceOf[js.Any], PageBackground = PageBackground.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1((t0: XController) => connectController(t0).runNow()), createDefaultChart = createDefaultChart.toJsFn, createInternalDataProvider = js.Any.fromFunction1((t0: Boolean) => createInternalDataProvider(t0).runNow()), disconnectController = js.Any.fromFunction1((t0: XController) => disconnectController(t0).runNow()), dispose = dispose.toJsFn, getArgs = getArgs.toJsFn, getChartTypeManager = getChartTypeManager.toJsFn, getCurrentController = getCurrentController.toJsFn, getCurrentSelection = getCurrentSelection.toJsFn, getDataProvider = getDataProvider.toJsFn, getFirstDiagram = getFirstDiagram.toJsFn, getPageBackground = getPageBackground.toJsFn, getURL = getURL.toJsFn, hasControllersLocked = hasControllersLocked.toJsFn, hasInternalDataProvider = hasInternalDataProvider.toJsFn, isOpenGLChart = isOpenGLChart.toJsFn, lockControllers = lockControllers.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setChartTypeManager = js.Any.fromFunction1((t0: XChartTypeManager) => setChartTypeManager(t0).runNow()), setCurrentController = js.Any.fromFunction1((t0: XController) => setCurrentController(t0).runNow()), setFirstDiagram = js.Any.fromFunction1((t0: XDiagram) => setFirstDiagram(t0).runNow()), unlockControllers = unlockControllers.toJsFn)
    __obj.asInstanceOf[XChartDocument]
  }
  
  extension [Self <: XChartDocument](x: Self) {
    
    inline def setChartTypeManager(value: XChartTypeManager): Self = StObject.set(x, "ChartTypeManager", value.asInstanceOf[js.Any])
    
    inline def setCreateDefaultChart(value: Callback): Self = StObject.set(x, "createDefaultChart", value.toJsFn)
    
    inline def setCreateInternalDataProvider(value: Boolean => Callback): Self = StObject.set(x, "createInternalDataProvider", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setDataProvider(value: XDataProvider): Self = StObject.set(x, "DataProvider", value.asInstanceOf[js.Any])
    
    inline def setFirstDiagram(value: XDiagram): Self = StObject.set(x, "FirstDiagram", value.asInstanceOf[js.Any])
    
    inline def setGetChartTypeManager(value: CallbackTo[XChartTypeManager]): Self = StObject.set(x, "getChartTypeManager", value.toJsFn)
    
    inline def setGetDataProvider(value: CallbackTo[XDataProvider]): Self = StObject.set(x, "getDataProvider", value.toJsFn)
    
    inline def setGetFirstDiagram(value: CallbackTo[XDiagram]): Self = StObject.set(x, "getFirstDiagram", value.toJsFn)
    
    inline def setGetPageBackground(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getPageBackground", value.toJsFn)
    
    inline def setHasInternalDataProvider(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasInternalDataProvider", value.toJsFn)
    
    inline def setIsOpenGLChart(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpenGLChart", value.toJsFn)
    
    inline def setPageBackground(value: XPropertySet): Self = StObject.set(x, "PageBackground", value.asInstanceOf[js.Any])
    
    inline def setSetChartTypeManager(value: XChartTypeManager => Callback): Self = StObject.set(x, "setChartTypeManager", js.Any.fromFunction1((t0: XChartTypeManager) => value(t0).runNow()))
    
    inline def setSetFirstDiagram(value: XDiagram => Callback): Self = StObject.set(x, "setFirstDiagram", js.Any.fromFunction1((t0: XDiagram) => value(t0).runNow()))
  }
}
