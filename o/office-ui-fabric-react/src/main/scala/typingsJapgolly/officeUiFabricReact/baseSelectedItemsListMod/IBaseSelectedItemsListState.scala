package typingsJapgolly.officeUiFabricReact.baseSelectedItemsListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseSelectedItemsListState[T] extends js.Object {
  var items: js.Array[T]
}

object IBaseSelectedItemsListState {
  @scala.inline
  def apply[T](items: js.Array[T]): IBaseSelectedItemsListState[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBaseSelectedItemsListState[T]]
  }
}

