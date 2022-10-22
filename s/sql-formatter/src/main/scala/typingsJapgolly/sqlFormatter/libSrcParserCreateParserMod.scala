package typingsJapgolly.sqlFormatter

import typingsJapgolly.sqlFormatter.libSrcLexerTokenizerMod.default
import typingsJapgolly.sqlFormatter.libSrcLexerTokenizerOptionsMod.ParamTypes
import typingsJapgolly.sqlFormatter.libSrcParserAstMod.StatementNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcParserCreateParserMod {
  
  @JSImport("sql-formatter/lib/src/parser/createParser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createParser(tokenizer: default): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("createParser")(tokenizer.asInstanceOf[js.Any]).asInstanceOf[Parser]
  
  trait Parser extends StObject {
    
    def parse(sql: String, paramTypesOverrides: ParamTypes): js.Array[StatementNode]
  }
  object Parser {
    
    inline def apply(parse: (String, ParamTypes) => js.Array[StatementNode]): Parser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse))
      __obj.asInstanceOf[Parser]
    }
    
    extension [Self <: Parser](x: Self) {
      
      inline def setParse(value: (String, ParamTypes) => js.Array[StatementNode]): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    }
  }
}
