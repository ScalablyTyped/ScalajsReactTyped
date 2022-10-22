package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provide access to a collection of remote content providers.
  * @author Stephan Bergmann
  * @see XRemoteContentProviderAcceptor
  * @version 1.0
  */
trait XRemoteContentProviderSupplier
  extends StObject
     with XInterface {
  
  /**
    * Get a factory through which a remote content provider's {@link UniversalContentBroker} service can be instantiated.
    * @param Identifier An arbitrary identifier uniquely identifying a remote content provider.
    * @returns the appropriate factory, or null if none is available.
    */
  def queryRemoteContentProvider(Identifier: String): XMultiServiceFactory
}
object XRemoteContentProviderSupplier {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    queryRemoteContentProvider: String => XMultiServiceFactory,
    release: Callback
  ): XRemoteContentProviderSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), queryRemoteContentProvider = js.Any.fromFunction1(queryRemoteContentProvider), release = release.toJsFn)
    __obj.asInstanceOf[XRemoteContentProviderSupplier]
  }
  
  extension [Self <: XRemoteContentProviderSupplier](x: Self) {
    
    inline def setQueryRemoteContentProvider(value: String => XMultiServiceFactory): Self = StObject.set(x, "queryRemoteContentProvider", js.Any.fromFunction1(value))
  }
}
