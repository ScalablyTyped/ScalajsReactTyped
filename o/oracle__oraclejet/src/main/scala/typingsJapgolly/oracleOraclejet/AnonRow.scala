package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disable
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.enable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRow extends js.Object {
  var row: enable | disable
}

object AnonRow {
  @scala.inline
  def apply(row: enable | disable): AnonRow = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRow]
  }
}

