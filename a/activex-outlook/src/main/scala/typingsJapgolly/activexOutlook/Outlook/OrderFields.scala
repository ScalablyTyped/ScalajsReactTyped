package typingsJapgolly.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OrderFields")
@js.native
class OrderFields protected () extends js.Object {
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.OrderFields_typekey")
  var OutlookDotOrderFields_typekey: OrderFields = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(PropertyName: String): OrderField = js.native
  def Add(PropertyName: String, IsDescending: js.Any): OrderField = js.native
  def Insert(PropertyName: String, Index: js.Any): OrderField = js.native
  def Insert(PropertyName: String, Index: js.Any, IsDescending: js.Any): OrderField = js.native
  def Item(Index: js.Any): OrderField = js.native
  def Remove(Index: js.Any): Unit = js.native
  def RemoveAll(): Unit = js.native
}

