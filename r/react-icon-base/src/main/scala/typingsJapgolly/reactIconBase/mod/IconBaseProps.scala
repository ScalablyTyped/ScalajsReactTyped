package typingsJapgolly.reactIconBase.mod

import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactSVGElement
import typingsJapgolly.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconBaseProps
  extends SVGAttributes[ReactSVGElement]
     with ClassAttributes[ReactSVGElement] {
  var size: js.UndefOr[String | Double] = js.undefined
  @JSName("style")
  var style_IconBaseProps: js.UndefOr[js.Any] = js.undefined
}

object IconBaseProps {
  @scala.inline
  def apply(
    ClassAttributes: ClassAttributes[ReactSVGElement] = null,
    SVGAttributes: SVGAttributes[ReactSVGElement] = null,
    size: String | Double = null,
    style: js.Any = null
  ): IconBaseProps = {
    val __obj = js.Dynamic.literal()
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconBaseProps]
  }
}

