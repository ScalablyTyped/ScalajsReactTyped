package typingsJapgolly.oracleOraclejet.ojfilmstripMod

import typingsJapgolly.oracleOraclejet.AnonId
import typingsJapgolly.oracleOraclejet.AnonLabelAccArrowNextPage
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.adjacent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hover
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.overlay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.page
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFilmStripSettableProperties extends baseComponentSettableProperties {
  var arrowPlacement: adjacent | overlay
  var arrowVisibility: visible | hidden | hover | auto
  var currentItem: AnonId
  var looping: off | page
  var maxItemsPerPage: Double
  var orientation: horizontal | vertical
  @JSName("translations")
  var translations_ojFilmStripSettableProperties: AnonLabelAccArrowNextPage
}

object ojFilmStripSettableProperties {
  @scala.inline
  def apply(
    arrowPlacement: adjacent | overlay,
    arrowVisibility: visible | hidden | hover | auto,
    currentItem: AnonId,
    looping: off | page,
    maxItemsPerPage: Double,
    orientation: horizontal | vertical,
    translations: AnonLabelAccArrowNextPage
  ): ojFilmStripSettableProperties = {
    val __obj = js.Dynamic.literal(arrowPlacement = arrowPlacement.asInstanceOf[js.Any], arrowVisibility = arrowVisibility.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], maxItemsPerPage = maxItemsPerPage.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojFilmStripSettableProperties]
  }
}

