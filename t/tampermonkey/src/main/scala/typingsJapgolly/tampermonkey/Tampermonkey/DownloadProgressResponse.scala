package typingsJapgolly.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Download Response
trait DownloadProgressResponse extends ProgressResponseBase {
  val finalUrl: String
}

object DownloadProgressResponse {
  @scala.inline
  def apply(
    done: Double,
    finalUrl: String,
    lengthComputable: Boolean,
    loaded: Double,
    position: Double,
    total: Double,
    totalSize: Double
  ): DownloadProgressResponse = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], finalUrl = finalUrl.asInstanceOf[js.Any], lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownloadProgressResponse]
  }
}

