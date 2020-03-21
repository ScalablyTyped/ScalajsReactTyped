package typingsJapgolly.recorderJs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recorder extends js.Object {
  def init(stream: MediaStream): js.Promise[Unit]
  def start(): js.Promise[js.UndefOr[MediaStream]]
  def stop(): js.Promise[RecorderResult]
}

object Recorder {
  @scala.inline
  def apply(
    init: MediaStream => CallbackTo[js.Promise[Unit]],
    start: CallbackTo[js.Promise[js.UndefOr[MediaStream]]],
    stop: CallbackTo[js.Promise[RecorderResult]]
  ): Recorder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: org.scalajs.dom.experimental.mediastream.MediaStream) => init(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[Recorder]
  }
}

