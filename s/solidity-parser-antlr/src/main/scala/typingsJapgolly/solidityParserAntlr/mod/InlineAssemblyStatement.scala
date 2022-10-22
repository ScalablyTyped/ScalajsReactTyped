package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineAssemblyStatement
  extends StObject
     with BaseASTNode
     with ASTNode
     with Statement {
  
  var body: AssemblyBlock
  
  var language: String
  
  @JSName("type")
  var type_InlineAssemblyStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
}
object InlineAssemblyStatement {
  
  inline def apply(body: AssemblyBlock, language: String): InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InlineAssemblyStatement")
    __obj.asInstanceOf[InlineAssemblyStatement]
  }
  
  extension [Self <: InlineAssemblyStatement](x: Self) {
    
    inline def setBody(value: AssemblyBlock): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
