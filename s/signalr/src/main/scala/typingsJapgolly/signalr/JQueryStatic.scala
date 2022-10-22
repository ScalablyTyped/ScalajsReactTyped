package typingsJapgolly.signalr

import typingsJapgolly.signalr.SignalR.Connection
import typingsJapgolly.signalr.SignalR.Hub.HubCreator
import typingsJapgolly.signalr.SignalR.Hub.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  /**
    * Creates a new SignalR connection for the given url
    *
    * @param url   The URL of the long polling endpoint
    * @param queryString   [Optional] Custom querystring parameters to add to the connection URL. If an object, every non-function member will be added to the querystring. If a string, it's added to the QS as specified.
    * @param logging [Optional] A flag indicating whether connection logging is enabled to the browser console/log. Defaults to false.
    */
  def connection(url: String): Connection
  def connection(url: String, queryString: String): Connection
  def connection(url: String, queryString: String, logging: Boolean): Connection
  def connection(url: String, queryString: js.Object): Connection
  def connection(url: String, queryString: js.Object, logging: Boolean): Connection
  def connection(url: String, queryString: Unit, logging: Boolean): Connection
  @JSName("connection")
  var connection_Original: SignalR
  
  def hubConnection(): typingsJapgolly.signalr.SignalR.Hub.Connection
  def hubConnection(url: String): typingsJapgolly.signalr.SignalR.Hub.Connection
  def hubConnection(url: String, options: Options): typingsJapgolly.signalr.SignalR.Hub.Connection
  def hubConnection(url: Unit, options: Options): typingsJapgolly.signalr.SignalR.Hub.Connection
  @JSName("hubConnection")
  var hubConnection_Original: HubCreator
  
  /**
    * Creates a new SignalR connection for the given url
    *
    * @param url   The URL of the long polling endpoint
    * @param queryString   [Optional] Custom querystring parameters to add to the connection URL. If an object, every non-function member will be added to the querystring. If a string, it's added to the QS as specified.
    * @param logging [Optional] A flag indicating whether connection logging is enabled to the browser console/log. Defaults to false.
    */
  def signalR(url: String): Connection
  def signalR(url: String, queryString: String): Connection
  def signalR(url: String, queryString: String, logging: Boolean): Connection
  def signalR(url: String, queryString: js.Object): Connection
  def signalR(url: String, queryString: js.Object, logging: Boolean): Connection
  def signalR(url: String, queryString: Unit, logging: Boolean): Connection
  @JSName("signalR")
  var signalR_Original: SignalR
}
object JQueryStatic {
  
  inline def apply(
    connection: SignalR,
    hubConnection: (/* url */ js.UndefOr[String], /* options */ js.UndefOr[Options]) => typingsJapgolly.signalr.SignalR.Hub.Connection,
    signalR: SignalR
  ): JQueryStatic = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], hubConnection = js.Any.fromFunction2(hubConnection), signalR = signalR.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setConnection(value: SignalR): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setHubConnection(
      value: (/* url */ js.UndefOr[String], /* options */ js.UndefOr[Options]) => typingsJapgolly.signalr.SignalR.Hub.Connection
    ): Self = StObject.set(x, "hubConnection", js.Any.fromFunction2(value))
    
    inline def setSignalR(value: SignalR): Self = StObject.set(x, "signalR", value.asInstanceOf[js.Any])
  }
}
