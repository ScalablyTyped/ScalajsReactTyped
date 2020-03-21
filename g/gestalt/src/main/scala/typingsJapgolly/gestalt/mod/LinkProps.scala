package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.AnonEvent
import typingsJapgolly.gestalt.gestaltStrings.`null`
import typingsJapgolly.gestalt.gestaltStrings.blank
import typingsJapgolly.gestalt.gestaltStrings.self
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ AnonEvent, Unit]] = js.undefined
  var target: js.UndefOr[`null` | self | blank] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    href: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    onClick: /* args */ AnonEvent => Callback = null,
    target: `null` | self | blank = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEvent) => onClick(t0).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
}

