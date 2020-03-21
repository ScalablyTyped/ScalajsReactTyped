package typingsJapgolly.ionicCore.gestureMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import typingsJapgolly.ionicCore.ionicCoreStrings.x
import typingsJapgolly.ionicCore.ionicCoreStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureConfig extends js.Object {
  var canStart: js.UndefOr[GestureCallback] = js.undefined
  var direction: js.UndefOr[x | y] = js.undefined
  var disableScroll: js.UndefOr[Boolean] = js.undefined
  var el: Node
  var gestureName: String
  var gesturePriority: js.UndefOr[Double] = js.undefined
  var maxAngle: js.UndefOr[Double] = js.undefined
  var notCaptured: js.UndefOr[GestureCallback] = js.undefined
  var onEnd: js.UndefOr[GestureCallback] = js.undefined
  var onMove: js.UndefOr[GestureCallback] = js.undefined
  var onStart: js.UndefOr[GestureCallback] = js.undefined
  var onWillStart: js.UndefOr[js.Function1[/* _ */ GestureDetail, js.Promise[Unit]]] = js.undefined
  var passive: js.UndefOr[Boolean] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object GestureConfig {
  @scala.inline
  def apply(
    el: Node,
    gestureName: String,
    canStart: /* detail */ GestureDetail => CallbackTo[Boolean | Unit] = null,
    direction: x | y = null,
    disableScroll: js.UndefOr[Boolean] = js.undefined,
    gesturePriority: Int | Double = null,
    maxAngle: Int | Double = null,
    notCaptured: /* detail */ GestureDetail => CallbackTo[Boolean | Unit] = null,
    onEnd: /* detail */ GestureDetail => CallbackTo[Boolean | Unit] = null,
    onMove: /* detail */ GestureDetail => CallbackTo[Boolean | Unit] = null,
    onStart: /* detail */ GestureDetail => CallbackTo[Boolean | Unit] = null,
    onWillStart: /* _ */ GestureDetail => CallbackTo[js.Promise[Unit]] = null,
    passive: js.UndefOr[Boolean] = js.undefined,
    threshold: Int | Double = null
  ): GestureConfig = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], gestureName = gestureName.asInstanceOf[js.Any])
    if (canStart != null) __obj.updateDynamic("canStart")(js.Any.fromFunction1((t0: /* detail */ typingsJapgolly.ionicCore.gestureMod.GestureDetail) => canStart(t0).runNow()))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.asInstanceOf[js.Any])
    if (gesturePriority != null) __obj.updateDynamic("gesturePriority")(gesturePriority.asInstanceOf[js.Any])
    if (maxAngle != null) __obj.updateDynamic("maxAngle")(maxAngle.asInstanceOf[js.Any])
    if (notCaptured != null) __obj.updateDynamic("notCaptured")(js.Any.fromFunction1((t0: /* detail */ typingsJapgolly.ionicCore.gestureMod.GestureDetail) => notCaptured(t0).runNow()))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1((t0: /* detail */ typingsJapgolly.ionicCore.gestureMod.GestureDetail) => onEnd(t0).runNow()))
    if (onMove != null) __obj.updateDynamic("onMove")(js.Any.fromFunction1((t0: /* detail */ typingsJapgolly.ionicCore.gestureMod.GestureDetail) => onMove(t0).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1((t0: /* detail */ typingsJapgolly.ionicCore.gestureMod.GestureDetail) => onStart(t0).runNow()))
    if (onWillStart != null) __obj.updateDynamic("onWillStart")(js.Any.fromFunction1((t0: /* _ */ typingsJapgolly.ionicCore.gestureMod.GestureDetail) => onWillStart(t0).runNow()))
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureConfig]
  }
}

