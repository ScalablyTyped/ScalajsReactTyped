package typingsJapgolly.istanbulReports.mod

import typingsJapgolly.istanbulLibReport.mod.Node
import typingsJapgolly.istanbulLibReport.mod.Visitor
import typingsJapgolly.istanbulReports.istanbulReportsStrings.cobertura
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_cobertura extends js.Object {
  def apply(name: cobertura): Visitor[Node] = js.native
  def apply(name: cobertura, options: Partial[RootedOptions]): Visitor[Node] = js.native
}

