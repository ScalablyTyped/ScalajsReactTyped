package typingsJapgolly.oracleOraclejet.ojdiagramMod

import typingsJapgolly.oracleOraclejet.AnonIconAnonShape
import typingsJapgolly.oracleOraclejet.AnonOpacity
import typingsJapgolly.oracleOraclejet.mod.JetSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.connected
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disjoint
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDiagramNodeSettableProperties extends JetSettableProperties {
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var descendantsConnectivity: js.UndefOr[connected | disjoint | unknown] = js.undefined
  var icon: js.UndefOr[AnonOpacity] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[js.Object | Null] = js.undefined
  var overview: js.UndefOr[AnonIconAnonShape] = js.undefined
  var selectable: js.UndefOr[auto | off] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var showDisclosure: js.UndefOr[on | off] = js.undefined
}

object ojDiagramNodeSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[String] = null,
    descendantsConnectivity: connected | disjoint | unknown = null,
    icon: AnonOpacity = null,
    label: String = null,
    labelStyle: js.Object = null,
    overview: AnonIconAnonShape = null,
    selectable: auto | off = null,
    shortDesc: String = null,
    showDisclosure: on | off = null
  ): ojDiagramNodeSettableProperties = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (descendantsConnectivity != null) __obj.updateDynamic("descendantsConnectivity")(descendantsConnectivity.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (showDisclosure != null) __obj.updateDynamic("showDisclosure")(showDisclosure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDiagramNodeSettableProperties]
  }
}

