package typingsJapgolly.oracleOraclejet.ojmasonrylayoutMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.AnonLabelCut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmasonrylayout.ojMasonryLayoutSettableProperties> */
trait ojMasonryLayoutSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var reorderHandle: js.UndefOr[String] = js.undefined
  var translations: js.UndefOr[AnonLabelCut] = js.undefined
}

object ojMasonryLayoutSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    reorderHandle: String = null,
    translations: AnonLabelCut = null
  ): ojMasonryLayoutSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMasonryLayoutSettablePropertiesLenient]
  }
}

