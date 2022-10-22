package typingsJapgolly.sparqljs.mod

import typingsJapgolly.sparqljs.sparqljsBooleans.`false`
import typingsJapgolly.sparqljs.sparqljsStrings.add
import typingsJapgolly.sparqljs.sparqljsStrings.clear
import typingsJapgolly.sparqljs.sparqljsStrings.copy
import typingsJapgolly.sparqljs.sparqljsStrings.drop
import typingsJapgolly.sparqljs.sparqljsStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sparqljs.mod.CopyMoveAddOperation
  - typingsJapgolly.sparqljs.mod.LoadOperation
  - typingsJapgolly.sparqljs.mod.CreateOperation
  - typingsJapgolly.sparqljs.mod.ClearDropOperation
*/
trait ManagementOperation
  extends StObject
     with UpdateOperation
object ManagementOperation {
  
  inline def ClearDropOperation(graph: GraphReference, silent: Boolean, `type`: clear | drop): typingsJapgolly.sparqljs.mod.ClearDropOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.ClearDropOperation]
  }
  
  inline def CopyMoveAddOperation(destination: GraphOrDefault, silent: Boolean, source: GraphOrDefault, `type`: copy | move | add): typingsJapgolly.sparqljs.mod.CopyMoveAddOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.CopyMoveAddOperation]
  }
  
  inline def CreateOperation(graph: IriTerm, silent: Boolean): typingsJapgolly.sparqljs.mod.CreateOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("create")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.CreateOperation]
  }
  
  inline def LoadOperation(destination: IriTerm | `false`, silent: Boolean, source: IriTerm): typingsJapgolly.sparqljs.mod.LoadOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("load")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.LoadOperation]
  }
}
