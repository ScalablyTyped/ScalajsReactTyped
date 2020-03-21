package typingsJapgolly.expoFileSystem.fileSystemTypesMod

import typingsJapgolly.expoFileSystem.expoFileSystemStrings.base64
import typingsJapgolly.expoFileSystem.expoFileSystemStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritingOptions extends js.Object {
  var encoding: js.UndefOr[EncodingType | utf8 | base64] = js.undefined
}

object WritingOptions {
  @scala.inline
  def apply(encoding: EncodingType | utf8 | base64 = null): WritingOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[WritingOptions]
  }
}

