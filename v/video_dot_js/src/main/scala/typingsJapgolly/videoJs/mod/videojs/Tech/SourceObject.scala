package typingsJapgolly.videoJs.mod.videojs.Tech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Object containing a structure like: `{src: 'url', type: 'mimetype'}` or string
  * that just contains the src url alone.
  * `var SourceObject = {src: 'http://ex.com/video.mp4', type: 'video/mp4'};`
  * `var SourceString = 'http://example.com/some-video.mp4';`
  */
trait SourceObject extends js.Object {
  /**
    * The url to the source
    */
  var src: String
  /**
    * The mime type of the source
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SourceObject {
  @scala.inline
  def apply(src: String, `type`: String = null): SourceObject = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceObject]
  }
}

