package typingsJapgolly.firebaseFirestore.databaseMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.pathMod.ResourcePath
import typingsJapgolly.firebaseFirestoreTypes.mod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/database", "PublicDocumentReference")
@js.native
class PublicDocumentReference[T] protected () extends DocumentReference[T] {
  def this(_key: DocumentKey, firestore: Firestore) = this()
  def this(
    _key: DocumentKey,
    firestore: Firestore,
    _converter: FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ _]
  ) = this()
}

@JSImport("@firebase/firestore/dist/lib/src/api/database", "PublicDocumentReference")
@js.native
object PublicDocumentReference
  extends Instantiable2[/* _key */ DocumentKey, /* firestore */ Firestore, DocumentReference[js.Object]]
     with Instantiable3[
      /* _key */ DocumentKey, 
      /* firestore */ Firestore, 
      /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
      DocumentReference[js.Object]
    ] {
  def forPath[U](path: ResourcePath, firestore: Firestore): DocumentReference[U] = js.native
  def forPath[U](path: ResourcePath, firestore: Firestore, converter: FirestoreDataConverter[U]): DocumentReference[U] = js.native
}

