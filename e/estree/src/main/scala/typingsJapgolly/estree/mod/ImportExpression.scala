package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportExpression
  extends StObject
     with BaseNode {
  
  var source: Expression
  
  @JSName("type")
  var type_ImportExpression: typingsJapgolly.estree.estreeStrings.ImportExpression
}
object ImportExpression {
  
  inline def apply(source: Expression): ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportExpression")
    __obj.asInstanceOf[ImportExpression]
  }
  
  extension [Self <: ImportExpression](x: Self) {
    
    inline def setSource(value: Expression): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.ImportExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
