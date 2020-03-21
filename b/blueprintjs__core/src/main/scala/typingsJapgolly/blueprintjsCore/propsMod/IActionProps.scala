package typingsJapgolly.blueprintjsCore.propsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionProps
  extends IIntentProps
     with IProps {
  /** Whether this action is non-interactive. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render before the text. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /** Click event handler. */
  var onClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  /** Action text. Can be any single React renderable. */
  var text: js.UndefOr[Node] = js.undefined
}

object IActionProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    onClick: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    text: VdomNode = null
  ): IActionProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    if (text != null) __obj.updateDynamic("text")(text.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionProps]
  }
}

