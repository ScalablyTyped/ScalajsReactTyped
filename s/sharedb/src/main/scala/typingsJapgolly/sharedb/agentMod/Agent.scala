package typingsJapgolly.sharedb.agentMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sharedb.DuplexisServerboolean
import typingsJapgolly.sharedb.sharedbMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `Agent` is the representation of a client's `Connection` state on the
  * server. If the `Connection` was created through `backend.connect` (i.e. the
  * client is running in the same Node process as the server), then the `Agent`
  * associated with a `Connection` can be accessed through `connection.agent`.
  *
  * The `Agent` will be made available in all middleware requests. The
  * `agent.custom` field is an object that can be used for storing arbitrary
  * information for use in middleware.
  *
  * @see https://github.com/share/sharedb#class-sharedbagent
  */
trait Agent extends js.Object {
  var backend: typingsJapgolly.sharedb.mod.^
  /**
    * Object for custom use in middleware to store app-specific state for a
    * given client session. It is in memory only as long as the session is
    * active, and it is passed to each middleware call.
    */
  var custom: Custom
  var stream: DuplexisServerboolean
  /**
    * Sends a JSON-compatible message to the client for this agent.
    *
    * @param message
    */
  def send(message: JSONObject): Unit
}

object Agent {
  @scala.inline
  def apply(
    backend: typingsJapgolly.sharedb.mod.^,
    custom: Custom,
    send: JSONObject => Callback,
    stream: DuplexisServerboolean
  ): Agent = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: typingsJapgolly.sharedb.sharedbMod.JSONObject) => send(t0).runNow()))
    __obj.asInstanceOf[Agent]
  }
}

