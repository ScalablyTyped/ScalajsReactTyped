package typingsJapgolly.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Stores")
@js.native
class Stores protected () extends js.Object {
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.Stores_typekey")
  var OutlookDotStores_typekey: Stores = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Item(Index: js.Any): Store = js.native
}

