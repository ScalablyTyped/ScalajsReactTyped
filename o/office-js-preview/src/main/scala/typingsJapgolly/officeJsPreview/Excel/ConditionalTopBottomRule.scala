package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BottomItems
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BottomPercent
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.TopItems
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.TopPercent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the rule of the top/bottom conditional format.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalTopBottomRule extends StObject {
  
  /**
    * The rank between 1 and 1000 for numeric ranks or 1 and 100 for percent ranks.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var rank: Double
  
  /**
    * Format values based on the top or bottom rank.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalTopBottomCriterionType | Invalid | TopItems | TopPercent | BottomItems | BottomPercent
}
object ConditionalTopBottomRule {
  
  inline def apply(
    rank: Double,
    `type`: ConditionalTopBottomCriterionType | Invalid | TopItems | TopPercent | BottomItems | BottomPercent
  ): ConditionalTopBottomRule = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalTopBottomRule]
  }
  
  extension [Self <: ConditionalTopBottomRule](x: Self) {
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: ConditionalTopBottomCriterionType | Invalid | TopItems | TopPercent | BottomItems | BottomPercent
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
