package typingsJapgolly.node

import typingsJapgolly.node.nodeBooleans.`false`
import typingsJapgolly.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingWithFileTypes extends js.Object {
  var encoding: buffer_
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object AnonEncodingWithFileTypes {
  @scala.inline
  def apply(encoding: buffer_, withFileTypes: `false` = null): AnonEncodingWithFileTypes = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingWithFileTypes]
  }
}

