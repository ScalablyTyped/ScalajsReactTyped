package typingsJapgolly.semanticUiReact.transitionTransitionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticUiReact.genericMod.SemanticTRANSITIONS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionEventData extends TransitionProps {
  var status: TRANSITION_STATUSES
}

object TransitionEventData {
  @scala.inline
  def apply(
    status: TRANSITION_STATUSES,
    animation: SemanticTRANSITIONS | String = null,
    children: VdomNode = null,
    directional: js.UndefOr[Boolean] = js.undefined,
    duration: Double | String | TransitionPropDuration = null,
    mountOnShow: js.UndefOr[Boolean] = js.undefined,
    onComplete: (/* nothing */ Null, /* data */ TransitionEventData) => Callback = null,
    onHide: (/* nothing */ Null, /* data */ TransitionEventData) => Callback = null,
    onShow: (/* nothing */ Null, /* data */ TransitionEventData) => Callback = null,
    onStart: (/* nothing */ Null, /* data */ TransitionEventData) => Callback = null,
    reactKey: String = null,
    transitionOnMount: js.UndefOr[Boolean] = js.undefined,
    unmountOnHide: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TransitionEventData = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(directional)) __obj.updateDynamic("directional")(directional.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnShow)) __obj.updateDynamic("mountOnShow")(mountOnShow.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData) => onComplete(t0, t1).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData) => onHide(t0, t1).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData) => onShow(t0, t1).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.transitionTransitionMod.TransitionEventData) => onStart(t0, t1).runNow()))
    if (reactKey != null) __obj.updateDynamic("reactKey")(reactKey.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionOnMount)) __obj.updateDynamic("transitionOnMount")(transitionOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnHide)) __obj.updateDynamic("unmountOnHide")(unmountOnHide.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEventData]
  }
}

