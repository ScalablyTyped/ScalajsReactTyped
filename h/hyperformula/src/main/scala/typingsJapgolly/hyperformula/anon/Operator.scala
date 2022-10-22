package typingsJapgolly.hyperformula.anon

import typingsJapgolly.hyperformula.typingsCellValueMod.NoErrorCellValue
import typingsJapgolly.hyperformula.typingsInterpreterCriterionMod.CriterionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operator extends StObject {
  
  var operator: CriterionType
  
  var value: NoErrorCellValue
}
object Operator {
  
  inline def apply(operator: CriterionType): Operator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[Operator]
  }
  
  extension [Self <: Operator](x: Self) {
    
    inline def setOperator(value: CriterionType): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: NoErrorCellValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
