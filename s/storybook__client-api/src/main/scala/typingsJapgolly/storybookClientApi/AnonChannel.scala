package typingsJapgolly.storybookClientApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.storybookChannels.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannel extends js.Object {
  var channel: default | Null
  var clientApi: typingsJapgolly.storybookClientApi.clientApiMod.default
  var storyStore: typingsJapgolly.storybookClientApi.storyStoreMod.default
  def clearDecorators(): Unit
}

object AnonChannel {
  @scala.inline
  def apply(
    clearDecorators: Callback,
    clientApi: typingsJapgolly.storybookClientApi.clientApiMod.default,
    storyStore: typingsJapgolly.storybookClientApi.storyStoreMod.default,
    channel: default = null
  ): AnonChannel = {
    val __obj = js.Dynamic.literal(clientApi = clientApi.asInstanceOf[js.Any], storyStore = storyStore.asInstanceOf[js.Any])
    __obj.updateDynamic("clearDecorators")(clearDecorators.toJsFn)
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannel]
  }
}

