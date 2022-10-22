package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsCellMod.SimpleCellAddress_
import typingsJapgolly.hyperformula.typingsDependencyGraphFormulaCellVertexMod.FormulaVertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterInterpreterStateMod {
  
  @JSImport("hyperformula/typings/interpreter/InterpreterState", "InterpreterState")
  @js.native
  open class InterpreterState protected () extends StObject {
    def this(formulaAddress: SimpleCellAddress_, arraysFlag: Boolean) = this()
    def this(formulaAddress: SimpleCellAddress_, arraysFlag: Boolean, formulaVertex: FormulaVertex) = this()
    
    var arraysFlag: Boolean = js.native
    
    var formulaAddress: SimpleCellAddress_ = js.native
    
    var formulaVertex: js.UndefOr[FormulaVertex] = js.native
  }
}
