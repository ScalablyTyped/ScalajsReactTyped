package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * dispatch with guaranteed notify (instead of {@link XDispatch} )
  * @see XDispatch
  * @see XStatusListener
  */
trait XNotifyingDispatch
  extends StObject
     with XDispatch {
  
  /**
    * Do the same like {@link XDispatch.dispatch()} but notifies listener in every case. Should be used if result must be known.
    * @param URL full parsed URL describes the feature which should be dispatched (executed)
    * @param Arguments optional arguments for this request (see {@link com.sun.star.document.MediaDescriptor} )
    * @param Listener optional listener for guaranteed notifications of this request
    */
  def dispatchWithNotification(URL: URL, Arguments: SeqEquiv[PropertyValue], Listener: XDispatchResultListener): Unit
}
object XNotifyingDispatch {
  
  inline def apply(
    acquire: Callback,
    addStatusListener: (XStatusListener, URL) => Callback,
    dispatch: (URL, SeqEquiv[PropertyValue]) => Callback,
    dispatchWithNotification: (URL, SeqEquiv[PropertyValue], XDispatchResultListener) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeStatusListener: (XStatusListener, URL) => Callback
  ): XNotifyingDispatch = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addStatusListener = js.Any.fromFunction2((t0: XStatusListener, t1: URL) => (addStatusListener(t0, t1)).runNow()), dispatch = js.Any.fromFunction2((t0: URL, t1: SeqEquiv[PropertyValue]) => (dispatch(t0, t1)).runNow()), dispatchWithNotification = js.Any.fromFunction3((t0: URL, t1: SeqEquiv[PropertyValue], t2: XDispatchResultListener) => (dispatchWithNotification(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeStatusListener = js.Any.fromFunction2((t0: XStatusListener, t1: URL) => (removeStatusListener(t0, t1)).runNow()))
    __obj.asInstanceOf[XNotifyingDispatch]
  }
  
  extension [Self <: XNotifyingDispatch](x: Self) {
    
    inline def setDispatchWithNotification(value: (URL, SeqEquiv[PropertyValue], XDispatchResultListener) => Callback): Self = StObject.set(x, "dispatchWithNotification", js.Any.fromFunction3((t0: URL, t1: SeqEquiv[PropertyValue], t2: XDispatchResultListener) => (value(t0, t1, t2)).runNow()))
  }
}
