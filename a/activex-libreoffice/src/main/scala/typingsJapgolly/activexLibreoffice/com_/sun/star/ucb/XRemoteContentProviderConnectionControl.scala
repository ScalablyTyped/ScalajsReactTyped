package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple mechanism to find out if the connection between a remote content provider distributor and acceptor gets lost.
  *
  * This interface should be supported by the **DoneListener** parameter of {@link XRemoteContentProviderAcceptor.addRemoteContentProvider()} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderConnectionControl
  extends StObject
     with XInterface {
  
  /**
    * Enable connection control, using as a token some object implemented on the remote content provider acceptor's side.
    *
    * The implementation of this interface must hold a reference to the supplied token. If the connection gets lost, the reference count of the token will
    * drop, which the remote content provider acceptor can observe.
    * @param Acceptor The remote content provider acceptor on the other side of the connection.
    * @param Token Some object implemented on the remote content provider acceptor's side of the connection.
    */
  def enableConnectionControl(Acceptor: XRemoteContentProviderAcceptor, Token: XInterface): Unit
}
object XRemoteContentProviderConnectionControl {
  
  inline def apply(
    acquire: Callback,
    enableConnectionControl: (XRemoteContentProviderAcceptor, XInterface) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XRemoteContentProviderConnectionControl = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, enableConnectionControl = js.Any.fromFunction2((t0: XRemoteContentProviderAcceptor, t1: XInterface) => (enableConnectionControl(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XRemoteContentProviderConnectionControl]
  }
  
  extension [Self <: XRemoteContentProviderConnectionControl](x: Self) {
    
    inline def setEnableConnectionControl(value: (XRemoteContentProviderAcceptor, XInterface) => Callback): Self = StObject.set(x, "enableConnectionControl", js.Any.fromFunction2((t0: XRemoteContentProviderAcceptor, t1: XInterface) => (value(t0, t1)).runNow()))
  }
}
