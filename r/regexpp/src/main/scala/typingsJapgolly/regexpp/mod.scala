package typingsJapgolly.regexpp

import typingsJapgolly.regexpp.astMod.Node
import typingsJapgolly.regexpp.astMod.RegExpLiteral
import typingsJapgolly.regexpp.parserMod.RegExpParser.Options
import typingsJapgolly.regexpp.visitorMod.RegExpVisitor.Handlers
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("regexpp", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RegExpParser ()
    extends typingsJapgolly.regexpp.parserMod.RegExpParser {
    def this(options: Options) = this()
  }
  
  @js.native
  class RegExpValidator ()
    extends typingsJapgolly.regexpp.validatorMod.RegExpValidator {
    def this(options: typingsJapgolly.regexpp.validatorMod.RegExpValidator.Options) = this()
  }
  
  def parseRegExpLiteral(source: String): RegExpLiteral = js.native
  def parseRegExpLiteral(source: String, options: Options): RegExpLiteral = js.native
  def parseRegExpLiteral(source: RegExp): RegExpLiteral = js.native
  def parseRegExpLiteral(source: RegExp, options: Options): RegExpLiteral = js.native
  def validateRegExpLiteral(source: String): Unit = js.native
  def validateRegExpLiteral(source: String, options: typingsJapgolly.regexpp.validatorMod.RegExpValidator.Options): Unit = js.native
  def visitRegExpAST(node: Node, handlers: Handlers): Unit = js.native
}

