package typingsJapgolly.hexRgb.mod

import typingsJapgolly.hexRgb.hexRgbStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  val format: js.UndefOr[array] = js.undefined
}

object Options {
  @scala.inline
  def apply(format: array = null): Options = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

