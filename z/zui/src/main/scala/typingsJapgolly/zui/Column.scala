package typingsJapgolly.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var colClass: js.UndefOr[String] = js.undefined
  var flex: js.UndefOr[Boolean] = js.undefined
  var ignore: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    colClass: String = null,
    flex: js.UndefOr[Boolean] = js.undefined,
    ignore: js.UndefOr[Boolean] = js.undefined,
    sort: String = null,
    text: String = null,
    `type`: String = null,
    width: Int | Double = null
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (colClass != null) __obj.updateDynamic("colClass")(colClass.asInstanceOf[js.Any])
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

