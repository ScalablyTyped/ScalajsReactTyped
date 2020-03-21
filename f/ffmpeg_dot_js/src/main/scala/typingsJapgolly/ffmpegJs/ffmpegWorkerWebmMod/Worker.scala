package typingsJapgolly.ffmpegJs.ffmpegWorkerWebmMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Worker extends js.Object {
  def onmessage(opts: OnMessageOptions): Unit
  def postMessage(opts: PostMessageOptions): Unit
  def terminate(): Unit
}

object Worker {
  @scala.inline
  def apply(
    onmessage: OnMessageOptions => Callback,
    postMessage: PostMessageOptions => Callback,
    terminate: Callback
  ): Worker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onmessage")(js.Any.fromFunction1((t0: typingsJapgolly.ffmpegJs.ffmpegWorkerWebmMod.OnMessageOptions) => onmessage(t0).runNow()))
    __obj.updateDynamic("postMessage")(js.Any.fromFunction1((t0: typingsJapgolly.ffmpegJs.ffmpegWorkerWebmMod.PostMessageOptions) => postMessage(t0).runNow()))
    __obj.updateDynamic("terminate")(terminate.toJsFn)
    __obj.asInstanceOf[Worker]
  }
}

