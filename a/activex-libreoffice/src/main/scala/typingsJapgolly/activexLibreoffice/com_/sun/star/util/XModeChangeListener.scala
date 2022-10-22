package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to listen for changes in an object's internal mode.
  * @see XModeChangeBroadcaster
  * @since OOo 1.1.2
  */
trait XModeChangeListener
  extends StObject
     with XEventListener {
  
  /** indicates that the mode of the broadcasting component has changed. */
  def modeChanged(rSource: ModeChangeEvent): Unit
}
object XModeChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    modeChanged: ModeChangeEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XModeChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), modeChanged = js.Any.fromFunction1((t0: ModeChangeEvent) => modeChanged(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XModeChangeListener]
  }
  
  extension [Self <: XModeChangeListener](x: Self) {
    
    inline def setModeChanged(value: ModeChangeEvent => Callback): Self = StObject.set(x, "modeChanged", js.Any.fromFunction1((t0: ModeChangeEvent) => value(t0).runNow()))
  }
}
