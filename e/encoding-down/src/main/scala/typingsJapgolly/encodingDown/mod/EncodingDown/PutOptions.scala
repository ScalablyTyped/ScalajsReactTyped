package typingsJapgolly.encodingDown.mod.EncodingDown

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.abstractLeveldown.mod.AbstractOptions
import typingsJapgolly.levelCodec.mod.CodecEncoder
import typingsJapgolly.levelCodec.mod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutOptions
  extends AbstractOptions
     with CodecOptions

object PutOptions {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.Any] = null,
    keyEncoding: String | CodecEncoder = null,
    valueEncoding: String | CodecEncoder = null
  ): PutOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (valueEncoding != null) __obj.updateDynamic("valueEncoding")(valueEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOptions]
  }
}

