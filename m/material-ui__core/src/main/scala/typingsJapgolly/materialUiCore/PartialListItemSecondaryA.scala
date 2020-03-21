package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ListItemSecondaryAction.ListItemSecondaryActionProps> */
@js.native
trait PartialListItemSecondaryA extends js.Object {
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[PartialClassNameMapListItRoot] = js.native
  var innerRef: js.UndefOr[Ref | RefHandle[_]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object PartialListItemSecondaryA {
  @scala.inline
  def apply(
    className: String = null,
    classes: PartialClassNameMapListItRoot = null,
    innerRef: Ref | RefHandle[_] = null,
    style: CSSProperties = null
  ): PartialListItemSecondaryA = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListItemSecondaryA]
  }
}

