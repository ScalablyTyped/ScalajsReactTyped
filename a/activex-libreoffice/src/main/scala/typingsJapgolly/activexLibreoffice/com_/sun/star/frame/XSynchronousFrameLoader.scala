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
  * loads a resource into a {@link Frame} .
  *
  * Unlike the {@link XFrameLoader} interface, this loading will be synchronous.
  * @see XFrameLoader
  */
trait XSynchronousFrameLoader
  extends StObject
     with XInterface {
  
  /**
    * cancels the loading process.
    *
    * No notifications (neither to the frame or the caller) must be notified. Because it's a synchronous process this cancel call can be forced by another
    * thread the loader thread only. Method {@link XSynchronousFrameLoader.load()} must return `FALSE` then and caller of this method {@link
    * XSynchronousFrameLoader.cancel()} already knows the state ...
    */
  def cancel(): Unit
  
  /**
    * starts the loading of the specified resource into the specified {@link Frame} .
    * @param Descriptor describes the resource which should be loaded It use a {@link com.sun.star.document.MediaDescriptor} for that.
    * @param Frame the target frame which should contain the new loaded component
    * @returns `TRUE` if loading is successfully ; `FALSE` otherwise
    */
  def load(Descriptor: SeqEquiv[PropertyValue], Frame: XFrame): Boolean
}
object XSynchronousFrameLoader {
  
  inline def apply(
    acquire: Callback,
    cancel: Callback,
    load: (SeqEquiv[PropertyValue], XFrame) => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XSynchronousFrameLoader = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, cancel = cancel.toJsFn, load = js.Any.fromFunction2(load), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSynchronousFrameLoader]
  }
  
  extension [Self <: XSynchronousFrameLoader](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setLoad(value: (SeqEquiv[PropertyValue], XFrame) => Boolean): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
  }
}
