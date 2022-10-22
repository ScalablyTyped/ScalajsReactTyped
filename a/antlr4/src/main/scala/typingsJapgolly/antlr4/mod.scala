package typingsJapgolly.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("antlr4", "CommonToken")
  @js.native
  open class CommonToken protected ()
    extends typingsJapgolly.antlr4.tokenMod.CommonToken {
    def this(source: Any, `type`: Any, channel: Any, start: Double, stop: Double) = this()
  }
  /* static members */
  object CommonToken {
    
    @JSImport("antlr4", "CommonToken.EMPTY_SOURCE")
    @js.native
    val EMPTY_SOURCE: Any = js.native
  }
  
  @JSImport("antlr4", "CommonTokenStream")
  @js.native
  open class CommonTokenStream protected ()
    extends typingsJapgolly.antlr4.commonTokenStreamMod.CommonTokenStream {
    def this(lexer: typingsJapgolly.antlr4.lexerMod.Lexer) = this()
    def this(lexer: typingsJapgolly.antlr4.lexerMod.Lexer, channel: Any) = this()
  }
  
  @JSImport("antlr4", "InputStream")
  @js.native
  open class InputStream protected ()
    extends typingsJapgolly.antlr4.inputStreamMod.InputStream {
    def this(data: String) = this()
    def this(data: String, decodeToUnicodeCodePoints: Boolean) = this()
  }
  
  @JSImport("antlr4", "Interval")
  @js.native
  open class Interval protected ()
    extends typingsJapgolly.antlr4.intervalSetMod.Interval {
    def this(start: Double, stop: Double) = this()
  }
  
  @JSImport("antlr4", "IntervalSet")
  @js.native
  open class IntervalSet ()
    extends typingsJapgolly.antlr4.intervalSetMod.IntervalSet
  
  @JSImport("antlr4", "Lexer")
  @js.native
  open class Lexer ()
    extends typingsJapgolly.antlr4.lexerMod.Lexer
  /* static members */
  object Lexer {
    
    @JSImport("antlr4", "Lexer.DEFAULT_MODE")
    @js.native
    val DEFAULT_MODE: Double = js.native
    
    @JSImport("antlr4", "Lexer.DEFAULT_TOKEN_CHANNEL")
    @js.native
    val DEFAULT_TOKEN_CHANNEL: Any = js.native
    
    @JSImport("antlr4", "Lexer.HIDDEN")
    @js.native
    val HIDDEN: Any = js.native
    
    @JSImport("antlr4", "Lexer.MAX_CHAR_VALUE")
    @js.native
    val MAX_CHAR_VALUE: Double = js.native
    
    @JSImport("antlr4", "Lexer.MIN_CHAR_VALUE")
    @js.native
    val MIN_CHAR_VALUE: Double = js.native
    
    @JSImport("antlr4", "Lexer.MORE")
    @js.native
    val MORE: Double = js.native
    
    @JSImport("antlr4", "Lexer.SKIP")
    @js.native
    val SKIP: Double = js.native
  }
  
  @JSImport("antlr4", "Parser")
  @js.native
  open class Parser protected ()
    extends typingsJapgolly.antlr4.parserMod.Parser {
    def this(input: typingsJapgolly.antlr4.commonTokenStreamMod.CommonTokenStream) = this()
  }
  
  @JSImport("antlr4", "ParserRuleContext")
  @js.native
  open class ParserRuleContext protected ()
    extends typingsJapgolly.antlr4.parserRuleContextMod.ParserRuleContext {
    def this(parent: Any, invokingState: Double) = this()
  }
  /* static members */
  object ParserRuleContext {
    
    @JSImport("antlr4", "ParserRuleContext.EMPTY")
    @js.native
    val EMPTY: typingsJapgolly.antlr4.parserRuleContextMod.ParserRuleContext = js.native
  }
  
  @JSImport("antlr4", "Recognizer")
  @js.native
  open class Recognizer ()
    extends typingsJapgolly.antlr4.recognizerMod.Recognizer
  
  @JSImport("antlr4", "Token")
  @js.native
  open class Token ()
    extends typingsJapgolly.antlr4.tokenMod.Token
  /* static members */
  object Token {
    
    @JSImport("antlr4", "Token.EOF")
    @js.native
    val EOF: Double = js.native
    
    @JSImport("antlr4", "Token.EPSILON")
    @js.native
    val EPSILON: Double = js.native
    
    @JSImport("antlr4", "Token.HIDDEN_CHANNEL")
    @js.native
    val HIDDEN_CHANNEL: Double = js.native
    
    @JSImport("antlr4", "Token.INVALID_TYPE")
    @js.native
    val INVALID_TYPE: Double = js.native
    
    @JSImport("antlr4", "Token.MIN_USER_TOKEN_TYPE")
    @js.native
    val MIN_USER_TOKEN_TYPE: Double = js.native
  }
  
  object tree {
    
    @JSImport("antlr4", "tree.ErrorNode")
    @js.native
    open class ErrorNode protected ()
      extends typingsJapgolly.antlr4.treeTreeMod.ErrorNode {
      def this(symbol: typingsJapgolly.antlr4.tokenMod.Token) = this()
    }
    
    @JSImport("antlr4", "tree.ErrorNodeImpl")
    @js.native
    open class ErrorNodeImpl protected ()
      extends typingsJapgolly.antlr4.treeTreeMod.ErrorNodeImpl {
      def this(token: typingsJapgolly.antlr4.tokenMod.Token) = this()
    }
    
    @JSImport("antlr4", "tree.INVALID_INTERVAL")
    @js.native
    val INVALID_INTERVAL: typingsJapgolly.antlr4.intervalSetMod.Interval = js.native
    
    @JSImport("antlr4", "tree.ParseTree")
    @js.native
    open class ParseTree ()
      extends typingsJapgolly.antlr4.treeTreeMod.ParseTree
    
    @JSImport("antlr4", "tree.ParseTreeVisitor")
    @js.native
    open class ParseTreeVisitor ()
      extends typingsJapgolly.antlr4.treeTreeMod.ParseTreeVisitor
    
    @JSImport("antlr4", "tree.ParseTreeWalker")
    @js.native
    open class ParseTreeWalker ()
      extends typingsJapgolly.antlr4.treeTreeMod.ParseTreeWalker
    /* static members */
    object ParseTreeWalker {
      
      @JSImport("antlr4", "tree.ParseTreeWalker.DEFAULT")
      @js.native
      val DEFAULT: typingsJapgolly.antlr4.treeTreeMod.ParseTreeWalker = js.native
    }
    
    @JSImport("antlr4", "tree.RuleNode")
    @js.native
    open class RuleNode ()
      extends typingsJapgolly.antlr4.treeTreeMod.RuleNode
    
    @JSImport("antlr4", "tree.TerminalNode")
    @js.native
    open class TerminalNode protected ()
      extends typingsJapgolly.antlr4.treeTreeMod.TerminalNode {
      def this(symbol: typingsJapgolly.antlr4.tokenMod.Token) = this()
    }
    
    @JSImport("antlr4", "tree.TerminalNodeImpl")
    @js.native
    open class TerminalNodeImpl protected ()
      extends typingsJapgolly.antlr4.treeTreeMod.TerminalNodeImpl {
      def this(symbol: typingsJapgolly.antlr4.tokenMod.Token) = this()
    }
  }
  
  type AntlrRule = typingsJapgolly.antlr4.parserRuleContextMod.ParserRuleContext
}
