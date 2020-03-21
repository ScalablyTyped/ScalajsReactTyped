package typingsJapgolly.googleapis.languageV1beta1Mod.languageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an output piece of text.
  */
@js.native
trait SchemaTextSpan extends js.Object {
  /**
    * The API calculates the beginning offset of the content in the original
    * document according to the EncodingType specified in the API request.
    */
  var beginOffset: js.UndefOr[Double] = js.native
  /**
    * The content of the output text.
    */
  var content: js.UndefOr[String] = js.native
}

object SchemaTextSpan {
  @scala.inline
  def apply(beginOffset: Int | Double = null, content: String = null): SchemaTextSpan = {
    val __obj = js.Dynamic.literal()
    if (beginOffset != null) __obj.updateDynamic("beginOffset")(beginOffset.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextSpan]
  }
}

