package typingsJapgolly.figma.mod._Global_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
// Other
trait Image extends js.Object {
  val hash: String
  def getBytesAsync(): js.Promise[scala.scalajs.js.typedarray.Uint8Array]
}

object Image {
  @scala.inline
  def apply(getBytesAsync: CallbackTo[js.Promise[scala.scalajs.js.typedarray.Uint8Array]], hash: String): Image = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.updateDynamic("getBytesAsync")(getBytesAsync.toJsFn)
    __obj.asInstanceOf[Image]
  }
}

