package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRouterOutlet extends js.Object {
  /**
    * If `true`, the router-outlet should animate the transition of components.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimateBuilder` functions.
    */
  var animation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
}

object IonRouterOutlet {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => CallbackTo[js.Promise[Animation]] = null,
    mode: ios | md = null
  ): IonRouterOutlet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(js.Any.fromFunction3((t0: /* Animation */ typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation, t1: /* baseEl */ js.Any, t2: /* opts */ js.UndefOr[js.Any]) => animation(t0, t1, t2).runNow()))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRouterOutlet]
  }
}

