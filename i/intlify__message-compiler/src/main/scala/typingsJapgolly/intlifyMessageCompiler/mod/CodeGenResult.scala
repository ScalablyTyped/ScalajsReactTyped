package typingsJapgolly.intlifyMessageCompiler.mod

import typingsJapgolly.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeGenResult extends StObject {
  
  var ast: ResourceNode
  
  var code: String
  
  var map: js.UndefOr[RawSourceMap] = js.undefined
}
object CodeGenResult {
  
  inline def apply(ast: ResourceNode, code: String): CodeGenResult = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenResult]
  }
  
  extension [Self <: CodeGenResult](x: Self) {
    
    inline def setAst(value: ResourceNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
