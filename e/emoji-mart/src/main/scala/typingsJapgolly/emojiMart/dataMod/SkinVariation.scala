package typingsJapgolly.emojiMart.dataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkinVariation extends js.Object {
  var added_in: String
  var has_img_apple: Boolean
  var has_img_emojione: Boolean
  var has_img_facebook: Boolean
  var has_img_google: Boolean
  var has_img_messenger: Boolean
  var has_img_twitter: Boolean
  var image: String
  var non_qualified: Null | String
  var obsoleted_by: js.UndefOr[String] = js.undefined
  var obsoletes: js.UndefOr[String] = js.undefined
  var sheet_x: Double
  var sheet_y: Double
  var unified: String
}

object SkinVariation {
  @scala.inline
  def apply(
    added_in: String,
    has_img_apple: Boolean,
    has_img_emojione: Boolean,
    has_img_facebook: Boolean,
    has_img_google: Boolean,
    has_img_messenger: Boolean,
    has_img_twitter: Boolean,
    image: String,
    sheet_x: Double,
    sheet_y: Double,
    unified: String,
    non_qualified: String = null,
    obsoleted_by: String = null,
    obsoletes: String = null
  ): SkinVariation = {
    val __obj = js.Dynamic.literal(added_in = added_in.asInstanceOf[js.Any], has_img_apple = has_img_apple.asInstanceOf[js.Any], has_img_emojione = has_img_emojione.asInstanceOf[js.Any], has_img_facebook = has_img_facebook.asInstanceOf[js.Any], has_img_google = has_img_google.asInstanceOf[js.Any], has_img_messenger = has_img_messenger.asInstanceOf[js.Any], has_img_twitter = has_img_twitter.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], sheet_x = sheet_x.asInstanceOf[js.Any], sheet_y = sheet_y.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any])
    if (non_qualified != null) __obj.updateDynamic("non_qualified")(non_qualified.asInstanceOf[js.Any])
    if (obsoleted_by != null) __obj.updateDynamic("obsoleted_by")(obsoleted_by.asInstanceOf[js.Any])
    if (obsoletes != null) __obj.updateDynamic("obsoletes")(obsoletes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkinVariation]
  }
}

