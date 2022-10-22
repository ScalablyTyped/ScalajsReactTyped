package typingsJapgolly.tsJest.distTypesMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsJestAstTransformer extends StObject {
  
  var after: js.Array[AstTransformerDesc[Record[String, Any]]]
  
  var afterDeclarations: js.Array[AstTransformerDesc[Record[String, Any]]]
  
  var before: js.Array[AstTransformerDesc[Record[String, Any]]]
}
object TsJestAstTransformer {
  
  inline def apply(
    after: js.Array[AstTransformerDesc[Record[String, Any]]],
    afterDeclarations: js.Array[AstTransformerDesc[Record[String, Any]]],
    before: js.Array[AstTransformerDesc[Record[String, Any]]]
  ): TsJestAstTransformer = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], afterDeclarations = afterDeclarations.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[TsJestAstTransformer]
  }
  
  extension [Self <: TsJestAstTransformer](x: Self) {
    
    inline def setAfter(value: js.Array[AstTransformerDesc[Record[String, Any]]]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterDeclarations(value: js.Array[AstTransformerDesc[Record[String, Any]]]): Self = StObject.set(x, "afterDeclarations", value.asInstanceOf[js.Any])
    
    inline def setAfterDeclarationsVarargs(value: (AstTransformerDesc[Record[String, Any]])*): Self = StObject.set(x, "afterDeclarations", js.Array(value*))
    
    inline def setAfterVarargs(value: (AstTransformerDesc[Record[String, Any]])*): Self = StObject.set(x, "after", js.Array(value*))
    
    inline def setBefore(value: js.Array[AstTransformerDesc[Record[String, Any]]]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeVarargs(value: (AstTransformerDesc[Record[String, Any]])*): Self = StObject.set(x, "before", js.Array(value*))
  }
}
