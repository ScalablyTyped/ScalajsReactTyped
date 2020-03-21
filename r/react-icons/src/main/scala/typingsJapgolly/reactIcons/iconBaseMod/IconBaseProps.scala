package typingsJapgolly.reactIcons.iconBaseMod

import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconBaseProps extends SVGAttributes[SVGElement] {
  var size: js.UndefOr[String | Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object IconBaseProps {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes[org.scalajs.dom.raw.SVGElement] = null,
    size: String | Double = null,
    title: String = null
  ): IconBaseProps = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconBaseProps]
  }
}

