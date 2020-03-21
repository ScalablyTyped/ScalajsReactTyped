package typingsJapgolly.exceljs

import typingsJapgolly.exceljs.mod.Column
import typingsJapgolly.exceljs.mod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: String
  var col: Column
  var row: Row
  var sheetName: String
}

object AnonAddress {
  @scala.inline
  def apply(address: String, col: Column, row: Row, sheetName: String): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddress]
  }
}

