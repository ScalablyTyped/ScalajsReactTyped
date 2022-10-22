package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface should be implemented together with {@link XRemoteContentProviderAcceptor} and allows for a lazy implementation of {@link
  * XRemoteContentProviderAcceptor.addRemoteContentProvider()} .
  *
  * The way this works might change, therefore this interface is marked as deprecated.
  * @deprecated Deprecated
  */
trait XRemoteContentProviderActivator
  extends StObject
     with XInterface {
  
  /**
    * Activate (i.e., register at the broker) the remote content providers that until now have only been remembered by {@link
    * XRemoteContentProviderAcceptor.addRemoteContentProvider()} , but not registered.
    *
    * This allows for {@link XRemoteContentProviderAcceptor.addRemoteContentProvider()} to be implemented in a lazy fashion (remember the remote content
    * providers, but do not register them right away), which can increase performance in certain situations. But it is not required that an implementation
    * of {@link XRemoteContentProviderAcceptor} uses this lazy strategy (and thus also implements this interface).
    * @returns the broker at which the remote content providers have been registered.
    */
  def activateRemoteContentProviders(): XContentProviderManager
}
object XRemoteContentProviderActivator {
  
  inline def apply(
    acquire: Callback,
    activateRemoteContentProviders: CallbackTo[XContentProviderManager],
    queryInterface: `type` => Any,
    release: Callback
  ): XRemoteContentProviderActivator = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, activateRemoteContentProviders = activateRemoteContentProviders.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XRemoteContentProviderActivator]
  }
  
  extension [Self <: XRemoteContentProviderActivator](x: Self) {
    
    inline def setActivateRemoteContentProviders(value: CallbackTo[XContentProviderManager]): Self = StObject.set(x, "activateRemoteContentProviders", value.toJsFn)
  }
}
