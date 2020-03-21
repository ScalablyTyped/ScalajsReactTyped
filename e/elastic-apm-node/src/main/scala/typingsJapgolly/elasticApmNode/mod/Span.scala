package typingsJapgolly.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Span extends GenericSpan {
  var name: String = js.native
  // The following properties and methods are currently not documented as their API isn't considered official:
  // customStackTrace(), setDbContext()
  var transaction: Transaction = js.native
  def end(): Unit = js.native
  def end(endTime: Double): Unit = js.native
}

