package typingsJapgolly.firebaseFirestore.modelCollectionsMod

import typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.utilSortedMapMod.SortedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSizeEntries extends js.Object {
  var maybeDocuments: NullableMaybeDocumentMap_
  var sizeMap: SortedMap[DocumentKey, Double]
}

object DocumentSizeEntries {
  @scala.inline
  def apply(maybeDocuments: NullableMaybeDocumentMap_, sizeMap: SortedMap[DocumentKey, Double]): DocumentSizeEntries = {
    val __obj = js.Dynamic.literal(maybeDocuments = maybeDocuments.asInstanceOf[js.Any], sizeMap = sizeMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentSizeEntries]
  }
}

