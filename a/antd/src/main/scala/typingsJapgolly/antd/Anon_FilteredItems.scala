package typingsJapgolly.antd

import typingsJapgolly.antd.esTransferListMod.RenderedItem
import typingsJapgolly.antd.esTransferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilteredItems extends js.Object {
  var filteredItems: js.Array[TransferItem]
  var filteredRenderItems: js.Array[RenderedItem]
}

object Anon_FilteredItems {
  @scala.inline
  def apply(filteredItems: js.Array[TransferItem], filteredRenderItems: js.Array[RenderedItem]): Anon_FilteredItems = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FilteredItems]
  }
}

