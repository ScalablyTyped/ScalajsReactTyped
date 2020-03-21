package typingsJapgolly.reactPose.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactPose.transitionTypesMod.Props
import typingsJapgolly.reactPose.transitionTypesMod.TransitionChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_Props_72066731[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animateOnMount: js.UndefOr[Boolean] = js.undefined,
    enterAfterExit: js.UndefOr[Boolean] = js.undefined,
    enterPose: String = null,
    exitPose: String = null,
    flipMove: js.UndefOr[Boolean] = js.undefined,
    onRest: js.UndefOr[Callback] = js.undefined,
    preEnterPose: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: TransitionChildren[_]
  ): UnmountedWithRoot[Props, ComponentRef, Unit, Props] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animateOnMount)) __obj.updateDynamic("animateOnMount")(animateOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(enterAfterExit)) __obj.updateDynamic("enterAfterExit")(enterAfterExit.asInstanceOf[js.Any])
    if (enterPose != null) __obj.updateDynamic("enterPose")(enterPose.asInstanceOf[js.Any])
    if (exitPose != null) __obj.updateDynamic("exitPose")(exitPose.asInstanceOf[js.Any])
    if (!js.isUndefined(flipMove)) __obj.updateDynamic("flipMove")(flipMove.asInstanceOf[js.Any])
    onRest.foreach(p => __obj.updateDynamic("onRest")(p.toJsFn))
    if (preEnterPose != null) __obj.updateDynamic("preEnterPose")(preEnterPose.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPose.transitionTypesMod.Props, 
  japgolly.scalajs.react.Children.None, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPose.transitionTypesMod.Props])
  }
}

