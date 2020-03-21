package typingsJapgolly.antlr4

import typingsJapgolly.antlr4.bufferedTokenStreamMod.BufferedTokenStream
import typingsJapgolly.antlr4.lexerMod.Lexer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/CommonTokenStream", JSImport.Namespace)
@js.native
object commonTokenStreamMod extends js.Object {
  @js.native
  class CommonTokenStream protected () extends BufferedTokenStream {
    def this(lexer: Lexer) = this()
    def this(lexer: Lexer, channel: js.Any) = this()
    def getNumberOfOnChannelTokens(): Double = js.native
  }
  
}

