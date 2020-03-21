package typingsJapgolly.atom

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.atom.atomStrings.click
import typingsJapgolly.atom.atomStrings.focus
import typingsJapgolly.atom.atomStrings.hover
import typingsJapgolly.atom.atomStrings.manual
import typingsJapgolly.atom.mod.TooltipPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClass extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[AnonHide] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var keyBindingCommand: js.UndefOr[String] = js.undefined
  var keyBindingTarget: js.UndefOr[HTMLElement] = js.undefined
  var placement: js.UndefOr[TooltipPlacement | js.Function0[TooltipPlacement]] = js.undefined
  var title: js.UndefOr[String | js.Function0[String]] = js.undefined
  var trigger: js.UndefOr[click | hover | focus | manual] = js.undefined
}

object AnonClass {
  @scala.inline
  def apply(
    `class`: String = null,
    delay: AnonHide = null,
    html: js.UndefOr[Boolean] = js.undefined,
    keyBindingCommand: String = null,
    keyBindingTarget: HTMLElement = null,
    placement: TooltipPlacement | js.Function0[TooltipPlacement] = null,
    title: String | js.Function0[String] = null,
    trigger: click | hover | focus | manual = null
  ): AnonClass = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (keyBindingCommand != null) __obj.updateDynamic("keyBindingCommand")(keyBindingCommand.asInstanceOf[js.Any])
    if (keyBindingTarget != null) __obj.updateDynamic("keyBindingTarget")(keyBindingTarget.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClass]
  }
}

