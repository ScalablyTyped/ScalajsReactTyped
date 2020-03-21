package typingsJapgolly.reactFa.mod

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconStackProps extends SizeOverrideHTMLProps[IconStack] {
  @JSName("children")
  var children_IconStackProps: js.UndefOr[Element | js.Array[Element]] = js.undefined
  @JSName("size")
  var size_IconStackProps: js.UndefOr[IconSize] = js.undefined
}

object IconStackProps {
  @scala.inline
  def apply(
    SizeOverrideHTMLProps: SizeOverrideHTMLProps[Component[IconStackProps with js.Object, js.Object]] = null,
    children: Element | js.Array[Element] = null,
    size: IconSize = null
  ): IconStackProps = {
    val __obj = js.Dynamic.literal()
    if (SizeOverrideHTMLProps != null) js.Dynamic.global.Object.assign(__obj, SizeOverrideHTMLProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconStackProps]
  }
}

