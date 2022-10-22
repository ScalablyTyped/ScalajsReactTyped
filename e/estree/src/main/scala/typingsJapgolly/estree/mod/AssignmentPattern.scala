package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentPattern
  extends StObject
     with BaseNode
     with Pattern {
  
  var left: Pattern
  
  var right: Expression
  
  @JSName("type")
  var type_AssignmentPattern: typingsJapgolly.estree.estreeStrings.AssignmentPattern
}
object AssignmentPattern {
  
  inline def apply(left: Pattern, right: Expression): AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[AssignmentPattern]
  }
  
  extension [Self <: AssignmentPattern](x: Self) {
    
    inline def setLeft(value: Pattern): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.AssignmentPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
