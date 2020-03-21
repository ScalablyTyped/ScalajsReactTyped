package typingsJapgolly.sha1.mod

import typingsJapgolly.sha1.sha1Booleans.`false`
import typingsJapgolly.sha1.sha1Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha1AsBytesOptions extends Sha1Options {
  var asBytes: `true`
  var asString: js.UndefOr[`false`] = js.undefined
}

object Sha1AsBytesOptions {
  @scala.inline
  def apply(asBytes: `true`, asString: `false` = null): Sha1AsBytesOptions = {
    val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
    if (asString != null) __obj.updateDynamic("asString")(asString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha1AsBytesOptions]
  }
}

