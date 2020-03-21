package typingsJapgolly.reactAriaMenubutton.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps[T /* <: HTMLElement */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  /**
  	 * The HTML tag for this element. Default: 'span'.
  	 */
  var tag: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply[T /* <: HTMLElement */](
    AllHTMLAttributes: AllHTMLAttributes[T] = null,
    ClassAttributes: ClassAttributes[T] = null,
    tag: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any = null
  ): ButtonProps[T] = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps[T]]
  }
}

