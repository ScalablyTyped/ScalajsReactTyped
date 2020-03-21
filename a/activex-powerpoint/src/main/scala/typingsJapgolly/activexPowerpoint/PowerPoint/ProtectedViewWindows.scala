package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ProtectedViewWindows")
@js.native
class ProtectedViewWindows protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ProtectedViewWindows_typekey")
  var PowerPointDotProtectedViewWindows_typekey: ProtectedViewWindows = js.native
  def Item(Index: Double): ProtectedViewWindow = js.native
  /**
    * @param string [ReadPassword='']
    * @param Office.MsoTriState [OpenAndRepair=0]
    */
  def Open(FileName: String): ProtectedViewWindow = js.native
  def Open(FileName: String, ReadPassword: String): ProtectedViewWindow = js.native
  def Open(FileName: String, ReadPassword: String, OpenAndRepair: MsoTriState): ProtectedViewWindow = js.native
}

