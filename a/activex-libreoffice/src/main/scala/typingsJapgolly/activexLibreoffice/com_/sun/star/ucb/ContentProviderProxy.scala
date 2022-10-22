package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a proxy for a content provider.
  *
  * Implementing a content provider proxy can be useful if the creation of the real content provider object shall be deferred for some reason (i.e.
  * performance) until the first method gets called on it. Instead of instantiating and registering the real provider at the UCB, a proxy for the real
  * provider can be created and registered at the UCB.
  * @see XContentProviderProxyFactory
  */
trait ContentProviderProxy
  extends StObject
     with XContentProviderSupplier
     with XContentProvider
     with XParameterizedContentProvider
object ContentProviderProxy {
  
  inline def apply(
    ContentProvider: XContentProvider,
    acquire: Callback,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => Double,
    deregisterInstance: (String, String) => XContentProvider,
    getContentProvider: CallbackTo[XContentProvider],
    queryContent: XContentIdentifier => XContent,
    queryInterface: `type` => Any,
    registerInstance: (String, String, Boolean) => XContentProvider,
    release: Callback
  ): ContentProviderProxy = {
    val __obj = js.Dynamic.literal(ContentProvider = ContentProvider.asInstanceOf[js.Any], acquire = acquire.toJsFn, compareContentIds = js.Any.fromFunction2(compareContentIds), deregisterInstance = js.Any.fromFunction2(deregisterInstance), getContentProvider = getContentProvider.toJsFn, queryContent = js.Any.fromFunction1(queryContent), queryInterface = js.Any.fromFunction1(queryInterface), registerInstance = js.Any.fromFunction3(registerInstance), release = release.toJsFn)
    __obj.asInstanceOf[ContentProviderProxy]
  }
}
