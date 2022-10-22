package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows content providers running in remote processes to be registered at the local content provider broker. */
trait RemoteContentProviderAcceptor
  extends StObject
     with XRemoteContentProviderAcceptor
     with XRemoteContentProviderActivator
object RemoteContentProviderAcceptor {
  
  inline def apply(
    acquire: Callback,
    activateRemoteContentProviders: CallbackTo[XContentProviderManager],
    addRemoteContentProvider: (String, XMultiServiceFactory, SeqEquiv[String], XRemoteContentProviderDoneListener) => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeRemoteContentProvider: String => Boolean
  ): RemoteContentProviderAcceptor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, activateRemoteContentProviders = activateRemoteContentProviders.toJsFn, addRemoteContentProvider = js.Any.fromFunction4(addRemoteContentProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeRemoteContentProvider = js.Any.fromFunction1(removeRemoteContentProvider))
    __obj.asInstanceOf[RemoteContentProviderAcceptor]
  }
}
