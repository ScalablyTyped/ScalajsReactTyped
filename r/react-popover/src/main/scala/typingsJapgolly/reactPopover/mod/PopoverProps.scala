package typingsJapgolly.reactPopover.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends js.Object {
  var appendTarget: js.UndefOr[Element] = js.undefined
  var body: Node
  var className: js.UndefOr[String] = js.undefined
  var enterExitTransitionDurationMs: js.UndefOr[Double] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var onOuterAction: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var place: js.UndefOr[PopoverPlace] = js.undefined
  var preferPlace: js.UndefOr[PopoverPlace] = js.undefined
  var refreshIntervalMs: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var target: js.UndefOr[japgolly.scalajs.react.raw.React.Element] = js.undefined
  var tipSize: js.UndefOr[Double] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    appendTarget: Element = null,
    body: VdomNode = null,
    className: String = null,
    enterExitTransitionDurationMs: Int | Double = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onOuterAction: /* event */ Event_ => Callback = null,
    place: PopoverPlace = null,
    preferPlace: PopoverPlace = null,
    refreshIntervalMs: Int | Double = null,
    style: CSSProperties = null,
    target: VdomElement = null,
    tipSize: Int | Double = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (appendTarget != null) __obj.updateDynamic("appendTarget")(appendTarget.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (enterExitTransitionDurationMs != null) __obj.updateDynamic("enterExitTransitionDurationMs")(enterExitTransitionDurationMs.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (onOuterAction != null) __obj.updateDynamic("onOuterAction")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onOuterAction(t0).runNow()))
    if (place != null) __obj.updateDynamic("place")(place.asInstanceOf[js.Any])
    if (preferPlace != null) __obj.updateDynamic("preferPlace")(preferPlace.asInstanceOf[js.Any])
    if (refreshIntervalMs != null) __obj.updateDynamic("refreshIntervalMs")(refreshIntervalMs.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.rawElement.asInstanceOf[js.Any])
    if (tipSize != null) __obj.updateDynamic("tipSize")(tipSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

