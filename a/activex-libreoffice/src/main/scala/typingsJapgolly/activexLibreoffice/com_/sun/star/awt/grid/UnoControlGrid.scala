package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControlModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XGraphics
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XKeyListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XToolkit
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XView
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindowListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindowPeer
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A control that displays a set of tabular data.
  *
  * **The Column Model**
  *
  * The horizontal structure of the grid is defined by the {@link XGridColumnModel} implemented in {@link DefaultGridColumnModel} The {@link XGridColumn}
  * implemented in {@link GridColumn} describes the properties and behavior of a single column. Use the {@link XGridColumnModel.addColumn()} to add a
  * column to the column model.
  *
  * **The Data Model**
  *
  * All row data are stored in the {@link XGridDataModel} . Use the {@link DefaultGridDataModel} to add XGridDataModel::addRow() or remove
  * XGridDataModel::removeRow() rows.
  *
  * The column and data model must be set at the {@link UnoControlGridModel.ColumnModel} and {@link UnoControlGridModel.GridDataModel} properties.
  *
  * **{@link Selection}**
  *
  * If you are interested in knowing when the selection changes implement a {@link XGridSelectionListener} and add the instance with the method {@link
  * XGridRowSelection.addSelectionListener()} . You than will be notified for any selection change.
  * @since OOo 3.3
  */
trait UnoControlGrid
  extends StObject
     with UnoControl
     with XGridControl
     with XGridRowSelection
object UnoControlGrid {
  
  inline def apply(
    AccessibleContext: XAccessibleContext,
    Context: XInterface,
    CurrentColumn: Double,
    CurrentRow: Double,
    Graphics: XGraphics,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    SelectedRows: SafeArray[Double],
    Size: Size,
    View: XView,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addFocusListener: XFocusListener => Callback,
    addKeyListener: XKeyListener => Callback,
    addMouseListener: XMouseListener => Callback,
    addMouseMotionListener: XMouseMotionListener => Callback,
    addPaintListener: XPaintListener => Callback,
    addSelectionListener: XGridSelectionListener => Callback,
    addWindowListener: XWindowListener => Callback,
    createPeer: (XToolkit, XWindowPeer) => Callback,
    deselectAllRows: Callback,
    deselectRow: Double => Callback,
    dispose: Callback,
    draw: (Double, Double) => Callback,
    getAccessibleContext: CallbackTo[XAccessibleContext],
    getColumnAtPoint: (Double, Double) => Double,
    getContext: CallbackTo[XInterface],
    getCurrentColumn: CallbackTo[Double],
    getCurrentRow: CallbackTo[Double],
    getGraphics: CallbackTo[XGraphics],
    getModel: CallbackTo[XControlModel],
    getPeer: CallbackTo[XWindowPeer],
    getPosSize: CallbackTo[Rectangle],
    getRowAtPoint: (Double, Double) => Double,
    getSelectedRows: CallbackTo[SafeArray[Double]],
    getSize: CallbackTo[Size],
    getView: CallbackTo[XView],
    goToCell: (Double, Double) => Callback,
    hasSelectedRows: CallbackTo[Boolean],
    isDesignMode: CallbackTo[Boolean],
    isRowSelected: Double => Boolean,
    isTransparent: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeFocusListener: XFocusListener => Callback,
    removeKeyListener: XKeyListener => Callback,
    removeMouseListener: XMouseListener => Callback,
    removeMouseMotionListener: XMouseMotionListener => Callback,
    removePaintListener: XPaintListener => Callback,
    removeSelectionListener: XGridSelectionListener => Callback,
    removeWindowListener: XWindowListener => Callback,
    selectAllRows: Callback,
    selectRow: Double => Callback,
    setContext: XInterface => Callback,
    setDesignMode: Boolean => Callback,
    setEnable: Boolean => Callback,
    setFocus: Callback,
    setGraphics: XGraphics => Boolean,
    setModel: XControlModel => Boolean,
    setPosSize: (Double, Double, Double, Double, Double) => Callback,
    setVisible: Boolean => Callback,
    setZoom: (Double, Double) => Callback
  ): UnoControlGrid = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], CurrentColumn = CurrentColumn.asInstanceOf[js.Any], CurrentRow = CurrentRow.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], SelectedRows = SelectedRows.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addSelectionListener = js.Any.fromFunction1((t0: XGridSelectionListener) => addSelectionListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), deselectAllRows = deselectAllRows.toJsFn, deselectRow = js.Any.fromFunction1((t0: Double) => deselectRow(t0).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getColumnAtPoint = js.Any.fromFunction2(getColumnAtPoint), getContext = getContext.toJsFn, getCurrentColumn = getCurrentColumn.toJsFn, getCurrentRow = getCurrentRow.toJsFn, getGraphics = getGraphics.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getRowAtPoint = js.Any.fromFunction2(getRowAtPoint), getSelectedRows = getSelectedRows.toJsFn, getSize = getSize.toJsFn, getView = getView.toJsFn, goToCell = js.Any.fromFunction2((t0: Double, t1: Double) => (goToCell(t0, t1)).runNow()), hasSelectedRows = hasSelectedRows.toJsFn, isDesignMode = isDesignMode.toJsFn, isRowSelected = js.Any.fromFunction1(isRowSelected), isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeSelectionListener = js.Any.fromFunction1((t0: XGridSelectionListener) => removeSelectionListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), selectAllRows = selectAllRows.toJsFn, selectRow = js.Any.fromFunction1((t0: Double) => selectRow(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()))
    __obj.asInstanceOf[UnoControlGrid]
  }
}
