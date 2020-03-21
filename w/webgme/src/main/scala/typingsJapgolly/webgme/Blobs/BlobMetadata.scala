package typingsJapgolly.webgme.Blobs

import typingsJapgolly.webgme.Core.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobMetadata extends js.Object {
  var contentType: String
  var context: DataObject
  var mime: String
  var name: String
  var size: Double
}

object BlobMetadata {
  @scala.inline
  def apply(contentType: String, context: DataObject, mime: String, name: String, size: Double): BlobMetadata = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlobMetadata]
  }
}

