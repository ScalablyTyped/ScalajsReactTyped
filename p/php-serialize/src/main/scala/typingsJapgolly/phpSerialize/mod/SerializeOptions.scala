package typingsJapgolly.phpSerialize.mod

import typingsJapgolly.phpSerialize.phpSerializeStrings.binary
import typingsJapgolly.phpSerialize.phpSerializeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeOptions extends js.Object {
  /** @default 'utf8' */
  val encoding: js.UndefOr[utf8 | binary] = js.undefined
}

object SerializeOptions {
  @scala.inline
  def apply(encoding: utf8 | binary = null): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeOptions]
  }
}

