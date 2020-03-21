package typingsJapgolly.sparqljs.mod

import typingsJapgolly.sparqljs.sparqljsStrings.delete
import typingsJapgolly.sparqljs.sparqljsStrings.deletewhere
import typingsJapgolly.sparqljs.sparqljsStrings.insert
import typingsJapgolly.sparqljs.sparqljsStrings.insertdelete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertDeleteOperation extends UpdateOperation {
  var delete: js.UndefOr[js.Array[Quads]] = js.undefined
  var graph: js.UndefOr[String] = js.undefined
  var insert: js.UndefOr[js.Array[Quads]] = js.undefined
  var updateType: insert | delete | deletewhere | insertdelete
  var where: js.UndefOr[js.Array[Pattern]] = js.undefined
}

object InsertDeleteOperation {
  @scala.inline
  def apply(
    updateType: insert | delete | deletewhere | insertdelete,
    delete: js.Array[Quads] = null,
    graph: String = null,
    insert: js.Array[Quads] = null,
    where: js.Array[Pattern] = null
  ): InsertDeleteOperation = {
    val __obj = js.Dynamic.literal(updateType = updateType.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertDeleteOperation]
  }
}

