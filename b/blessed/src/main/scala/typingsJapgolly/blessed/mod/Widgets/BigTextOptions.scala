package typingsJapgolly.blessed.mod.Widgets

import typingsJapgolly.blessed.AnonCh
import typingsJapgolly.blessed.blessedStrings.bg
import typingsJapgolly.blessed.blessedStrings.bottom
import typingsJapgolly.blessed.blessedStrings.center
import typingsJapgolly.blessed.blessedStrings.left
import typingsJapgolly.blessed.blessedStrings.line
import typingsJapgolly.blessed.blessedStrings.middle
import typingsJapgolly.blessed.blessedStrings.right
import typingsJapgolly.blessed.blessedStrings.top
import typingsJapgolly.blessed.mod.Widgets.Types.TPosition
import typingsJapgolly.blessed.mod.Widgets.Types.TTopLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigTextOptions extends BoxOptions {
  /**
    * foreground character. (default: ' ')
    */
  var fch: js.UndefOr[String] = js.undefined
  /**
    * bdf->json font file to use (see ttystudio for instructions on compiling BDFs to JSON).
    */
  var font: js.UndefOr[String] = js.undefined
  /**
    * bdf->json bold font file to use (see ttystudio for instructions on compiling BDFs to JSON).
    */
  var fontBold: js.UndefOr[String] = js.undefined
}

object BigTextOptions {
  @scala.inline
  def apply(
    align: left | center | right = null,
    alwaysScroll: js.UndefOr[Boolean] = js.undefined,
    baseLimit: Int | Double = null,
    bg: String = null,
    bindings: js.Any = null,
    bold: String = null,
    border: Border | line | bg = null,
    bottom: TPosition = null,
    ch: String = null,
    children: js.Array[Node] = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    fch: String = null,
    fg: String = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    focused: BlessedElement = null,
    font: String = null,
    fontBold: String = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hoverText: String = null,
    input: js.UndefOr[Boolean] = js.undefined,
    keyable: js.UndefOr[Boolean] = js.undefined,
    keys: String | js.Array[String] | Boolean = null,
    label: String = null,
    left: TTopLeft = null,
    mouse: Boolean | js.Function0[Unit] = null,
    name: String = null,
    padding: Double | Padding = null,
    parent: Node = null,
    position: Position = null,
    right: TPosition = null,
    screen: Screen = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    scrollbar: AnonCh = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    shrink: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    tags: js.UndefOr[Boolean] = js.undefined,
    top: TTopLeft = null,
    underline: String = null,
    valign: top | middle | bottom = null,
    vi: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): BigTextOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysScroll)) __obj.updateDynamic("alwaysScroll")(alwaysScroll.asInstanceOf[js.Any])
    if (baseLimit != null) __obj.updateDynamic("baseLimit")(baseLimit.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (bold != null) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (ch != null) __obj.updateDynamic("ch")(ch.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (fch != null) __obj.updateDynamic("fch")(fch.asInstanceOf[js.Any])
    if (fg != null) __obj.updateDynamic("fg")(fg.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontBold != null) __obj.updateDynamic("fontBold")(fontBold.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hoverText != null) __obj.updateDynamic("hoverText")(hoverText.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(keyable)) __obj.updateDynamic("keyable")(keyable.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (mouse != null) __obj.updateDynamic("mouse")(mouse.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(shrink)) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (!js.isUndefined(vi)) __obj.updateDynamic("vi")(vi.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigTextOptions]
  }
}

