package typingsJapgolly.sqlFormatter

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.sqlFormatter.libSrcFormatterFormatterMod.default
import typingsJapgolly.sqlFormatter.libSrcFormatterParamsMod.ParamItems
import typingsJapgolly.sqlFormatter.libSrcLexerTokenizerOptionsMod.ParamTypes
import typingsJapgolly.sqlFormatter.libSrcSqlFormatterMod.SqlLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcFormatOptionsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.before
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.after
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.tabular
  */
  trait CommaPosition extends StObject
  object CommaPosition {
    
    inline def after: typingsJapgolly.sqlFormatter.sqlFormatterStrings.after = "after".asInstanceOf[typingsJapgolly.sqlFormatter.sqlFormatterStrings.after]
    
    inline def before: typingsJapgolly.sqlFormatter.sqlFormatterStrings.before = "before".asInstanceOf[typingsJapgolly.sqlFormatter.sqlFormatterStrings.before]
    
    inline def tabular: typingsJapgolly.sqlFormatter.sqlFormatterStrings.tabular = "tabular".asInstanceOf[typingsJapgolly.sqlFormatter.sqlFormatterStrings.tabular]
  }
  
  trait FormatOptions extends StObject {
    
    var commaPosition: CommaPosition
    
    var denseOperators: Boolean
    
    var expressionWidth: Double
    
    var indentStyle: IndentStyle
    
    var keywordCase: KeywordCase
    
    var language: SqlLanguage | (Instantiable1[/* cfg */ FormatOptions, default])
    
    var linesBetweenQueries: Double
    
    var logicalOperatorNewline: LogicalOperatorNewline
    
    var newlineBeforeSemicolon: Boolean
    
    var paramTypes: js.UndefOr[ParamTypes] = js.undefined
    
    var params: js.UndefOr[ParamItems | js.Array[String]] = js.undefined
    
    var tabWidth: Double
    
    var tabulateAlias: Boolean
    
    var useTabs: Boolean
  }
  object FormatOptions {
    
    inline def apply(
      commaPosition: CommaPosition,
      denseOperators: Boolean,
      expressionWidth: Double,
      indentStyle: IndentStyle,
      keywordCase: KeywordCase,
      language: SqlLanguage | (Instantiable1[/* cfg */ FormatOptions, default]),
      linesBetweenQueries: Double,
      logicalOperatorNewline: LogicalOperatorNewline,
      newlineBeforeSemicolon: Boolean,
      tabWidth: Double,
      tabulateAlias: Boolean,
      useTabs: Boolean
    ): FormatOptions = {
      val __obj = js.Dynamic.literal(commaPosition = commaPosition.asInstanceOf[js.Any], denseOperators = denseOperators.asInstanceOf[js.Any], expressionWidth = expressionWidth.asInstanceOf[js.Any], indentStyle = indentStyle.asInstanceOf[js.Any], keywordCase = keywordCase.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], linesBetweenQueries = linesBetweenQueries.asInstanceOf[js.Any], logicalOperatorNewline = logicalOperatorNewline.asInstanceOf[js.Any], newlineBeforeSemicolon = newlineBeforeSemicolon.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], tabulateAlias = tabulateAlias.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setCommaPosition(value: CommaPosition): Self = StObject.set(x, "commaPosition", value.asInstanceOf[js.Any])
      
      inline def setDenseOperators(value: Boolean): Self = StObject.set(x, "denseOperators", value.asInstanceOf[js.Any])
      
      inline def setExpressionWidth(value: Double): Self = StObject.set(x, "expressionWidth", value.asInstanceOf[js.Any])
      
      inline def setIndentStyle(value: IndentStyle): Self = StObject.set(x, "indentStyle", value.asInstanceOf[js.Any])
      
      inline def setKeywordCase(value: KeywordCase): Self = StObject.set(x, "keywordCase", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: SqlLanguage | (Instantiable1[/* cfg */ FormatOptions, default])): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLinesBetweenQueries(value: Double): Self = StObject.set(x, "linesBetweenQueries", value.asInstanceOf[js.Any])
      
      inline def setLogicalOperatorNewline(value: LogicalOperatorNewline): Self = StObject.set(x, "logicalOperatorNewline", value.asInstanceOf[js.Any])
      
      inline def setNewlineBeforeSemicolon(value: Boolean): Self = StObject.set(x, "newlineBeforeSemicolon", value.asInstanceOf[js.Any])
      
      inline def setParamTypes(value: ParamTypes): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
      
      inline def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
      
      inline def setParams(value: ParamItems | js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setTabulateAlias(value: Boolean): Self = StObject.set(x, "tabulateAlias", value.asInstanceOf[js.Any])
      
      inline def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.standard
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.tabularLeft
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.tabularRight
  */
  trait IndentStyle extends StObject
  object IndentStyle {
    
    inline def standard: typingsJapgolly.sqlFormatter.sqlFormatterStrings.standard = "standard".asInstanceOf[typingsJapgolly.sqlFormatter.sqlFormatterStrings.standard]
    
    inline def tabularLeft: typingsJapgolly.sqlFormatter.sqlFormatterStrings.tabularLeft = "tabularLeft".asInstanceOf[typingsJapgolly.sqlFormatter.sqlFormatterStrings.tabularLeft]
    
    inline def tabularRight: typingsJapgolly.sqlFormatter.sqlFormatterStrings.tabularRight = "tabularRight".asInstanceOf[typingsJapgolly.sqlFormatter.sqlFormatterStrings.tabularRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.preserve
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.upper
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.lower
  */
  trait KeywordCase extends StObject
  object KeywordCase {
    
    inline def lower: typingsJapgolly.sqlFormatter.sqlFormatterStrings.lower = "lower".asInstanceOf[typingsJapgolly.sqlFormatter.sqlFormatterStrings.lower]
    
    inline def preserve: typingsJapgolly.sqlFormatter.sqlFormatterStrings.preserve = "preserve".asInstanceOf[typingsJapgolly.sqlFormatter.sqlFormatterStrings.preserve]
    
    inline def upper: typingsJapgolly.sqlFormatter.sqlFormatterStrings.upper = "upper".asInstanceOf[typingsJapgolly.sqlFormatter.sqlFormatterStrings.upper]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.before
    - typingsJapgolly.sqlFormatter.sqlFormatterStrings.after
  */
  trait LogicalOperatorNewline extends StObject
  object LogicalOperatorNewline {
    
    inline def after: typingsJapgolly.sqlFormatter.sqlFormatterStrings.after = "after".asInstanceOf[typingsJapgolly.sqlFormatter.sqlFormatterStrings.after]
    
    inline def before: typingsJapgolly.sqlFormatter.sqlFormatterStrings.before = "before".asInstanceOf[typingsJapgolly.sqlFormatter.sqlFormatterStrings.before]
  }
}
