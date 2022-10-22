package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows notification when range selection is completed or aborted.
  * @see com.sun.star.sheet.XRangeSelection
  */
trait XRangeSelectionListener
  extends StObject
     with XEventListener {
  
  /** is called when range selection is aborted. */
  def aborted(aEvent: RangeSelectionEvent): Unit
  
  /** is called when range selection is completed. */
  def done(aEvent: RangeSelectionEvent): Unit
}
object XRangeSelectionListener {
  
  inline def apply(
    aborted: RangeSelectionEvent => Callback,
    acquire: Callback,
    disposing: EventObject => Callback,
    done: RangeSelectionEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XRangeSelectionListener = {
    val __obj = js.Dynamic.literal(aborted = js.Any.fromFunction1((t0: RangeSelectionEvent) => aborted(t0).runNow()), acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), done = js.Any.fromFunction1((t0: RangeSelectionEvent) => done(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XRangeSelectionListener]
  }
  
  extension [Self <: XRangeSelectionListener](x: Self) {
    
    inline def setAborted(value: RangeSelectionEvent => Callback): Self = StObject.set(x, "aborted", js.Any.fromFunction1((t0: RangeSelectionEvent) => value(t0).runNow()))
    
    inline def setDone(value: RangeSelectionEvent => Callback): Self = StObject.set(x, "done", js.Any.fromFunction1((t0: RangeSelectionEvent) => value(t0).runNow()))
  }
}
