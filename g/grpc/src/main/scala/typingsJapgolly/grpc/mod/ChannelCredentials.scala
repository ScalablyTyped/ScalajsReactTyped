package typingsJapgolly.grpc.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelCredentials extends js.Object {
  /**
    * Returns a copy of this object with the included set of per-call credentials
    * expanded to include callCredentials.
    * @param callCredentials A CallCredentials object to associate with this
    * instance.
    */
  def compose(callCredentials: CallCredentials): ChannelCredentials
}

object ChannelCredentials {
  @scala.inline
  def apply(compose: CallCredentials => CallbackTo[ChannelCredentials]): ChannelCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compose")(js.Any.fromFunction1((t0: typingsJapgolly.grpc.mod.CallCredentials) => compose(t0).runNow()))
    __obj.asInstanceOf[ChannelCredentials]
  }
}

