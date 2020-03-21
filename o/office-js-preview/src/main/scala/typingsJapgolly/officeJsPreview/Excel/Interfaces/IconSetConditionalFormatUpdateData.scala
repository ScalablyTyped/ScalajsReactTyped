package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.ConditionalIconCriterion
import typingsJapgolly.officeJsPreview.Excel.IconSet
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FiveArrows
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FiveArrowsGray
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FiveBoxes
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FiveQuarters
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FiveRating
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FourArrows
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FourArrowsGray
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FourRating
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FourRedToBlack
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FourTrafficLights
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeArrows
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeArrowsGray
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeFlags
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeSigns
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeStars
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeSymbols
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeSymbols2
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeTrafficLights1
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeTrafficLights2
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeTriangles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the IconSetConditionalFormat object, for use in `iconSetConditionalFormat.set({ ... })`. */
trait IconSetConditionalFormatUpdateData extends js.Object {
  /**
    *
    * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[js.Array[ConditionalIconCriterion]] = js.undefined
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
  ] = js.undefined
}

object IconSetConditionalFormatUpdateData {
  @scala.inline
  def apply(
    criteria: js.Array[ConditionalIconCriterion] = null,
    reverseIconOrder: js.UndefOr[Boolean] = js.undefined,
    showIconOnly: js.UndefOr[Boolean] = js.undefined,
    style: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes = null
  ): IconSetConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseIconOrder)) __obj.updateDynamic("reverseIconOrder")(reverseIconOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(showIconOnly)) __obj.updateDynamic("showIconOnly")(showIconOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetConditionalFormatUpdateData]
  }
}

