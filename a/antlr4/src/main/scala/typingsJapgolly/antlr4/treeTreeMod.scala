package typingsJapgolly.antlr4

import japgolly.scalajs.react.Callback
import typingsJapgolly.antlr4.intervalSetMod.Interval
import typingsJapgolly.antlr4.parserRuleContextMod.ParserRuleContext
import typingsJapgolly.antlr4.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeTreeMod {
  
  @JSImport("antlr4/tree/Tree", "ErrorNode")
  @js.native
  open class ErrorNode protected () extends TerminalNode {
    def this(symbol: Token) = this()
  }
  
  @JSImport("antlr4/tree/Tree", "ErrorNodeImpl")
  @js.native
  open class ErrorNodeImpl protected () extends TerminalNode {
    def this(token: Token) = this()
    
    def isErrorNode(): Boolean = js.native
  }
  
  @JSImport("antlr4/tree/Tree", "INVALID_INTERVAL")
  @js.native
  val INVALID_INTERVAL: Interval = js.native
  
  @JSImport("antlr4/tree/Tree", "ParseTree")
  @js.native
  open class ParseTree () extends StObject
  
  @JSImport("antlr4/tree/Tree", "ParseTreeVisitor")
  @js.native
  open class ParseTreeVisitor () extends StObject {
    
    def visit(ctx: ParserRuleContext): Any = js.native
    
    def visitChildren(ctx: ParserRuleContext): Any = js.native
    
    def visitErrorNode(node: ErrorNode): Any = js.native
    
    def visitTerminal(node: TerminalNode): Any = js.native
  }
  
  @JSImport("antlr4/tree/Tree", "ParseTreeWalker")
  @js.native
  open class ParseTreeWalker () extends StObject {
    
    def enterRule(listener: ParseTreeListener, rule: Any): Unit = js.native
    
    def exitRule(listener: ParseTreeListener, rule: Any): Unit = js.native
    
    def walk(listener: ParseTreeListener, rule: Any): Unit = js.native
  }
  /* static members */
  object ParseTreeWalker {
    
    @JSImport("antlr4/tree/Tree", "ParseTreeWalker.DEFAULT")
    @js.native
    val DEFAULT: ParseTreeWalker = js.native
  }
  
  @JSImport("antlr4/tree/Tree", "RuleNode")
  @js.native
  open class RuleNode () extends ParseTree
  
  @JSImport("antlr4/tree/Tree", "TerminalNode")
  @js.native
  open class TerminalNode protected () extends ParseTree {
    def this(symbol: Token) = this()
    
    def accept(visitor: ParseTreeVisitor): Any = js.native
    
    def getChild(i: Double): Any = js.native
    
    def getChildCount(): Double = js.native
    
    def getParent(): Any = js.native
    
    def getPayload(): Token = js.native
    
    def getSourceInterval(): Interval = js.native
    
    def getSymbol(): Token = js.native
    
    def getText(): String = js.native
    
    val parentCtx: Any = js.native
    
    val symbol: Token = js.native
  }
  
  @JSImport("antlr4/tree/Tree", "TerminalNodeImpl")
  @js.native
  open class TerminalNodeImpl protected () extends TerminalNode {
    def this(symbol: Token) = this()
  }
  
  trait ParseTreeListener extends StObject {
    
    def enterEveryRule(node: ParserRuleContext): Unit
    
    def exitEveryRule(node: ParserRuleContext): Unit
    
    def visitErrorNode(node: ErrorNode): Unit
    
    def visitTerminal(node: TerminalNode): Unit
  }
  object ParseTreeListener {
    
    inline def apply(
      enterEveryRule: ParserRuleContext => Callback,
      exitEveryRule: ParserRuleContext => Callback,
      visitErrorNode: ErrorNode => Callback,
      visitTerminal: TerminalNode => Callback
    ): ParseTreeListener = {
      val __obj = js.Dynamic.literal(enterEveryRule = js.Any.fromFunction1((t0: ParserRuleContext) => enterEveryRule(t0).runNow()), exitEveryRule = js.Any.fromFunction1((t0: ParserRuleContext) => exitEveryRule(t0).runNow()), visitErrorNode = js.Any.fromFunction1((t0: ErrorNode) => visitErrorNode(t0).runNow()), visitTerminal = js.Any.fromFunction1((t0: TerminalNode) => visitTerminal(t0).runNow()))
      __obj.asInstanceOf[ParseTreeListener]
    }
    
    extension [Self <: ParseTreeListener](x: Self) {
      
      inline def setEnterEveryRule(value: ParserRuleContext => Callback): Self = StObject.set(x, "enterEveryRule", js.Any.fromFunction1((t0: ParserRuleContext) => value(t0).runNow()))
      
      inline def setExitEveryRule(value: ParserRuleContext => Callback): Self = StObject.set(x, "exitEveryRule", js.Any.fromFunction1((t0: ParserRuleContext) => value(t0).runNow()))
      
      inline def setVisitErrorNode(value: ErrorNode => Callback): Self = StObject.set(x, "visitErrorNode", js.Any.fromFunction1((t0: ErrorNode) => value(t0).runNow()))
      
      inline def setVisitTerminal(value: TerminalNode => Callback): Self = StObject.set(x, "visitTerminal", js.Any.fromFunction1((t0: TerminalNode) => value(t0).runNow()))
    }
  }
}
