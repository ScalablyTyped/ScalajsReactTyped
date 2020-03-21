package typingsJapgolly.reactPose.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionConfig
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionPoser
import typingsJapgolly.reactPose.AnonCurrent
import typingsJapgolly.reactPose.typesMod.ChildRegistration
import typingsJapgolly.reactPose.typesMod.ConfigFactory
import typingsJapgolly.reactPose.typesMod.CurrentPose
import typingsJapgolly.reactPose.typesMod.PoseElementInternalProps
import typingsJapgolly.reactPose.typesMod.RefFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PoseElement {
  def apply(
    elementType: js.Any,
    poseConfig: DomPopmotionConfig | ConfigFactory,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    _pose: CurrentPose = null,
    getInitialPoseFromParent: js.UndefOr[CallbackTo[CurrentPose | Unit]] = js.undefined,
    getParentPoseConfig: js.UndefOr[CallbackTo[DomPopmotionConfig]] = js.undefined,
    initialPose: CurrentPose = null,
    innerRef: AnonCurrent | RefFunc = null,
    onPoseComplete: /* pose */ CurrentPose => CallbackTo[js.Any] = null,
    onUnmount: /* child */ DomPopmotionPoser => CallbackTo[js.Any] = null,
    onValueChange: StringDictionary[js.Function1[/* v */ js.Any, _]] = null,
    pose: CurrentPose = null,
    registerChild: /* props */ ChildRegistration => Callback = null,
    withParent: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any = null
  ): UnmountedWithRoot[
    PoseElementInternalProps, 
    typingsJapgolly.reactPose.poseElementMod.PoseElement, 
    Unit, 
    PoseElementInternalProps
  ] = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], poseConfig = poseConfig.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_pose != null) __obj.updateDynamic("_pose")(_pose.asInstanceOf[js.Any])
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPose.typesMod.PoseElementInternalProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactPose.poseElementMod.PoseElement](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPose.typesMod.PoseElementInternalProps])
  }
  @JSImport("react-pose/lib/components/PoseElement", "PoseElement")
  @js.native
  object componentImport extends js.Object
  
}

