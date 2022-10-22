package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XDataProvider
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XDataReceiver
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XRangeHighlighter
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.XStyleFamiliesSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XNumberFormats
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartDocument
  extends StObject
     with XChartDocument
     with XDataReceiver
     with XTitled
     with XStyleFamiliesSupplier
     with XNumberFormatsSupplier
     with XInitialization
object ChartDocument {
  
  inline def apply(
    Args: SafeArray[PropertyValue],
    ChartTypeManager: XChartTypeManager,
    CurrentController: XController,
    CurrentSelection: XInterface,
    DataProvider: XDataProvider,
    FirstDiagram: XDiagram,
    NumberFormatSettings: XPropertySet,
    NumberFormats: XNumberFormats,
    PageBackground: XPropertySet,
    RangeHighlighter: XRangeHighlighter,
    StyleFamilies: XNameAccess,
    TitleObject: XTitle,
    URL: String,
    UsedData: XDataSource,
    UsedRangeRepresentations: SafeArray[String],
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attachDataProvider: XDataProvider => Callback,
    attachNumberFormatsSupplier: XNumberFormatsSupplier => Callback,
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
    getNumberFormatSettings: CallbackTo[XPropertySet],
    getNumberFormats: CallbackTo[XNumberFormats],
    getPageBackground: CallbackTo[XPropertySet],
    getRangeHighlighter: CallbackTo[XRangeHighlighter],
    getStyleFamilies: CallbackTo[XNameAccess],
    getTitleObject: CallbackTo[XTitle],
    getURL: CallbackTo[String],
    getUsedData: CallbackTo[XDataSource],
    getUsedRangeRepresentations: CallbackTo[SafeArray[String]],
    hasControllersLocked: CallbackTo[Boolean],
    hasInternalDataProvider: CallbackTo[Boolean],
    initialize: SeqEquiv[Any] => Callback,
    isOpenGLChart: CallbackTo[Boolean],
    lockControllers: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setArguments: SeqEquiv[PropertyValue] => Callback,
    setChartTypeManager: XChartTypeManager => Callback,
    setCurrentController: XController => Callback,
    setFirstDiagram: XDiagram => Callback,
    setTitleObject: XTitle => Callback,
    unlockControllers: Callback
  ): ChartDocument = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], ChartTypeManager = ChartTypeManager.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], DataProvider = DataProvider.asInstanceOf[js.Any], FirstDiagram = FirstDiagram.asInstanceOf[js.Any], NumberFormatSettings = NumberFormatSettings.asInstanceOf[js.Any], NumberFormats = NumberFormats.asInstanceOf[js.Any], PageBackground = PageBackground.asInstanceOf[js.Any], RangeHighlighter = RangeHighlighter.asInstanceOf[js.Any], StyleFamilies = StyleFamilies.asInstanceOf[js.Any], TitleObject = TitleObject.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], UsedData = UsedData.asInstanceOf[js.Any], UsedRangeRepresentations = UsedRangeRepresentations.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attachDataProvider = js.Any.fromFunction1((t0: XDataProvider) => attachDataProvider(t0).runNow()), attachNumberFormatsSupplier = js.Any.fromFunction1((t0: XNumberFormatsSupplier) => attachNumberFormatsSupplier(t0).runNow()), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1((t0: XController) => connectController(t0).runNow()), createDefaultChart = createDefaultChart.toJsFn, createInternalDataProvider = js.Any.fromFunction1((t0: Boolean) => createInternalDataProvider(t0).runNow()), disconnectController = js.Any.fromFunction1((t0: XController) => disconnectController(t0).runNow()), dispose = dispose.toJsFn, getArgs = getArgs.toJsFn, getChartTypeManager = getChartTypeManager.toJsFn, getCurrentController = getCurrentController.toJsFn, getCurrentSelection = getCurrentSelection.toJsFn, getDataProvider = getDataProvider.toJsFn, getFirstDiagram = getFirstDiagram.toJsFn, getNumberFormatSettings = getNumberFormatSettings.toJsFn, getNumberFormats = getNumberFormats.toJsFn, getPageBackground = getPageBackground.toJsFn, getRangeHighlighter = getRangeHighlighter.toJsFn, getStyleFamilies = getStyleFamilies.toJsFn, getTitleObject = getTitleObject.toJsFn, getURL = getURL.toJsFn, getUsedData = getUsedData.toJsFn, getUsedRangeRepresentations = getUsedRangeRepresentations.toJsFn, hasControllersLocked = hasControllersLocked.toJsFn, hasInternalDataProvider = hasInternalDataProvider.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), isOpenGLChart = isOpenGLChart.toJsFn, lockControllers = lockControllers.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setArguments = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => setArguments(t0).runNow()), setChartTypeManager = js.Any.fromFunction1((t0: XChartTypeManager) => setChartTypeManager(t0).runNow()), setCurrentController = js.Any.fromFunction1((t0: XController) => setCurrentController(t0).runNow()), setFirstDiagram = js.Any.fromFunction1((t0: XDiagram) => setFirstDiagram(t0).runNow()), setTitleObject = js.Any.fromFunction1((t0: XTitle) => setTitleObject(t0).runNow()), unlockControllers = unlockControllers.toJsFn)
    __obj.asInstanceOf[ChartDocument]
  }
}
