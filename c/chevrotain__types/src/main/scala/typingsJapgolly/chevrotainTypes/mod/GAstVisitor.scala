package typingsJapgolly.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@chevrotain/types", "GAstVisitor")
@js.native
open class GAstVisitor () extends StObject {
  
  def visit(node: IProduction): Any = js.native
  
  def visitAlternation(node: Alternation): Any = js.native
  
  def visitAlternative(node: Alternative): Any = js.native
  
  def visitNonTerminal(node: NonTerminal): Any = js.native
  
  def visitOption(node: Option): Any = js.native
  
  def visitRepetition(node: Repetition): Any = js.native
  
  def visitRepetitionMandatory(node: RepetitionMandatory): Any = js.native
  
  def visitRepetitionMandatoryWithSeparator(node: RepetitionMandatoryWithSeparator): Any = js.native
  
  def visitRepetitionWithSeparator(node: RepetitionWithSeparator): Any = js.native
  
  def visitRule(node: Rule): Any = js.native
  
  def visitTerminal(node: Terminal): Any = js.native
}
