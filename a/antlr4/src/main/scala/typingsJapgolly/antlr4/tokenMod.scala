package typingsJapgolly.antlr4

import typingsJapgolly.antlr4.inputStreamMod.InputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  @JSImport("antlr4/Token", "CommonToken")
  @js.native
  open class CommonToken protected () extends Token {
    def this(source: Any, `type`: Any, channel: Any, start: Double, stop: Double) = this()
  }
  /* static members */
  object CommonToken {
    
    @JSImport("antlr4/Token", "CommonToken.EMPTY_SOURCE")
    @js.native
    val EMPTY_SOURCE: Any = js.native
  }
  
  @JSImport("antlr4/Token", "Token")
  @js.native
  open class Token () extends StObject {
    
    var channel: Any = js.native
    
    var column: Double = js.native
    
    def getInputStream(): InputStream = js.native
    
    def getTokenSource(): Any = js.native
    
    var line: Double = js.native
    
    var source: Any = js.native
    
    var start: Double = js.native
    
    var stop: Double = js.native
    
    val text: String = js.native
    
    var tokenIndex: Double = js.native
    
    var `type`: Any = js.native
  }
  /* static members */
  object Token {
    
    @JSImport("antlr4/Token", "Token.EOF")
    @js.native
    val EOF: Double = js.native
    
    @JSImport("antlr4/Token", "Token.EPSILON")
    @js.native
    val EPSILON: Double = js.native
    
    @JSImport("antlr4/Token", "Token.HIDDEN_CHANNEL")
    @js.native
    val HIDDEN_CHANNEL: Double = js.native
    
    @JSImport("antlr4/Token", "Token.INVALID_TYPE")
    @js.native
    val INVALID_TYPE: Double = js.native
    
    @JSImport("antlr4/Token", "Token.MIN_USER_TOKEN_TYPE")
    @js.native
    val MIN_USER_TOKEN_TYPE: Double = js.native
  }
}
