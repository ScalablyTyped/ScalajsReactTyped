package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to let the user to select a cell range.
  * @see com.sun.star.sheet.SpreadsheetView
  */
trait XRangeSelection
  extends StObject
     with XInterface {
  
  /** aborts the range selection. */
  def abortRangeSelection(): Unit
  
  /** adds a listener that is notified when the selected range is changed. */
  def addRangeSelectionChangeListener(aListener: XRangeSelectionChangeListener): Unit
  
  /** adds a listener that is notified when range selection is completed or aborted. */
  def addRangeSelectionListener(aListener: XRangeSelectionListener): Unit
  
  /** removes the specified listener. */
  def removeRangeSelectionChangeListener(aListener: XRangeSelectionChangeListener): Unit
  
  /** removes the specified listener. */
  def removeRangeSelectionListener(aListener: XRangeSelectionListener): Unit
  
  /**
    * starts the range selection.
    * @param aArguments the {@link RangeSelectionArguments} that specify how the range selection is done.
    */
  def startRangeSelection(aArguments: SeqEquiv[PropertyValue]): Unit
}
object XRangeSelection {
  
  inline def apply(
    abortRangeSelection: Callback,
    acquire: Callback,
    addRangeSelectionChangeListener: XRangeSelectionChangeListener => Callback,
    addRangeSelectionListener: XRangeSelectionListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeRangeSelectionChangeListener: XRangeSelectionChangeListener => Callback,
    removeRangeSelectionListener: XRangeSelectionListener => Callback,
    startRangeSelection: SeqEquiv[PropertyValue] => Callback
  ): XRangeSelection = {
    val __obj = js.Dynamic.literal(abortRangeSelection = abortRangeSelection.toJsFn, acquire = acquire.toJsFn, addRangeSelectionChangeListener = js.Any.fromFunction1((t0: XRangeSelectionChangeListener) => addRangeSelectionChangeListener(t0).runNow()), addRangeSelectionListener = js.Any.fromFunction1((t0: XRangeSelectionListener) => addRangeSelectionListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeRangeSelectionChangeListener = js.Any.fromFunction1((t0: XRangeSelectionChangeListener) => removeRangeSelectionChangeListener(t0).runNow()), removeRangeSelectionListener = js.Any.fromFunction1((t0: XRangeSelectionListener) => removeRangeSelectionListener(t0).runNow()), startRangeSelection = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => startRangeSelection(t0).runNow()))
    __obj.asInstanceOf[XRangeSelection]
  }
  
  extension [Self <: XRangeSelection](x: Self) {
    
    inline def setAbortRangeSelection(value: Callback): Self = StObject.set(x, "abortRangeSelection", value.toJsFn)
    
    inline def setAddRangeSelectionChangeListener(value: XRangeSelectionChangeListener => Callback): Self = StObject.set(x, "addRangeSelectionChangeListener", js.Any.fromFunction1((t0: XRangeSelectionChangeListener) => value(t0).runNow()))
    
    inline def setAddRangeSelectionListener(value: XRangeSelectionListener => Callback): Self = StObject.set(x, "addRangeSelectionListener", js.Any.fromFunction1((t0: XRangeSelectionListener) => value(t0).runNow()))
    
    inline def setRemoveRangeSelectionChangeListener(value: XRangeSelectionChangeListener => Callback): Self = StObject.set(x, "removeRangeSelectionChangeListener", js.Any.fromFunction1((t0: XRangeSelectionChangeListener) => value(t0).runNow()))
    
    inline def setRemoveRangeSelectionListener(value: XRangeSelectionListener => Callback): Self = StObject.set(x, "removeRangeSelectionListener", js.Any.fromFunction1((t0: XRangeSelectionListener) => value(t0).runNow()))
    
    inline def setStartRangeSelection(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "startRangeSelection", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
  }
}
