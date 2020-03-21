package typingsJapgolly.prettier.mod

import japgolly.scalajs.react.CallbackTo
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
import typingsJapgolly.prettier.prettierStrings.preserve
import typingsJapgolly.prettier.prettierStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends RequiredOptions {
  var originalText: String
  def locEnd(node: js.Any): Double
  def locStart(node: js.Any): Double
}

object ParserOptions {
  @scala.inline
  def apply(
    arrowParens: avoid | always,
    bracketSpacing: Boolean,
    endOfLine: auto | lf | crlf | cr,
    filepath: String,
    htmlWhitespaceSensitivity: css | strict | ignore,
    insertPragma: Boolean,
    jsxBracketSameLine: Boolean,
    jsxSingleQuote: Boolean,
    locEnd: js.Any => CallbackTo[Double],
    locStart: js.Any => CallbackTo[Double],
    originalText: String,
    parser: BuiltInParserName | CustomParser,
    plugins: js.Array[String | Plugin],
    printWidth: Double,
    proseWrap: Boolean | always | never | preserve,
    quoteProps: `as-needed` | consistent | preserve,
    rangeEnd: Double,
    rangeStart: Double,
    requirePragma: Boolean,
    semi: Boolean,
    singleQuote: Boolean,
    tabWidth: Double,
    trailingComma: none | es5 | all,
    useTabs: Boolean,
    vueIndentScriptAndStyle: Boolean
  ): ParserOptions = {
    val __obj = js.Dynamic.literal(arrowParens = arrowParens.asInstanceOf[js.Any], bracketSpacing = bracketSpacing.asInstanceOf[js.Any], endOfLine = endOfLine.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], htmlWhitespaceSensitivity = htmlWhitespaceSensitivity.asInstanceOf[js.Any], insertPragma = insertPragma.asInstanceOf[js.Any], jsxBracketSameLine = jsxBracketSameLine.asInstanceOf[js.Any], jsxSingleQuote = jsxSingleQuote.asInstanceOf[js.Any], originalText = originalText.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printWidth = printWidth.asInstanceOf[js.Any], proseWrap = proseWrap.asInstanceOf[js.Any], quoteProps = quoteProps.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], requirePragma = requirePragma.asInstanceOf[js.Any], semi = semi.asInstanceOf[js.Any], singleQuote = singleQuote.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], trailingComma = trailingComma.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any], vueIndentScriptAndStyle = vueIndentScriptAndStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("locEnd")(js.Any.fromFunction1((t0: js.Any) => locEnd(t0).runNow()))
    __obj.updateDynamic("locStart")(js.Any.fromFunction1((t0: js.Any) => locStart(t0).runNow()))
    __obj.asInstanceOf[ParserOptions]
  }
}

