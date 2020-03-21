package typingsJapgolly.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectKeyPhrasesRequest extends js.Object {
  /**
    * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend. All documents must be in the same language.
    */
  var LanguageCode: typingsJapgolly.awsSdk.comprehendMod.LanguageCode = js.native
  /**
    * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var Text: String = js.native
}

object DetectKeyPhrasesRequest {
  @scala.inline
  def apply(LanguageCode: LanguageCode, Text: String): DetectKeyPhrasesRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetectKeyPhrasesRequest]
  }
}

