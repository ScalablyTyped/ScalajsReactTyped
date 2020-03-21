package typingsJapgolly.istanbulReports.mod

import typingsJapgolly.istanbulLibReport.mod.Node
import typingsJapgolly.istanbulLibReport.mod.Visitor
import typingsJapgolly.istanbulReports.istanbulReportsStrings.lcov
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_lcov extends js.Object {
  def apply(name: lcov): Visitor[Node] = js.native
  def apply(name: lcov, options: Partial[scala.Nothing]): Visitor[Node] = js.native
}

