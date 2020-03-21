package typingsJapgolly.istanbulReports.mod

import typingsJapgolly.istanbulLibReport.mod.Node
import typingsJapgolly.istanbulLibReport.mod.Visitor
import typingsJapgolly.istanbulReports.istanbulReportsStrings.`text-summary`
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_textsummary extends js.Object {
  def apply(name: `text-summary`): Visitor[Node] = js.native
  def apply(name: `text-summary`, options: Partial[Options]): Visitor[Node] = js.native
}

