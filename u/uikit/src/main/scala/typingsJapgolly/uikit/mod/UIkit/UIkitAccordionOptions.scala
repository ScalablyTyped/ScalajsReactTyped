package typingsJapgolly.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitAccordionOptions extends js.Object {
  var active: js.UndefOr[Double] = js.undefined
  var animation: js.UndefOr[Boolean] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var targets: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
}

object UIkitAccordionOptions {
  @scala.inline
  def apply(
    active: Int | Double = null,
    animation: js.UndefOr[Boolean] = js.undefined,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    duration: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    targets: String = null,
    toggle: String = null,
    transition: String = null
  ): UIkitAccordionOptions = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitAccordionOptions]
  }
}

