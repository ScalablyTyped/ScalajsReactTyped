package typingsJapgolly.antlr4

import typingsJapgolly.antlr4.intervalSetMod.Interval
import typingsJapgolly.antlr4.parserRuleContextMod.ParserRuleContext
import typingsJapgolly.antlr4.treeTreeMod.ParseTreeVisitor
import typingsJapgolly.antlr4.treeTreeMod.RuleNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruleContextMod {
  
  @JSImport("antlr4/RuleContext", "RuleContext")
  @js.native
  open class RuleContext protected () extends RuleNode {
    def this(parent: Any, invokingState: Double) = this()
    
    def accept(visitor: ParseTreeVisitor): Unit = js.native
    
    def depth(): Double = js.native
    
    def getAltNumber(): Double = js.native
    
    def getChild(i: Double): Any = js.native
    
    def getChildCount(): Double = js.native
    
    def getPayload(): RuleContext = js.native
    
    def getRuleContext(): RuleContext = js.native
    
    def getSourceInterval(): Interval = js.native
    
    def getText(): String = js.native
    
    val invokingState: Double = js.native
    
    def isEmpty(): Boolean = js.native
    
    val parentCtx: ParserRuleContext = js.native
    
    def setAltNumber(altNumber: Double): Unit = js.native
    
    def toStringTree(ruleNames: js.Array[String], recog: Any): String = js.native
  }
}
