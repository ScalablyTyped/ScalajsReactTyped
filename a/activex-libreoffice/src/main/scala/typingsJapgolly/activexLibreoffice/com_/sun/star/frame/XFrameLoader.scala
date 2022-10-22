package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * load components into a frame
  *
  * It's an asynchronous loading. For synchronous processes use {@link XSynchronousFrameLoader} instead of this one. The generic load algorithm of the
  * office supports both ones - but preferred the synchronous interface.
  * @see XFrame
  */
trait XFrameLoader
  extends StObject
     with XInterface {
  
  /**
    * cancels the loading process.
    *
    * After returning from this call, neither the frame nor the load-event-listener specified in {@link XFrameLoader.load()} may be called back. Because
    * only the owner of this process who called load method before can cancel this process. And they don't need any notification about that. On the other
    * hand - nobody then this owner themselves can be registered as an {@link XLoadEventListener} here.
    */
  def cancel(): Unit
  
  /**
    * starts the loading of the specified resource into the specified {@link Frame} .
    * @param Frame specifies the loading target
    * @param URL describes the resource of loading component Support of special protocols are implementation details and depends from the environment.
    * @param Arguments optional arguments for loading (see {@link com.sun.star.document.MediaDescriptor} for further information)
    * @param Listener this listener will be informed about success
    * @see XLoadEventListener
    */
  def load(Frame: XFrame, URL: String, Arguments: SeqEquiv[PropertyValue], Listener: XLoadEventListener): Unit
}
object XFrameLoader {
  
  inline def apply(
    acquire: Callback,
    cancel: Callback,
    load: (XFrame, String, SeqEquiv[PropertyValue], XLoadEventListener) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XFrameLoader = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, cancel = cancel.toJsFn, load = js.Any.fromFunction4((t0: XFrame, t1: String, t2: SeqEquiv[PropertyValue], t3: XLoadEventListener) => (load(t0, t1, t2, t3)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFrameLoader]
  }
  
  extension [Self <: XFrameLoader](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setLoad(value: (XFrame, String, SeqEquiv[PropertyValue], XLoadEventListener) => Callback): Self = StObject.set(x, "load", js.Any.fromFunction4((t0: XFrame, t1: String, t2: SeqEquiv[PropertyValue], t3: XLoadEventListener) => (value(t0, t1, t2, t3)).runNow()))
  }
}
