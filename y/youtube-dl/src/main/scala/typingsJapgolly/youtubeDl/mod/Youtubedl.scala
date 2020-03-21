package typingsJapgolly.youtubeDl.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Youtubedl extends js.Object {
  def on(event: String, func: js.Function1[/* info */ Info, Unit]): this.type
  def pipe(stream: WriteStream): this.type
}

object Youtubedl {
  @scala.inline
  def apply(
    on: (String, js.Function1[/* info */ Info, Unit]) => CallbackTo[Youtubedl],
    pipe: WriteStream => CallbackTo[Youtubedl]
  ): Youtubedl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* info */ typingsJapgolly.youtubeDl.mod.Info, scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("pipe")(js.Any.fromFunction1((t0: typingsJapgolly.node.fsMod.WriteStream) => pipe(t0).runNow()))
    __obj.asInstanceOf[Youtubedl]
  }
}

