package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The granularity of one 'step' in the stepping requests `next`, `stepIn`, `stepOut`, and `stepBack`.
		'statement': The step should allow the program to run until the current statement has finished executing.
		The meaning of a statement is determined by the adapter and it may be considered equivalent to a line.
		For example 'for(int i = 0; i < 10; i++)' could be considered to have 3 statements 'int i = 0', 'i < 10', and 'i++'.
		'line': The step should allow the program to run until the current source line has executed.
		'instruction': The step should allow one instruction to execute (e.g. one x86 instruction).
	*/
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.statement
  - typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.line
  - typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.instruction
*/
trait SteppingGranularity extends StObject
object SteppingGranularity {
  
  inline def instruction: typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.instruction = "instruction".asInstanceOf[typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.instruction]
  
  inline def line: typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.line = "line".asInstanceOf[typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.line]
  
  inline def statement: typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.statement = "statement".asInstanceOf[typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.statement]
}
