package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Distribute a content broker to various XRemoteContentProviderAcceptors.
  * @author Stephan Bergmann
  * @see XRemoteContentProviderAcceptor
  * @version 1.0
  */
trait XRemoteContentProviderDistributor
  extends StObject
     with XInterface {
  
  /**
    * Offer the local content broker to a remote content provider acceptor.
    *
    * The Uno Url is handed to the {@link com.sun.star.bridge.UnoUrlResolver} service, which is responsible for raising any of the advertised exceptions.
    * @param Url A Uno Url to address the {@link XRemoteContentProviderAcceptor} .
    * @param Identifier An identifier handed to the {@link XRemoteContentProviderAcceptor} .
    * @returns success indicator. Especially, if there's already a connection to the given Url, the call will fail, no matter whether that connection uses the s
    */
  def connectToRemoteAcceptor(Url: String, Identifier: String): Boolean
  
  /** Undo the offering of the local content broker to all remote content provider acceptors. */
  def disconnectFromAll(): Unit
  
  /**
    * Undo the offering of the local content broker to a specific remote content provider acceptor.
    * @param Url A Uno Url to address the {@link XRemoteContentProviderAcceptor} .
    * @returns success indicator.
    */
  def disconnectFromRemoteAcceptor(Url: String): Boolean
}
object XRemoteContentProviderDistributor {
  
  inline def apply(
    acquire: Callback,
    connectToRemoteAcceptor: (String, String) => Boolean,
    disconnectFromAll: Callback,
    disconnectFromRemoteAcceptor: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XRemoteContentProviderDistributor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, connectToRemoteAcceptor = js.Any.fromFunction2(connectToRemoteAcceptor), disconnectFromAll = disconnectFromAll.toJsFn, disconnectFromRemoteAcceptor = js.Any.fromFunction1(disconnectFromRemoteAcceptor), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XRemoteContentProviderDistributor]
  }
  
  extension [Self <: XRemoteContentProviderDistributor](x: Self) {
    
    inline def setConnectToRemoteAcceptor(value: (String, String) => Boolean): Self = StObject.set(x, "connectToRemoteAcceptor", js.Any.fromFunction2(value))
    
    inline def setDisconnectFromAll(value: Callback): Self = StObject.set(x, "disconnectFromAll", value.toJsFn)
    
    inline def setDisconnectFromRemoteAcceptor(value: String => Boolean): Self = StObject.set(x, "disconnectFromRemoteAcceptor", js.Any.fromFunction1(value))
  }
}
