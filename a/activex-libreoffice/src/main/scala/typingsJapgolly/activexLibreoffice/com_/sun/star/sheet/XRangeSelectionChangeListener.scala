package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows notification when the selected range is changed.
  * @see com.sun.star.sheet.XRangeSelection
  */
trait XRangeSelectionChangeListener
  extends StObject
     with XEventListener {
  
  /** is called when the selected range is changed while range selection is active. */
  def descriptorChanged(aEvent: RangeSelectionEvent): Unit
}
object XRangeSelectionChangeListener {
  
  inline def apply(
    acquire: Callback,
    descriptorChanged: RangeSelectionEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XRangeSelectionChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, descriptorChanged = js.Any.fromFunction1((t0: RangeSelectionEvent) => descriptorChanged(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XRangeSelectionChangeListener]
  }
  
  extension [Self <: XRangeSelectionChangeListener](x: Self) {
    
    inline def setDescriptorChanged(value: RangeSelectionEvent => Callback): Self = StObject.set(x, "descriptorChanged", js.Any.fromFunction1((t0: RangeSelectionEvent) => value(t0).runNow()))
  }
}
