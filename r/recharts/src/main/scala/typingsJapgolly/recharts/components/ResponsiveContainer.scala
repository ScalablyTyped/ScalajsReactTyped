package typingsJapgolly.recharts.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.recharts.mod.ResponsiveContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveContainer {
  def apply(
    aspect: Int | Double = null,
    className: String | Double = null,
    debounce: Int | Double = null,
    height: String | Double = null,
    id: String | Double = null,
    maxHeight: String | Double = null,
    minHeight: String | Double = null,
    minWidth: String | Double = null,
    width: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ResponsiveContainerProps, 
    typingsJapgolly.recharts.mod.ResponsiveContainer, 
    Unit, 
    ResponsiveContainerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.recharts.mod.ResponsiveContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.recharts.mod.ResponsiveContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.recharts.mod.ResponsiveContainerProps])(children: _*)
  }
  @JSImport("recharts", "ResponsiveContainer")
  @js.native
  object componentImport extends js.Object
  
}

