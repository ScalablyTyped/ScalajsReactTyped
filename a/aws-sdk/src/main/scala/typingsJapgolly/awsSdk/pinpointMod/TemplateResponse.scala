package typingsJapgolly.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the message template.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was created.
    */
  var CreationDate: string = js.native
  /**
    * The JSON object that specifies the default values that are used for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was last modified.
    */
  var LastModifiedDate: string = js.native
  /**
    * The custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.native
  /**
    * The name of the message template.
    */
  var TemplateName: string = js.native
  /**
    * The type of channel that the message template is designed for. Possible values are: EMAIL, PUSH, SMS, and VOICE.
    */
  var TemplateType: typingsJapgolly.awsSdk.pinpointMod.TemplateType = js.native
  /**
    * The unique identifier, as an integer, for the active version of the message template.
    */
  var Version: js.UndefOr[string] = js.native
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object TemplateResponse {
  @scala.inline
  def apply(
    CreationDate: string,
    LastModifiedDate: string,
    TemplateName: string,
    TemplateType: TemplateType,
    Arn: string = null,
    DefaultSubstitutions: string = null,
    TemplateDescription: string = null,
    Version: string = null,
    tags: MapOfString = null
  ): TemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (DefaultSubstitutions != null) __obj.updateDynamic("DefaultSubstitutions")(DefaultSubstitutions.asInstanceOf[js.Any])
    if (TemplateDescription != null) __obj.updateDynamic("TemplateDescription")(TemplateDescription.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateResponse]
  }
}

