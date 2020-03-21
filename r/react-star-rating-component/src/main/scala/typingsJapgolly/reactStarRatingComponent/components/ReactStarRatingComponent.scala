package typingsJapgolly.reactStarRatingComponent.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactStarRatingComponent.mod.StarRatingComponentProps
import typingsJapgolly.reactStarRatingComponent.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactStarRatingComponent {
  def apply(
    name: String,
    value: Double,
    editing: js.UndefOr[Boolean] = js.undefined,
    emptyStarColor: String = null,
    onStarClick: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Callback = null,
    onStarHover: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Callback = null,
    onStarHoverOut: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Callback = null,
    renderStarIcon: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => CallbackTo[Node | String] = null,
    renderStarIconHalf: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => CallbackTo[Node | String] = null,
    starColor: String = null,
    starCount: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StarRatingComponentProps, ^, Unit, StarRatingComponentProps] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
      if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (emptyStarColor != null) __obj.updateDynamic("emptyStarColor")(emptyStarColor.asInstanceOf[js.Any])
    if (onStarClick != null) __obj.updateDynamic("onStarClick")(js.Any.fromFunction3((t0: /* nextValue */ scala.Double, t1: /* prevValue */ scala.Double, t2: /* name */ java.lang.String) => onStarClick(t0, t1, t2).runNow()))
    if (onStarHover != null) __obj.updateDynamic("onStarHover")(js.Any.fromFunction3((t0: /* nextValue */ scala.Double, t1: /* prevValue */ scala.Double, t2: /* name */ java.lang.String) => onStarHover(t0, t1, t2).runNow()))
    if (onStarHoverOut != null) __obj.updateDynamic("onStarHoverOut")(js.Any.fromFunction3((t0: /* nextValue */ scala.Double, t1: /* prevValue */ scala.Double, t2: /* name */ java.lang.String) => onStarHoverOut(t0, t1, t2).runNow()))
    if (renderStarIcon != null) __obj.updateDynamic("renderStarIcon")(js.Any.fromFunction3((t0: /* nextValue */ scala.Double, t1: /* prevValue */ scala.Double, t2: /* name */ java.lang.String) => renderStarIcon(t0, t1, t2).runNow()))
    if (renderStarIconHalf != null) __obj.updateDynamic("renderStarIconHalf")(js.Any.fromFunction3((t0: /* nextValue */ scala.Double, t1: /* prevValue */ scala.Double, t2: /* name */ java.lang.String) => renderStarIconHalf(t0, t1, t2).runNow()))
    if (starColor != null) __obj.updateDynamic("starColor")(starColor.asInstanceOf[js.Any])
    if (starCount != null) __obj.updateDynamic("starCount")(starCount.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactStarRatingComponent.mod.StarRatingComponentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactStarRatingComponent.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactStarRatingComponent.mod.StarRatingComponentProps])(children: _*)
  }
  @JSImport("react-star-rating-component", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

