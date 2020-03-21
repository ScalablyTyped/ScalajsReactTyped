package typingsJapgolly.popmotionPose.libTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.popmotionPose.popmotionPoseNumbers.`-1`
import typingsJapgolly.popmotionPose.popmotionPoseNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pose[A, TD]
  extends /* key */ StringDictionary[js.Any] {
  var afterChildren: js.UndefOr[Boolean | BooleanPropFactory] = js.undefined
  var applyAtEnd: js.UndefOr[ApplyMap] = js.undefined
  var applyAtStart: js.UndefOr[ApplyMap] = js.undefined
  var beforeChildren: js.UndefOr[Boolean | BooleanPropFactory] = js.undefined
  var delay: js.UndefOr[Double | NumberPropFactory] = js.undefined
  var delayChildren: js.UndefOr[Double | NumberPropFactory] = js.undefined
  var preTransform: js.UndefOr[js.Function0[_]] = js.undefined
  var preTransition: js.UndefOr[js.Function1[/* props */ Props, _]] = js.undefined
  var staggerChildren: js.UndefOr[Double | NumberPropFactory] = js.undefined
  var staggerDirection: js.UndefOr[`1` | `-1` | StaggerDirectionPropFactory] = js.undefined
  var transition: js.UndefOr[(TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])] = js.undefined
}

object Pose {
  @scala.inline
  def apply[A, TD](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    afterChildren: Boolean | BooleanPropFactory = null,
    applyAtEnd: ApplyMap = null,
    applyAtStart: ApplyMap = null,
    beforeChildren: Boolean | BooleanPropFactory = null,
    delay: Double | NumberPropFactory = null,
    delayChildren: Double | NumberPropFactory = null,
    preTransform: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    preTransition: /* props */ Props => CallbackTo[js.Any] = null,
    staggerChildren: Double | NumberPropFactory = null,
    staggerDirection: `1` | `-1` | StaggerDirectionPropFactory = null,
    transition: (TransitionMap[A, TD]) | (TransitionMapFactory[A, TD]) = null
  ): Pose[A, TD] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (afterChildren != null) __obj.updateDynamic("afterChildren")(afterChildren.asInstanceOf[js.Any])
    if (applyAtEnd != null) __obj.updateDynamic("applyAtEnd")(applyAtEnd.asInstanceOf[js.Any])
    if (applyAtStart != null) __obj.updateDynamic("applyAtStart")(applyAtStart.asInstanceOf[js.Any])
    if (beforeChildren != null) __obj.updateDynamic("beforeChildren")(beforeChildren.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (delayChildren != null) __obj.updateDynamic("delayChildren")(delayChildren.asInstanceOf[js.Any])
    preTransform.foreach(p => __obj.updateDynamic("preTransform")(p.toJsFn))
    if (preTransition != null) __obj.updateDynamic("preTransition")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.popmotionPose.libTypesMod.Props) => preTransition(t0).runNow()))
    if (staggerChildren != null) __obj.updateDynamic("staggerChildren")(staggerChildren.asInstanceOf[js.Any])
    if (staggerDirection != null) __obj.updateDynamic("staggerDirection")(staggerDirection.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pose[A, TD]]
  }
}

