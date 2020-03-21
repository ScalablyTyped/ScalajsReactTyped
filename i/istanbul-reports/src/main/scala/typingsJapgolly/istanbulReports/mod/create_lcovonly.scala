package typingsJapgolly.istanbulReports.mod

import typingsJapgolly.istanbulLibReport.mod.Node
import typingsJapgolly.istanbulLibReport.mod.Visitor
import typingsJapgolly.istanbulReports.istanbulReportsStrings.lcovonly
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_lcovonly extends js.Object {
  def apply(name: lcovonly): Visitor[Node] = js.native
  def apply(name: lcovonly, options: Partial[Options]): Visitor[Node] = js.native
}

