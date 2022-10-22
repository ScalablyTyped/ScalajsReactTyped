package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * serves state information of objects which can be connected to controls (e.g. toolbox controls).
  *
  * Each state change is to be broadcasted to all registered status listeners. The first notification should be performed synchronously from {@link
  * XDispatch.addStatusListener()} ; if not, controls may flicker. State listener must be aware of this synchronous notification.
  *
  * The state consists of enabled/disabled and a short descriptive text of the function (e.g. "undo insert character"). It is to be broadcasted whenever
  * this state changes or the control should re-get the value for the URL it is connected to. Additionally, a context-switch-event is to be broadcasted
  * whenever the object may be out of scope, to force the state listener to requery the {@link XDispatch} .
  * @see Frame
  * @see FeatureStateEvent
  */
trait XDispatch
  extends StObject
     with XInterface {
  
  /**
    * registers a listener of a control for a specific URL at this object to receive status events.
    *
    * It is only allowed to register URLs for which this {@link XDispatch} was explicitly queried. Additional arguments ("#..." or "?...") will be ignored.
    *
    * Note: Notifications can't be guaranteed! This will be a part of interface {@link XNotifyingDispatch} .
    * @param Control listener that wishes to be informed
    * @param URL the URL (without additional arguments) the listener wishes to be registered for. A listener can be registered for more than one URL at the sa
    * @see XStatusListener
    * @see XDispatch.removeStatusListener()
    */
  def addStatusListener(Control: XStatusListener, URL: URL): Unit
  
  /**
    * dispatches (executes) an URL
    *
    * It is only allowed to dispatch URLs for which this {@link XDispatch} was explicitly queried. Additional arguments ("'#..." or "?...") are allowed.
    * @param URL fully parsed URL describing the feature which should be dispatched (=executed)
    * @param Arguments optional arguments for this request (see {@link com.sun.star.document.MediaDescriptor} ) They depend on the real implementation of the
    */
  def dispatch(URL: URL, Arguments: SeqEquiv[PropertyValue]): Unit
  
  /**
    * unregisters a listener from a control.
    * @param Control listener that wishes to be unregistered
    * @param URL URL the listener was registered for. Additional arguments ("#..." or "?...") will be ignored.
    * @see XStatusListener
    * @see XDispatch.addStatusListener()
    */
  def removeStatusListener(Control: XStatusListener, URL: URL): Unit
}
object XDispatch {
  
  inline def apply(
    acquire: Callback,
    addStatusListener: (XStatusListener, URL) => Callback,
    dispatch: (URL, SeqEquiv[PropertyValue]) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeStatusListener: (XStatusListener, URL) => Callback
  ): XDispatch = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addStatusListener = js.Any.fromFunction2((t0: XStatusListener, t1: URL) => (addStatusListener(t0, t1)).runNow()), dispatch = js.Any.fromFunction2((t0: URL, t1: SeqEquiv[PropertyValue]) => (dispatch(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeStatusListener = js.Any.fromFunction2((t0: XStatusListener, t1: URL) => (removeStatusListener(t0, t1)).runNow()))
    __obj.asInstanceOf[XDispatch]
  }
  
  extension [Self <: XDispatch](x: Self) {
    
    inline def setAddStatusListener(value: (XStatusListener, URL) => Callback): Self = StObject.set(x, "addStatusListener", js.Any.fromFunction2((t0: XStatusListener, t1: URL) => (value(t0, t1)).runNow()))
    
    inline def setDispatch(value: (URL, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "dispatch", js.Any.fromFunction2((t0: URL, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setRemoveStatusListener(value: (XStatusListener, URL) => Callback): Self = StObject.set(x, "removeStatusListener", js.Any.fromFunction2((t0: XStatusListener, t1: URL) => (value(t0, t1)).runNow()))
  }
}
