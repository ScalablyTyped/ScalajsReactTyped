package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.ReturnStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnStatement_
  extends StObject
     with Node
     with CompletionStatement
     with Statement
     with Terminatorless {
  
  var argument: Expression
  
  @JSName("type")
  var type_ReturnStatement_ : ReturnStatement
}
object ReturnStatement_ {
  
  inline def apply(argument: Expression, end: Double, loc: SourceLocation, start: Double): ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[ReturnStatement_]
  }
  
  extension [Self <: ReturnStatement_](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
