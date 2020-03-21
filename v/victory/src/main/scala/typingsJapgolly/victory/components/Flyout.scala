package typingsJapgolly.victory.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.victory.Anon1
import typingsJapgolly.victory.AnonXBoolean
import typingsJapgolly.victory.AnonY
import typingsJapgolly.victory.mod.AnimatePropTypeInterface
import typingsJapgolly.victory.mod.D3Scale
import typingsJapgolly.victory.mod.FlyoutProps
import typingsJapgolly.victory.mod.PaddingProps
import typingsJapgolly.victory.mod.ScalePropType
import typingsJapgolly.victory.mod.VictoryStyleObject
import typingsJapgolly.victory.mod.VictoryThemeDefinition
import typingsJapgolly.victory.victoryStrings.bottom
import typingsJapgolly.victory.victoryStrings.left
import typingsJapgolly.victory.victoryStrings.right
import typingsJapgolly.victory.victoryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Flyout {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    animate: Boolean | AnimatePropTypeInterface = null,
    center: AnonY = null,
    className: String = null,
    containerComponent: VdomElement = null,
    cornerRadius: Int | Double = null,
    data: js.Array[_] = null,
    datum: js.Object = null,
    dx: Int | Double = null,
    dy: Int | Double = null,
    events: js.Object = null,
    groupComponent: VdomElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    index: Int | Double = null,
    maxDomain: Double | AnonY = null,
    minDomain: Double | AnonY = null,
    name: String = null,
    orientation: top | bottom | left | right = null,
    origin: js.Object = null,
    padding: PaddingProps = null,
    pathComponent: VdomElement = null,
    pointerLength: Int | Double = null,
    pointerWidth: Int | Double = null,
    polar: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    scale: ScalePropType | D3Scale | Anon1 = null,
    shapeRendering: String = null,
    singleQuadrantDomainPadding: Boolean | AnonXBoolean = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: VictoryStyleObject = null,
    theme: VictoryThemeDefinition = null,
    transform: String = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FlyoutProps, typingsJapgolly.victory.mod.Flyout, Unit, FlyoutProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.rawElement.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.rawElement.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pathComponent != null) __obj.updateDynamic("pathComponent")(pathComponent.rawElement.asInstanceOf[js.Any])
    if (pointerLength != null) __obj.updateDynamic("pointerLength")(pointerLength.asInstanceOf[js.Any])
    if (pointerWidth != null) __obj.updateDynamic("pointerWidth")(pointerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(polar)) __obj.updateDynamic("polar")(polar.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
    if (singleQuadrantDomainPadding != null) __obj.updateDynamic("singleQuadrantDomainPadding")(singleQuadrantDomainPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.victory.mod.FlyoutProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.victory.mod.Flyout](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.victory.mod.FlyoutProps])(children: _*)
  }
  @JSImport("victory", "Flyout")
  @js.native
  object componentImport extends js.Object
  
}

