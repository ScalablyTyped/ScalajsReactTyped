package typingsJapgolly.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object collectionsMod {
  type DocumentKeySet_ = typingsJapgolly.firebaseFirestore.sortedSetMod.SortedSet[typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey]
  type DocumentMap_ = typingsJapgolly.firebaseFirestore.sortedMapMod.SortedMap[
    typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey, 
    typingsJapgolly.firebaseFirestore.documentMod.Document
  ]
  type DocumentVersionMap_ = typingsJapgolly.firebaseFirestore.sortedMapMod.SortedMap[
    typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey, 
    typingsJapgolly.firebaseFirestore.snapshotVersionMod.SnapshotVersion
  ]
  type MaybeDocumentMap_ = typingsJapgolly.firebaseFirestore.sortedMapMod.SortedMap[
    typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey, 
    typingsJapgolly.firebaseFirestore.documentMod.MaybeDocument
  ]
  type NullableMaybeDocumentMap_ = typingsJapgolly.firebaseFirestore.sortedMapMod.SortedMap[
    typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey, 
    typingsJapgolly.firebaseFirestore.documentMod.MaybeDocument | scala.Null
  ]
  type TargetIdSet_ = typingsJapgolly.firebaseFirestore.sortedSetMod.SortedSet[typingsJapgolly.firebaseFirestore.typesMod.TargetId]
}
