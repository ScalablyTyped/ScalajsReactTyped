package typingsJapgolly.firebaseFirestore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import typingsJapgolly.firebaseAppTypes.mod.FirebaseApp
import typingsJapgolly.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsJapgolly.firebaseComponent.mod.Provider
import typingsJapgolly.firebaseFirestore.databaseMod.FirestoreDatabase
import typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.documentMod.Document
import typingsJapgolly.firebaseFirestore.fieldValueMod.FieldValueImpl
import typingsJapgolly.firebaseFirestore.pathMod.ResourcePath
import typingsJapgolly.firebaseFirestore.queryMod.Query
import typingsJapgolly.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import typingsJapgolly.firebaseFirestoreTypes.mod.FirestoreDataConverter
import typingsJapgolly.firebaseFirestoreTypes.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/index.console", JSImport.Namespace)
@js.native
object indexDotconsoleMod extends js.Object {
  @js.native
  class Blob ()
    extends typingsJapgolly.firebaseFirestore.blobMod.Blob
  
  @js.native
  class DocumentReference[T] protected ()
    extends typingsJapgolly.firebaseFirestore.databaseMod.DocumentReference[T] {
    def this(_key: DocumentKey, firestore: typingsJapgolly.firebaseFirestore.databaseMod.Firestore) = this()
    def this(
      _key: DocumentKey,
      firestore: typingsJapgolly.firebaseFirestore.databaseMod.Firestore,
      _converter: FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ _]
    ) = this()
  }
  
  @js.native
  class FieldPath protected ()
    extends typingsJapgolly.firebaseFirestore.fieldPathMod.FieldPath {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  @js.native
  class FieldValue protected () extends FieldValueImpl {
    def this(_methodName: String) = this()
  }
  
  @js.native
  class Firestore protected ()
    extends typingsJapgolly.firebaseFirestore.databaseMod.Firestore {
    def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
    def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
  }
  
  @js.native
  class GeoPoint protected ()
    extends typingsJapgolly.firebaseFirestore.geoPointMod.GeoPoint {
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @js.native
  class Timestamp protected ()
    extends typingsJapgolly.firebaseFirestore.timestampMod.Timestamp {
    def this(seconds: Double, nanoseconds: Double) = this()
  }
  
  val CollectionReference: Instantiable3[
    /* _path */ ResourcePath, 
    /* firestore */ typingsJapgolly.firebaseFirestore.databaseMod.Firestore, 
    js.UndefOr[
      /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typingsJapgolly.firebaseFirestore.databaseMod.CollectionReference[js.Object]
  ] = js.native
  val DocumentSnapshot: Instantiable6[
    /* _firestore */ typingsJapgolly.firebaseFirestore.databaseMod.Firestore, 
    /* _key */ DocumentKey, 
    /* _document */ Document | Null, 
    /* _fromCache */ Boolean, 
    /* _hasPendingWrites */ Boolean, 
    js.UndefOr[
      FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typingsJapgolly.firebaseFirestore.databaseMod.DocumentSnapshot[js.Object]
  ] = js.native
  val QuerySnapshot: Instantiable4[
    /* _firestore */ typingsJapgolly.firebaseFirestore.databaseMod.Firestore, 
    /* _originalQuery */ Query, 
    /* _snapshot */ ViewSnapshot, 
    js.UndefOr[
      FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typingsJapgolly.firebaseFirestore.databaseMod.QuerySnapshot[js.Object]
  ] = js.native
  @js.native
  object Blob
    extends Instantiable0[typingsJapgolly.firebaseFirestore.blobMod.Blob] {
    def fromBase64String(base64: String): typingsJapgolly.firebaseFirestore.blobMod.Blob = js.native
    def fromUint8Array(array: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.firebaseFirestore.blobMod.Blob = js.native
  }
  
  @js.native
  object DocumentReference
    extends Instantiable2[
          /* _key */ DocumentKey, 
          /* firestore */ typingsJapgolly.firebaseFirestore.databaseMod.Firestore, 
          typingsJapgolly.firebaseFirestore.databaseMod.DocumentReference[js.Object]
        ]
       with Instantiable3[
          /* _key */ DocumentKey, 
          /* firestore */ typingsJapgolly.firebaseFirestore.databaseMod.Firestore, 
          /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          typingsJapgolly.firebaseFirestore.databaseMod.DocumentReference[js.Object]
        ] {
    def forPath[U](path: ResourcePath, firestore: typingsJapgolly.firebaseFirestore.databaseMod.Firestore): typingsJapgolly.firebaseFirestore.databaseMod.DocumentReference[U] = js.native
    def forPath[U](
      path: ResourcePath,
      firestore: typingsJapgolly.firebaseFirestore.databaseMod.Firestore,
      converter: FirestoreDataConverter[U]
    ): typingsJapgolly.firebaseFirestore.databaseMod.DocumentReference[U] = js.native
  }
  
  /* static members */
  @js.native
  object FieldPath extends js.Object {
    /**
      * Internal Note: The backend doesn't technically support querying by
      * document ID. Instead it queries by the entire document name (full path
      * included), but in the cases we currently support documentId(), the net
      * effect is the same.
      */
    val _DOCUMENT_ID: js.Any = js.native
    def documentId(): typingsJapgolly.firebaseFirestore.fieldPathMod.FieldPath = js.native
  }
  
  @js.native
  object FieldValue extends Instantiable1[/* _methodName */ String, FieldValueImpl] {
    def arrayRemove(elements: js.Any*): FieldValueImpl = js.native
    def arrayUnion(elements: js.Any*): FieldValueImpl = js.native
    def delete(): FieldValueImpl = js.native
    def increment(n: Double): FieldValueImpl = js.native
    def serverTimestamp(): FieldValueImpl = js.native
  }
  
  /* static members */
  @js.native
  object Firestore extends js.Object {
    var databaseIdFromApp: js.Any = js.native
    def logLevel(): LogLevel = js.native
    def setLogLevel(level: LogLevel): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Timestamp extends js.Object {
    def fromDate(date: js.Date): typingsJapgolly.firebaseFirestore.timestampMod.Timestamp = js.native
    def fromMillis(milliseconds: Double): typingsJapgolly.firebaseFirestore.timestampMod.Timestamp = js.native
    def now(): typingsJapgolly.firebaseFirestore.timestampMod.Timestamp = js.native
  }
  
}

