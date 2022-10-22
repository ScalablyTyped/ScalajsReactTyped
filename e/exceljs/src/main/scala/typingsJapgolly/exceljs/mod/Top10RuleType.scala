package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.exceljsStrings.top10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Top10RuleType
  extends StObject
     with ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var bottom: Boolean
  
  var percent: Boolean
  
  var rank: Double
  
  var `type`: top10
}
object Top10RuleType {
  
  inline def apply(bottom: Boolean, percent: Boolean, priority: Double, rank: Double): Top10RuleType = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("top10")
    __obj.asInstanceOf[Top10RuleType]
  }
  
  extension [Self <: Top10RuleType](x: Self) {
    
    inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setPercent(value: Boolean): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setType(value: top10): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
