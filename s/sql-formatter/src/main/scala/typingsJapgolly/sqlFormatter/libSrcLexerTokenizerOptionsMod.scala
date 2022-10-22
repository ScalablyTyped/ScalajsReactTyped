package typingsJapgolly.sqlFormatter

import typingsJapgolly.sqlFormatter.libSrcLexerTokenMod.Token
import typingsJapgolly.sqlFormatter.sqlFormatterStrings.$
import typingsJapgolly.sqlFormatter.sqlFormatterStrings.Colon
import typingsJapgolly.sqlFormatter.sqlFormatterStrings.LeftcurlybracketRightcurlybracket
import typingsJapgolly.sqlFormatter.sqlFormatterStrings.Questionmark
import typingsJapgolly.sqlFormatter.sqlFormatterStrings.`@`
import typingsJapgolly.sqlFormatter.sqlFormatterStrings.`[]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcLexerTokenizerOptionsMod {
  
  trait IdentChars extends StObject {
    
    var allowFirstCharNumber: js.UndefOr[Boolean] = js.undefined
    
    var dashes: js.UndefOr[Boolean] = js.undefined
    
    var first: js.UndefOr[String] = js.undefined
    
    var rest: js.UndefOr[String] = js.undefined
  }
  object IdentChars {
    
    inline def apply(): IdentChars = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentChars]
    }
    
    extension [Self <: IdentChars](x: Self) {
      
      inline def setAllowFirstCharNumber(value: Boolean): Self = StObject.set(x, "allowFirstCharNumber", value.asInstanceOf[js.Any])
      
      inline def setAllowFirstCharNumberUndefined: Self = StObject.set(x, "allowFirstCharNumber", js.undefined)
      
      inline def setDashes(value: Boolean): Self = StObject.set(x, "dashes", value.asInstanceOf[js.Any])
      
      inline def setDashesUndefined: Self = StObject.set(x, "dashes", js.undefined)
      
      inline def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    }
  }
  
  trait ParamTypes extends StObject {
    
    var named: js.UndefOr[js.Array[Colon | `@` | $]] = js.undefined
    
    var numbered: js.UndefOr[js.Array[Questionmark | Colon | $]] = js.undefined
    
    var positional: js.UndefOr[Boolean] = js.undefined
    
    var quoted: js.UndefOr[js.Array[Colon | `@` | $]] = js.undefined
  }
  object ParamTypes {
    
    inline def apply(): ParamTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamTypes]
    }
    
    extension [Self <: ParamTypes](x: Self) {
      
      inline def setNamed(value: js.Array[Colon | `@` | $]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setNamedUndefined: Self = StObject.set(x, "named", js.undefined)
      
      inline def setNamedVarargs(value: (Colon | `@` | $)*): Self = StObject.set(x, "named", js.Array(value*))
      
      inline def setNumbered(value: js.Array[Questionmark | Colon | $]): Self = StObject.set(x, "numbered", value.asInstanceOf[js.Any])
      
      inline def setNumberedUndefined: Self = StObject.set(x, "numbered", js.undefined)
      
      inline def setNumberedVarargs(value: (Questionmark | Colon | $)*): Self = StObject.set(x, "numbered", js.Array(value*))
      
      inline def setPositional(value: Boolean): Self = StObject.set(x, "positional", value.asInstanceOf[js.Any])
      
      inline def setPositionalUndefined: Self = StObject.set(x, "positional", js.undefined)
      
      inline def setQuoted(value: js.Array[Colon | `@` | $]): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
      
      inline def setQuotedUndefined: Self = StObject.set(x, "quoted", js.undefined)
      
      inline def setQuotedVarargs(value: (Colon | `@` | $)*): Self = StObject.set(x, "quoted", js.Array(value*))
    }
  }
  
  /* keyof sql-formatter.anon. */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.GraveaccentGraveaccent
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.`[]`
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.`QuotationmarkQuotationmark-qq`
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.`QuotationmarkQuotationmark-bs`
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.`QuotationmarkQuotationmark-qq-bs`
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.`QuotationmarkQuotationmark-raw`
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.`ApostropheApostrophe-qq`
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.`ApostropheApostrophe-bs`
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.`ApostropheApostrophe-qq-bs`
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.`ApostropheApostrophe-raw`
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.DollarDollar
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.ApostropheApostropheApostropheDotDotApostropheApostropheApostrophe
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.QuotationmarkQuotationmarkQuotationmarkDotDotQuotationmarkQuotationmarkQuotationmark
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.LeftcurlybracketRightcurlybracket
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.qApostropheApostrophe
  */
  trait PlainQuoteType
    extends StObject
       with QuoteType
  
  trait PrefixedQuoteType
    extends StObject
       with QuoteType
       with VariableType {
    
    var prefixes: js.Array[String]
    
    var quote: PlainQuoteType
    
    var requirePrefix: js.UndefOr[Boolean] = js.undefined
  }
  object PrefixedQuoteType {
    
    inline def apply(prefixes: js.Array[String], quote: PlainQuoteType): PrefixedQuoteType = {
      val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrefixedQuoteType]
    }
    
    extension [Self <: PrefixedQuoteType](x: Self) {
      
      inline def setPrefixes(value: js.Array[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      inline def setPrefixesVarargs(value: String*): Self = StObject.set(x, "prefixes", js.Array(value*))
      
      inline def setQuote(value: PlainQuoteType): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setRequirePrefix(value: Boolean): Self = StObject.set(x, "requirePrefix", value.asInstanceOf[js.Any])
      
      inline def setRequirePrefixUndefined: Self = StObject.set(x, "requirePrefix", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlFormatter.libSrcLexerTokenizerOptionsMod.PlainQuoteType
    - typingsJapgolly.sqlFormatter.libSrcLexerTokenizerOptionsMod.PrefixedQuoteType
  */
  trait QuoteType extends StObject
  
  trait TokenizerOptions extends StObject {
    
    var extraParens: js.UndefOr[js.Array[`[]` | LeftcurlybracketRightcurlybracket]] = js.undefined
    
    var identChars: js.UndefOr[IdentChars] = js.undefined
    
    var identTypes: js.Array[QuoteType]
    
    var lineCommentTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var nestedBlockComments: js.UndefOr[Boolean] = js.undefined
    
    var operators: js.UndefOr[js.Array[String]] = js.undefined
    
    var paramChars: js.UndefOr[IdentChars] = js.undefined
    
    var paramTypes: js.UndefOr[ParamTypes] = js.undefined
    
    var postProcess: js.UndefOr[js.Function1[/* tokens */ js.Array[Token], js.Array[Token]]] = js.undefined
    
    var reservedClauses: js.Array[String]
    
    var reservedFunctionNames: js.Array[String]
    
    var reservedJoins: js.Array[String]
    
    var reservedKeywords: js.Array[String]
    
    var reservedPhrases: js.UndefOr[js.Array[String]] = js.undefined
    
    var reservedSelect: js.Array[String]
    
    var reservedSetOperations: js.Array[String]
    
    var stringTypes: js.Array[QuoteType]
    
    var supportsXor: js.UndefOr[Boolean] = js.undefined
    
    var variableTypes: js.UndefOr[js.Array[VariableType]] = js.undefined
  }
  object TokenizerOptions {
    
    inline def apply(
      identTypes: js.Array[QuoteType],
      reservedClauses: js.Array[String],
      reservedFunctionNames: js.Array[String],
      reservedJoins: js.Array[String],
      reservedKeywords: js.Array[String],
      reservedSelect: js.Array[String],
      reservedSetOperations: js.Array[String],
      stringTypes: js.Array[QuoteType]
    ): TokenizerOptions = {
      val __obj = js.Dynamic.literal(identTypes = identTypes.asInstanceOf[js.Any], reservedClauses = reservedClauses.asInstanceOf[js.Any], reservedFunctionNames = reservedFunctionNames.asInstanceOf[js.Any], reservedJoins = reservedJoins.asInstanceOf[js.Any], reservedKeywords = reservedKeywords.asInstanceOf[js.Any], reservedSelect = reservedSelect.asInstanceOf[js.Any], reservedSetOperations = reservedSetOperations.asInstanceOf[js.Any], stringTypes = stringTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizerOptions]
    }
    
    extension [Self <: TokenizerOptions](x: Self) {
      
      inline def setExtraParens(value: js.Array[`[]` | LeftcurlybracketRightcurlybracket]): Self = StObject.set(x, "extraParens", value.asInstanceOf[js.Any])
      
      inline def setExtraParensUndefined: Self = StObject.set(x, "extraParens", js.undefined)
      
      inline def setExtraParensVarargs(value: (`[]` | LeftcurlybracketRightcurlybracket)*): Self = StObject.set(x, "extraParens", js.Array(value*))
      
      inline def setIdentChars(value: IdentChars): Self = StObject.set(x, "identChars", value.asInstanceOf[js.Any])
      
      inline def setIdentCharsUndefined: Self = StObject.set(x, "identChars", js.undefined)
      
      inline def setIdentTypes(value: js.Array[QuoteType]): Self = StObject.set(x, "identTypes", value.asInstanceOf[js.Any])
      
      inline def setIdentTypesVarargs(value: QuoteType*): Self = StObject.set(x, "identTypes", js.Array(value*))
      
      inline def setLineCommentTypes(value: js.Array[String]): Self = StObject.set(x, "lineCommentTypes", value.asInstanceOf[js.Any])
      
      inline def setLineCommentTypesUndefined: Self = StObject.set(x, "lineCommentTypes", js.undefined)
      
      inline def setLineCommentTypesVarargs(value: String*): Self = StObject.set(x, "lineCommentTypes", js.Array(value*))
      
      inline def setNestedBlockComments(value: Boolean): Self = StObject.set(x, "nestedBlockComments", value.asInstanceOf[js.Any])
      
      inline def setNestedBlockCommentsUndefined: Self = StObject.set(x, "nestedBlockComments", js.undefined)
      
      inline def setOperators(value: js.Array[String]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
      
      inline def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
      
      inline def setOperatorsVarargs(value: String*): Self = StObject.set(x, "operators", js.Array(value*))
      
      inline def setParamChars(value: IdentChars): Self = StObject.set(x, "paramChars", value.asInstanceOf[js.Any])
      
      inline def setParamCharsUndefined: Self = StObject.set(x, "paramChars", js.undefined)
      
      inline def setParamTypes(value: ParamTypes): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
      
      inline def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
      
      inline def setPostProcess(value: /* tokens */ js.Array[Token] => js.Array[Token]): Self = StObject.set(x, "postProcess", js.Any.fromFunction1(value))
      
      inline def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
      
      inline def setReservedClauses(value: js.Array[String]): Self = StObject.set(x, "reservedClauses", value.asInstanceOf[js.Any])
      
      inline def setReservedClausesVarargs(value: String*): Self = StObject.set(x, "reservedClauses", js.Array(value*))
      
      inline def setReservedFunctionNames(value: js.Array[String]): Self = StObject.set(x, "reservedFunctionNames", value.asInstanceOf[js.Any])
      
      inline def setReservedFunctionNamesVarargs(value: String*): Self = StObject.set(x, "reservedFunctionNames", js.Array(value*))
      
      inline def setReservedJoins(value: js.Array[String]): Self = StObject.set(x, "reservedJoins", value.asInstanceOf[js.Any])
      
      inline def setReservedJoinsVarargs(value: String*): Self = StObject.set(x, "reservedJoins", js.Array(value*))
      
      inline def setReservedKeywords(value: js.Array[String]): Self = StObject.set(x, "reservedKeywords", value.asInstanceOf[js.Any])
      
      inline def setReservedKeywordsVarargs(value: String*): Self = StObject.set(x, "reservedKeywords", js.Array(value*))
      
      inline def setReservedPhrases(value: js.Array[String]): Self = StObject.set(x, "reservedPhrases", value.asInstanceOf[js.Any])
      
      inline def setReservedPhrasesUndefined: Self = StObject.set(x, "reservedPhrases", js.undefined)
      
      inline def setReservedPhrasesVarargs(value: String*): Self = StObject.set(x, "reservedPhrases", js.Array(value*))
      
      inline def setReservedSelect(value: js.Array[String]): Self = StObject.set(x, "reservedSelect", value.asInstanceOf[js.Any])
      
      inline def setReservedSelectVarargs(value: String*): Self = StObject.set(x, "reservedSelect", js.Array(value*))
      
      inline def setReservedSetOperations(value: js.Array[String]): Self = StObject.set(x, "reservedSetOperations", value.asInstanceOf[js.Any])
      
      inline def setReservedSetOperationsVarargs(value: String*): Self = StObject.set(x, "reservedSetOperations", js.Array(value*))
      
      inline def setStringTypes(value: js.Array[QuoteType]): Self = StObject.set(x, "stringTypes", value.asInstanceOf[js.Any])
      
      inline def setStringTypesVarargs(value: QuoteType*): Self = StObject.set(x, "stringTypes", js.Array(value*))
      
      inline def setSupportsXor(value: Boolean): Self = StObject.set(x, "supportsXor", value.asInstanceOf[js.Any])
      
      inline def setSupportsXorUndefined: Self = StObject.set(x, "supportsXor", js.undefined)
      
      inline def setVariableTypes(value: js.Array[VariableType]): Self = StObject.set(x, "variableTypes", value.asInstanceOf[js.Any])
      
      inline def setVariableTypesUndefined: Self = StObject.set(x, "variableTypes", js.undefined)
      
      inline def setVariableTypesVarargs(value: VariableType*): Self = StObject.set(x, "variableTypes", js.Array(value*))
    }
  }
  
  trait VariableRegex
    extends StObject
       with VariableType {
    
    var regex: String
  }
  object VariableRegex {
    
    inline def apply(regex: String): VariableRegex = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariableRegex]
    }
    
    extension [Self <: VariableRegex](x: Self) {
      
      inline def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlFormatter.libSrcLexerTokenizerOptionsMod.VariableRegex
    - typingsJapgolly.sqlFormatter.libSrcLexerTokenizerOptionsMod.PrefixedQuoteType
  */
  trait VariableType extends StObject
  object VariableType {
    
    inline def PrefixedQuoteType(prefixes: js.Array[String], quote: PlainQuoteType): typingsJapgolly.sqlFormatter.libSrcLexerTokenizerOptionsMod.PrefixedQuoteType = {
      val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcLexerTokenizerOptionsMod.PrefixedQuoteType]
    }
    
    inline def VariableRegex(regex: String): typingsJapgolly.sqlFormatter.libSrcLexerTokenizerOptionsMod.VariableRegex = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.sqlFormatter.libSrcLexerTokenizerOptionsMod.VariableRegex]
    }
  }
}
