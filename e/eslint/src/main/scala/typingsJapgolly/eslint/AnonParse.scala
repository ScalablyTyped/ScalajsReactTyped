package typingsJapgolly.eslint

import typingsJapgolly.eslint.mod.AST.Program
import typingsJapgolly.eslint.mod.Linter.ParserModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParse extends ParserModule {
  def parse(text: String): Program = js.native
  def parse(text: String, options: js.Any): Program = js.native
}

