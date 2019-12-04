package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTRANSITIONS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionGroupMod.TransitionGroupProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionGroupMod.default
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionPropDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TransitionGroup {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animation: SemanticTRANSITIONS | String = null,
    as: js.Any = null,
    directional: js.UndefOr[Boolean] = js.undefined,
    duration: Double | String | TransitionPropDuration = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TransitionGroupProps, default, Unit, TransitionGroupProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(directional)) __obj.updateDynamic("directional")(directional.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionGroupMod.TransitionGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionGroupMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionGroupMod.TransitionGroupProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Transition/TransitionGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

