package typingsJapgolly.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.exceljs.mod.ExpressionRuleType
  - typingsJapgolly.exceljs.mod.CellIsRuleType
  - typingsJapgolly.exceljs.mod.Top10RuleType
  - typingsJapgolly.exceljs.mod.AboveAverageRuleType
  - typingsJapgolly.exceljs.mod.ColorScaleRuleType
  - typingsJapgolly.exceljs.mod.IconSetRuleType
  - typingsJapgolly.exceljs.mod.ContainsTextRuleType
  - typingsJapgolly.exceljs.mod.TimePeriodRuleType
  - typingsJapgolly.exceljs.mod.DataBarRuleType
*/
trait ConditionalFormattingRule extends StObject
object ConditionalFormattingRule {
  
  inline def AboveAverageRuleType(aboveAverage: Boolean, priority: Double): typingsJapgolly.exceljs.mod.AboveAverageRuleType = {
    val __obj = js.Dynamic.literal(aboveAverage = aboveAverage.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("aboveAverage")
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.AboveAverageRuleType]
  }
  
  inline def CellIsRuleType(priority: Double): typingsJapgolly.exceljs.mod.CellIsRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cellIs")
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.CellIsRuleType]
  }
  
  inline def ColorScaleRuleType(priority: Double): typingsJapgolly.exceljs.mod.ColorScaleRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("colorScale")
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.ColorScaleRuleType]
  }
  
  inline def ContainsTextRuleType(priority: Double): typingsJapgolly.exceljs.mod.ContainsTextRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("containsText")
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.ContainsTextRuleType]
  }
  
  inline def DataBarRuleType(priority: Double): typingsJapgolly.exceljs.mod.DataBarRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dataBar")
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.DataBarRuleType]
  }
  
  inline def ExpressionRuleType(priority: Double): typingsJapgolly.exceljs.mod.ExpressionRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("expression")
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.ExpressionRuleType]
  }
  
  inline def IconSetRuleType(priority: Double): typingsJapgolly.exceljs.mod.IconSetRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("iconSet")
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.IconSetRuleType]
  }
  
  inline def TimePeriodRuleType(priority: Double): typingsJapgolly.exceljs.mod.TimePeriodRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timePeriod")
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.TimePeriodRuleType]
  }
  
  inline def Top10RuleType(bottom: Boolean, percent: Boolean, priority: Double, rank: Double): typingsJapgolly.exceljs.mod.Top10RuleType = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("top10")
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.Top10RuleType]
  }
}
