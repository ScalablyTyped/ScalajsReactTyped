package typingsJapgolly.hyperformula

import typingsJapgolly.chevrotainTypes.mod.ILexingResult
import typingsJapgolly.chevrotainTypes.mod.IToken
import typingsJapgolly.hyperformula.typingsCellMod.SimpleCellAddress_
import typingsJapgolly.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typingsJapgolly.hyperformula.typingsParserAddressRepresentationConvertersMod.SheetMappingFn
import typingsJapgolly.hyperformula.typingsParserAstMod.Ast
import typingsJapgolly.hyperformula.typingsParserAstMod.ParsingError_
import typingsJapgolly.hyperformula.typingsParserFormulaParserMod.ExtendedToken
import typingsJapgolly.hyperformula.typingsParserParserConfigMod.ParserConfig
import typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.RelativeDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserParserWithCachingMod {
  
  @JSImport("hyperformula/typings/parser/ParserWithCaching", "ParserWithCaching")
  @js.native
  open class ParserWithCaching protected () extends StObject {
    def this(config: ParserConfig, functionRegistry: FunctionRegistry, sheetMapping: SheetMappingFn) = this()
    
    def bindWhitespacesToTokens(tokens: js.Array[IToken]): js.Array[ExtendedToken] = js.native
    
    /* private */ var cache: Any = js.native
    
    def computeHashFromAst(ast: Ast): String = js.native
    
    def computeHashFromTokens(tokens: js.Array[IToken], baseAddress: SimpleCellAddress_): String = js.native
    
    /* private */ var computeHashOfAstNode: Any = js.native
    
    /* private */ val config: Any = js.native
    
    def fetchCachedResult(hash: String): ParsingResult = js.native
    
    def fetchCachedResultForAst(ast: Ast): ParsingResult = js.native
    
    /* private */ var formulaParser: Any = js.native
    
    /* private */ val functionRegistry: Any = js.native
    
    /* private */ var lexer: Any = js.native
    
    /* private */ val lexerConfig: Any = js.native
    
    /**
      * Parses a formula.
      *
      * @param text - formula to parse
      * @param formulaAddress - address with regard to which formula should be parsed. Impacts computed addresses in R0C0 format.
      */
    def parse(text: String, formulaAddress: SimpleCellAddress_): ParsingResult = js.native
    
    def rememberNewAst(ast: Ast): Ast = js.native
    
    /* private */ val sheetMapping: Any = js.native
    
    var statsCacheUsed: Double = js.native
    
    def tokenizeFormula(text: String): ILexingResult = js.native
  }
  
  trait ParsingResult extends StObject {
    
    var ast: Ast
    
    var dependencies: js.Array[RelativeDependency]
    
    var errors: js.Array[ParsingError_]
    
    var hasStructuralChangeFunction: Boolean
    
    var hasVolatileFunction: Boolean
  }
  object ParsingResult {
    
    inline def apply(
      ast: Ast,
      dependencies: js.Array[RelativeDependency],
      errors: js.Array[ParsingError_],
      hasStructuralChangeFunction: Boolean,
      hasVolatileFunction: Boolean
    ): ParsingResult = {
      val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], hasStructuralChangeFunction = hasStructuralChangeFunction.asInstanceOf[js.Any], hasVolatileFunction = hasVolatileFunction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsingResult]
    }
    
    extension [Self <: ParsingResult](x: Self) {
      
      inline def setAst(value: Ast): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: js.Array[RelativeDependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: RelativeDependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setErrors(value: js.Array[ParsingError_]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ParsingError_ *): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setHasStructuralChangeFunction(value: Boolean): Self = StObject.set(x, "hasStructuralChangeFunction", value.asInstanceOf[js.Any])
      
      inline def setHasVolatileFunction(value: Boolean): Self = StObject.set(x, "hasVolatileFunction", value.asInstanceOf[js.Any])
    }
  }
}
