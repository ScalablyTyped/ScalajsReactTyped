package typingsJapgolly.ionicCore.transitionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.animationInterfaceMod.Animation
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import typingsJapgolly.ionicCore.mod.Mode
import typingsJapgolly.ionicCore.navInterfaceMod.NavDirection
import typingsJapgolly.ionicCore.navInterfaceMod.NavOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionOptions extends NavOptions {
  var baseEl: js.Any
  var enteringEl: HTMLElement
  var leavingEl: js.UndefOr[HTMLElement] = js.undefined
  var progressCallback: js.UndefOr[
    js.Function1[
      /* ani */ js.UndefOr[
        Animation | typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation
      ], 
      Unit
    ]
  ] = js.undefined
}

object TransitionOptions {
  @scala.inline
  def apply(
    baseEl: js.Any,
    enteringEl: HTMLElement,
    animated: js.UndefOr[Boolean] = js.undefined,
    animationBuilder: (/* Animation */ typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => CallbackTo[
      js.Promise[typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation]
    ] = null,
    deepWait: js.UndefOr[Boolean] = js.undefined,
    delegate: FrameworkDelegate = null,
    direction: NavDirection = null,
    duration: Int | Double = null,
    easing: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leavingEl: HTMLElement = null,
    mode: Mode = null,
    progressAnimation: js.UndefOr[Boolean] = js.undefined,
    progressCallback: /* ani */ js.UndefOr[
      Animation | typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation
    ] => Callback = null,
    showGoBack: js.UndefOr[Boolean] = js.undefined,
    skipIfBusy: js.UndefOr[Boolean] = js.undefined,
    updateURL: js.UndefOr[Boolean] = js.undefined,
    viewIsReady: /* enteringEl */ HTMLElement => CallbackTo[js.Promise[js.Any]] = null
  ): TransitionOptions = {
    val __obj = js.Dynamic.literal(baseEl = baseEl.asInstanceOf[js.Any], enteringEl = enteringEl.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animationBuilder != null) __obj.updateDynamic("animationBuilder")(js.Any.fromFunction3((t0: /* Animation */ typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation, t1: /* baseEl */ js.Any, t2: /* opts */ js.UndefOr[js.Any]) => animationBuilder(t0, t1, t2).runNow()))
    if (!js.isUndefined(deepWait)) __obj.updateDynamic("deepWait")(deepWait.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leavingEl != null) __obj.updateDynamic("leavingEl")(leavingEl.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(progressAnimation)) __obj.updateDynamic("progressAnimation")(progressAnimation.asInstanceOf[js.Any])
    if (progressCallback != null) __obj.updateDynamic("progressCallback")(js.Any.fromFunction1((t0: /* ani */ js.UndefOr[
  typingsJapgolly.ionicCore.animationInterfaceMod.Animation | typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation]) => progressCallback(t0).runNow()))
    if (!js.isUndefined(showGoBack)) __obj.updateDynamic("showGoBack")(showGoBack.asInstanceOf[js.Any])
    if (!js.isUndefined(skipIfBusy)) __obj.updateDynamic("skipIfBusy")(skipIfBusy.asInstanceOf[js.Any])
    if (!js.isUndefined(updateURL)) __obj.updateDynamic("updateURL")(updateURL.asInstanceOf[js.Any])
    if (viewIsReady != null) __obj.updateDynamic("viewIsReady")(js.Any.fromFunction1((t0: /* enteringEl */ org.scalajs.dom.raw.HTMLElement) => viewIsReady(t0).runNow()))
    __obj.asInstanceOf[TransitionOptions]
  }
}

