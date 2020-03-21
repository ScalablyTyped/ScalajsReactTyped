package typingsJapgolly.xrm.Xrm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.XrmEnum.ClientFormFactor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the client context.
  */
trait ClientContext extends js.Object {
  /**
    * Returns a value to indicate which client the script is executing in.
    * @returns The client, as either "Web", "Outlook", or "Mobile"
    */
  def getClient(): Client
  /**
    * Gets client's current state.
    * @returns The client state, as either "Online" or "Offline"
    */
  def getClientState(): ClientState
  /**
    * Use this method to get information about the kind of device the user is using.
    */
  def getFormFactor(): ClientFormFactor
  /**
    * Returns information whether the server is online or offline.
    */
  def isOffline(): Boolean
}

object ClientContext {
  @scala.inline
  def apply(
    getClient: CallbackTo[Client],
    getClientState: CallbackTo[ClientState],
    getFormFactor: CallbackTo[ClientFormFactor],
    isOffline: CallbackTo[Boolean]
  ): ClientContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getClient")(getClient.toJsFn)
    __obj.updateDynamic("getClientState")(getClientState.toJsFn)
    __obj.updateDynamic("getFormFactor")(getFormFactor.toJsFn)
    __obj.updateDynamic("isOffline")(isOffline.toJsFn)
    __obj.asInstanceOf[ClientContext]
  }
}

