package typingsJapgolly.oracleOraclejet.ojbuttonMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.full
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.half
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.icons
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojbutton.ojButtonSettableProperties> */
trait ojButtonSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var chroming: js.UndefOr[full | half | outlined] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var display: js.UndefOr[all | icons] = js.undefined
  var translations: js.UndefOr[js.Object] = js.undefined
}

object ojButtonSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    chroming: full | half | outlined = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    display: all | icons = null,
    translations: js.Object = null
  ): ojButtonSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (chroming != null) __obj.updateDynamic("chroming")(chroming.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojButtonSettablePropertiesLenient]
  }
}

