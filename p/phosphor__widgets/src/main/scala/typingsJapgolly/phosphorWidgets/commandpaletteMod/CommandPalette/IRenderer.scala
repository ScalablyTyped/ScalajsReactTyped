package typingsJapgolly.phosphorWidgets.commandpaletteMod.CommandPalette

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phosphorVirtualdom.mod.VirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a command palette.
  */
trait IRenderer extends js.Object {
  /**
    * Render the empty results message for a command palette.
    *
    * @param data - The data to use for rendering the message.
    *
    * @returns A virtual element representing the message.
    */
  def renderEmptyMessage(data: IEmptyMessageRenderData): VirtualElement
  /**
    * Render the virtual element for a command palette header.
    *
    * @param data - The data to use for rendering the header.
    *
    * @returns A virtual element representing the header.
    */
  def renderHeader(data: IHeaderRenderData): VirtualElement
  /**
    * Render the virtual element for a command palette item.
    *
    * @param data - The data to use for rendering the item.
    *
    * @returns A virtual element representing the item.
    *
    * #### Notes
    * The command palette will not render invisible items.
    */
  def renderItem(data: IItemRenderData): VirtualElement
}

object IRenderer {
  @scala.inline
  def apply(
    renderEmptyMessage: IEmptyMessageRenderData => CallbackTo[VirtualElement],
    renderHeader: IHeaderRenderData => CallbackTo[VirtualElement],
    renderItem: IItemRenderData => CallbackTo[VirtualElement]
  ): IRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderEmptyMessage")(js.Any.fromFunction1((t0: typingsJapgolly.phosphorWidgets.commandpaletteMod.CommandPalette.IEmptyMessageRenderData) => renderEmptyMessage(t0).runNow()))
    __obj.updateDynamic("renderHeader")(js.Any.fromFunction1((t0: typingsJapgolly.phosphorWidgets.commandpaletteMod.CommandPalette.IHeaderRenderData) => renderHeader(t0).runNow()))
    __obj.updateDynamic("renderItem")(js.Any.fromFunction1((t0: typingsJapgolly.phosphorWidgets.commandpaletteMod.CommandPalette.IItemRenderData) => renderItem(t0).runNow()))
    __obj.asInstanceOf[IRenderer]
  }
}

