package typingsJapgolly.cassandraDriver.graphMod.graph

import typingsJapgolly.cassandraDriver.typesMod.types.ResultSet
import typingsJapgolly.std.Iterator
import typingsJapgolly.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/datastax/graph", "graph.GraphResultSet")
@js.native
class GraphResultSet protected ()
  extends Iterator[js.Any, js.Any, js.UndefOr[scala.Nothing]] {
  def this(rs: ResultSet) = this()
  def first(): js.Any = js.native
  def next(): IteratorResult[_, _] = js.native
  def next(value: js.Any): IteratorResult[_, _] = js.native
  def toArray(): js.Array[_] = js.native
  def values(): js.Iterator[_] = js.native
}

