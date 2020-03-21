package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.navInterfaceMod.NavComponent
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonNav extends js.Object {
  /**
    * If `true`, the nav should animate the transition of components.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimateBuilder` functions.
    */
  var animation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Event fired when the nav has changed components
    */
  var onIonNavDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Event fired when the nav will change components
    */
  var onIonNavWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Root NavComponent to load
    */
  var root: js.UndefOr[NavComponent] = js.undefined
  /**
    * Any parameters for the root component
    */
  var rootParams: js.UndefOr[ComponentProps[Null]] = js.undefined
  /**
    * If the nav component should allow for swipe-to-go-back.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.undefined
}

object IonNav {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => CallbackTo[js.Promise[Animation]] = null,
    onIonNavDidChange: /* event */ CustomEvent => Callback = null,
    onIonNavWillChange: /* event */ CustomEvent => Callback = null,
    root: NavComponent = null,
    rootParams: ComponentProps[Null] = null,
    swipeGesture: js.UndefOr[Boolean] = js.undefined
  ): IonNav = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(js.Any.fromFunction3((t0: /* Animation */ typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation, t1: /* baseEl */ js.Any, t2: /* opts */ js.UndefOr[js.Any]) => animation(t0, t1, t2).runNow()))
    if (onIonNavDidChange != null) __obj.updateDynamic("onIonNavDidChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonNavDidChange(t0).runNow()))
    if (onIonNavWillChange != null) __obj.updateDynamic("onIonNavWillChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonNavWillChange(t0).runNow()))
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootParams != null) __obj.updateDynamic("rootParams")(rootParams.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeGesture)) __obj.updateDynamic("swipeGesture")(swipeGesture.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonNav]
  }
}

