package typingsJapgolly.istanbulReports.mod

import typingsJapgolly.istanbulLibReport.mod.Node
import typingsJapgolly.istanbulLibReport.mod.Visitor
import typingsJapgolly.istanbulReports.OptionsmaxColsnumber
import typingsJapgolly.istanbulReports.istanbulReportsStrings.text
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_text extends js.Object {
  def apply(name: text): Visitor[Node] = js.native
  def apply(name: text, options: Partial[OptionsmaxColsnumber]): Visitor[Node] = js.native
}

