package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingPersistent extends js.Object {
  var encoding: js.UndefOr[java.lang.String | Null] = js.undefined
  var persistent: js.UndefOr[Boolean] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object AnonEncodingPersistent {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined
  ): AnonEncodingPersistent = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingPersistent]
  }
}

