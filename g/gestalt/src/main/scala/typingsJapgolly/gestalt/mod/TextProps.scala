package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.gestaltStrings.blue
import typingsJapgolly.gestalt.gestaltStrings.breakWord
import typingsJapgolly.gestalt.gestaltStrings.center
import typingsJapgolly.gestalt.gestaltStrings.darkGray
import typingsJapgolly.gestalt.gestaltStrings.eggplant
import typingsJapgolly.gestalt.gestaltStrings.gray
import typingsJapgolly.gestalt.gestaltStrings.green
import typingsJapgolly.gestalt.gestaltStrings.justify
import typingsJapgolly.gestalt.gestaltStrings.left
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.lightGray
import typingsJapgolly.gestalt.gestaltStrings.maroon
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.midnight
import typingsJapgolly.gestalt.gestaltStrings.navy
import typingsJapgolly.gestalt.gestaltStrings.normal
import typingsJapgolly.gestalt.gestaltStrings.olive
import typingsJapgolly.gestalt.gestaltStrings.orange
import typingsJapgolly.gestalt.gestaltStrings.orchid
import typingsJapgolly.gestalt.gestaltStrings.pine
import typingsJapgolly.gestalt.gestaltStrings.purple
import typingsJapgolly.gestalt.gestaltStrings.red
import typingsJapgolly.gestalt.gestaltStrings.right
import typingsJapgolly.gestalt.gestaltStrings.short
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.tall
import typingsJapgolly.gestalt.gestaltStrings.watermelon
import typingsJapgolly.gestalt.gestaltStrings.white
import typingsJapgolly.gestalt.gestaltStrings.xl
import typingsJapgolly.gestalt.gestaltStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  var align: js.UndefOr[left | right | center | justify] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var color: js.UndefOr[
    blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white
  ] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var leading: js.UndefOr[short | tall] = js.undefined
  var lgSize: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  var mdSize: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  var overflow: js.UndefOr[normal | breakWord] = js.undefined
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  var smSize: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  var truncate: js.UndefOr[Boolean] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    align: left | right | center | justify = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    color: blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    leading: short | tall = null,
    lgSize: xs | sm | md | lg | xl = null,
    mdSize: xs | sm | md | lg | xl = null,
    overflow: normal | breakWord = null,
    size: xs | sm | md | lg | xl = null,
    smSize: xs | sm | md | lg | xl = null,
    truncate: js.UndefOr[Boolean] = js.undefined
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (leading != null) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (lgSize != null) __obj.updateDynamic("lgSize")(lgSize.asInstanceOf[js.Any])
    if (mdSize != null) __obj.updateDynamic("mdSize")(mdSize.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (smSize != null) __obj.updateDynamic("smSize")(smSize.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProps]
  }
}

