package typingsJapgolly.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubExpression
  extends StObject
     with Node {
  
  var hash: Hash
  
  var params: js.Array[Expression]
  
  var path: PathExpression
  
  @JSName("type")
  var type_SubExpression: typingsJapgolly.handlebars.handlebarsStrings.SubExpression
}
object SubExpression {
  
  inline def apply(hash: Hash, loc: SourceLocation, params: js.Array[Expression], path: PathExpression): SubExpression = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SubExpression")
    __obj.asInstanceOf[SubExpression]
  }
  
  extension [Self <: SubExpression](x: Self) {
    
    inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Expression]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Expression*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setPath(value: PathExpression): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.handlebars.handlebarsStrings.SubExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
