package typingsJapgolly.vcardsJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  var base64: Boolean
  var mediaType: String
  var url: String
  /**
    * Attach a photo from a URL
    * @param   url       URL where photo can be found
    * @param  mediaType Media type of photo (JPEG, PNG, GIF)
    */
  def attachFromUrl(url: String, mediaType: String): Unit
  /**
    * Embed a photo from a file using base-64 encoding (not implemented yet)
    * @param  fileLocation - filename
    */
  def embedFromFile(fileLocation: String): Unit
  /**
    * Embed a photo from a base-64 string
    * @param  base64String - the base64 string
    * @param  mediaType - the media type
    */
  def embedFromString(base64String: String, mediaType: String): Unit
}

object Photo {
  @scala.inline
  def apply(
    attachFromUrl: (String, String) => Callback,
    base64: Boolean,
    embedFromFile: String => Callback,
    embedFromString: (String, String) => Callback,
    mediaType: String,
    url: String
  ): Photo = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("attachFromUrl")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => attachFromUrl(t0, t1).runNow()))
    __obj.updateDynamic("embedFromFile")(js.Any.fromFunction1((t0: java.lang.String) => embedFromFile(t0).runNow()))
    __obj.updateDynamic("embedFromString")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => embedFromString(t0, t1).runNow()))
    __obj.asInstanceOf[Photo]
  }
}

