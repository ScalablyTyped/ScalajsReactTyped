package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowData extends js.Object {
  var rowData: js.Array[String | Node]
}

object AnonRowData {
  @scala.inline
  def apply(rowData: js.Array[String | Node]): AnonRowData = {
    val __obj = js.Dynamic.literal(rowData = rowData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRowData]
  }
}

