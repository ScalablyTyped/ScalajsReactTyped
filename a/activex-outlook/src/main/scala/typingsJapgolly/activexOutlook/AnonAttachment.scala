package typingsJapgolly.activexOutlook

import typingsJapgolly.activexOutlook.Outlook.Attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttachment extends js.Object {
  val Attachment: typingsJapgolly.activexOutlook.Outlook.Attachment
}

object AnonAttachment {
  @scala.inline
  def apply(Attachment: Attachment): AnonAttachment = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttachment]
  }
}

