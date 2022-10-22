package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to query/register/deregister content providers.
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
trait XContentProviderManager
  extends StObject
     with XInterface {
  
  /**
    * deregisters a content provider.
    * @param Provider a content provider to deregister.
    * @param Scheme the URL scheme for the provided contents. More generally, this may not only be a URL scheme, but a URL template (see {@link registerConten
    */
  def deregisterContentProvider(Provider: XContentProvider, Scheme: String): Unit
  
  /**
    * returns the currently active content provider for a content identifier.
    * @param Identifier a content identifier (i.e., a URL).
    * @returns a content provider, or null.
    */
  def queryContentProvider(Identifier: String): XContentProvider
  
  /**
    * returns a list of information on all registered content providers.
    * @returns a list information on content providers.
    */
  def queryContentProviders(): SafeArray[ContentProviderInfo]
  
  /**
    * registers a content provider for a specific URL template.
    * @param Provider the content provider to register.  This may be `NULL` , in which case a later {@link XContentProvider.queryContent()} with an {@link XCo
    * @param Scheme the URL scheme for the provided contents. More generally, this may not only be a URL scheme, but a URL template.  A URL template is a regu
    * @param ReplaceExisting `TRUE` : replace the provider possibly registered for the given URL template. The replaced provider will not be deregistered auto
    * @returns the replaced content provider, if there was one.
    * @see XContentIdentifier
    */
  def registerContentProvider(Provider: XContentProvider, Scheme: String, ReplaceExisting: Boolean): XContentProvider
}
object XContentProviderManager {
  
  inline def apply(
    acquire: Callback,
    deregisterContentProvider: (XContentProvider, String) => Callback,
    queryContentProvider: String => XContentProvider,
    queryContentProviders: CallbackTo[SafeArray[ContentProviderInfo]],
    queryInterface: `type` => Any,
    registerContentProvider: (XContentProvider, String, Boolean) => XContentProvider,
    release: Callback
  ): XContentProviderManager = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, deregisterContentProvider = js.Any.fromFunction2((t0: XContentProvider, t1: String) => (deregisterContentProvider(t0, t1)).runNow()), queryContentProvider = js.Any.fromFunction1(queryContentProvider), queryContentProviders = queryContentProviders.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), registerContentProvider = js.Any.fromFunction3(registerContentProvider), release = release.toJsFn)
    __obj.asInstanceOf[XContentProviderManager]
  }
  
  extension [Self <: XContentProviderManager](x: Self) {
    
    inline def setDeregisterContentProvider(value: (XContentProvider, String) => Callback): Self = StObject.set(x, "deregisterContentProvider", js.Any.fromFunction2((t0: XContentProvider, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setQueryContentProvider(value: String => XContentProvider): Self = StObject.set(x, "queryContentProvider", js.Any.fromFunction1(value))
    
    inline def setQueryContentProviders(value: CallbackTo[SafeArray[ContentProviderInfo]]): Self = StObject.set(x, "queryContentProviders", value.toJsFn)
    
    inline def setRegisterContentProvider(value: (XContentProvider, String, Boolean) => XContentProvider): Self = StObject.set(x, "registerContentProvider", js.Any.fromFunction3(value))
  }
}
