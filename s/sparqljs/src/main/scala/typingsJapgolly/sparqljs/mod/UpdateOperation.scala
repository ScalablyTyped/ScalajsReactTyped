package typingsJapgolly.sparqljs.mod

import typingsJapgolly.sparqljs.sparqljsBooleans.`false`
import typingsJapgolly.sparqljs.sparqljsStrings.add
import typingsJapgolly.sparqljs.sparqljsStrings.clear
import typingsJapgolly.sparqljs.sparqljsStrings.copy
import typingsJapgolly.sparqljs.sparqljsStrings.create
import typingsJapgolly.sparqljs.sparqljsStrings.delete
import typingsJapgolly.sparqljs.sparqljsStrings.deletewhere
import typingsJapgolly.sparqljs.sparqljsStrings.drop
import typingsJapgolly.sparqljs.sparqljsStrings.insert
import typingsJapgolly.sparqljs.sparqljsStrings.insertdelete
import typingsJapgolly.sparqljs.sparqljsStrings.load
import typingsJapgolly.sparqljs.sparqljsStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sparqljs.mod.InsertDeleteOperation
  - typingsJapgolly.sparqljs.mod.ManagementOperation
*/
trait UpdateOperation extends js.Object

object UpdateOperation {
  @scala.inline
  def ClearDropOperation(graph: GraphReference, silent: Boolean, `type`: clear | drop): UpdateOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
  @scala.inline
  def LoadOperation(destination: String | `false`, silent: Boolean, source: String, `type`: load): UpdateOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
  @scala.inline
  def CopyMoveAddOperation(destination: GraphOrDefault, silent: Boolean, source: GraphOrDefault, `type`: copy | move | add): UpdateOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
  @scala.inline
  def InsertDeleteOperation(
    updateType: insert | delete | deletewhere | insertdelete,
    delete: js.Array[Quads] = null,
    graph: String = null,
    insert: js.Array[Quads] = null,
    where: js.Array[Pattern] = null
  ): UpdateOperation = {
    val __obj = js.Dynamic.literal(updateType = updateType.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
  @scala.inline
  def CreateOperation(graph: String, silent: Boolean, `type`: create): UpdateOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
}

