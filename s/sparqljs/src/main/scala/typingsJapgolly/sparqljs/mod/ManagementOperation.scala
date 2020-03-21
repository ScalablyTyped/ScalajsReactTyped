package typingsJapgolly.sparqljs.mod

import typingsJapgolly.sparqljs.sparqljsBooleans.`false`
import typingsJapgolly.sparqljs.sparqljsStrings.add
import typingsJapgolly.sparqljs.sparqljsStrings.clear
import typingsJapgolly.sparqljs.sparqljsStrings.copy
import typingsJapgolly.sparqljs.sparqljsStrings.create
import typingsJapgolly.sparqljs.sparqljsStrings.drop
import typingsJapgolly.sparqljs.sparqljsStrings.load
import typingsJapgolly.sparqljs.sparqljsStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sparqljs.mod.CopyMoveAddOperation
  - typingsJapgolly.sparqljs.mod.LoadOperation
  - typingsJapgolly.sparqljs.mod.CreateOperation
  - typingsJapgolly.sparqljs.mod.ClearDropOperation
*/
trait ManagementOperation extends UpdateOperation

object ManagementOperation {
  @scala.inline
  def CopyMoveAddOperation(destination: GraphOrDefault, silent: Boolean, source: GraphOrDefault, `type`: copy | move | add): ManagementOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementOperation]
  }
  @scala.inline
  def LoadOperation(destination: String | `false`, silent: Boolean, source: String, `type`: load): ManagementOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementOperation]
  }
  @scala.inline
  def CreateOperation(graph: String, silent: Boolean, `type`: create): ManagementOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementOperation]
  }
  @scala.inline
  def ClearDropOperation(graph: GraphReference, silent: Boolean, `type`: clear | drop): ManagementOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementOperation]
  }
}

