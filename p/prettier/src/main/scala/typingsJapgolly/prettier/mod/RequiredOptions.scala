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

trait RequiredOptions
  extends StObject
     with typingsJapgolly.prettier.mod.doc.printer.Options {
  
  /**
    * Include parentheses around a sole arrow function parameter.
    * @default 'always'
    */
  var arrowParens: avoid | always
  
  /**
    * Put the `>` of a multi-line HTML (HTML, JSX, Vue, Angular) element at the end of the last line instead of being
    * alone on the next line (does not apply to self closing elements).
    * @default false
    */
  var bracketSameLine: Boolean
  
  /**
    * Print spaces between brackets in object literals.
    * @default true
    */
  var bracketSpacing: Boolean
  
  /**
    * Control whether Prettier formats quoted code embedded in the file.
    * @default 'auto'
    */
  var embeddedLanguageFormatting: auto | off
  
  /**
    * Which end of line characters to apply.
    * @default 'lf'
    */
  var endOfLine: auto | lf | crlf | cr
  
  /**
    * Specify the input filepath. This will be used to do parser inference.
    */
  var filepath: String
  
  /**
    * How to handle whitespaces in HTML.
    * @default 'css'
    */
  var htmlWhitespaceSensitivity: css | strict | ignore
  
  /**
    * Prettier can insert a special @format marker at the top of files specifying that
    * the file has been formatted with prettier. This works well when used in tandem with
    * the --require-pragma option. If there is already a docblock at the top of
    * the file then this option will add a newline to it with the @format marker.
    * @default false
    */
  var insertPragma: Boolean
  
  /**
    * Put the `>` of a multi-line JSX element at the end of the last line instead of being alone on the next line.
    * @default false
    * @deprecated use bracketSameLine instead
    */
  var jsxBracketSameLine: Boolean
  
  /**
    * Use single quotes in JSX.
    * @default false
    */
  var jsxSingleQuote: Boolean
  
  /**
    * Specify which parser to use.
    */
  var parser: (LiteralUnion[BuiltInParserName, String]) | CustomParser
  
  /**
    * Specify plugin directory paths to search for plugins if not installed in the same `node_modules` where prettier is located.
    */
  var pluginSearchDirs: js.Array[String] | `false`
  
  /**
    * Provide ability to support new languages to prettier.
    */
  var plugins: js.Array[String | Plugin[Any]]
  
  /**
    * By default, Prettier will wrap markdown text as-is since some services use a linebreak-sensitive renderer.
    * In some cases you may want to rely on editor/viewer soft wrapping instead, so this option allows you to opt out.
    * @default 'preserve'
    */
  var proseWrap: always | never | preserve
  
  /**
    * Change when properties in objects are quoted.
    * @default 'as-needed'
    */
  var quoteProps: `as-needed` | consistent | preserve
  
  /**
    * Format only a segment of a file.
    * @default Infinity
    */
  var rangeEnd: Double
  
  /**
    * Format only a segment of a file.
    * @default 0
    */
  var rangeStart: Double
  
  /**
    * Prettier can restrict itself to only format files that contain a special comment, called a pragma, at the top of the file.
    * This is very useful when gradually transitioning large, unformatted codebases to prettier.
    * @default false
    */
  var requirePragma: Boolean
  
  /**
    * Print semicolons at the ends of statements.
    * @default true
    */
  var semi: Boolean
  
  /**
    * Enforce single attribute per line in HTML, Vue and JSX.
    * @default false
    */
  var singleAttributePerLine: Boolean
  
  /**
    * Use single quotes instead of double quotes.
    * @default false
    */
  var singleQuote: Boolean
  
  /**
    * Print trailing commas wherever possible.
    * @default 'es5'
    */
  var trailingComma: none | es5 | all
  
  /**
    * Whether or not to indent the code inside <script> and <style> tags in Vue files.
    * @default false
    */
  var vueIndentScriptAndStyle: Boolean
}
object RequiredOptions {
  
  inline def apply(
    arrowParens: avoid | always,
    bracketSameLine: Boolean,
    bracketSpacing: Boolean,
    embeddedLanguageFormatting: auto | off,
    endOfLine: auto | lf | crlf | cr,
    filepath: String,
    htmlWhitespaceSensitivity: css | strict | ignore,
    insertPragma: Boolean,
    jsxBracketSameLine: Boolean,
    jsxSingleQuote: Boolean,
    parser: (LiteralUnion[BuiltInParserName, String]) | CustomParser,
    pluginSearchDirs: js.Array[String] | `false`,
    plugins: js.Array[String | Plugin[Any]],
    printWidth: Double,
    proseWrap: always | never | preserve,
    quoteProps: `as-needed` | consistent | preserve,
    rangeEnd: Double,
    rangeStart: Double,
    requirePragma: Boolean,
    semi: Boolean,
    singleAttributePerLine: Boolean,
    singleQuote: Boolean,
    tabWidth: Double,
    trailingComma: none | es5 | all,
    useTabs: Boolean,
    vueIndentScriptAndStyle: Boolean
  ): RequiredOptions = {
    val __obj = js.Dynamic.literal(arrowParens = arrowParens.asInstanceOf[js.Any], bracketSameLine = bracketSameLine.asInstanceOf[js.Any], bracketSpacing = bracketSpacing.asInstanceOf[js.Any], embeddedLanguageFormatting = embeddedLanguageFormatting.asInstanceOf[js.Any], endOfLine = endOfLine.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], htmlWhitespaceSensitivity = htmlWhitespaceSensitivity.asInstanceOf[js.Any], insertPragma = insertPragma.asInstanceOf[js.Any], jsxBracketSameLine = jsxBracketSameLine.asInstanceOf[js.Any], jsxSingleQuote = jsxSingleQuote.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], pluginSearchDirs = pluginSearchDirs.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printWidth = printWidth.asInstanceOf[js.Any], proseWrap = proseWrap.asInstanceOf[js.Any], quoteProps = quoteProps.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], requirePragma = requirePragma.asInstanceOf[js.Any], semi = semi.asInstanceOf[js.Any], singleAttributePerLine = singleAttributePerLine.asInstanceOf[js.Any], singleQuote = singleQuote.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], trailingComma = trailingComma.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any], vueIndentScriptAndStyle = vueIndentScriptAndStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredOptions]
  }
  
  extension [Self <: RequiredOptions](x: Self) {
    
    inline def setArrowParens(value: avoid | always): Self = StObject.set(x, "arrowParens", value.asInstanceOf[js.Any])
    
    inline def setBracketSameLine(value: Boolean): Self = StObject.set(x, "bracketSameLine", value.asInstanceOf[js.Any])
    
    inline def setBracketSpacing(value: Boolean): Self = StObject.set(x, "bracketSpacing", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedLanguageFormatting(value: auto | off): Self = StObject.set(x, "embeddedLanguageFormatting", value.asInstanceOf[js.Any])
    
    inline def setEndOfLine(value: auto | lf | crlf | cr): Self = StObject.set(x, "endOfLine", value.asInstanceOf[js.Any])
    
    inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
    
    inline def setHtmlWhitespaceSensitivity(value: css | strict | ignore): Self = StObject.set(x, "htmlWhitespaceSensitivity", value.asInstanceOf[js.Any])
    
    inline def setInsertPragma(value: Boolean): Self = StObject.set(x, "insertPragma", value.asInstanceOf[js.Any])
    
    inline def setJsxBracketSameLine(value: Boolean): Self = StObject.set(x, "jsxBracketSameLine", value.asInstanceOf[js.Any])
    
    inline def setJsxSingleQuote(value: Boolean): Self = StObject.set(x, "jsxSingleQuote", value.asInstanceOf[js.Any])
    
    inline def setParser(value: (LiteralUnion[BuiltInParserName, String]) | CustomParser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserFunction3(value: (/* text */ String, /* parsers */ BuiltInParsers, /* options */ Options) => AST): Self = StObject.set(x, "parser", js.Any.fromFunction3(value))
    
    inline def setPluginSearchDirs(value: js.Array[String] | `false`): Self = StObject.set(x, "pluginSearchDirs", value.asInstanceOf[js.Any])
    
    inline def setPluginSearchDirsVarargs(value: String*): Self = StObject.set(x, "pluginSearchDirs", js.Array(value*))
    
    inline def setPlugins(value: js.Array[String | Plugin[Any]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: (String | Plugin[Any])*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setProseWrap(value: always | never | preserve): Self = StObject.set(x, "proseWrap", value.asInstanceOf[js.Any])
    
    inline def setQuoteProps(value: `as-needed` | consistent | preserve): Self = StObject.set(x, "quoteProps", value.asInstanceOf[js.Any])
    
    inline def setRangeEnd(value: Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    inline def setRangeStart(value: Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    inline def setRequirePragma(value: Boolean): Self = StObject.set(x, "requirePragma", value.asInstanceOf[js.Any])
    
    inline def setSemi(value: Boolean): Self = StObject.set(x, "semi", value.asInstanceOf[js.Any])
    
    inline def setSingleAttributePerLine(value: Boolean): Self = StObject.set(x, "singleAttributePerLine", value.asInstanceOf[js.Any])
    
    inline def setSingleQuote(value: Boolean): Self = StObject.set(x, "singleQuote", value.asInstanceOf[js.Any])
    
    inline def setTrailingComma(value: none | es5 | all): Self = StObject.set(x, "trailingComma", value.asInstanceOf[js.Any])
    
    inline def setVueIndentScriptAndStyle(value: Boolean): Self = StObject.set(x, "vueIndentScriptAndStyle", value.asInstanceOf[js.Any])
  }
}
