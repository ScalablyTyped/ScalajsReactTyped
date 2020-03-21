package typingsJapgolly.nivoTooltip.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nivoTooltip.Pickanytooltip
import typingsJapgolly.nivoTooltip.mod.BasicTooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BasicTooltip {
  def apply(
    color: String,
    theme: Pickanytooltip,
    enableChip: js.UndefOr[Boolean] = js.undefined,
    format: /* value */ Double | String => CallbackTo[Double | String] = null,
    id: VdomNode = null,
    renderContent: js.UndefOr[CallbackTo[Node]] = js.undefined,
    value: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BasicTooltipProps, 
    typingsJapgolly.nivoTooltip.mod.BasicTooltip, 
    Unit, 
    BasicTooltipProps
  ] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
      if (!js.isUndefined(enableChip)) __obj.updateDynamic("enableChip")(enableChip.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1((t0: /* value */ scala.Double | java.lang.String) => format(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.rawNode.asInstanceOf[js.Any])
    renderContent.foreach(p => __obj.updateDynamic("renderContent")(p.toJsFn))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoTooltip.mod.BasicTooltipProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoTooltip.mod.BasicTooltip](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoTooltip.mod.BasicTooltipProps])(children: _*)
  }
  @JSImport("@nivo/tooltip", "BasicTooltip")
  @js.native
  object componentImport extends js.Object
  
}

