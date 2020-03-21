package typingsJapgolly.oracleOraclejet.ojvalidationgroupMod

import typingsJapgolly.oracleOraclejet.mod.JetSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojValidationGroupSettableProperties extends JetSettableProperties {
  val valid: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
}

object ojValidationGroupSettableProperties {
  @scala.inline
  def apply(valid: valid | pending | invalidHidden | invalidShown): ojValidationGroupSettableProperties = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojValidationGroupSettableProperties]
  }
}

