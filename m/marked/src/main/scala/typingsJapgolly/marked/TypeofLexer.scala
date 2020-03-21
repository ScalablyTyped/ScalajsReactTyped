package typingsJapgolly.marked

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.marked.mod.Lexer_
import typingsJapgolly.marked.mod.MarkedOptions
import typingsJapgolly.marked.mod.Rules
import typingsJapgolly.marked.mod.TokensList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofLexer
  extends Instantiable0[Lexer_]
     with Instantiable1[/* options */ MarkedOptions, Lexer_] {
  var rules: Rules = js.native
  def lex(src: TokensList): TokensList = js.native
  def lex(src: TokensList, options: MarkedOptions): TokensList = js.native
}

