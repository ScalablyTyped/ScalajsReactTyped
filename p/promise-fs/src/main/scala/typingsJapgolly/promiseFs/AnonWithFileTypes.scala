package typingsJapgolly.promiseFs

import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.promiseFs.promiseFsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWithFileTypes extends js.Object {
  var encoding: BufferEncoding | Null
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object AnonWithFileTypes {
  @scala.inline
  def apply(encoding: BufferEncoding = null, withFileTypes: `false` = null): AnonWithFileTypes = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWithFileTypes]
  }
}

