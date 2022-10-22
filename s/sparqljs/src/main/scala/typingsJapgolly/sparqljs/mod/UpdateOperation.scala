package typingsJapgolly.sparqljs.mod

import typingsJapgolly.sparqljs.sparqljsBooleans.`false`
import typingsJapgolly.sparqljs.sparqljsStrings.add
import typingsJapgolly.sparqljs.sparqljsStrings.clear
import typingsJapgolly.sparqljs.sparqljsStrings.copy
import typingsJapgolly.sparqljs.sparqljsStrings.delete
import typingsJapgolly.sparqljs.sparqljsStrings.deletewhere
import typingsJapgolly.sparqljs.sparqljsStrings.drop
import typingsJapgolly.sparqljs.sparqljsStrings.insert
import typingsJapgolly.sparqljs.sparqljsStrings.insertdelete
import typingsJapgolly.sparqljs.sparqljsStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sparqljs.mod.InsertDeleteOperation
  - typingsJapgolly.sparqljs.mod.ManagementOperation
*/
trait UpdateOperation extends StObject
object UpdateOperation {
  
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
  
  inline def InsertDeleteOperation(updateType: insert | delete | deletewhere | insertdelete): typingsJapgolly.sparqljs.mod.InsertDeleteOperation = {
    val __obj = js.Dynamic.literal(updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.InsertDeleteOperation]
  }
  
  inline def LoadOperation(destination: IriTerm | `false`, silent: Boolean, source: IriTerm): typingsJapgolly.sparqljs.mod.LoadOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("load")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.LoadOperation]
  }
}
