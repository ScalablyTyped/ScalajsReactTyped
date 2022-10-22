package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControlModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XEnhancedMouseClickHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XKeyHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseClickHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.Controller
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XDispatch
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCellRange
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.XContextMenuInterceptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a view of a spreadsheet document. */
trait SpreadsheetView
  extends StObject
     with Controller
     with SpreadsheetViewSettings
     with SpreadsheetViewPane
     with XSpreadsheetView
     with XIndexAccess
     with XEnumerationAccess
     with XViewSplitable
     with XViewFreezable
     with XRangeSelection
     with XEnhancedMouseClickBroadcaster
     with XActivationBroadcaster
object SpreadsheetView {
  
  inline def apply(
    ActiveSheet: XSpreadsheet,
    Count: Double,
    ElementType: `type`,
    FirstVisibleColumn: Double,
    FirstVisibleRow: Double,
    Frame: XFrame,
    GridColor: Color,
    HasColumnRowHeaders: Boolean,
    HasHorizontalScrollBar: Boolean,
    HasSheetTabs: Boolean,
    HasVerticalScrollBar: Boolean,
    HideSpellMarks: Boolean,
    IsOutlineSymbolsSet: Boolean,
    IsValueHighlightingEnabled: Boolean,
    IsWindowSplit: Boolean,
    Model: XModel,
    PropertySetInfo: XPropertySetInfo,
    ReferredCells: XCellRange,
    Selection: Any,
    ShowAnchor: Boolean,
    ShowCharts: Double,
    ShowDrawing: Double,
    ShowFormulas: Boolean,
    ShowGrid: Boolean,
    ShowHelpLines: Boolean,
    ShowNotes: Boolean,
    ShowObjects: Double,
    ShowPageBreaks: Boolean,
    ShowZeroValues: Boolean,
    SplitColumn: Double,
    SplitHorizontal: Double,
    SplitRow: Double,
    SplitVertical: Double,
    Transferable: XTransferable,
    ViewData: Any,
    VisibleRange: CellRangeAddress,
    ZoomType: Double,
    ZoomValue: Double,
    abortRangeSelection: Callback,
    acquire: Callback,
    addActivationEventListener: XActivationEventListener => Callback,
    addEnhancedMouseClickHandler: XEnhancedMouseClickHandler => Callback,
    addEventListener: XEventListener => Callback,
    addKeyHandler: XKeyHandler => Callback,
    addMouseClickHandler: XMouseClickHandler => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addRangeSelectionChangeListener: XRangeSelectionChangeListener => Callback,
    addRangeSelectionListener: XRangeSelectionListener => Callback,
    addSelectionChangeListener: XSelectionChangeListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    attachFrame: XFrame => Callback,
    attachModel: XModel => Boolean,
    createEnumeration: CallbackTo[XEnumeration],
    dispose: Callback,
    freezeAtPosition: (Double, Double) => Callback,
    getActiveSheet: CallbackTo[XSpreadsheet],
    getByIndex: Double => Any,
    getControl: XControlModel => XControl,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    getFirstVisibleColumn: CallbackTo[Double],
    getFirstVisibleRow: CallbackTo[Double],
    getFrame: CallbackTo[XFrame],
    getIsWindowSplit: CallbackTo[Boolean],
    getModel: CallbackTo[XModel],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getReferredCells: CallbackTo[XCellRange],
    getSelection: CallbackTo[Any],
    getSplitColumn: CallbackTo[Double],
    getSplitHorizontal: CallbackTo[Double],
    getSplitRow: CallbackTo[Double],
    getSplitVertical: CallbackTo[Double],
    getTransferable: CallbackTo[XTransferable],
    getViewData: CallbackTo[Any],
    getVisibleRange: CallbackTo[CellRangeAddress],
    hasElements: CallbackTo[Boolean],
    hasFrozenPanes: CallbackTo[Boolean],
    insertTransferable: XTransferable => Callback,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => Any,
    registerContextMenuInterceptor: XContextMenuInterceptor => Callback,
    release: Callback,
    releaseContextMenuInterceptor: XContextMenuInterceptor => Callback,
    removeActivationEventListener: XActivationEventListener => Callback,
    removeEnhancedMouseClickHandler: XEnhancedMouseClickHandler => Callback,
    removeEventListener: XEventListener => Callback,
    removeKeyHandler: XKeyHandler => Callback,
    removeMouseClickHandler: XMouseClickHandler => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeRangeSelectionChangeListener: XRangeSelectionChangeListener => Callback,
    removeRangeSelectionListener: XRangeSelectionListener => Callback,
    removeSelectionChangeListener: XSelectionChangeListener => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    restoreViewData: Any => Callback,
    select: Any => Boolean,
    setActiveSheet: XSpreadsheet => Callback,
    setFirstVisibleColumn: Double => Callback,
    setFirstVisibleRow: Double => Callback,
    setPropertyValue: (String, Any) => Callback,
    splitAtPosition: (Double, Double) => Callback,
    startRangeSelection: SeqEquiv[PropertyValue] => Callback,
    suspend: Boolean => Boolean
  ): SpreadsheetView = {
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], FirstVisibleColumn = FirstVisibleColumn.asInstanceOf[js.Any], FirstVisibleRow = FirstVisibleRow.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], GridColor = GridColor.asInstanceOf[js.Any], HasColumnRowHeaders = HasColumnRowHeaders.asInstanceOf[js.Any], HasHorizontalScrollBar = HasHorizontalScrollBar.asInstanceOf[js.Any], HasSheetTabs = HasSheetTabs.asInstanceOf[js.Any], HasVerticalScrollBar = HasVerticalScrollBar.asInstanceOf[js.Any], HideSpellMarks = HideSpellMarks.asInstanceOf[js.Any], IsOutlineSymbolsSet = IsOutlineSymbolsSet.asInstanceOf[js.Any], IsValueHighlightingEnabled = IsValueHighlightingEnabled.asInstanceOf[js.Any], IsWindowSplit = IsWindowSplit.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReferredCells = ReferredCells.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], ShowAnchor = ShowAnchor.asInstanceOf[js.Any], ShowCharts = ShowCharts.asInstanceOf[js.Any], ShowDrawing = ShowDrawing.asInstanceOf[js.Any], ShowFormulas = ShowFormulas.asInstanceOf[js.Any], ShowGrid = ShowGrid.asInstanceOf[js.Any], ShowHelpLines = ShowHelpLines.asInstanceOf[js.Any], ShowNotes = ShowNotes.asInstanceOf[js.Any], ShowObjects = ShowObjects.asInstanceOf[js.Any], ShowPageBreaks = ShowPageBreaks.asInstanceOf[js.Any], ShowZeroValues = ShowZeroValues.asInstanceOf[js.Any], SplitColumn = SplitColumn.asInstanceOf[js.Any], SplitHorizontal = SplitHorizontal.asInstanceOf[js.Any], SplitRow = SplitRow.asInstanceOf[js.Any], SplitVertical = SplitVertical.asInstanceOf[js.Any], Transferable = Transferable.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], VisibleRange = VisibleRange.asInstanceOf[js.Any], ZoomType = ZoomType.asInstanceOf[js.Any], ZoomValue = ZoomValue.asInstanceOf[js.Any], abortRangeSelection = abortRangeSelection.toJsFn, acquire = acquire.toJsFn, addActivationEventListener = js.Any.fromFunction1((t0: XActivationEventListener) => addActivationEventListener(t0).runNow()), addEnhancedMouseClickHandler = js.Any.fromFunction1((t0: XEnhancedMouseClickHandler) => addEnhancedMouseClickHandler(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addKeyHandler = js.Any.fromFunction1((t0: XKeyHandler) => addKeyHandler(t0).runNow()), addMouseClickHandler = js.Any.fromFunction1((t0: XMouseClickHandler) => addMouseClickHandler(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addRangeSelectionChangeListener = js.Any.fromFunction1((t0: XRangeSelectionChangeListener) => addRangeSelectionChangeListener(t0).runNow()), addRangeSelectionListener = js.Any.fromFunction1((t0: XRangeSelectionListener) => addRangeSelectionListener(t0).runNow()), addSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => addSelectionChangeListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), attachFrame = js.Any.fromFunction1((t0: XFrame) => attachFrame(t0).runNow()), attachModel = js.Any.fromFunction1(attachModel), createEnumeration = createEnumeration.toJsFn, dispose = dispose.toJsFn, freezeAtPosition = js.Any.fromFunction2((t0: Double, t1: Double) => (freezeAtPosition(t0, t1)).runNow()), getActiveSheet = getActiveSheet.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getControl = js.Any.fromFunction1(getControl), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getFirstVisibleColumn = getFirstVisibleColumn.toJsFn, getFirstVisibleRow = getFirstVisibleRow.toJsFn, getFrame = getFrame.toJsFn, getIsWindowSplit = getIsWindowSplit.toJsFn, getModel = getModel.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReferredCells = getReferredCells.toJsFn, getSelection = getSelection.toJsFn, getSplitColumn = getSplitColumn.toJsFn, getSplitHorizontal = getSplitHorizontal.toJsFn, getSplitRow = getSplitRow.toJsFn, getSplitVertical = getSplitVertical.toJsFn, getTransferable = getTransferable.toJsFn, getViewData = getViewData.toJsFn, getVisibleRange = getVisibleRange.toJsFn, hasElements = hasElements.toJsFn, hasFrozenPanes = hasFrozenPanes.toJsFn, insertTransferable = js.Any.fromFunction1((t0: XTransferable) => insertTransferable(t0).runNow()), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1((t0: XContextMenuInterceptor) => registerContextMenuInterceptor(t0).runNow()), release = release.toJsFn, releaseContextMenuInterceptor = js.Any.fromFunction1((t0: XContextMenuInterceptor) => releaseContextMenuInterceptor(t0).runNow()), removeActivationEventListener = js.Any.fromFunction1((t0: XActivationEventListener) => removeActivationEventListener(t0).runNow()), removeEnhancedMouseClickHandler = js.Any.fromFunction1((t0: XEnhancedMouseClickHandler) => removeEnhancedMouseClickHandler(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeKeyHandler = js.Any.fromFunction1((t0: XKeyHandler) => removeKeyHandler(t0).runNow()), removeMouseClickHandler = js.Any.fromFunction1((t0: XMouseClickHandler) => removeMouseClickHandler(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeRangeSelectionChangeListener = js.Any.fromFunction1((t0: XRangeSelectionChangeListener) => removeRangeSelectionChangeListener(t0).runNow()), removeRangeSelectionListener = js.Any.fromFunction1((t0: XRangeSelectionListener) => removeRangeSelectionListener(t0).runNow()), removeSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => removeSelectionChangeListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), restoreViewData = js.Any.fromFunction1((t0: Any) => restoreViewData(t0).runNow()), select = js.Any.fromFunction1(select), setActiveSheet = js.Any.fromFunction1((t0: XSpreadsheet) => setActiveSheet(t0).runNow()), setFirstVisibleColumn = js.Any.fromFunction1((t0: Double) => setFirstVisibleColumn(t0).runNow()), setFirstVisibleRow = js.Any.fromFunction1((t0: Double) => setFirstVisibleRow(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), splitAtPosition = js.Any.fromFunction2((t0: Double, t1: Double) => (splitAtPosition(t0, t1)).runNow()), startRangeSelection = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => startRangeSelection(t0).runNow()), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[SpreadsheetView]
  }
}
