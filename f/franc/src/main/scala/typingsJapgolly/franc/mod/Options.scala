package typingsJapgolly.franc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var blacklist: js.UndefOr[js.Array[ISO6393]] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var only: js.UndefOr[js.Array[String]] = js.undefined
  var whitelist: js.UndefOr[js.Array[ISO6393]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    blacklist: js.Array[ISO6393] = null,
    minLength: Int | Double = null,
    only: js.Array[String] = null,
    whitelist: js.Array[ISO6393] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

