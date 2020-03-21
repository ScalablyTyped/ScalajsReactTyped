package typingsJapgolly.nodal.mod

import typingsJapgolly.nodal.TypeofModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "RelationshipNode")
@js.native
class RelationshipNode protected () extends js.Object {
  def this(Graph: RelationshipGraph, mModel: TypeofModel) = this()
  var Graph: RelationshipGraph = js.native
  var Model: TypeofModel = js.native
  var edges: js.Array[RelationshipEdge] = js.native
  def cascade(): js.Array[RelationshipPath] = js.native
  def childEdges(): js.Array[RelationshipEdge] = js.native
  def find(name: String): RelationshipPath | Null = js.native
  def findExplicit(pathname: String): RelationshipPath | Null = js.native
  def joinsTo(mModel: TypeofModel, options: IOptions): RelationshipEdge | Null = js.native
}

