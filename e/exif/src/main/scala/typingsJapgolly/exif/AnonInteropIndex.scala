package typingsJapgolly.exif

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInteropIndex extends js.Object {
  var InteropIndex: js.UndefOr[String] = js.undefined
  var InteropVersion: js.UndefOr[Buffer] = js.undefined
}

object AnonInteropIndex {
  @scala.inline
  def apply(InteropIndex: String = null, InteropVersion: Buffer = null): AnonInteropIndex = {
    val __obj = js.Dynamic.literal()
    if (InteropIndex != null) __obj.updateDynamic("InteropIndex")(InteropIndex.asInstanceOf[js.Any])
    if (InteropVersion != null) __obj.updateDynamic("InteropVersion")(InteropVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInteropIndex]
  }
}

