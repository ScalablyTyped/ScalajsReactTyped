package typingsJapgolly.puppeteer.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracing extends js.Object {
  def start(options: TracingStartOptions): js.Promise[Unit]
  def stop(): js.Promise[Buffer]
}

object Tracing {
  @scala.inline
  def apply(start: TracingStartOptions => CallbackTo[js.Promise[Unit]], stop: CallbackTo[js.Promise[Buffer]]): Tracing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("start")(js.Any.fromFunction1((t0: typingsJapgolly.puppeteer.mod.TracingStartOptions) => start(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[Tracing]
  }
}

