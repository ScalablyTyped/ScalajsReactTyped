package typingsJapgolly.antlr4.treeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antlr4.parserRuleContextMod.ParserRuleContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseTreeListener extends js.Object {
  def enterEveryRule(node: ParserRuleContext): Unit
  def exitEveryRule(node: ParserRuleContext): Unit
  def visitErrorNode(node: ErrorNode): Unit
  def visitTerminal(node: TerminalNode): Unit
}

object ParseTreeListener {
  @scala.inline
  def apply(
    enterEveryRule: ParserRuleContext => Callback,
    exitEveryRule: ParserRuleContext => Callback,
    visitErrorNode: ErrorNode => Callback,
    visitTerminal: TerminalNode => Callback
  ): ParseTreeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enterEveryRule")(js.Any.fromFunction1((t0: typingsJapgolly.antlr4.parserRuleContextMod.ParserRuleContext) => enterEveryRule(t0).runNow()))
    __obj.updateDynamic("exitEveryRule")(js.Any.fromFunction1((t0: typingsJapgolly.antlr4.parserRuleContextMod.ParserRuleContext) => exitEveryRule(t0).runNow()))
    __obj.updateDynamic("visitErrorNode")(js.Any.fromFunction1((t0: typingsJapgolly.antlr4.treeMod.ErrorNode) => visitErrorNode(t0).runNow()))
    __obj.updateDynamic("visitTerminal")(js.Any.fromFunction1((t0: typingsJapgolly.antlr4.treeMod.TerminalNode) => visitTerminal(t0).runNow()))
    __obj.asInstanceOf[ParseTreeListener]
  }
}

