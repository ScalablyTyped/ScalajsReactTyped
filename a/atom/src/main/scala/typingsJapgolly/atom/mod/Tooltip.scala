package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.atom.atomStrings.in
import typingsJapgolly.atom.atomStrings.out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip extends js.Object {
  val element: HTMLElement
  val enabled: Boolean
  val hoverState: in | out | Null
  val options: TooltipOptions
  val timeout: Double
  def disable(): Unit
  def enable(): Unit
  def getArrowElement(): HTMLElement
  def getTitle(): String
  def getTooltipElement(): HTMLElement
  def recalculatePosition(): Unit
  def toggle(): Unit
  def toggleEnabled(): Unit
}

object Tooltip {
  @scala.inline
  def apply(
    disable: Callback,
    element: HTMLElement,
    enable: Callback,
    enabled: Boolean,
    getArrowElement: CallbackTo[HTMLElement],
    getTitle: CallbackTo[String],
    getTooltipElement: CallbackTo[HTMLElement],
    options: TooltipOptions,
    recalculatePosition: Callback,
    timeout: Double,
    toggle: Callback,
    toggleEnabled: Callback,
    hoverState: in | out = null
  ): Tooltip = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("getArrowElement")(getArrowElement.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getTooltipElement")(getTooltipElement.toJsFn)
    __obj.updateDynamic("recalculatePosition")(recalculatePosition.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.updateDynamic("toggleEnabled")(toggleEnabled.toJsFn)
    if (hoverState != null) __obj.updateDynamic("hoverState")(hoverState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
}

