package typingsJapgolly.atMaterialDashUiCore

import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.ClassNameMap
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @material-ui/core.@material-ui/core.StandardProps<{}, never, never> */
trait StandardPropsnevernever extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[Partial[ClassNameMap[scala.Nothing]]] = js.undefined
  var innerRef: js.UndefOr[Ref | RefHandle[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object StandardPropsnevernever {
  @scala.inline
  def apply(
    className: String = null,
    classes: Partial[ClassNameMap[scala.Nothing]] = null,
    innerRef: Ref | RefHandle[_] = null,
    style: CSSProperties = null
  ): StandardPropsnevernever = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardPropsnevernever]
  }
}

