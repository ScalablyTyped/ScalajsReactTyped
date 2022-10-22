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
