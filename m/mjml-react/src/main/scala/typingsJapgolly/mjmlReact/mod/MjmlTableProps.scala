package typingsJapgolly.mjmlReact.mod

import typingsJapgolly.csstype.mod.BackgroundColorProperty
import typingsJapgolly.csstype.mod.ColorProperty
import typingsJapgolly.mjmlReact.mjmlReactStrings.auto
import typingsJapgolly.mjmlReact.mjmlReactStrings.center
import typingsJapgolly.mjmlReact.mjmlReactStrings.fixed
import typingsJapgolly.mjmlReact.mjmlReactStrings.inherit
import typingsJapgolly.mjmlReact.mjmlReactStrings.initial
import typingsJapgolly.mjmlReact.mjmlReactStrings.left
import typingsJapgolly.mjmlReact.mjmlReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlTableProps extends js.Object {
  var align: js.UndefOr[left | right | center] = js.undefined
  var cellpadding: js.UndefOr[String] = js.undefined
  var cellspacing: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[ColorProperty] = js.undefined
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String | Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[String | Double] = js.undefined
  var tableLayout: js.UndefOr[auto | fixed | initial | inherit] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object MjmlTableProps {
  @scala.inline
  def apply(
    align: left | right | center = null,
    cellpadding: String = null,
    cellspacing: String = null,
    color: ColorProperty = null,
    containerBackgroundColor: BackgroundColorProperty = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    fontStyle: String = null,
    lineHeight: String | Double = null,
    tableLayout: auto | fixed | initial | inherit = null,
    width: String | Double = null
  ): MjmlTableProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (cellpadding != null) __obj.updateDynamic("cellpadding")(cellpadding.asInstanceOf[js.Any])
    if (cellspacing != null) __obj.updateDynamic("cellspacing")(cellspacing.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlTableProps]
  }
}

