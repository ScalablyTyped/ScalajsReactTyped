package typingsJapgolly.webgme.Blobs

import typingsJapgolly.webgme.Global.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobClientParamters extends js.Object {
  var logger: GmeLogger
}

object BlobClientParamters {
  @scala.inline
  def apply(logger: GmeLogger): BlobClientParamters = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlobClientParamters]
  }
}

