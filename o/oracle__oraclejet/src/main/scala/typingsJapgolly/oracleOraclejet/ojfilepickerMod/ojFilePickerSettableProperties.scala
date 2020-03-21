package typingsJapgolly.oracleOraclejet.ojfilepickerMod

import typingsJapgolly.oracleOraclejet.mod.JetSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.click
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.clickAndDrop
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.drop
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFilePickerSettableProperties extends JetSettableProperties {
  var accept: js.Array[String] | Null
  var selectOn: auto | click | drop | clickAndDrop
  var selectionMode: multiple | single
}

object ojFilePickerSettableProperties {
  @scala.inline
  def apply(
    selectOn: auto | click | drop | clickAndDrop,
    selectionMode: multiple | single,
    accept: js.Array[String] = null
  ): ojFilePickerSettableProperties = {
    val __obj = js.Dynamic.literal(selectOn = selectOn.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojFilePickerSettableProperties]
  }
}

