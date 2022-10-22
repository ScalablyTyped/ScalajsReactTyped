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

trait ParserOptions[T]
  extends StObject
     with RequiredOptions {
  
  def locEnd(node: T): Double
  
  def locStart(node: T): Double
  
  var originalText: String
}
object ParserOptions {
  
  inline def apply[T](
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
    locEnd: T => Double,
    locStart: T => Double,
    originalText: String,
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
  ): ParserOptions[T] = {
    val __obj = js.Dynamic.literal(arrowParens = arrowParens.asInstanceOf[js.Any], bracketSameLine = bracketSameLine.asInstanceOf[js.Any], bracketSpacing = bracketSpacing.asInstanceOf[js.Any], embeddedLanguageFormatting = embeddedLanguageFormatting.asInstanceOf[js.Any], endOfLine = endOfLine.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], htmlWhitespaceSensitivity = htmlWhitespaceSensitivity.asInstanceOf[js.Any], insertPragma = insertPragma.asInstanceOf[js.Any], jsxBracketSameLine = jsxBracketSameLine.asInstanceOf[js.Any], jsxSingleQuote = jsxSingleQuote.asInstanceOf[js.Any], locEnd = js.Any.fromFunction1(locEnd), locStart = js.Any.fromFunction1(locStart), originalText = originalText.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], pluginSearchDirs = pluginSearchDirs.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printWidth = printWidth.asInstanceOf[js.Any], proseWrap = proseWrap.asInstanceOf[js.Any], quoteProps = quoteProps.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], requirePragma = requirePragma.asInstanceOf[js.Any], semi = semi.asInstanceOf[js.Any], singleAttributePerLine = singleAttributePerLine.asInstanceOf[js.Any], singleQuote = singleQuote.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], trailingComma = trailingComma.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any], vueIndentScriptAndStyle = vueIndentScriptAndStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions[T]]
  }
  
  extension [Self <: ParserOptions[?], T](x: Self & ParserOptions[T]) {
    
    inline def setLocEnd(value: T => Double): Self = StObject.set(x, "locEnd", js.Any.fromFunction1(value))
    
    inline def setLocStart(value: T => Double): Self = StObject.set(x, "locStart", js.Any.fromFunction1(value))
    
    inline def setOriginalText(value: String): Self = StObject.set(x, "originalText", value.asInstanceOf[js.Any])
  }
}
