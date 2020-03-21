package typingsJapgolly.reactPose.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionConfig
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionPoser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoseContextProps extends js.Object {
  var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.undefined
  var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.undefined
  var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, _]] = js.undefined
  var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.undefined
}

object PoseContextProps {
  @scala.inline
  def apply(
    getInitialPoseFromParent: js.UndefOr[CallbackTo[CurrentPose | Unit]] = js.undefined,
    getParentPoseConfig: js.UndefOr[CallbackTo[DomPopmotionConfig]] = js.undefined,
    onUnmount: /* child */ DomPopmotionPoser => CallbackTo[js.Any] = null,
    registerChild: /* props */ ChildRegistration => Callback = null
  ): PoseContextProps = {
    val __obj = js.Dynamic.literal()
    getInitialPoseFromParent.foreach(p => __obj.updateDynamic("getInitialPoseFromParent")(p.toJsFn))
    getParentPoseConfig.foreach(p => __obj.updateDynamic("getParentPoseConfig")(p.toJsFn))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction1((t0: /* child */ typingsJapgolly.popmotionPose.typesMod.DomPopmotionPoser) => onUnmount(t0).runNow()))
    if (registerChild != null) __obj.updateDynamic("registerChild")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactPose.typesMod.ChildRegistration) => registerChild(t0).runNow()))
    __obj.asInstanceOf[PoseContextProps]
  }
}

