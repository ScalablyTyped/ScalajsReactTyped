package typingsJapgolly.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/private", "DocumentSnapshot")
@js.native
open class DocumentSnapshot[T] protected ()
  extends StObject
     with DocumentSnapshot2[T] {
  def this(
    _firestore: Firestore,
    userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
    document: Null,
    metadata: SnapshotMetadata
  ) = this()
  /** @hideconstructor protected */
  def this(
    _firestore: Firestore,
    userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
    document: Document2,
    metadata: SnapshotMetadata
  ) = this()
  def this(
    _firestore: Firestore,
    userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
    document: Null,
    metadata: SnapshotMetadata,
    converter: UntypedFirestoreDataConverter[T]
  ) = this()
  def this(
    _firestore: Firestore,
    userDataWriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter */ Any,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
    document: Document2,
    metadata: SnapshotMetadata,
    converter: UntypedFirestoreDataConverter[T]
  ) = this()
  
  /* private */ val _firestoreImpl: Any = js.native
  
  @JSName("_firestore")
  val _firestore_DocumentSnapshot: Firestore = js.native
  
  def data(options: SnapshotOptions): js.UndefOr[T] = js.native
  
  def get(fieldPath: String, options: SnapshotOptions): Any = js.native
  def get(fieldPath: FieldPath, options: SnapshotOptions): Any = js.native
  
  /**
    *  Metadata about the `DocumentSnapshot`, including information about its
    *  source and local modifications.
    */
  val metadata: SnapshotMetadata = js.native
}
