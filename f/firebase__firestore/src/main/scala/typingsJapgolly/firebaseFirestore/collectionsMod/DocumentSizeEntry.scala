package typingsJapgolly.firebaseFirestore.collectionsMod

import typingsJapgolly.firebaseFirestore.documentMod.MaybeDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSizeEntry extends js.Object {
  var maybeDocument: MaybeDocument
  var size: Double
}

object DocumentSizeEntry {
  @scala.inline
  def apply(maybeDocument: MaybeDocument, size: Double): DocumentSizeEntry = {
    val __obj = js.Dynamic.literal(maybeDocument = maybeDocument.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentSizeEntry]
  }
}

