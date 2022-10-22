package typingsJapgolly.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/private", "CollectionReference")
@js.native
open class CollectionReference[T] protected () extends Query_[T] {
  def this(
    firestore: Firestore2,
    converter: Null,
    _path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ResourcePath */ Any
  ) = this()
  /** @hideconstructor */
  def this(
    firestore: Firestore2,
    converter: FirestoreDataConverter2[T],
    _path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ResourcePath */ Any
  ) = this()
  
  val _path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ResourcePath */ Any = js.native
  
  /** The collection's identifier. */
  def id: String = js.native
  
  /**
    * A reference to the containing `DocumentReference` if this is a
    * subcollection. If this isn't a subcollection, the reference is null.
    */
  def parent: DocumentReference[DocumentData] | Null = js.native
  
  /**
    * A string representing the path of the referenced collection (relative
    * to the root of the database).
    */
  def path: String = js.native
  
  /** The type of this Firestore reference. */
  @JSName("type")
  val type_CollectionReference: /* "collection" */ String = js.native
}
