package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRangeHighlighter
  extends StObject
     with XInterface {
  
  /** Returns a list of ranges that are used by objects that are currently selected. */
  val SelectedRanges: SafeArray[HighlightedRange]
  
  /** registers an event listener, which is called when the selection is changed and affects different source ranges */
  def addSelectionChangeListener(xListener: XSelectionChangeListener): Unit
  
  /** Returns a list of ranges that are used by objects that are currently selected. */
  def getSelectedRanges(): SafeArray[HighlightedRange]
  
  /** unregisters an event listener which was registered with {@link XRangeHighlighter.addSelectionChangeListener()} before. */
  def removeSelectionChangeListener(xListener: XSelectionChangeListener): Unit
}
object XRangeHighlighter {
  
  inline def apply(
    SelectedRanges: SafeArray[HighlightedRange],
    acquire: Callback,
    addSelectionChangeListener: XSelectionChangeListener => Callback,
    getSelectedRanges: CallbackTo[SafeArray[HighlightedRange]],
    queryInterface: `type` => Any,
    release: Callback,
    removeSelectionChangeListener: XSelectionChangeListener => Callback
  ): XRangeHighlighter = {
    val __obj = js.Dynamic.literal(SelectedRanges = SelectedRanges.asInstanceOf[js.Any], acquire = acquire.toJsFn, addSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => addSelectionChangeListener(t0).runNow()), getSelectedRanges = getSelectedRanges.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => removeSelectionChangeListener(t0).runNow()))
    __obj.asInstanceOf[XRangeHighlighter]
  }
  
  extension [Self <: XRangeHighlighter](x: Self) {
    
    inline def setAddSelectionChangeListener(value: XSelectionChangeListener => Callback): Self = StObject.set(x, "addSelectionChangeListener", js.Any.fromFunction1((t0: XSelectionChangeListener) => value(t0).runNow()))
    
    inline def setGetSelectedRanges(value: CallbackTo[SafeArray[HighlightedRange]]): Self = StObject.set(x, "getSelectedRanges", value.toJsFn)
    
    inline def setRemoveSelectionChangeListener(value: XSelectionChangeListener => Callback): Self = StObject.set(x, "removeSelectionChangeListener", js.Any.fromFunction1((t0: XSelectionChangeListener) => value(t0).runNow()))
    
    inline def setSelectedRanges(value: SafeArray[HighlightedRange]): Self = StObject.set(x, "SelectedRanges", value.asInstanceOf[js.Any])
  }
}
