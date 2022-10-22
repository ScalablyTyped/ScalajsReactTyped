package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The main task of this service is to close an office document frame embedded in an application running in another process correctly.
  *
  * The usual usage of this service is to create it, initialize with document frame, and to dispose the service. While disposing the service will do all
  * the required actions to let the frame be closed using com::sun::star::util::XCloseable::close( true ). Thus in case there is a code that prevents
  * closing of the frame the code automatically becomes the owner of the frame.
  *
  * In addition the code will disconnect the VCL window the frame is based on from the container system window.
  */
trait DocumentCloser
  extends StObject
     with XComponent {
  
  /**
    * is used to initialize the object on it's creation.
    * @param xFrame the frame of the document that should be closed.
    */
  def DocumentCloserCtor1(xFrame: XFrame): Unit
}
object DocumentCloser {
  
  inline def apply(
    DocumentCloserCtor1: XFrame => Callback,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): DocumentCloser = {
    val __obj = js.Dynamic.literal(DocumentCloserCtor1 = js.Any.fromFunction1((t0: XFrame) => DocumentCloserCtor1(t0).runNow()), acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[DocumentCloser]
  }
  
  extension [Self <: DocumentCloser](x: Self) {
    
    inline def setDocumentCloserCtor1(value: XFrame => Callback): Self = StObject.set(x, "DocumentCloserCtor1", js.Any.fromFunction1((t0: XFrame) => value(t0).runNow()))
  }
}
