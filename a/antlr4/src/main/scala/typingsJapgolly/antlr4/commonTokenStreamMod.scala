package typingsJapgolly.antlr4

import typingsJapgolly.antlr4.bufferedTokenStreamMod.BufferedTokenStream
import typingsJapgolly.antlr4.lexerMod.Lexer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTokenStreamMod {
  
  @JSImport("antlr4/CommonTokenStream", "CommonTokenStream")
  @js.native
  open class CommonTokenStream protected () extends BufferedTokenStream {
    def this(lexer: Lexer) = this()
    def this(lexer: Lexer, channel: Any) = this()
    
    def getNumberOfOnChannelTokens(): Double = js.native
  }
}
