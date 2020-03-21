package typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsHeaderFooterProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var onExecute: js.UndefOr[js.Function0[Unit]] = js.undefined
  def renderItem(): Element
  def shouldShow(): Boolean
}

object ISuggestionsHeaderFooterProps {
  @scala.inline
  def apply(
    renderItem: CallbackTo[Element],
    shouldShow: CallbackTo[Boolean],
    ariaLabel: String = null,
    className: String = null,
    onExecute: js.UndefOr[Callback] = js.undefined
  ): ISuggestionsHeaderFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderItem")(renderItem.toJsFn)
    __obj.updateDynamic("shouldShow")(shouldShow.toJsFn)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    onExecute.foreach(p => __obj.updateDynamic("onExecute")(p.toJsFn))
    __obj.asInstanceOf[ISuggestionsHeaderFooterProps]
  }
}

