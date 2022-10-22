package typingsJapgolly.prettier.mod

import typingsJapgolly.prettier.prettierBooleans.`false`
import typingsJapgolly.prettier.prettierStrings.`as-needed`
import typingsJapgolly.prettier.prettierStrings.all
import typingsJapgolly.prettier.prettierStrings.always
import typingsJapgolly.prettier.prettierStrings.auto
import typingsJapgolly.prettier.prettierStrings.avoid
import typingsJapgolly.prettier.prettierStrings.consistent
import typingsJapgolly.prettier.prettierStrings.cr
import typingsJapgolly.prettier.prettierStrings.crlf
import typingsJapgolly.prettier.prettierStrings.css
import typingsJapgolly.prettier.prettierStrings.es5
import typingsJapgolly.prettier.prettierStrings.ignore
import typingsJapgolly.prettier.prettierStrings.lf
import typingsJapgolly.prettier.prettierStrings.never
import typingsJapgolly.prettier.prettierStrings.none
import typingsJapgolly.prettier.prettierStrings.off
import typingsJapgolly.prettier.prettierStrings.preserve
import typingsJapgolly.prettier.prettierStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<prettier.prettier.RequiredOptions> */
trait Options extends StObject {
  
  var __embeddedInHtml: js.UndefOr[Boolean] = js.undefined
  
  var arrowParens: js.UndefOr[avoid | always] = js.undefined
  
  var bracketSameLine: js.UndefOr[Boolean] = js.undefined
  
  var bracketSpacing: js.UndefOr[Boolean] = js.undefined
  
  var embeddedLanguageFormatting: js.UndefOr[auto | off] = js.undefined
  
  var endOfLine: js.UndefOr[auto | lf | crlf | cr] = js.undefined
  
  var filepath: js.UndefOr[String] = js.undefined
  
  var htmlWhitespaceSensitivity: js.UndefOr[css | strict | ignore] = js.undefined
  
  var insertPragma: js.UndefOr[Boolean] = js.undefined
  
  var jsxBracketSameLine: js.UndefOr[Boolean] = js.undefined
  
  var jsxSingleQuote: js.UndefOr[Boolean] = js.undefined
  
  var parentParser: js.UndefOr[String] = js.undefined
  
  var parser: js.UndefOr[(LiteralUnion[BuiltInParserName, String]) | CustomParser] = js.undefined
  
  var pluginSearchDirs: js.UndefOr[js.Array[String] | `false`] = js.undefined
  
  var plugins: js.UndefOr[js.Array[String | Plugin[Any]]] = js.undefined
  
  var printWidth: js.UndefOr[Double] = js.undefined
  
  var proseWrap: js.UndefOr[always | never | preserve] = js.undefined
  
  var quoteProps: js.UndefOr[`as-needed` | consistent | preserve] = js.undefined
  
  var rangeEnd: js.UndefOr[Double] = js.undefined
  
  var rangeStart: js.UndefOr[Double] = js.undefined
  
  var requirePragma: js.UndefOr[Boolean] = js.undefined
  
  var semi: js.UndefOr[Boolean] = js.undefined
  
  var singleAttributePerLine: js.UndefOr[Boolean] = js.undefined
  
  var singleQuote: js.UndefOr[Boolean] = js.undefined
  
  var tabWidth: js.UndefOr[Double] = js.undefined
  
  var trailingComma: js.UndefOr[none | es5 | all] = js.undefined
  
  var useTabs: js.UndefOr[Boolean] = js.undefined
  
  var vueIndentScriptAndStyle: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setArrowParens(value: avoid | always): Self = StObject.set(x, "arrowParens", value.asInstanceOf[js.Any])
    
    inline def setArrowParensUndefined: Self = StObject.set(x, "arrowParens", js.undefined)
    
    inline def setBracketSameLine(value: Boolean): Self = StObject.set(x, "bracketSameLine", value.asInstanceOf[js.Any])
    
    inline def setBracketSameLineUndefined: Self = StObject.set(x, "bracketSameLine", js.undefined)
    
    inline def setBracketSpacing(value: Boolean): Self = StObject.set(x, "bracketSpacing", value.asInstanceOf[js.Any])
    
    inline def setBracketSpacingUndefined: Self = StObject.set(x, "bracketSpacing", js.undefined)
    
    inline def setEmbeddedLanguageFormatting(value: auto | off): Self = StObject.set(x, "embeddedLanguageFormatting", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedLanguageFormattingUndefined: Self = StObject.set(x, "embeddedLanguageFormatting", js.undefined)
    
    inline def setEndOfLine(value: auto | lf | crlf | cr): Self = StObject.set(x, "endOfLine", value.asInstanceOf[js.Any])
    
    inline def setEndOfLineUndefined: Self = StObject.set(x, "endOfLine", js.undefined)
    
    inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
    
    inline def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
    
    inline def setHtmlWhitespaceSensitivity(value: css | strict | ignore): Self = StObject.set(x, "htmlWhitespaceSensitivity", value.asInstanceOf[js.Any])
    
    inline def setHtmlWhitespaceSensitivityUndefined: Self = StObject.set(x, "htmlWhitespaceSensitivity", js.undefined)
    
    inline def setInsertPragma(value: Boolean): Self = StObject.set(x, "insertPragma", value.asInstanceOf[js.Any])
    
    inline def setInsertPragmaUndefined: Self = StObject.set(x, "insertPragma", js.undefined)
    
    inline def setJsxBracketSameLine(value: Boolean): Self = StObject.set(x, "jsxBracketSameLine", value.asInstanceOf[js.Any])
    
    inline def setJsxBracketSameLineUndefined: Self = StObject.set(x, "jsxBracketSameLine", js.undefined)
    
    inline def setJsxSingleQuote(value: Boolean): Self = StObject.set(x, "jsxSingleQuote", value.asInstanceOf[js.Any])
    
    inline def setJsxSingleQuoteUndefined: Self = StObject.set(x, "jsxSingleQuote", js.undefined)
    
    inline def setParentParser(value: String): Self = StObject.set(x, "parentParser", value.asInstanceOf[js.Any])
    
    inline def setParentParserUndefined: Self = StObject.set(x, "parentParser", js.undefined)
    
    inline def setParser(value: (LiteralUnion[BuiltInParserName, String]) | CustomParser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserFunction3(value: (/* text */ String, /* parsers */ BuiltInParsers, /* options */ Options) => AST): Self = StObject.set(x, "parser", js.Any.fromFunction3(value))
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setPluginSearchDirs(value: js.Array[String] | `false`): Self = StObject.set(x, "pluginSearchDirs", value.asInstanceOf[js.Any])
    
    inline def setPluginSearchDirsUndefined: Self = StObject.set(x, "pluginSearchDirs", js.undefined)
    
    inline def setPluginSearchDirsVarargs(value: String*): Self = StObject.set(x, "pluginSearchDirs", js.Array(value*))
    
    inline def setPlugins(value: js.Array[String | Plugin[Any]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (String | Plugin[Any])*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPrintWidth(value: Double): Self = StObject.set(x, "printWidth", value.asInstanceOf[js.Any])
    
    inline def setPrintWidthUndefined: Self = StObject.set(x, "printWidth", js.undefined)
    
    inline def setProseWrap(value: always | never | preserve): Self = StObject.set(x, "proseWrap", value.asInstanceOf[js.Any])
    
    inline def setProseWrapUndefined: Self = StObject.set(x, "proseWrap", js.undefined)
    
    inline def setQuoteProps(value: `as-needed` | consistent | preserve): Self = StObject.set(x, "quoteProps", value.asInstanceOf[js.Any])
    
    inline def setQuotePropsUndefined: Self = StObject.set(x, "quoteProps", js.undefined)
    
    inline def setRangeEnd(value: Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    inline def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    inline def setRangeStart(value: Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    inline def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
    
    inline def setRequirePragma(value: Boolean): Self = StObject.set(x, "requirePragma", value.asInstanceOf[js.Any])
    
    inline def setRequirePragmaUndefined: Self = StObject.set(x, "requirePragma", js.undefined)
    
    inline def setSemi(value: Boolean): Self = StObject.set(x, "semi", value.asInstanceOf[js.Any])
    
    inline def setSemiUndefined: Self = StObject.set(x, "semi", js.undefined)
    
    inline def setSingleAttributePerLine(value: Boolean): Self = StObject.set(x, "singleAttributePerLine", value.asInstanceOf[js.Any])
    
    inline def setSingleAttributePerLineUndefined: Self = StObject.set(x, "singleAttributePerLine", js.undefined)
    
    inline def setSingleQuote(value: Boolean): Self = StObject.set(x, "singleQuote", value.asInstanceOf[js.Any])
    
    inline def setSingleQuoteUndefined: Self = StObject.set(x, "singleQuote", js.undefined)
    
    inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
    
    inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
    
    inline def setTrailingComma(value: none | es5 | all): Self = StObject.set(x, "trailingComma", value.asInstanceOf[js.Any])
    
    inline def setTrailingCommaUndefined: Self = StObject.set(x, "trailingComma", js.undefined)
    
    inline def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
    
    inline def setUseTabsUndefined: Self = StObject.set(x, "useTabs", js.undefined)
    
    inline def setVueIndentScriptAndStyle(value: Boolean): Self = StObject.set(x, "vueIndentScriptAndStyle", value.asInstanceOf[js.Any])
    
    inline def setVueIndentScriptAndStyleUndefined: Self = StObject.set(x, "vueIndentScriptAndStyle", js.undefined)
    
    inline def set__embeddedInHtml(value: Boolean): Self = StObject.set(x, "__embeddedInHtml", value.asInstanceOf[js.Any])
    
    inline def set__embeddedInHtmlUndefined: Self = StObject.set(x, "__embeddedInHtml", js.undefined)
  }
}
