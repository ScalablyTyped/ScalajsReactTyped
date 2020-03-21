package typingsJapgolly.recharts.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.recharts.mod.ContentRenderer
import typingsJapgolly.recharts.mod.LabelListProps
import typingsJapgolly.recharts.mod.LabelProps
import typingsJapgolly.recharts.mod.PositionType
import typingsJapgolly.recharts.mod.RechartsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LabelList {
  def apply(
    dataKey: String | Double | RechartsFunction,
    angle: Int | Double = null,
    className: String = null,
    clockWise: js.UndefOr[Boolean] = js.undefined,
    content: Element | ContentRenderer[LabelProps] = null,
    data: Int | Double = null,
    formatter: /* label */ String | Double => CallbackTo[Node] = null,
    id: String = null,
    offset: Int | Double = null,
    position: PositionType = null,
    valueAccessor: /* repeated */ js.Any => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] | Node = null
  ): UnmountedWithRoot[LabelListProps, typingsJapgolly.recharts.mod.LabelList, Unit, LabelListProps] = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clockWise)) __obj.updateDynamic("clockWise")(clockWise.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* label */ java.lang.String | scala.Double) => formatter(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (valueAccessor != null) __obj.updateDynamic("valueAccessor")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => valueAccessor(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.recharts.mod.LabelListProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.recharts.mod.LabelList](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.recharts.mod.LabelListProps])
  }
  @JSImport("recharts", "LabelList")
  @js.native
  object componentImport extends js.Object
  
}

