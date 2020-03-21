package typingsJapgolly.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseFirestore.apiDatabaseMod.CollectionReference
import typingsJapgolly.firebaseFirestore.apiDatabaseMod.DocumentReference
import typingsJapgolly.firebaseFirestore.apiDatabaseMod.DocumentSnapshot
import typingsJapgolly.firebaseFirestore.apiDatabaseMod.Firestore
import typingsJapgolly.firebaseFirestore.apiDatabaseMod.Query
import typingsJapgolly.firebaseFirestore.apiDatabaseMod.QuerySnapshot
import typingsJapgolly.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.srcModelFieldValueMod.JsonObject
import typingsJapgolly.firebaseFirestoreTypes.mod.DocumentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/util/api_helpers", JSImport.Namespace)
@js.native
object utilApiHelpersMod extends js.Object {
  @JSName("FIRESTORE")
  val FIRESTORE_ : Firestore = js.native
  def collectionReference(path: String): CollectionReference[DocumentData] = js.native
  def documentReference(path: String): DocumentReference[DocumentData] = js.native
  def documentSnapshot(path: String, data: Null, fromCache: Boolean): DocumentSnapshot[DocumentData] = js.native
  def documentSnapshot(path: String, data: JsonObject[_], fromCache: Boolean): DocumentSnapshot[DocumentData] = js.native
  def firestore(): Firestore = js.native
  def query(path: String): Query[DocumentData] = js.native
  def querySnapshot(
    path: String,
    oldDocs: StringDictionary[JsonObject[_]],
    docsToAdd: StringDictionary[JsonObject[_]],
    mutatedKeys: DocumentKeySet_,
    fromCache: Boolean,
    syncStateChanged: Boolean
  ): QuerySnapshot[DocumentData] = js.native
}

