package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.amazonConnectStreams.amazonConnectStreamsStrings.inbound
import typingsJapgolly.amazonConnectStreams.amazonConnectStreamsStrings.monitoring
import typingsJapgolly.amazonConnectStreams.amazonConnectStreamsStrings.outbound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  /**
    * Ends the connection.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def destroy(successFailOptions: SuccessFailOptions): Unit
  /**
    * Gets the unique connectionId for this connection.
    */
  def getConnectionId(): String
  /**
    * Gets the unique contactId of the contact to which this connection belongs.
    */
  def getContactId(): String
  /**
    * Gets the endpoint to which this connection is connected.
    */
  def getEndpoint(): Endpoint
  /**
    * Gets the ConnectionState object for this connection.
    */
  def getState(): ConnectionState
  /**
    * Get the duration of the connection state, in milliseconds, relative to local time.
    */
  def getStateDuration(): Double
  /**
    * Get the type of connection.
    */
  def getType(): inbound | outbound | monitoring
  /**
    * Put this connection on hold.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def hold(successFailOptions: SuccessFailOptions): Unit
  /**
    * Determine if the contact is active.
    */
  def isActive(): Boolean
  /**
    * Determine if the connection is connected, meaning that the agent is live in a
    * conversation through this connection.
    */
  def isConnected(): Boolean
  /**
    * Determine whether the connection is in the process of connecting.
    */
  def isConnecting(): Boolean
  /**
    * Determine if the connection is the contact's initial connection.
    */
  def isInitialConnection(): Boolean
  /**
    * Determine whether the connection is on hold.
    */
  def isOnHold(): Boolean
  /**
    * Resume this connection if it was on hold.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def resume(successFailOptions: SuccessFailOptions): Unit
  /**
    * Send a digit or string of digits through this connection.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def sendDigits(options: SendDigitOptions): Unit
}

object Connection {
  @scala.inline
  def apply(
    destroy: SuccessFailOptions => Callback,
    getConnectionId: CallbackTo[String],
    getContactId: CallbackTo[String],
    getEndpoint: CallbackTo[Endpoint],
    getState: CallbackTo[ConnectionState],
    getStateDuration: CallbackTo[Double],
    getType: CallbackTo[inbound | outbound | monitoring],
    hold: SuccessFailOptions => Callback,
    isActive: CallbackTo[Boolean],
    isConnected: CallbackTo[Boolean],
    isConnecting: CallbackTo[Boolean],
    isInitialConnection: CallbackTo[Boolean],
    isOnHold: CallbackTo[Boolean],
    resume: SuccessFailOptions => Callback,
    sendDigits: SendDigitOptions => Callback
  ): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.SuccessFailOptions) => destroy(t0).runNow()))
    __obj.updateDynamic("getConnectionId")(getConnectionId.toJsFn)
    __obj.updateDynamic("getContactId")(getContactId.toJsFn)
    __obj.updateDynamic("getEndpoint")(getEndpoint.toJsFn)
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("getStateDuration")(getStateDuration.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("hold")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.SuccessFailOptions) => hold(t0).runNow()))
    __obj.updateDynamic("isActive")(isActive.toJsFn)
    __obj.updateDynamic("isConnected")(isConnected.toJsFn)
    __obj.updateDynamic("isConnecting")(isConnecting.toJsFn)
    __obj.updateDynamic("isInitialConnection")(isInitialConnection.toJsFn)
    __obj.updateDynamic("isOnHold")(isOnHold.toJsFn)
    __obj.updateDynamic("resume")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.SuccessFailOptions) => resume(t0).runNow()))
    __obj.updateDynamic("sendDigits")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.SendDigitOptions) => sendDigits(t0).runNow()))
    __obj.asInstanceOf[Connection]
  }
}

