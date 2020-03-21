package typingsJapgolly.oracleOraclejet.ojfilepickerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.click
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.clickAndDrop
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.drop
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojfilepicker.ojFilePickerSettableProperties> */
trait ojFilePickerSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var accept: js.UndefOr[js.Array[String]] = js.undefined
  var selectOn: js.UndefOr[auto | click | drop | clickAndDrop] = js.undefined
  var selectionMode: js.UndefOr[multiple | single] = js.undefined
}

object ojFilePickerSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    accept: js.Array[String] = null,
    selectOn: auto | click | drop | clickAndDrop = null,
    selectionMode: multiple | single = null
  ): ojFilePickerSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (selectOn != null) __obj.updateDynamic("selectOn")(selectOn.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojFilePickerSettablePropertiesLenient]
  }
}

