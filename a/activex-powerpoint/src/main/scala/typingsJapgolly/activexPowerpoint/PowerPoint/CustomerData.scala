package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.CustomXMLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CustomerData")
@js.native
class CustomerData protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.CustomerData_typekey")
  var PowerPointDotCustomerData_typekey: CustomerData = js.native
  def Add(): CustomXMLPart = js.native
  def Delete(Id: String): Unit = js.native
  def Item(Id: String): CustomXMLPart = js.native
}

