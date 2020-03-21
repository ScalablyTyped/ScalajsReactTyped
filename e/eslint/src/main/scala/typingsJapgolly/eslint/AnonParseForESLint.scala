package typingsJapgolly.eslint

import typingsJapgolly.eslint.mod.Linter.ESLintParseResult
import typingsJapgolly.eslint.mod.Linter.ParserModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParseForESLint extends ParserModule {
  def parseForESLint(text: String): ESLintParseResult = js.native
  def parseForESLint(text: String, options: js.Any): ESLintParseResult = js.native
}

