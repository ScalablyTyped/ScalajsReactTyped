package typingsJapgolly.oracleOraclejet.ojtableMod.ojTable

import typingsJapgolly.oracleOraclejet.Anon20
import typingsJapgolly.oracleOraclejet.Anon21
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.oracleOraclejet.AnonStartKey[K]
  - typingsJapgolly.oracleOraclejet.AnonStartIndexStartKey[K]
*/
trait ColumnSelectionStart[K] extends js.Object

object ColumnSelectionStart {
  @scala.inline
  def AnonStartKey[K](startIndex: Anon20, startKey: Anon21[K] = null): ColumnSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectionStart[K]]
  }
  @scala.inline
  def AnonStartIndexStartKey[K](startKey: Anon21[K], startIndex: Anon20 = null): ColumnSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectionStart[K]]
  }
}

