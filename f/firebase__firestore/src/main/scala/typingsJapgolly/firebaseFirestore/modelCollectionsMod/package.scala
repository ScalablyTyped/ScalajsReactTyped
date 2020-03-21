package typingsJapgolly.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modelCollectionsMod {
  type DocumentKeySet_ = typingsJapgolly.firebaseFirestore.utilSortedSetMod.SortedSet[typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey]
  type DocumentMap_ = typingsJapgolly.firebaseFirestore.utilSortedMapMod.SortedMap[
    typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey, 
    typingsJapgolly.firebaseFirestore.modelDocumentMod.Document
  ]
  type DocumentVersionMap_ = typingsJapgolly.firebaseFirestore.utilSortedMapMod.SortedMap[
    typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey, 
    typingsJapgolly.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
  ]
  type MaybeDocumentMap_ = typingsJapgolly.firebaseFirestore.utilSortedMapMod.SortedMap[
    typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey, 
    typingsJapgolly.firebaseFirestore.modelDocumentMod.MaybeDocument
  ]
  type NullableMaybeDocumentMap_ = typingsJapgolly.firebaseFirestore.utilSortedMapMod.SortedMap[
    typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey, 
    typingsJapgolly.firebaseFirestore.modelDocumentMod.MaybeDocument | scala.Null
  ]
  type TargetIdSet_ = typingsJapgolly.firebaseFirestore.utilSortedSetMod.SortedSet[typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId]
}
