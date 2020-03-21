package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.officeUiFabricReact.tagPickerTypesMod.ITag
import typingsJapgolly.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRenderItem extends js.Object {
  def onRenderItem(props: ITagItemProps): Element
  def onRenderSuggestionsItem(props: ITag): Element
}

object AnonOnRenderItem {
  @scala.inline
  def apply(
    onRenderItem: ITagItemProps => CallbackTo[Element],
    onRenderSuggestionsItem: ITag => CallbackTo[Element]
  ): AnonOnRenderItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onRenderItem")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.tagPickerTypesMod.ITagItemProps) => onRenderItem(t0).runNow()))
    __obj.updateDynamic("onRenderSuggestionsItem")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.tagPickerTypesMod.ITag) => onRenderSuggestionsItem(t0).runNow()))
    __obj.asInstanceOf[AnonOnRenderItem]
  }
}

