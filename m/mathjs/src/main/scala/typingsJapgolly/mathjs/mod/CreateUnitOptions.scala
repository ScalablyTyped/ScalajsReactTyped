package typingsJapgolly.mathjs.mod

import typingsJapgolly.mathjs.mathjsStrings.binary_long
import typingsJapgolly.mathjs.mathjsStrings.binary_short
import typingsJapgolly.mathjs.mathjsStrings.long
import typingsJapgolly.mathjs.mathjsStrings.none
import typingsJapgolly.mathjs.mathjsStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUnitOptions extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var `override`: js.UndefOr[Boolean] = js.undefined
  var prefixes: js.UndefOr[none | short | long | binary_short | binary_long] = js.undefined
}

object CreateUnitOptions {
  @scala.inline
  def apply(
    aliases: js.Array[String] = null,
    offset: Int | Double = null,
    `override`: js.UndefOr[Boolean] = js.undefined,
    prefixes: none | short | long | binary_short | binary_long = null
  ): CreateUnitOptions = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUnitOptions]
  }
}

