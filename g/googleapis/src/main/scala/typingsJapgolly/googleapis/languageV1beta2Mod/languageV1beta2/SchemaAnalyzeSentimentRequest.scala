package typingsJapgolly.googleapis.languageV1beta2Mod.languageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The sentiment analysis request message.
  */
@js.native
trait SchemaAnalyzeSentimentRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.native
  /**
    * The encoding type used by the API to calculate sentence offsets for the
    * sentence sentiment.
    */
  var encodingType: js.UndefOr[String] = js.native
}

object SchemaAnalyzeSentimentRequest {
  @scala.inline
  def apply(document: SchemaDocument = null, encodingType: String = null): SchemaAnalyzeSentimentRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnalyzeSentimentRequest]
  }
}

