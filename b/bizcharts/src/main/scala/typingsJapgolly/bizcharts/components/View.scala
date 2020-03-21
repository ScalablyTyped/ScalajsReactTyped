package typingsJapgolly.bizcharts.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.bizcharts.AnonX
import typingsJapgolly.bizcharts.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object View {
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    end: AnonX = null,
    filter: js.Array[_] = null,
    id: String = null,
    scale: StringDictionary[js.Any] = null,
    start: AnonX = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ViewProps, typingsJapgolly.bizcharts.mod.View, Unit, ViewProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.bizcharts.mod.ViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.bizcharts.mod.View](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.bizcharts.mod.ViewProps])(children: _*)
  }
  @JSImport("bizcharts", "View")
  @js.native
  object componentImport extends js.Object
  
}

