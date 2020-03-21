package typingsJapgolly.nivoTooltip.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nivoTooltip.Pickanytooltip
import typingsJapgolly.nivoTooltip.mod.TableTooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableTooltip {
  def apply(
    rows: js.Array[js.Array[Node]],
    theme: Pickanytooltip,
    renderContent: js.UndefOr[CallbackTo[Node]] = js.undefined,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TableTooltipProps, 
    typingsJapgolly.nivoTooltip.mod.TableTooltip, 
    Unit, 
    TableTooltipProps
  ] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
      renderContent.foreach(p => __obj.updateDynamic("renderContent")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoTooltip.mod.TableTooltipProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoTooltip.mod.TableTooltip](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoTooltip.mod.TableTooltipProps])(children: _*)
  }
  @JSImport("@nivo/tooltip", "TableTooltip")
  @js.native
  object componentImport extends js.Object
  
}

