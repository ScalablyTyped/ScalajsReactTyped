package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadElement
  extends StObject
     with BaseNode {
  
  var argument: Expression
  
  @JSName("type")
  var type_SpreadElement: typingsJapgolly.estree.estreeStrings.SpreadElement
}
object SpreadElement {
  
  inline def apply(argument: Expression): SpreadElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[SpreadElement]
  }
  
  extension [Self <: SpreadElement](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.SpreadElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
