package typingsJapgolly.reactPose.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionConfig
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionPoser
import typingsJapgolly.reactPose.AnonCurrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  children ? :any,   pose ? :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose,   _pose ? :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose,   initialPose ? :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose,   withParent ? :boolean, onPoseComplete ? (pose : react-pose.react-pose/lib/components/PoseElement/types.CurrentPose): any,   onValueChange ? :{[key: string] : (v : any): any},   innerRef ? :{  current  :any} | react-pose.react-pose/lib/components/PoseElement/types.RefFunc, [key: string] : any} & react-pose.react-pose/lib/components/PoseElement/types.PoseContextProps */
trait PoseElementProps
  extends /* key */ StringDictionary[js.Any] {
  var _pose: js.UndefOr[CurrentPose] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.undefined
  var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.undefined
  var initialPose: js.UndefOr[CurrentPose] = js.undefined
  var innerRef: js.UndefOr[AnonCurrent | RefFunc] = js.undefined
  var onPoseComplete: js.UndefOr[js.Function1[/* pose */ CurrentPose, _]] = js.undefined
  var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, _]] = js.undefined
  var onValueChange: js.UndefOr[StringDictionary[js.Function1[/* v */ js.Any, _]]] = js.undefined
  var pose: js.UndefOr[CurrentPose] = js.undefined
  var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.undefined
  var withParent: js.UndefOr[Boolean] = js.undefined
}

object PoseElementProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    _pose: CurrentPose = null,
    children: js.Any = null,
    getInitialPoseFromParent: js.UndefOr[CallbackTo[CurrentPose | Unit]] = js.undefined,
    getParentPoseConfig: js.UndefOr[CallbackTo[DomPopmotionConfig]] = js.undefined,
    initialPose: CurrentPose = null,
    innerRef: AnonCurrent | RefFunc = null,
    onPoseComplete: /* pose */ CurrentPose => CallbackTo[js.Any] = null,
    onUnmount: /* child */ DomPopmotionPoser => CallbackTo[js.Any] = null,
    onValueChange: StringDictionary[js.Function1[/* v */ js.Any, _]] = null,
    pose: CurrentPose = null,
    registerChild: /* props */ ChildRegistration => Callback = null,
    withParent: js.UndefOr[Boolean] = js.undefined
  ): PoseElementProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_pose != null) __obj.updateDynamic("_pose")(_pose.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    getInitialPoseFromParent.foreach(p => __obj.updateDynamic("getInitialPoseFromParent")(p.toJsFn))
    getParentPoseConfig.foreach(p => __obj.updateDynamic("getParentPoseConfig")(p.toJsFn))
    if (initialPose != null) __obj.updateDynamic("initialPose")(initialPose.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onPoseComplete != null) __obj.updateDynamic("onPoseComplete")(js.Any.fromFunction1((t0: /* pose */ typingsJapgolly.reactPose.typesMod.CurrentPose) => onPoseComplete(t0).runNow()))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction1((t0: /* child */ typingsJapgolly.popmotionPose.typesMod.DomPopmotionPoser) => onUnmount(t0).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(onValueChange.asInstanceOf[js.Any])
    if (pose != null) __obj.updateDynamic("pose")(pose.asInstanceOf[js.Any])
    if (registerChild != null) __obj.updateDynamic("registerChild")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactPose.typesMod.ChildRegistration) => registerChild(t0).runNow()))
    if (!js.isUndefined(withParent)) __obj.updateDynamic("withParent")(withParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoseElementProps]
  }
}

