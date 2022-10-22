package typingsJapgolly.firebaseFirestoreCompat

import typingsJapgolly.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsJapgolly.firebaseComponent.mod.Provider
import typingsJapgolly.firebaseFirestore.mod.Bytes
import typingsJapgolly.firebaseFirestore.mod.FirestoreDataConverter
import typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.PersistenceProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIndexDotconsoleMod {
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "Blob")
  @js.native
  open class Blob protected ()
    extends typingsJapgolly.firebaseFirestoreCompat.distSrcApiBlobMod.Blob {
    def this(_delegate: Bytes) = this()
  }
  /* static members */
  object Blob {
    
    @JSImport("@firebase/firestore-compat/dist/src/index.console", "Blob")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBase64String(base64: String): typingsJapgolly.firebaseFirestoreCompat.distSrcApiBlobMod.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestoreCompat.distSrcApiBlobMod.Blob]
    
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typingsJapgolly.firebaseFirestoreCompat.distSrcApiBlobMod.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestoreCompat.distSrcApiBlobMod.Blob]
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "CollectionReference")
  @js.native
  open class CollectionReference[T] protected ()
    extends typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.CollectionReference[T] {
    def this(
      firestore: typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      _delegate: typingsJapgolly.firebaseFirestore.mod.CollectionReference[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "DocumentReference")
  @js.native
  open class DocumentReference[T] protected ()
    extends typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[T] {
    def this(
      firestore: typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      _delegate: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T]
    ) = this()
  }
  /* static members */
  object DocumentReference {
    
    @JSImport("@firebase/firestore-compat/dist/src/index.console", "DocumentReference")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forKey[U](
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
      firestore: typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore
    ): typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forKey")(key.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U]]
    inline def forKey[U](
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
      firestore: typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[U]
    ): typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forKey")(key.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any], converter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U]]
    
    inline def forPath[U](
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ResourcePath */ Any,
      firestore: typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore
    ): typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forPath")(path.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U]]
    inline def forPath[U](
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ResourcePath */ Any,
      firestore: typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[U]
    ): typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forPath")(path.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any], converter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U]]
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "DocumentSnapshot")
  @js.native
  open class DocumentSnapshot[T] protected ()
    extends typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentSnapshot[T] {
    def this(
      _firestore: typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      _delegate: typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldPathMod.FieldPath {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  /* static members */
  object FieldPath {
    
    @JSImport("@firebase/firestore-compat/dist/src/index.console", "FieldPath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def documentId(): typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldPathMod.FieldPath]
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "FieldValue")
  @js.native
  open class FieldValue protected ()
    extends typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue {
    def this(_delegate: typingsJapgolly.firebaseFirestore.mod.FieldValue) = this()
  }
  /* static members */
  object FieldValue {
    
    @JSImport("@firebase/firestore-compat/dist/src/index.console", "FieldValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def arrayRemove(elements: Any*): typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue]
    
    inline def arrayUnion(elements: Any*): typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue]
    
    inline def delete(): typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue]
    
    inline def increment(n: Double): typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue]
    
    inline def serverTimestamp(): typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typingsJapgolly.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue]
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "Firestore")
  @js.native
  open class Firestore protected ()
    extends typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore {
    def this(firestoreDatabase: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typingsJapgolly.firebaseFirestoreCompat.distSrcApiGeoPointMod.GeoPoint {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "MemoryPersistenceProvider")
  @js.native
  open class MemoryPersistenceProvider ()
    extends StObject
       with PersistenceProvider {
    
    /* CompleteClass */
    override def clearIndexedDbPersistence(firestore: typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore): js.Promise[Unit] = js.native
    def clearIndexedDbPersistence(firestore: Firestore): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def enableIndexedDbPersistence(
      firestore: typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      forceOwnership: Boolean
    ): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def enableMultiTabIndexedDbPersistence(firestore: typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore): js.Promise[Unit] = js.native
    def enableMultiTabIndexedDbPersistence(firestore: Firestore): js.Promise[Unit] = js.native
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "QuerySnapshot")
  @js.native
  open class QuerySnapshot[T] protected ()
    extends typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.QuerySnapshot[T] {
    def this(
      _firestore: typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      _delegate: typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typingsJapgolly.firebaseFirestoreCompat.distSrcApiTimestampMod.Timestamp {
    /**
      * Creates a new timestamp.
      *
      * @param seconds - The number of seconds of UTC time since Unix epoch
      *     1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
      *     9999-12-31T23:59:59Z inclusive.
      * @param nanoseconds - The non-negative fractions of a second at nanosecond
      *     resolution. Negative second values with fractions must still have
      *     non-negative nanoseconds values that count forward in time. Must be
      *     from 0 to 999,999,999 inclusive.
      */
    def this(
      /**
      * The number of seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z.
      */
    seconds: Double,
      /**
      * The fractions of a second at nanosecond resolution.*
      */
    nanoseconds: Double
    ) = this()
  }
  /* static members */
  object Timestamp {
    
    @JSImport("@firebase/firestore-compat/dist/src/index.console", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date - The date to initialize the `Timestamp` from.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     date.
      */
    inline def fromDate(date: js.Date): typingsJapgolly.firebaseFirestore.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds - Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): typingsJapgolly.firebaseFirestore.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @returns a new timestamp representing the current date.
      */
    inline def now(): typingsJapgolly.firebaseFirestore.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.firebaseFirestore.mod.Timestamp]
  }
  
  trait FirestoreDatabase extends StObject {
    
    var database: js.UndefOr[String] = js.undefined
    
    var projectId: String
  }
  object FirestoreDatabase {
    
    inline def apply(projectId: String): FirestoreDatabase = {
      val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirestoreDatabase]
    }
    
    extension [Self <: FirestoreDatabase](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    }
  }
}
