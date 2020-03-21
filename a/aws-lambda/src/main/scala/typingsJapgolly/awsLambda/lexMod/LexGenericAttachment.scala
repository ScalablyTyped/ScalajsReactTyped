package typingsJapgolly.awsLambda.lexMod

import typingsJapgolly.awsLambda.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexGenericAttachment extends js.Object {
  var attachmentLinkUrl: String
  var buttons: js.Array[AnonText]
  var imageUrl: String
  var subTitle: String
  var title: String
}

object LexGenericAttachment {
  @scala.inline
  def apply(
    attachmentLinkUrl: String,
    buttons: js.Array[AnonText],
    imageUrl: String,
    subTitle: String,
    title: String
  ): LexGenericAttachment = {
    val __obj = js.Dynamic.literal(attachmentLinkUrl = attachmentLinkUrl.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LexGenericAttachment]
  }
}

