package typingsJapgolly.antlr4.treeMod

import typingsJapgolly.antlr4.tokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/tree/Tree", "ErrorNodeImpl")
@js.native
class ErrorNodeImpl protected () extends TerminalNode {
  def this(token: Token) = this()
  def isErrorNode(): Boolean = js.native
}

