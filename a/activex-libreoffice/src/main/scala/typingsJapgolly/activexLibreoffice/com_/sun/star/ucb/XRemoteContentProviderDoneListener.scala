package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A notification mechanism that a {@link XRemoteContentProviderAcceptor} no longer needs a remote content provider.
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderDoneListener
  extends StObject
     with XInterface {
  
  /**
    * A notification that all remote content providers added to the given {@link XRemoteContentProviderAcceptor} should be removed, because the acceptor no
    * longer needs them.
    * @param Acceptor If null, all remote content providers added to any acceptor shall be removed.
    */
  def doneWithRemoteContentProviders(Acceptor: XRemoteContentProviderAcceptor): Unit
}
object XRemoteContentProviderDoneListener {
  
  inline def apply(
    acquire: Callback,
    doneWithRemoteContentProviders: XRemoteContentProviderAcceptor => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XRemoteContentProviderDoneListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, doneWithRemoteContentProviders = js.Any.fromFunction1((t0: XRemoteContentProviderAcceptor) => doneWithRemoteContentProviders(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XRemoteContentProviderDoneListener]
  }
  
  extension [Self <: XRemoteContentProviderDoneListener](x: Self) {
    
    inline def setDoneWithRemoteContentProviders(value: XRemoteContentProviderAcceptor => Callback): Self = StObject.set(x, "doneWithRemoteContentProviders", js.Any.fromFunction1((t0: XRemoteContentProviderAcceptor) => value(t0).runNow()))
  }
}
