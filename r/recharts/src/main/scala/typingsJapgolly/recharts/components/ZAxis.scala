package typingsJapgolly.recharts.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.recharts.mod.DataKey
import typingsJapgolly.recharts.mod.RechartsFunction
import typingsJapgolly.recharts.mod.ScaleType
import typingsJapgolly.recharts.mod.ZAxisProps
import typingsJapgolly.recharts.rechartsStrings.category
import typingsJapgolly.recharts.rechartsStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ZAxis {
  def apply(
    dataKey: DataKey = null,
    name: String | Double = null,
    range: js.Array[Double] = null,
    scale: ScaleType | RechartsFunction = null,
    `type`: number | category = null,
    unit: String | Double = null,
    zAxisId: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ZAxisProps, typingsJapgolly.recharts.mod.ZAxis, Unit, ZAxisProps] = {
    val __obj = js.Dynamic.literal()
  
      if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (zAxisId != null) __obj.updateDynamic("zAxisId")(zAxisId.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.recharts.mod.ZAxisProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.recharts.mod.ZAxis](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.recharts.mod.ZAxisProps])(children: _*)
  }
  @JSImport("recharts", "ZAxis")
  @js.native
  object componentImport extends js.Object
  
}

