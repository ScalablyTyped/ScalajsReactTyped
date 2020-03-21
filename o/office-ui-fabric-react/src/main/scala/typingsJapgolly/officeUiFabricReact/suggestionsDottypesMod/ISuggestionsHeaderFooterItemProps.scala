package typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsHeaderFooterItemProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.undefined
  var id: String
  var isSelected: Boolean
  var onExecute: js.UndefOr[js.Function0[Unit]] = js.undefined
  def renderItem(): Element
}

object ISuggestionsHeaderFooterItemProps {
  @scala.inline
  def apply(
    id: String,
    isSelected: Boolean,
    renderItem: CallbackTo[Element],
    className: String = null,
    componentRef: IRefObject[js.Object] = null,
    onExecute: js.UndefOr[Callback] = js.undefined
  ): ISuggestionsHeaderFooterItemProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
    __obj.updateDynamic("renderItem")(renderItem.toJsFn)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    onExecute.foreach(p => __obj.updateDynamic("onExecute")(p.toJsFn))
    __obj.asInstanceOf[ISuggestionsHeaderFooterItemProps]
  }
}

