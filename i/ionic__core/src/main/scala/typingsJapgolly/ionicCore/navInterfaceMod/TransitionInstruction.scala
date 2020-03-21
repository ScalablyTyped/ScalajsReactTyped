package typingsJapgolly.ionicCore.navInterfaceMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionInstruction extends js.Object {
  var done: js.UndefOr[TransitionDoneFn] = js.undefined
  var enteringRequiresTransition: js.UndefOr[Boolean] = js.undefined
  var insertStart: js.UndefOr[Double] = js.undefined
  var insertViews: js.UndefOr[js.Array[_]] = js.undefined
  var leavingRequiresTransition: js.UndefOr[Boolean] = js.undefined
  var opts: js.UndefOr[NavOptions | Null] = js.undefined
  var reject: js.UndefOr[js.Function1[/* rejectReason */ String, Unit]] = js.undefined
  var removeCount: js.UndefOr[Double] = js.undefined
  var removeStart: js.UndefOr[Double] = js.undefined
  var removeView: js.UndefOr[typingsJapgolly.ionicCore.viewControllerMod.ViewController] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* hasCompleted */ Boolean, Unit]] = js.undefined
}

object TransitionInstruction {
  @scala.inline
  def apply(
    done: (/* hasCompleted */ Boolean, /* requiresTransition */ Boolean, /* enteringView */ js.UndefOr[typingsJapgolly.ionicCore.viewControllerMod.ViewController], /* leavingView */ js.UndefOr[typingsJapgolly.ionicCore.viewControllerMod.ViewController], /* direction */ js.UndefOr[String]) => Callback = null,
    enteringRequiresTransition: js.UndefOr[Boolean] = js.undefined,
    insertStart: Int | Double = null,
    insertViews: js.Array[_] = null,
    leavingRequiresTransition: js.UndefOr[Boolean] = js.undefined,
    opts: NavOptions = null,
    reject: /* rejectReason */ String => Callback = null,
    removeCount: Int | Double = null,
    removeStart: Int | Double = null,
    removeView: typingsJapgolly.ionicCore.viewControllerMod.ViewController = null,
    resolve: /* hasCompleted */ Boolean => Callback = null
  ): TransitionInstruction = {
    val __obj = js.Dynamic.literal()
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction5((t0: /* hasCompleted */ scala.Boolean, t1: /* requiresTransition */ scala.Boolean, t2: /* enteringView */ js.UndefOr[typingsJapgolly.ionicCore.viewControllerMod.ViewController], t3: /* leavingView */ js.UndefOr[typingsJapgolly.ionicCore.viewControllerMod.ViewController], t4: /* direction */ js.UndefOr[java.lang.String]) => done(t0, t1, t2, t3, t4).runNow()))
    if (!js.isUndefined(enteringRequiresTransition)) __obj.updateDynamic("enteringRequiresTransition")(enteringRequiresTransition.asInstanceOf[js.Any])
    if (insertStart != null) __obj.updateDynamic("insertStart")(insertStart.asInstanceOf[js.Any])
    if (insertViews != null) __obj.updateDynamic("insertViews")(insertViews.asInstanceOf[js.Any])
    if (!js.isUndefined(leavingRequiresTransition)) __obj.updateDynamic("leavingRequiresTransition")(leavingRequiresTransition.asInstanceOf[js.Any])
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (reject != null) __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: /* rejectReason */ java.lang.String) => reject(t0).runNow()))
    if (removeCount != null) __obj.updateDynamic("removeCount")(removeCount.asInstanceOf[js.Any])
    if (removeStart != null) __obj.updateDynamic("removeStart")(removeStart.asInstanceOf[js.Any])
    if (removeView != null) __obj.updateDynamic("removeView")(removeView.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: /* hasCompleted */ scala.Boolean) => resolve(t0).runNow()))
    __obj.asInstanceOf[TransitionInstruction]
  }
}

