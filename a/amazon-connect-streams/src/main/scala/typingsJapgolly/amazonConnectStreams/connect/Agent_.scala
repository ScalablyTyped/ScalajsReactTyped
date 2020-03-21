package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agent_ extends js.Object {
  /**
    * Creates an outbound contact to the given endpoint.
    *
    * @param endpoint An object describing the endpoint to which to connect.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def connect(endpoint: Endpoint, successFailOptions: ConnectOptions): Unit
  /**
    * Gets the list of selectable AgentState API objects.
    */
  def getAgentStates(): js.Array[AgentState]
  /**
    * Gets the full AgentConfiguration object for the agent.
    */
  def getConfiguration(): AgentConfiguration
  // /**
  //  * For internal purposes only.
  //  */
  // getPermissions(): string[];
  /**
    * Gets a list of Contact API objects for each of the agent's current contacts.
    */
  def getContacts(contactTypeFilter: String): js.Array[Contact_]
  /**
    * Gets the agent's phone number from the AgentConfiguration object for the agent.
    */
  def getExtension(): String
  /**
    * Gets the agent's user friendly display name from the AgentConfiguration object for the agent.
    */
  def getName(): String
  /**
    * Gets the agent's routing profile.
    */
  def getRoutingProfile(): AgentRoutingProfile
  /**
    * Get the agent's current AgentState object indicating their availability state type.
    */
  def getState(): AgentState
  /**
    * Get the duration of the agent's state in milliseconds relative to local time.
    */
  def getStateDuration(): Double
  /**
    * Determine if softphone is enabled for the agent.
    */
  def isSoftphoneEnabled(): Boolean
  /*
    * Sets the agent local media to mute mode.
    */
  def mute(): Unit
  /**
    * Subscribe a method to be called when the agent enters the "After Call Work" (ACW) state.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onAfterCallWork(callback: AgentCallback): Unit
  /**
    * Subscribe a method to be called whenever Contact information is about to be updated.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onContactPending(callback: AgentCallback): Unit
  /**
    * Subscribe a method to be called when the agent is put into an error state.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onError(callback: AgentCallback): Unit
  /**
    * Subscribe a method to be called when the agent updates the mute status,
    * meaning that agents mute/unmute APIs are called and the local media stream
    * is succesfully updated with the new status.
    *
    * @param callback A callback to receive updates on agent mute state
    */
  def onMuteToggle(callback: MuteCallback): Unit
  /**
    * Subscribe a method to be called when the agent becomes not-routable, meaning that they are online but cannot be routed incoming contacts.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onNotRoutable(callback: AgentCallback): Unit
  /**
    * Subscribe a method to be called when the agent goes offline.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onOffline(callback: AgentCallback): Unit
  /**
    * Subscribe a method to be called whenever new agent data is available.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onRefresh(callback: AgentCallback): Unit
  /**
    * Subscribe a method to be called when the agent becomes routable, meaning that they can be routed incoming contacts.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onRoutable(callback: AgentCallback): Unit
  /**
    * Updates the agent's configuration with the given AgentConfiguration object.
    *
    * @param configuration The desired configuration
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def setConfiguration(configuration: AgentConfiguration, successFailOptions: SuccessFailOptions): Unit
  /**
    * Set the agent's current availability state.
    *
    * @param state The new agent state.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def setState(state: AgentState, successFailOptions: SuccessFailOptions): Unit
  /**
    * Create a snapshot version of the current Agent state and save it for future use, such as adding to a log file or posting elsewhere.
    */
  def toSnapshot(): Agent_
  /*
    * Sets the agent localmedia to unmute mode.
    */
  def unmute(): Unit
}

object Agent_ {
  @scala.inline
  def apply(
    connect: (Endpoint, ConnectOptions) => Callback,
    getAgentStates: CallbackTo[js.Array[AgentState]],
    getConfiguration: CallbackTo[AgentConfiguration],
    getContacts: String => CallbackTo[js.Array[Contact_]],
    getExtension: CallbackTo[String],
    getName: CallbackTo[String],
    getRoutingProfile: CallbackTo[AgentRoutingProfile],
    getState: CallbackTo[AgentState],
    getStateDuration: CallbackTo[Double],
    isSoftphoneEnabled: CallbackTo[Boolean],
    mute: Callback,
    onAfterCallWork: AgentCallback => Callback,
    onContactPending: AgentCallback => Callback,
    onError: AgentCallback => Callback,
    onMuteToggle: MuteCallback => Callback,
    onNotRoutable: AgentCallback => Callback,
    onOffline: AgentCallback => Callback,
    onRefresh: AgentCallback => Callback,
    onRoutable: AgentCallback => Callback,
    setConfiguration: (AgentConfiguration, SuccessFailOptions) => Callback,
    setState: (AgentState, SuccessFailOptions) => Callback,
    toSnapshot: CallbackTo[Agent_],
    unmute: Callback
  ): Agent_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connect")(js.Any.fromFunction2((t0: typingsJapgolly.amazonConnectStreams.connect.Endpoint, t1: typingsJapgolly.amazonConnectStreams.connect.ConnectOptions) => connect(t0, t1).runNow()))
    __obj.updateDynamic("getAgentStates")(getAgentStates.toJsFn)
    __obj.updateDynamic("getConfiguration")(getConfiguration.toJsFn)
    __obj.updateDynamic("getContacts")(js.Any.fromFunction1((t0: java.lang.String) => getContacts(t0).runNow()))
    __obj.updateDynamic("getExtension")(getExtension.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getRoutingProfile")(getRoutingProfile.toJsFn)
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("getStateDuration")(getStateDuration.toJsFn)
    __obj.updateDynamic("isSoftphoneEnabled")(isSoftphoneEnabled.toJsFn)
    __obj.updateDynamic("mute")(mute.toJsFn)
    __obj.updateDynamic("onAfterCallWork")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.AgentCallback) => onAfterCallWork(t0).runNow()))
    __obj.updateDynamic("onContactPending")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.AgentCallback) => onContactPending(t0).runNow()))
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.AgentCallback) => onError(t0).runNow()))
    __obj.updateDynamic("onMuteToggle")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.MuteCallback) => onMuteToggle(t0).runNow()))
    __obj.updateDynamic("onNotRoutable")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.AgentCallback) => onNotRoutable(t0).runNow()))
    __obj.updateDynamic("onOffline")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.AgentCallback) => onOffline(t0).runNow()))
    __obj.updateDynamic("onRefresh")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.AgentCallback) => onRefresh(t0).runNow()))
    __obj.updateDynamic("onRoutable")(js.Any.fromFunction1((t0: typingsJapgolly.amazonConnectStreams.connect.AgentCallback) => onRoutable(t0).runNow()))
    __obj.updateDynamic("setConfiguration")(js.Any.fromFunction2((t0: typingsJapgolly.amazonConnectStreams.connect.AgentConfiguration, t1: typingsJapgolly.amazonConnectStreams.connect.SuccessFailOptions) => setConfiguration(t0, t1).runNow()))
    __obj.updateDynamic("setState")(js.Any.fromFunction2((t0: typingsJapgolly.amazonConnectStreams.connect.AgentState, t1: typingsJapgolly.amazonConnectStreams.connect.SuccessFailOptions) => setState(t0, t1).runNow()))
    __obj.updateDynamic("toSnapshot")(toSnapshot.toJsFn)
    __obj.updateDynamic("unmute")(unmute.toJsFn)
    __obj.asInstanceOf[Agent_]
  }
}

