package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsCellMod.CellError
import typingsJapgolly.hyperformula.typingsParserAstMod.ParsingError_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyGraphParsingErrorVertexMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/ParsingErrorVertex", "ParsingErrorVertex")
  @js.native
  open class ParsingErrorVertex protected () extends StObject {
    def this(errors: js.Array[ParsingError_], rawInput: String) = this()
    
    val errors: js.Array[ParsingError_] = js.native
    
    def getCellValue(): CellError = js.native
    
    def getFormula(): String = js.native
    
    val rawInput: String = js.native
  }
}
