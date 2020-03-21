package typingsJapgolly.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Attachments")
@js.native
class Attachments protected () extends js.Object {
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.Attachments_typekey")
  var OutlookDotAttachments_typekey: Attachments = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Source: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: js.Any, Position: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: js.Any, Position: js.Any, DisplayName: js.Any): Attachment = js.native
  def Item(Index: js.Any): Attachment = js.native
  def Remove(Index: Double): Unit = js.native
}

