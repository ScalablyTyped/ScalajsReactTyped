package typingsJapgolly.freedom.freedom

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See |Core_unprivileged| in |core.unprivileged.js|
trait Core extends js.Object {
  // Given an ChannelEndpointIdentifier for a channel, create a proxy event
  // interface for it.
  def bindChannel(channelIdentifier: String): js.Promise[Channel]
  // Create a new channel which which to communicate between modules.
  def createChannel(): js.Promise[ChannelSpecifier]
  // Returns the list of identifiers describing the dependency path.
  def getId(): js.Promise[js.Array[String]]
  def getLogger(tag: String): js.Promise[Logger]
}

object Core {
  @scala.inline
  def apply(
    bindChannel: String => CallbackTo[js.Promise[Channel]],
    createChannel: CallbackTo[js.Promise[ChannelSpecifier]],
    getId: CallbackTo[js.Promise[js.Array[String]]],
    getLogger: String => CallbackTo[js.Promise[Logger]]
  ): Core = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindChannel")(js.Any.fromFunction1((t0: java.lang.String) => bindChannel(t0).runNow()))
    __obj.updateDynamic("createChannel")(createChannel.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getLogger")(js.Any.fromFunction1((t0: java.lang.String) => getLogger(t0).runNow()))
    __obj.asInstanceOf[Core]
  }
}

