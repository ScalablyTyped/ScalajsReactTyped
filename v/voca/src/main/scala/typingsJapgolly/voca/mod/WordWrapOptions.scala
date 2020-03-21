package typingsJapgolly.voca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordWrapOptions extends js.Object {
  var cut: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[String] = js.undefined
  var newLine: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object WordWrapOptions {
  @scala.inline
  def apply(
    cut: js.UndefOr[Boolean] = js.undefined,
    indent: String = null,
    newLine: String = null,
    width: Int | Double = null
  ): WordWrapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cut)) __obj.updateDynamic("cut")(cut.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (newLine != null) __obj.updateDynamic("newLine")(newLine.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordWrapOptions]
  }
}

