package typingsJapgolly.cassandraDriver.typesMod.types

import typingsJapgolly.cassandraDriver.AnonAchievedConsistency
import typingsJapgolly.cassandraDriver.AnonType
import typingsJapgolly.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSet
  extends Iterator[Row, js.Any, js.UndefOr[scala.Nothing]] {
  var columns: js.Array[AnonType] = js.native
  var info: AnonAchievedConsistency = js.native
  var nextPage: js.Function0[Unit] | Null = js.native
  var pageState: String = js.native
  var rowLength: Double = js.native
  var rows: js.Array[Row] = js.native
  def first(): Row = js.native
  def wasApplied(): Boolean = js.native
}

