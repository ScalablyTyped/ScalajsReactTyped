package typingsJapgolly.reactPose.transitionTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends /* key */ StringDictionary[js.Any] {
  var animateOnMount: js.UndefOr[Boolean] = js.undefined
  var children: TransitionChildren[_]
  var enterAfterExit: js.UndefOr[Boolean] = js.undefined
  var enterPose: js.UndefOr[String] = js.undefined
  var exitPose: js.UndefOr[String] = js.undefined
  var flipMove: js.UndefOr[Boolean] = js.undefined
  var onRest: js.UndefOr[js.Function0[Unit]] = js.undefined
  var preEnterPose: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: TransitionChildren[_],
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animateOnMount: js.UndefOr[Boolean] = js.undefined,
    enterAfterExit: js.UndefOr[Boolean] = js.undefined,
    enterPose: String = null,
    exitPose: String = null,
    flipMove: js.UndefOr[Boolean] = js.undefined,
    onRest: js.UndefOr[Callback] = js.undefined,
    preEnterPose: String = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animateOnMount)) __obj.updateDynamic("animateOnMount")(animateOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(enterAfterExit)) __obj.updateDynamic("enterAfterExit")(enterAfterExit.asInstanceOf[js.Any])
    if (enterPose != null) __obj.updateDynamic("enterPose")(enterPose.asInstanceOf[js.Any])
    if (exitPose != null) __obj.updateDynamic("exitPose")(exitPose.asInstanceOf[js.Any])
    if (!js.isUndefined(flipMove)) __obj.updateDynamic("flipMove")(flipMove.asInstanceOf[js.Any])
    onRest.foreach(p => __obj.updateDynamic("onRest")(p.toJsFn))
    if (preEnterPose != null) __obj.updateDynamic("preEnterPose")(preEnterPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

