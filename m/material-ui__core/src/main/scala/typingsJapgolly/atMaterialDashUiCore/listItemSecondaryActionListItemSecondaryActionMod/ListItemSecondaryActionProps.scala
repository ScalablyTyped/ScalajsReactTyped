package typingsJapgolly.atMaterialDashUiCore.listItemSecondaryActionListItemSecondaryActionMod

import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.atMaterialDashUiCore.PartialClassNameMapListItemSecondaryActionClassKey
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/ListItemSecondaryAction/ListItemSecondaryAction.ListItemSecondaryActionClassKey, never> */
trait ListItemSecondaryActionProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[PartialClassNameMapListItemSecondaryActionClassKey] = js.undefined
  var innerRef: js.UndefOr[Ref | RefHandle[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ListItemSecondaryActionProps {
  @scala.inline
  def apply(
    className: String = null,
    classes: PartialClassNameMapListItemSecondaryActionClassKey = null,
    innerRef: Ref | RefHandle[_] = null,
    style: CSSProperties = null
  ): ListItemSecondaryActionProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemSecondaryActionProps]
  }
}

