package typingsJapgolly.victory.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.victory.mod.DomainPropType
import typingsJapgolly.victory.mod.VictoryBrushContainerProps
import typingsJapgolly.victory.victoryStrings.all
import typingsJapgolly.victory.victoryStrings.disable
import typingsJapgolly.victory.victoryStrings.none
import typingsJapgolly.victory.victoryStrings.x
import typingsJapgolly.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryBrushContainer {
  def apply(
    allowDrag: js.UndefOr[Boolean] = js.undefined,
    allowResize: js.UndefOr[Boolean] = js.undefined,
    brushComponent: VdomElement = null,
    brushDimension: x | y = null,
    brushDomain: DomainPropType = null,
    brushStyle: CSSProperties = null,
    defaultBrushArea: all | none | disable = null,
    desc: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    events: DOMAttributes[_] = null,
    handleComponent: VdomElement = null,
    handleStyle: CSSProperties = null,
    height: Int | Double = null,
    onBrushDomainChange: (/* domain */ DomainPropType, /* props */ VictoryBrushContainerProps) => Callback = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: String = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    VictoryBrushContainerProps, 
    typingsJapgolly.victory.mod.VictoryBrushContainer, 
    Unit, 
    VictoryBrushContainerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResize)) __obj.updateDynamic("allowResize")(allowResize.asInstanceOf[js.Any])
    if (brushComponent != null) __obj.updateDynamic("brushComponent")(brushComponent.rawElement.asInstanceOf[js.Any])
    if (brushDimension != null) __obj.updateDynamic("brushDimension")(brushDimension.asInstanceOf[js.Any])
    if (brushDomain != null) __obj.updateDynamic("brushDomain")(brushDomain.asInstanceOf[js.Any])
    if (brushStyle != null) __obj.updateDynamic("brushStyle")(brushStyle.asInstanceOf[js.Any])
    if (defaultBrushArea != null) __obj.updateDynamic("defaultBrushArea")(defaultBrushArea.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (handleComponent != null) __obj.updateDynamic("handleComponent")(handleComponent.rawElement.asInstanceOf[js.Any])
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onBrushDomainChange != null) __obj.updateDynamic("onBrushDomainChange")(js.Any.fromFunction2((t0: /* domain */ typingsJapgolly.victory.mod.DomainPropType, t1: /* props */ typingsJapgolly.victory.mod.VictoryBrushContainerProps) => onBrushDomainChange(t0, t1).runNow()))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.victory.mod.VictoryBrushContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.victory.mod.VictoryBrushContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.victory.mod.VictoryBrushContainerProps])(children: _*)
  }
  @JSImport("victory", "VictoryBrushContainer")
  @js.native
  object componentImport extends js.Object
  
}

