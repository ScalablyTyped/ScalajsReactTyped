package typingsJapgolly.firebaseFirestore.apiDatabaseMod

import typingsJapgolly.firebaseFirestore.modelPathMod.ResourcePath
import typingsJapgolly.firebaseFirestoreTypes.mod.DocumentData
import typingsJapgolly.firebaseFirestoreTypes.mod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.firebaseFirestoreTypes.mod.Query because Already inherited
- typingsJapgolly.firebaseFirestoreTypes.mod.CollectionReference because Inheritance from two classes. Inlined id, parent, path, add, doc, doc, isEqual */ @JSImport("@firebase/firestore/dist/src/api/database", "CollectionReference")
@js.native
class CollectionReference[T] protected () extends Query[T] {
  def this(_path: ResourcePath, firestore: Firestore) = this()
  def this(_path: ResourcePath, firestore: Firestore, _converter: FirestoreDataConverter[T]) = this()
  val _path: ResourcePath = js.native
  @JSName("id")
  val id_FCollectionReference: String = js.native
  @JSName("parent")
  val parent_FCollectionReference: typingsJapgolly.firebaseFirestoreTypes.mod.DocumentReference[DocumentData] | Null = js.native
  @JSName("path")
  val path_FCollectionReference: String = js.native
  def add(value: T): js.Promise[typingsJapgolly.firebaseFirestoreTypes.mod.DocumentReference[T]] = js.native
  def doc(): typingsJapgolly.firebaseFirestoreTypes.mod.DocumentReference[T] = js.native
  def doc(pathString: String): typingsJapgolly.firebaseFirestoreTypes.mod.DocumentReference[T] = js.native
  def id(): String = js.native
  def isEqual(other: typingsJapgolly.firebaseFirestoreTypes.mod.CollectionReference[T]): Boolean = js.native
  def parent(): typingsJapgolly.firebaseFirestoreTypes.mod.DocumentReference[DocumentData] | Null = js.native
  def path(): String = js.native
}

