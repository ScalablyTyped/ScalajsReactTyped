package typingsJapgolly.signalr

import typingsJapgolly.signalr.SignalR.AjaxDefaults
import typingsJapgolly.signalr.SignalR.AvailableEvents
import typingsJapgolly.signalr.SignalR.ConnectionStates
import typingsJapgolly.signalr.SignalR.Hub.Connection
import typingsJapgolly.signalr.SignalR.Hub.HubCreator
import typingsJapgolly.signalr.SignalR.Hub.Options
import typingsJapgolly.signalr.SignalR.Transports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalR_ extends js.Object {
  var ajaxDefaults: AjaxDefaults = js.native
  var connectionState: ConnectionStates = js.native
  var events: AvailableEvents = js.native
  var hub: Connection = js.native
  @JSName("hubConnection")
  var hubConnection_Original: HubCreator = js.native
  var transports: Transports = js.native
  /**
    *   Current SignalR version.
    */
  var version: String = js.native
  /**
    * Creates a new SignalR connection for the given url
    *
    * @param url   The URL of the long polling endpoint
    * @param queryString   [Optional] Custom querystring parameters to add to the connection URL. If an object, every non-function member will be added to the querystring. If a string, it's added to the QS as specified.
    * @param logging [Optional] A flag indicating whether connection logging is enabled to the browser console/log. Defaults to false.
    */
  def apply(url: String): typingsJapgolly.signalr.SignalR.Connection = js.native
  def apply(url: String, queryString: String): typingsJapgolly.signalr.SignalR.Connection = js.native
  def apply(url: String, queryString: String, logging: Boolean): typingsJapgolly.signalr.SignalR.Connection = js.native
  def apply(url: String, queryString: js.Object): typingsJapgolly.signalr.SignalR.Connection = js.native
  def apply(url: String, queryString: js.Object, logging: Boolean): typingsJapgolly.signalr.SignalR.Connection = js.native
  def changeState(connection: typingsJapgolly.signalr.SignalR.Connection, expectedState: Double, newState: Double): Unit = js.native
  def hubConnection(): Connection = js.native
  def hubConnection(url: String): Connection = js.native
  def hubConnection(url: String, options: Options): Connection = js.native
  def isDisconnecting(connection: typingsJapgolly.signalr.SignalR.Connection): Boolean = js.native
  /**
    *   Reinstates the original value of $.connection and returns the signalR object for manual assignment.
    */
  def noConflict(): typingsJapgolly.signalr.SignalR.Connection = js.native
}

