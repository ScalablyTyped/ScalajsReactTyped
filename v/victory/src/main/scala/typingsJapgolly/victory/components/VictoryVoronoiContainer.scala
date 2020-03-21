package typingsJapgolly.victory.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.victory.mod.VictoryVoronoiContainerProps
import typingsJapgolly.victory.victoryStrings.x
import typingsJapgolly.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryVoronoiContainer {
  def apply(
    activateData: js.UndefOr[Boolean] = js.undefined,
    activateLabels: js.UndefOr[Boolean] = js.undefined,
    desc: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    events: DOMAttributes[_] = null,
    height: Int | Double = null,
    labelComponent: VdomElement = null,
    labels: (/* point */ js.Any, /* index */ Double, /* points */ js.Array[js.Any]) => CallbackTo[String] = null,
    onActivated: (/* points */ js.Array[js.Any], /* props */ VictoryVoronoiContainerProps) => Callback = null,
    onDeactivated: (/* points */ js.Array[js.Any], /* props */ VictoryVoronoiContainerProps) => Callback = null,
    radius: Int | Double = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: String = null,
    voronoiBlacklist: js.Array[String] = null,
    voronoiDimension: x | y = null,
    voronoiPadding: Int | Double = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    VictoryVoronoiContainerProps, 
    typingsJapgolly.victory.mod.VictoryVoronoiContainer, 
    Unit, 
    VictoryVoronoiContainerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(activateData)) __obj.updateDynamic("activateData")(activateData.asInstanceOf[js.Any])
    if (!js.isUndefined(activateLabels)) __obj.updateDynamic("activateLabels")(activateLabels.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.rawElement.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(js.Any.fromFunction3((t0: /* point */ js.Any, t1: /* index */ scala.Double, t2: /* points */ js.Array[js.Any]) => labels(t0, t1, t2).runNow()))
    if (onActivated != null) __obj.updateDynamic("onActivated")(js.Any.fromFunction2((t0: /* points */ js.Array[js.Any], t1: /* props */ typingsJapgolly.victory.mod.VictoryVoronoiContainerProps) => onActivated(t0, t1).runNow()))
    if (onDeactivated != null) __obj.updateDynamic("onDeactivated")(js.Any.fromFunction2((t0: /* points */ js.Array[js.Any], t1: /* props */ typingsJapgolly.victory.mod.VictoryVoronoiContainerProps) => onDeactivated(t0, t1).runNow()))
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (voronoiBlacklist != null) __obj.updateDynamic("voronoiBlacklist")(voronoiBlacklist.asInstanceOf[js.Any])
    if (voronoiDimension != null) __obj.updateDynamic("voronoiDimension")(voronoiDimension.asInstanceOf[js.Any])
    if (voronoiPadding != null) __obj.updateDynamic("voronoiPadding")(voronoiPadding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.victory.mod.VictoryVoronoiContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.victory.mod.VictoryVoronoiContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.victory.mod.VictoryVoronoiContainerProps])(children: _*)
  }
  @JSImport("victory", "VictoryVoronoiContainer")
  @js.native
  object componentImport extends js.Object
  
}

