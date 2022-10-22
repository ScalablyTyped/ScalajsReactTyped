package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * listener for results of {@link XNotifyingDispatch.dispatchWithNotification()}
  * @see XNotifyingDispatch
  */
trait XDispatchResultListener
  extends StObject
     with XEventListener {
  
  /**
    * indicates finished dispatch
    * @param Result contains the result of the dispatch action
    * @see DispatchResultEvent
    */
  def dispatchFinished(Result: DispatchResultEvent): Unit
}
object XDispatchResultListener {
  
  inline def apply(
    acquire: Callback,
    dispatchFinished: DispatchResultEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDispatchResultListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, dispatchFinished = js.Any.fromFunction1((t0: DispatchResultEvent) => dispatchFinished(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDispatchResultListener]
  }
  
  extension [Self <: XDispatchResultListener](x: Self) {
    
    inline def setDispatchFinished(value: DispatchResultEvent => Callback): Self = StObject.set(x, "dispatchFinished", js.Any.fromFunction1((t0: DispatchResultEvent) => value(t0).runNow()))
  }
}
