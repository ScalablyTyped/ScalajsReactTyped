package typingsJapgolly.istanbulReports.mod

import typingsJapgolly.istanbulLibReport.mod.Node
import typingsJapgolly.istanbulLibReport.mod.Visitor
import typingsJapgolly.istanbulReports.istanbulReportsStrings.`json-summary`
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_jsonsummary extends js.Object {
  def apply(name: `json-summary`): Visitor[Node] = js.native
  def apply(name: `json-summary`, options: Partial[Options]): Visitor[Node] = js.native
}

