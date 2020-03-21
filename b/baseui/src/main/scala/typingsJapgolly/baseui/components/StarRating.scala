package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonValueNumber
import typingsJapgolly.baseui.ratingMod.RatingOverrides
import typingsJapgolly.baseui.ratingMod.StarRatingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StarRating {
  def apply(
    numItems: Int | Double = null,
    onChange: /* args */ AnonValueNumber => CallbackTo[js.Any] = null,
    overrides: RatingOverrides = null,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StarRatingProps, typingsJapgolly.baseui.ratingMod.StarRating, Unit, StarRatingProps] = {
    val __obj = js.Dynamic.literal()
  
      if (numItems != null) __obj.updateDynamic("numItems")(numItems.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonValueNumber) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.ratingMod.StarRatingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.ratingMod.StarRating](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.ratingMod.StarRatingProps])(children: _*)
  }
  @JSImport("baseui/rating", "StarRating")
  @js.native
  object componentImport extends js.Object
  
}

