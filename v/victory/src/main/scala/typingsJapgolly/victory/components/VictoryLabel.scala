package typingsJapgolly.victory.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.victory.AnonX
import typingsJapgolly.victory.mod.StringOrNumberOrCallback
import typingsJapgolly.victory.mod.TextAnchorType
import typingsJapgolly.victory.mod.VerticalAnchorType
import typingsJapgolly.victory.mod.VictoryLabelProps
import typingsJapgolly.victory.victoryStrings.parallel
import typingsJapgolly.victory.victoryStrings.perpendicular
import typingsJapgolly.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryLabel {
  def apply(
    angle: String | Double = null,
    capHeight: StringOrNumberOrCallback = null,
    className: String = null,
    data: js.Array[_] = null,
    datum: js.Object = null,
    dx: StringOrNumberOrCallback = null,
    dy: StringOrNumberOrCallback = null,
    events: DOMAttributes[_] = null,
    labelPlacement: parallel | perpendicular | vertical = null,
    lineHeight: StringOrNumberOrCallback = null,
    origin: AnonX = null,
    polar: js.UndefOr[Boolean] = js.undefined,
    renderInPortal: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties | js.Array[CSSProperties] = null,
    text: js.Array[String] | StringOrNumberOrCallback = null,
    textAnchor: TextAnchorType | js.Function0[TextAnchorType] = null,
    transform: String | js.Object | (js.Function0[String | js.Object]) = null,
    verticalAnchor: VerticalAnchorType | js.Function0[VerticalAnchorType] = null,
    x: Int | Double = null,
    y: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: StringOrNumberOrCallback = null
  ): UnmountedWithRoot[VictoryLabelProps, typingsJapgolly.victory.mod.VictoryLabel, Unit, VictoryLabelProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (capHeight != null) __obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(polar)) __obj.updateDynamic("polar")(polar.asInstanceOf[js.Any])
    if (!js.isUndefined(renderInPortal)) __obj.updateDynamic("renderInPortal")(renderInPortal.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (verticalAnchor != null) __obj.updateDynamic("verticalAnchor")(verticalAnchor.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.victory.mod.VictoryLabelProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.victory.mod.VictoryLabel](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.victory.mod.VictoryLabelProps])
  }
  @JSImport("victory", "VictoryLabel")
  @js.native
  object componentImport extends js.Object
  
}

