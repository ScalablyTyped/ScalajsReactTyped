package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact_ extends js.Object {
  /**
    * Accept an incoming contact.
    *
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def accept(successFailOptions: SuccessFailOptions): Unit
  /**
    * Add a new outbound third-party connection to this contact and connect
    * it to the specified endpoint.
    *
    * @param endpoint The endpoint to add.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def addConnection(endpoint: Endpoint, successFailOptions: SuccessFailOptions): Unit
  /**
    * Conference together the active connections of the conversation.
    *
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def conferenceConnections(successFailOptions: SuccessFailOptions): Unit
  /**
    * Close the contact and all of its associated connections.
    *
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def destroy(successFailOptions: SuccessFailOptions): Unit
  /**
    * Get the inital connection of the contact, or null if the initial connection
    * is no longer active.
    */
  def getActiveInitialConnection(): Connection
  /**
    * Gets the agent connection. This is the connection that represents the agent's
    * participation in the contact.
    */
  def getAgentConnection(): Connection
  /**
    * Get a map from attribute name to value for each attribute associated with the contact.
    */
  def getAttributes(): StringDictionary[String]
  /**
    * Get a list containing Connection API objects for each connection in the contact.
    */
  def getConnections(): js.Array[Connection]
  /**
    * Get the unique contactId of this contact.
    */
  def getContactId(): String
  /**
    * Get the initial connection of the contact.
    */
  def getInitialConnection(): Connection
  /**
    * Get the original contact id from which this contact was transferred,
    * or none if this is not an internal Connect transfer.
    */
  def getOriginalContactId(): String
  /**
    * Get the queue associated with the contact.
    */
  def getQueue(): Queue
  /**
    * In Voice contacts, there can only be one active third-party connection.
    * This method returns the single active third-party connection, or null if
    * there are no currently active third-party connections.
    */
  def getSingleActiveThirdPartyConnection(): Connection
  /**
    * Get a ContactState object representing the state of the contact.
    */
  def getStatus(): ContactState
  /**
    * Get the duration of the contact state in milliseconds relative to local time.
    */
  def getStatusDuration(): Double
  /**
    * Get a list of all of the third-party connections, i.e. the list of all
    * connections except for the initial connection, or an empty list if there
    * are no third-party connections.
    */
  def getThirdPartyConnections(): Connection
  /**
    * Get the type of the contact. This indicates what type of media is
    * carried over the connections of the contact.
    */
  def getType(): String
  /**
    * Determine whether the contact is in a connected state.
    */
  def isConnected(): Boolean
  /**
    * Determine whether this is an inbound or outbound contact.
    */
  def isInbound(): Boolean
  /*
    * Determine whether this contact is a softphone call.
    */
  def isSoftphoneCall(): Boolean
  /**
    * Provide diagnostic information for the contact in the case
    * something exceptional happens on the front end.
    *
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def notifyIssue(successFailOptions: SuccessFailOptions): Unit
  /**
    * Subscribe a method to be invoked whenever the contact is accepted.
    */
  def onAccepted(callback: ContactCallback): Unit
  /**
    * Subscribe a method to be invoked when the contact is connected.
    */
  def onConnected(callback: ContactCallback): Unit
  /**
    * Subscribe a method to be invoked whenever the contact is ended or destroyed.
    */
  def onEnded(callback: ContactCallback): Unit
  /**
    * Subscribe a method to be invoked when the contact is incoming.
    */
  def onIncoming(callback: ContactCallback): Unit
  /**
    * Subscribe a method to be invoked whenever the contact is updated.
    */
  def onRefresh(callback: ContactCallback): Unit
  /**
    * Rotate through the connected and on hold connections of the contact.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def toggleActiveConnections(successFailOptions: SuccessFailOptions): Unit
}

object Contact_ {
  @scala.inline
  def apply(
    accept: SuccessFailOptions => Callback,
    addConnection: (Endpoint, SuccessFailOptions) => Callback,
    conferenceConnections: SuccessFailOptions => Callback,
    destroy: SuccessFailOptions => Callback,
    getActiveInitialConnection: CallbackTo[Connection],
    getAgentConnection: CallbackTo[Connection],
    getAttributes: CallbackTo[StringDictionary[String]],
    getConnections: CallbackTo[js.Array[Connection]],
    getContactId: CallbackTo[String],
    getInitialConnection: CallbackTo[Connection],
    getOriginalContactId: CallbackTo[String],
    getQueue: CallbackTo[Queue],
    getSingleActiveThirdPartyConnection: CallbackTo[Connection],
    getStatus: CallbackTo[ContactState],
    getStatusDuration: CallbackTo[Double],
    getThirdPartyConnections: CallbackTo[Connection],
    getType: CallbackTo[String],
    isConnected: CallbackTo[Boolean],
    isInbound: CallbackTo[Boolean],
    isSoftphoneCall: CallbackTo[Boolean],
    notifyIssue: SuccessFailOptions => Callback,
    onAccepted: ContactCallback => Callback,
    onConnected: ContactCallback => Callback,
    onEnded: ContactCallback => Callback,
    onIncoming: ContactCallback => Callback,
    onRefresh: ContactCallback => Callback,
    toggleActiveConnections: SuccessFailOptions => Callback
  ): Contact_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.SuccessFailOptions) => accept(t0).runNow()))
    __obj.updateDynamic("addConnection")(js.Any.fromFunction2((t0: typingsJapgolly.amazonConnectStreams.connect.Endpoint, t1: typingsJapgolly.amazonConnectStreams.connect.SuccessFailOptions) => addConnection(t0, t1).runNow()))
    __obj.updateDynamic("conferenceConnections")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.SuccessFailOptions) => conferenceConnections(t0).runNow()))
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.SuccessFailOptions) => destroy(t0).runNow()))
    __obj.updateDynamic("getActiveInitialConnection")(getActiveInitialConnection.toJsFn)
    __obj.updateDynamic("getAgentConnection")(getAgentConnection.toJsFn)
    __obj.updateDynamic("getAttributes")(getAttributes.toJsFn)
    __obj.updateDynamic("getConnections")(getConnections.toJsFn)
    __obj.updateDynamic("getContactId")(getContactId.toJsFn)
    __obj.updateDynamic("getInitialConnection")(getInitialConnection.toJsFn)
    __obj.updateDynamic("getOriginalContactId")(getOriginalContactId.toJsFn)
    __obj.updateDynamic("getQueue")(getQueue.toJsFn)
    __obj.updateDynamic("getSingleActiveThirdPartyConnection")(getSingleActiveThirdPartyConnection.toJsFn)
    __obj.updateDynamic("getStatus")(getStatus.toJsFn)
    __obj.updateDynamic("getStatusDuration")(getStatusDuration.toJsFn)
    __obj.updateDynamic("getThirdPartyConnections")(getThirdPartyConnections.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("isConnected")(isConnected.toJsFn)
    __obj.updateDynamic("isInbound")(isInbound.toJsFn)
    __obj.updateDynamic("isSoftphoneCall")(isSoftphoneCall.toJsFn)
    __obj.updateDynamic("notifyIssue")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.SuccessFailOptions) => notifyIssue(t0).runNow()))
    __obj.updateDynamic("onAccepted")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.ContactCallback) => onAccepted(t0).runNow()))
    __obj.updateDynamic("onConnected")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.ContactCallback) => onConnected(t0).runNow()))
    __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.ContactCallback) => onEnded(t0).runNow()))
    __obj.updateDynamic("onIncoming")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.ContactCallback) => onIncoming(t0).runNow()))
    __obj.updateDynamic("onRefresh")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.ContactCallback) => onRefresh(t0).runNow()))
    __obj.updateDynamic("toggleActiveConnections")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.SuccessFailOptions) => toggleActiveConnections(t0).runNow()))
    __obj.asInstanceOf[Contact_]
  }
}

