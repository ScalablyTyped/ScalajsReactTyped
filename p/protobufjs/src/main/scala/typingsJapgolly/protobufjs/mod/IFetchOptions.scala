package typingsJapgolly.protobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFetchOptions extends js.Object {
  /** Whether expecting a binary response */
  var binary: js.UndefOr[Boolean] = js.undefined
  /** If `true`, forces the use of XMLHttpRequest */
  var xhr: js.UndefOr[Boolean] = js.undefined
}

object IFetchOptions {
  @scala.inline
  def apply(binary: js.UndefOr[Boolean] = js.undefined, xhr: js.UndefOr[Boolean] = js.undefined): IFetchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (!js.isUndefined(xhr)) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFetchOptions]
  }
}

