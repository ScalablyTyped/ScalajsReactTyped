package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to veto changes in an object's internal mode.
  * @see XModeChangeBroadcaster
  * @since OOo 1.1.2
  */
trait XModeChangeApproveListener
  extends StObject
     with XEventListener {
  
  /**
    * indicates that the mode of the broadcasting component is about to change.
    *
    * The {@link ModeChangeEvent.NewMode} indicates the new mode which is to be set on the component
    * @throws VetoException when the mode change is vetoed
    */
  def approveModeChange(rSource: ModeChangeEvent): Unit
}
object XModeChangeApproveListener {
  
  inline def apply(
    acquire: Callback,
    approveModeChange: ModeChangeEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XModeChangeApproveListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, approveModeChange = js.Any.fromFunction1((t0: ModeChangeEvent) => approveModeChange(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XModeChangeApproveListener]
  }
  
  extension [Self <: XModeChangeApproveListener](x: Self) {
    
    inline def setApproveModeChange(value: ModeChangeEvent => Callback): Self = StObject.set(x, "approveModeChange", js.Any.fromFunction1((t0: ModeChangeEvent) => value(t0).runNow()))
  }
}
