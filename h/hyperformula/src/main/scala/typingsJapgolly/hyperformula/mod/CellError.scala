package typingsJapgolly.hyperformula.mod

import typingsJapgolly.hyperformula.typingsDependencyGraphFormulaCellVertexMod.FormulaVertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula", "CellError")
@js.native
open class CellError protected ()
  extends typingsJapgolly.hyperformula.typingsCellMod.CellError {
  def this(`type`: typingsJapgolly.hyperformula.typingsCellMod.ErrorType) = this()
  def this(`type`: typingsJapgolly.hyperformula.typingsCellMod.ErrorType, message: String) = this()
  def this(
    `type`: typingsJapgolly.hyperformula.typingsCellMod.ErrorType,
    message: String,
    root: FormulaVertex
  ) = this()
  def this(`type`: typingsJapgolly.hyperformula.typingsCellMod.ErrorType, message: Unit, root: FormulaVertex) = this()
}
/* static members */
object CellError {
  
  @JSImport("hyperformula", "CellError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parsingError(): typingsJapgolly.hyperformula.typingsCellMod.CellError = ^.asInstanceOf[js.Dynamic].applyDynamic("parsingError")().asInstanceOf[typingsJapgolly.hyperformula.typingsCellMod.CellError]
}
