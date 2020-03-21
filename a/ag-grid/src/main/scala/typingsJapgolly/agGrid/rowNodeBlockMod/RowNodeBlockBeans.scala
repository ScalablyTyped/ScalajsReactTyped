package typingsJapgolly.agGrid.rowNodeBlockMod

import typingsJapgolly.agGrid.contextMod.Context
import typingsJapgolly.agGrid.rowRendererMod.RowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowNodeBlockBeans extends js.Object {
  var context: Context
  var rowRenderer: RowRenderer
}

object RowNodeBlockBeans {
  @scala.inline
  def apply(context: Context, rowRenderer: RowRenderer): RowNodeBlockBeans = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], rowRenderer = rowRenderer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowNodeBlockBeans]
  }
}

