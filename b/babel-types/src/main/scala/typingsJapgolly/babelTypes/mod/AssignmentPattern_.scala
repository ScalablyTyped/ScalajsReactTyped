package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.AssignmentPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentPattern_
  extends StObject
     with Node
     with LVal
     with Pattern {
  
  var left: Identifier_
  
  var right: Expression
  
  @JSName("type")
  var type_AssignmentPattern_ : AssignmentPattern
}
object AssignmentPattern_ {
  
  inline def apply(end: Double, left: Identifier_, loc: SourceLocation, right: Expression, start: Double): AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[AssignmentPattern_]
  }
  
  extension [Self <: AssignmentPattern_](x: Self) {
    
    inline def setLeft(value: Identifier_): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: AssignmentPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
