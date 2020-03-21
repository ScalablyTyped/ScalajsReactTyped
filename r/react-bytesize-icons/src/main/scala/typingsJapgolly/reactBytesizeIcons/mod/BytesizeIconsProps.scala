package typingsJapgolly.reactBytesizeIcons.mod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesizeIconsProps
  extends Props[js.Any] {
  var color: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var strokeLinecap: js.UndefOr[StrokeLinecap] = js.undefined
  var strokeLinejoin: js.UndefOr[StrokeLinejoin] = js.undefined
  var strokeWidth: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object BytesizeIconsProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    color: String = null,
    height: Int | Double = null,
    key: Key = null,
    ref: LegacyRef[js.Any] = null,
    strokeLinecap: StrokeLinecap = null,
    strokeLinejoin: StrokeLinejoin = null,
    strokeWidth: String = null,
    width: Int | Double = null
  ): BytesizeIconsProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesizeIconsProps]
  }
}

