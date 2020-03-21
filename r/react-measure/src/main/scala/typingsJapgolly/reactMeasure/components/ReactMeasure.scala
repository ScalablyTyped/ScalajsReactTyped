package typingsJapgolly.reactMeasure.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.SFC
import typingsJapgolly.reactMeasure.mod.ContentRect
import typingsJapgolly.reactMeasure.mod.MeasureProps
import typingsJapgolly.reactMeasure.mod.MeasuredComponentProps
import typingsJapgolly.reactMeasure.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMeasure {
  def apply(
    bounds: js.UndefOr[Boolean] = js.undefined,
    client: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref = null,
    margin: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Boolean] = js.undefined,
    onResize: /* contentRect */ ContentRect => Callback = null,
    scroll: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: SFC[MeasuredComponentProps] = null
  ): UnmountedWithRoot[MeasureProps, default, Unit, MeasureProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(bounds)) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(client)) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* contentRect */ typingsJapgolly.reactMeasure.mod.ContentRect) => onResize(t0).runNow()))
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMeasure.mod.MeasureProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactMeasure.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMeasure.mod.MeasureProps])
  }
  @JSImport("react-measure", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

