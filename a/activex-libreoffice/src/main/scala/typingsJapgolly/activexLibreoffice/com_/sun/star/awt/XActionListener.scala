package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive action events. */
trait XActionListener
  extends StObject
     with XEventListener {
  
  /** is invoked when an action is performed. */
  def actionPerformed(rEvent: ActionEvent): Unit
}
object XActionListener {
  
  inline def apply(
    acquire: Callback,
    actionPerformed: ActionEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XActionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, actionPerformed = js.Any.fromFunction1((t0: ActionEvent) => actionPerformed(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XActionListener]
  }
  
  extension [Self <: XActionListener](x: Self) {
    
    inline def setActionPerformed(value: ActionEvent => Callback): Self = StObject.set(x, "actionPerformed", js.Any.fromFunction1((t0: ActionEvent) => value(t0).runNow()))
  }
}
