package typingsJapgolly.reactDatagrid.mod.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortInfo extends js.Object {
  var dir: String
  var name: String
}

object SortInfo {
  @scala.inline
  def apply(dir: String, name: String): SortInfo = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortInfo]
  }
}

