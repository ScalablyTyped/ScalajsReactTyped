package typingsJapgolly.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the natural language text to be processed.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2TextInput extends js.Object {
  /**
    * Required. The language of this conversational query. See [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes. Note that queries
    * in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Required. The UTF-8 encoded natural language text to be processed. Text
    * length must not exceed 256 characters.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2TextInput {
  @scala.inline
  def apply(languageCode: String = null, text: String = null): SchemaGoogleCloudDialogflowV2TextInput = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2TextInput]
  }
}

