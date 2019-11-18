package typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionGroupMod

import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTRANSITIONS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionPropDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionGroupProps
  extends StrictTransitionGroupProps
     with /* key */ StringDictionary[js.Any]

object TransitionGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animation: SemanticTRANSITIONS | String = null,
    as: js.Any = null,
    children: VdomNode = null,
    directional: js.UndefOr[Boolean] = js.undefined,
    duration: Double | String | TransitionPropDuration = null
  ): TransitionGroupProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(directional)) __obj.updateDynamic("directional")(directional.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionGroupProps]
  }
}

