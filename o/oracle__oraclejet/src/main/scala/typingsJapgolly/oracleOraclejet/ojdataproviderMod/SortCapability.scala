package typingsJapgolly.oracleOraclejet.ojdataproviderMod

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortCapability[D] extends js.Object {
  var attributes: none | single | multiple
}

object SortCapability {
  @scala.inline
  def apply[D](attributes: none | single | multiple): SortCapability[D] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortCapability[D]]
  }
}

