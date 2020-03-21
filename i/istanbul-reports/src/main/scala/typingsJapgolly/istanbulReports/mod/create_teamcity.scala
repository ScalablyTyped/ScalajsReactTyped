package typingsJapgolly.istanbulReports.mod

import typingsJapgolly.istanbulLibReport.mod.Node
import typingsJapgolly.istanbulLibReport.mod.Visitor
import typingsJapgolly.istanbulReports.OptionsblockNamestring
import typingsJapgolly.istanbulReports.istanbulReportsStrings.teamcity
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_teamcity extends js.Object {
  def apply(name: teamcity): Visitor[Node] = js.native
  def apply(name: teamcity, options: Partial[OptionsblockNamestring]): Visitor[Node] = js.native
}

