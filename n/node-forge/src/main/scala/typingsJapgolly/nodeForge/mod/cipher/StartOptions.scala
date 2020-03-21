package typingsJapgolly.nodeForge.mod.cipher

import typingsJapgolly.nodeForge.mod.Byte
import typingsJapgolly.nodeForge.mod.Bytes
import typingsJapgolly.nodeForge.mod.util.ByteBuffer
import typingsJapgolly.nodeForge.mod.util.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOptions extends js.Object {
  var additionalData: js.UndefOr[String] = js.undefined
  var iv: js.UndefOr[ByteBuffer | js.Array[Byte] | Bytes] = js.undefined
  var tag: js.UndefOr[ByteStringBuffer] = js.undefined
  var tagLength: js.UndefOr[Double] = js.undefined
}

object StartOptions {
  @scala.inline
  def apply(
    additionalData: String = null,
    iv: ByteBuffer | js.Array[Byte] | Bytes = null,
    tag: ByteStringBuffer = null,
    tagLength: Int | Double = null
  ): StartOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (tagLength != null) __obj.updateDynamic("tagLength")(tagLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOptions]
  }
}

