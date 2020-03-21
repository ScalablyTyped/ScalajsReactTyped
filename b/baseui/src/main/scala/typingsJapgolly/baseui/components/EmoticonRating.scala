package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonValueNumber
import typingsJapgolly.baseui.ratingMod.EmoticonRatingProps
import typingsJapgolly.baseui.ratingMod.RatingOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EmoticonRating {
  def apply(
    onChange: /* args */ AnonValueNumber => CallbackTo[js.Any] = null,
    overrides: RatingOverrides = null,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    EmoticonRatingProps, 
    typingsJapgolly.baseui.ratingMod.EmoticonRating, 
    Unit, 
    EmoticonRatingProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonValueNumber) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.ratingMod.EmoticonRatingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.ratingMod.EmoticonRating](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.ratingMod.EmoticonRatingProps])(children: _*)
  }
  @JSImport("baseui/rating", "EmoticonRating")
  @js.native
  object componentImport extends js.Object
  
}

