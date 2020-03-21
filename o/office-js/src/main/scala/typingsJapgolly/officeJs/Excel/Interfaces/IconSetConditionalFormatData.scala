package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.ConditionalIconCriterion
import typingsJapgolly.officeJs.Excel.IconSet
import typingsJapgolly.officeJs.officeJsStrings.FiveArrows
import typingsJapgolly.officeJs.officeJsStrings.FiveArrowsGray
import typingsJapgolly.officeJs.officeJsStrings.FiveBoxes
import typingsJapgolly.officeJs.officeJsStrings.FiveQuarters
import typingsJapgolly.officeJs.officeJsStrings.FiveRating
import typingsJapgolly.officeJs.officeJsStrings.FourArrows
import typingsJapgolly.officeJs.officeJsStrings.FourArrowsGray
import typingsJapgolly.officeJs.officeJsStrings.FourRating
import typingsJapgolly.officeJs.officeJsStrings.FourRedToBlack
import typingsJapgolly.officeJs.officeJsStrings.FourTrafficLights
import typingsJapgolly.officeJs.officeJsStrings.Invalid
import typingsJapgolly.officeJs.officeJsStrings.ThreeArrows
import typingsJapgolly.officeJs.officeJsStrings.ThreeArrowsGray
import typingsJapgolly.officeJs.officeJsStrings.ThreeFlags
import typingsJapgolly.officeJs.officeJsStrings.ThreeSigns
import typingsJapgolly.officeJs.officeJsStrings.ThreeStars
import typingsJapgolly.officeJs.officeJsStrings.ThreeSymbols
import typingsJapgolly.officeJs.officeJsStrings.ThreeSymbols2
import typingsJapgolly.officeJs.officeJsStrings.ThreeTrafficLights1
import typingsJapgolly.officeJs.officeJsStrings.ThreeTrafficLights2
import typingsJapgolly.officeJs.officeJsStrings.ThreeTriangles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `iconSetConditionalFormat.toJSON()`. */
trait IconSetConditionalFormatData extends js.Object {
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

object IconSetConditionalFormatData {
  @scala.inline
  def apply(
    criteria: js.Array[ConditionalIconCriterion] = null,
    reverseIconOrder: js.UndefOr[Boolean] = js.undefined,
    showIconOnly: js.UndefOr[Boolean] = js.undefined,
    style: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes = null
  ): IconSetConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseIconOrder)) __obj.updateDynamic("reverseIconOrder")(reverseIconOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(showIconOnly)) __obj.updateDynamic("showIconOnly")(showIconOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetConditionalFormatData]
  }
}

