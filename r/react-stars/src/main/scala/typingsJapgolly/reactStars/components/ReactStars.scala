package typingsJapgolly.reactStars.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactStars.mod.ReactStarsProps
import typingsJapgolly.reactStars.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactStars {
  def apply(
    char: String = null,
    className: String = null,
    color1: String = null,
    color2: String = null,
    count: Int | Double = null,
    edit: js.UndefOr[Boolean] = js.undefined,
    half: js.UndefOr[Boolean] = js.undefined,
    onChange: /* new_rating */ Double => Callback = null,
    size: Int | Double = null,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactStarsProps, default, Unit, ReactStarsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (char != null) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color1 != null) __obj.updateDynamic("color1")(color1.asInstanceOf[js.Any])
    if (color2 != null) __obj.updateDynamic("color2")(color2.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(edit)) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (!js.isUndefined(half)) __obj.updateDynamic("half")(half.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* new_rating */ scala.Double) => onChange(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactStars.mod.ReactStarsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactStars.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactStars.mod.ReactStarsProps])(children: _*)
  }
  @JSImport("react-stars", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

