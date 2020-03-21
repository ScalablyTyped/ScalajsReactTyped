package typingsJapgolly.unzipper

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSize extends js.Object {
  var stream: Readable
  def size(): js.Promise[Double]
}

object AnonSize {
  @scala.inline
  def apply(size: CallbackTo[js.Promise[Double]], stream: Readable): AnonSize = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[AnonSize]
  }
}

