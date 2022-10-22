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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `iconSetConditionalFormat.toJSON()`. */
trait IconSetConditionalFormatData extends StObject {
  
  /**
    * An array of criteria and icon sets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[js.Array[ConditionalIconCriterion]] = js.undefined
  
  /**
    * If `true`, reverses the icon orders for the icon set. Note that this cannot be set if custom icons are used.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, hides the values and only shows icons.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set, displays the icon set option for the conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
  ] = js.undefined
}
object IconSetConditionalFormatData {
  
  inline def apply(): IconSetConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSetConditionalFormatData]
  }
  
  extension [Self <: IconSetConditionalFormatData](x: Self) {
    
    inline def setCriteria(value: js.Array[ConditionalIconCriterion]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setCriteriaVarargs(value: ConditionalIconCriterion*): Self = StObject.set(x, "criteria", js.Array(value*))
    
    inline def setReverseIconOrder(value: Boolean): Self = StObject.set(x, "reverseIconOrder", value.asInstanceOf[js.Any])
    
    inline def setReverseIconOrderUndefined: Self = StObject.set(x, "reverseIconOrder", js.undefined)
    
    inline def setShowIconOnly(value: Boolean): Self = StObject.set(x, "showIconOnly", value.asInstanceOf[js.Any])
    
    inline def setShowIconOnlyUndefined: Self = StObject.set(x, "showIconOnly", js.undefined)
    
    inline def setStyle(
      value: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
