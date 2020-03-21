package typingsJapgolly.officeUiFabricReact.announcedQuickActionsExampleMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnouncedQuickActionsExampleState extends js.Object {
  var announced: js.UndefOr[Element] = js.undefined
  var dialogContent: js.UndefOr[Element] = js.undefined
  var items: js.Array[IAnnouncedQuickActionsExampleItem]
  var renameDialogOpen: Boolean
}

object IAnnouncedQuickActionsExampleState {
  @scala.inline
  def apply(
    items: js.Array[IAnnouncedQuickActionsExampleItem],
    renameDialogOpen: Boolean,
    announced: VdomElement = null,
    dialogContent: VdomElement = null
  ): IAnnouncedQuickActionsExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], renameDialogOpen = renameDialogOpen.asInstanceOf[js.Any])
    if (announced != null) __obj.updateDynamic("announced")(announced.rawElement.asInstanceOf[js.Any])
    if (dialogContent != null) __obj.updateDynamic("dialogContent")(dialogContent.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedQuickActionsExampleState]
  }
}

