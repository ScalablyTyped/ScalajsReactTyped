package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive text change events. */
trait XTextListener
  extends StObject
     with XEventListener {
  
  /** is invoked when the text has changed. */
  def textChanged(rEvent: TextEvent): Unit
}
object XTextListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    textChanged: TextEvent => Callback
  ): XTextListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, textChanged = js.Any.fromFunction1((t0: TextEvent) => textChanged(t0).runNow()))
    __obj.asInstanceOf[XTextListener]
  }
  
  extension [Self <: XTextListener](x: Self) {
    
    inline def setTextChanged(value: TextEvent => Callback): Self = StObject.set(x, "textChanged", js.Any.fromFunction1((t0: TextEvent) => value(t0).runNow()))
  }
}
