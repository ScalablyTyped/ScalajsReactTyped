package typingsJapgolly.msgpack5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeDecodeOptions extends js.Object {
  var header: js.UndefOr[Boolean] = js.undefined
}

object EncodeDecodeOptions {
  @scala.inline
  def apply(header: js.UndefOr[Boolean] = js.undefined): EncodeDecodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeDecodeOptions]
  }
}

