package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link ContentProvider} that wraps remote content providers that (potentially) have been distributed to a UCB.
  *
  * Before trying to pass a request to a "real", underlying content provider (which will most likely be a remote content provider distributed to this
  * UCB), this proxy first activates any remote content providers that have been distributed here, but are still inactive (see {@link
  * RemoteContentProviderAcceptor} and {@link XRemoteContentProviderActivator} for more information).
  *
  * The way this works might change, therefore this interface is marked as deprecated.
  * @deprecated Deprecated
  */
trait RemoteProxyContentProvider
  extends StObject
     with XContentProvider
     with XContentIdentifierFactory
     with XParameterizedContentProvider
object RemoteProxyContentProvider {
  
  inline def apply(
    acquire: Callback,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => Double,
    createContentIdentifier: String => XContentIdentifier,
    deregisterInstance: (String, String) => XContentProvider,
    queryContent: XContentIdentifier => XContent,
    queryInterface: `type` => Any,
    registerInstance: (String, String, Boolean) => XContentProvider,
    release: Callback
  ): RemoteProxyContentProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, compareContentIds = js.Any.fromFunction2(compareContentIds), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), deregisterInstance = js.Any.fromFunction2(deregisterInstance), queryContent = js.Any.fromFunction1(queryContent), queryInterface = js.Any.fromFunction1(queryInterface), registerInstance = js.Any.fromFunction3(registerInstance), release = release.toJsFn)
    __obj.asInstanceOf[RemoteProxyContentProvider]
  }
}
