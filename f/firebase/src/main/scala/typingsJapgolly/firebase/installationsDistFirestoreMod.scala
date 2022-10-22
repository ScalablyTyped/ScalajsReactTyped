package typingsJapgolly.firebase

import org.scalajs.dom.ReadableStream
import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseFirestore.anon.CompleteError
import typingsJapgolly.firebaseFirestore.anon.CompleteErrorNext
import typingsJapgolly.firebaseFirestore.anon.ErrorNext
import typingsJapgolly.firebaseFirestore.anon.MockUserToken
import typingsJapgolly.firebaseFirestore.anon.`5`
import typingsJapgolly.firebaseFirestore.mod.AggregateSpec
import typingsJapgolly.firebaseFirestore.mod.DocumentData
import typingsJapgolly.firebaseFirestore.mod.FirestoreSettings
import typingsJapgolly.firebaseFirestore.mod.IndexConfiguration
import typingsJapgolly.firebaseFirestore.mod.OrderByDirection
import typingsJapgolly.firebaseFirestore.mod.PartialWithFieldValue
import typingsJapgolly.firebaseFirestore.mod.PersistenceSettings
import typingsJapgolly.firebaseFirestore.mod.SetOptions
import typingsJapgolly.firebaseFirestore.mod.SnapshotListenOptions
import typingsJapgolly.firebaseFirestore.mod.TransactionOptions
import typingsJapgolly.firebaseFirestore.mod.Unsubscribe
import typingsJapgolly.firebaseFirestore.mod.UpdateData
import typingsJapgolly.firebaseFirestore.mod.WhereFilterOp
import typingsJapgolly.firebaseFirestore.mod.WithFieldValue
import typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogLevelString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object installationsDistFirestoreMod {
  
  @JSImport("firebase/installations/dist/firestore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/installations/dist/firestore", "AggregateField")
  @js.native
  open class AggregateField[T] ()
    extends typingsJapgolly.firebaseFirestore.mod.AggregateField[T]
  
  @JSImport("firebase/installations/dist/firestore", "AggregateQuerySnapshot")
  @js.native
  /* private */ open class AggregateQuerySnapshot[T /* <: AggregateSpec */] ()
    extends typingsJapgolly.firebaseFirestore.mod.AggregateQuerySnapshot[T]
  
  @JSImport("firebase/installations/dist/firestore", "Bytes")
  @js.native
  /* private */ open class Bytes ()
    extends typingsJapgolly.firebaseFirestore.mod.Bytes
  /* static members */
  object Bytes {
    
    @JSImport("firebase/installations/dist/firestore", "Bytes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new `Bytes` object from the given Base64 string, converting it to
      * bytes.
      *
      * @param base64 - The Base64 string used to create the `Bytes` object.
      */
    inline def fromBase64String(base64: String): typingsJapgolly.firebaseFirestore.mod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.Bytes]
    
    /**
      * Creates a new `Bytes` object from the given Uint8Array.
      *
      * @param array - The Uint8Array used to create the `Bytes` object.
      */
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typingsJapgolly.firebaseFirestore.mod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.Bytes]
  }
  
  @JSImport("firebase/installations/dist/firestore", "CACHE_SIZE_UNLIMITED")
  @js.native
  val CACHE_SIZE_UNLIMITED: /* -1 */ Double = js.native
  
  @JSImport("firebase/installations/dist/firestore", "CollectionReference")
  @js.native
  /* private */ open class CollectionReference[T] ()
    extends typingsJapgolly.firebaseFirestore.mod.CollectionReference[T]
  
  @JSImport("firebase/installations/dist/firestore", "DocumentReference")
  @js.native
  /* private */ open class DocumentReference[T] ()
    extends typingsJapgolly.firebaseFirestore.mod.DocumentReference[T]
  
  @JSImport("firebase/installations/dist/firestore", "DocumentSnapshot")
  @js.native
  /* protected */ open class DocumentSnapshot[T] ()
    extends typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T]
  
  @JSImport("firebase/installations/dist/firestore", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typingsJapgolly.firebaseFirestore.mod.FieldPath {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  /* note: abstract class */ @JSImport("firebase/installations/dist/firestore", "FieldValue")
  @js.native
  /* private */ open class FieldValue ()
    extends typingsJapgolly.firebaseFirestore.mod.FieldValue
  
  @JSImport("firebase/installations/dist/firestore", "Firestore")
  @js.native
  /* private */ open class Firestore ()
    extends typingsJapgolly.firebaseFirestore.mod.Firestore
  
  @JSImport("firebase/installations/dist/firestore", "FirestoreError")
  @js.native
  /* private */ open class FirestoreError ()
    extends typingsJapgolly.firebaseFirestore.mod.FirestoreError
  
  @JSImport("firebase/installations/dist/firestore", "GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typingsJapgolly.firebaseFirestore.mod.GeoPoint {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @JSImport("firebase/installations/dist/firestore", "LoadBundleTask")
  @js.native
  open class LoadBundleTask ()
    extends typingsJapgolly.firebaseFirestore.mod.LoadBundleTask
  
  /* note: abstract class */ @JSImport("firebase/installations/dist/firestore", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typingsJapgolly.firebaseFirestore.mod.QueryConstraint
  
  @JSImport("firebase/installations/dist/firestore", "QueryDocumentSnapshot")
  @js.native
  /* protected */ open class QueryDocumentSnapshot[T] ()
    extends typingsJapgolly.firebaseFirestore.mod.QueryDocumentSnapshot[T]
  
  @JSImport("firebase/installations/dist/firestore", "QuerySnapshot")
  @js.native
  /* private */ open class QuerySnapshot[T] ()
    extends typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T]
  
  @JSImport("firebase/installations/dist/firestore", "Query")
  @js.native
  /* protected */ open class Query_[T] ()
    extends typingsJapgolly.firebaseFirestore.mod.Query_[T]
  
  @JSImport("firebase/installations/dist/firestore", "SnapshotMetadata")
  @js.native
  /* private */ open class SnapshotMetadata ()
    extends typingsJapgolly.firebaseFirestore.mod.SnapshotMetadata
  
  @JSImport("firebase/installations/dist/firestore", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typingsJapgolly.firebaseFirestore.mod.Timestamp {
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
    
    @JSImport("firebase/installations/dist/firestore", "Timestamp")
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
  
  @JSImport("firebase/installations/dist/firestore", "Transaction")
  @js.native
  /* private */ open class Transaction ()
    extends typingsJapgolly.firebaseFirestore.mod.Transaction
  
  @JSImport("firebase/installations/dist/firestore", "WriteBatch")
  @js.native
  /* private */ open class WriteBatch_ ()
    extends typingsJapgolly.firebaseFirestore.mod.WriteBatch_
  
  inline def addDoc[T](reference: typingsJapgolly.firebaseFirestore.mod.CollectionReference[T], data: WithFieldValue[T]): js.Promise[typingsJapgolly.firebaseFirestore.mod.DocumentReference[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.mod.DocumentReference[T]]]
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](
    left: typingsJapgolly.firebaseFirestore.mod.AggregateQuerySnapshot[T],
    right: typingsJapgolly.firebaseFirestore.mod.AggregateQuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayRemove(elements: Any*): typingsJapgolly.firebaseFirestore.mod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.FieldValue]
  
  inline def arrayUnion(elements: Any*): typingsJapgolly.firebaseFirestore.mod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.FieldValue]
  
  inline def clearIndexedDbPersistence(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def collection(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore, path: String, pathSegments: String*): typingsJapgolly.firebaseFirestore.mod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typingsJapgolly.firebaseFirestore.mod.CollectionReference[Any],
    path: String,
    pathSegments: String*
  ): typingsJapgolly.firebaseFirestore.mod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[DocumentData],
    path: String,
    pathSegments: String*
  ): typingsJapgolly.firebaseFirestore.mod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.CollectionReference[DocumentData]]
  
  inline def collectionGroup(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore, collectionId: String): typingsJapgolly.firebaseFirestore.mod.Query_[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.Query_[DocumentData]]
  
  inline def connectFirestoreEmulator(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectFirestoreEmulator(
    firestore: typingsJapgolly.firebaseFirestore.mod.Firestore,
    host: String,
    port: Double,
    options: MockUserToken
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteDoc(reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteField(): typingsJapgolly.firebaseFirestore.mod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[typingsJapgolly.firebaseFirestore.mod.FieldValue]
  
  inline def disableNetwork(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def doc(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore, path: String, pathSegments: String*): typingsJapgolly.firebaseFirestore.mod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.DocumentReference[DocumentData]]
  inline def doc(
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[Any],
    path: String,
    pathSegments: String*
  ): typingsJapgolly.firebaseFirestore.mod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.DocumentReference[DocumentData]]
  inline def doc[T](
    reference: typingsJapgolly.firebaseFirestore.mod.CollectionReference[T],
    path: String,
    pathSegments: String*
  ): typingsJapgolly.firebaseFirestore.mod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.DocumentReference[T]]
  inline def doc[T](
    reference: typingsJapgolly.firebaseFirestore.mod.CollectionReference[T],
    path: Unit,
    pathSegments: String*
  ): typingsJapgolly.firebaseFirestore.mod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.DocumentReference[T]]
  
  inline def documentId(): typingsJapgolly.firebaseFirestore.mod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typingsJapgolly.firebaseFirestore.mod.FieldPath]
  
  inline def enableIndexedDbPersistence(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def enableIndexedDbPersistence(
    firestore: typingsJapgolly.firebaseFirestore.mod.Firestore,
    persistenceSettings: PersistenceSettings
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any], persistenceSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def enableMultiTabIndexedDbPersistence(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableMultiTabIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def enableNetwork(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def endAt(fieldValues: Any*): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  inline def endAt(snapshot: typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[Any]): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  inline def endBefore(snapshot: typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[Any]): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  
  inline def getCountFromServer(query: typingsJapgolly.firebaseFirestore.mod.Query_[Any]): js.Promise[typingsJapgolly.firebaseFirestore.mod.AggregateQuerySnapshot[`5`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.mod.AggregateQuerySnapshot[`5`]]]
  
  inline def getDoc[T](reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T]): js.Promise[typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T]]]
  
  inline def getDocFromCache[T](reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T]): js.Promise[typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromCache")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T]]]
  
  inline def getDocFromServer[T](reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T]): js.Promise[typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromServer")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T]]]
  
  inline def getDocs[T](query: typingsJapgolly.firebaseFirestore.mod.Query_[T]): js.Promise[typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T]]]
  
  inline def getDocsFromCache[T](query: typingsJapgolly.firebaseFirestore.mod.Query_[T]): js.Promise[typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromCache")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T]]]
  
  inline def getDocsFromServer[T](query: typingsJapgolly.firebaseFirestore.mod.Query_[T]): js.Promise[typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T]]]
  
  inline def getFirestore(): typingsJapgolly.firebaseFirestore.mod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[typingsJapgolly.firebaseFirestore.mod.Firestore]
  inline def getFirestore(app: FirebaseApp): typingsJapgolly.firebaseFirestore.mod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.Firestore]
  
  inline def increment(n: Double): typingsJapgolly.firebaseFirestore.mod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.FieldValue]
  
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings): typingsJapgolly.firebaseFirestore.mod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.Firestore]
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings, databaseId: String): typingsJapgolly.firebaseFirestore.mod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.Firestore]
  
  inline def limit(limit: Double): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  
  inline def loadBundle(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore, bundleData: String): typingsJapgolly.firebaseFirestore.mod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.LoadBundleTask]
  inline def loadBundle(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore, bundleData: js.typedarray.ArrayBuffer): typingsJapgolly.firebaseFirestore.mod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.LoadBundleTask]
  inline def loadBundle(
    firestore: typingsJapgolly.firebaseFirestore.mod.Firestore,
    bundleData: ReadableStream[js.typedarray.Uint8Array]
  ): typingsJapgolly.firebaseFirestore.mod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.LoadBundleTask]
  
  inline def namedQuery(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore, name: String): js.Promise[typingsJapgolly.firebaseFirestore.mod.Query_[DocumentData] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("namedQuery")(firestore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.mod.Query_[DocumentData] | Null]]
  
  inline def onSnapshot[T](query: typingsJapgolly.firebaseFirestore.mod.Query_[T], observer: ErrorNext[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typingsJapgolly.firebaseFirestore.mod.Query_[T],
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T], Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typingsJapgolly.firebaseFirestore.mod.Query_[T],
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typingsJapgolly.firebaseFirestore.mod.FirestoreError, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typingsJapgolly.firebaseFirestore.mod.Query_[T],
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typingsJapgolly.firebaseFirestore.mod.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typingsJapgolly.firebaseFirestore.mod.Query_[T],
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T], Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typingsJapgolly.firebaseFirestore.mod.Query_[T],
    options: SnapshotListenOptions,
    observer: ErrorNext[T]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typingsJapgolly.firebaseFirestore.mod.Query_[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T], Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typingsJapgolly.firebaseFirestore.mod.Query_[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typingsJapgolly.firebaseFirestore.mod.FirestoreError, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typingsJapgolly.firebaseFirestore.mod.Query_[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typingsJapgolly.firebaseFirestore.mod.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typingsJapgolly.firebaseFirestore.mod.Query_[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T], Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T], observer: CompleteError[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T],
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T], Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T],
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typingsJapgolly.firebaseFirestore.mod.FirestoreError, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T],
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typingsJapgolly.firebaseFirestore.mod.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T],
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T], Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T],
    options: SnapshotListenOptions,
    observer: CompleteError[T]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T], Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typingsJapgolly.firebaseFirestore.mod.FirestoreError, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typingsJapgolly.firebaseFirestore.mod.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T], Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onSnapshotsInSync(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore, observer: CompleteErrorNext): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshotsInSync(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore, onSync: js.Function0[Unit]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], onSync.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def orderBy(fieldPath: String): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  inline def orderBy(fieldPath: typingsJapgolly.firebaseFirestore.mod.FieldPath): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  inline def orderBy(fieldPath: typingsJapgolly.firebaseFirestore.mod.FieldPath, directionStr: OrderByDirection): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  
  inline def query[T](
    query: typingsJapgolly.firebaseFirestore.mod.Query_[T],
    queryConstraints: typingsJapgolly.firebaseFirestore.mod.QueryConstraint*
  ): typingsJapgolly.firebaseFirestore.mod.Query_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.Query_[T]]
  
  inline def queryEqual[T](
    left: typingsJapgolly.firebaseFirestore.mod.Query_[T],
    right: typingsJapgolly.firebaseFirestore.mod.Query_[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def refEqual[T](
    left: typingsJapgolly.firebaseFirestore.mod.CollectionReference[T],
    right: typingsJapgolly.firebaseFirestore.mod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typingsJapgolly.firebaseFirestore.mod.CollectionReference[T],
    right: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T],
    right: typingsJapgolly.firebaseFirestore.mod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T],
    right: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def runTransaction[T](
    firestore: typingsJapgolly.firebaseFirestore.mod.Firestore,
    updateFunction: js.Function1[/* transaction */ typingsJapgolly.firebaseFirestore.mod.Transaction, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: typingsJapgolly.firebaseFirestore.mod.Firestore,
    updateFunction: js.Function1[/* transaction */ typingsJapgolly.firebaseFirestore.mod.Transaction, js.Promise[T]],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def serverTimestamp(): typingsJapgolly.firebaseFirestore.mod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typingsJapgolly.firebaseFirestore.mod.FieldValue]
  
  inline def setDoc[T](
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T],
    data: PartialWithFieldValue[T],
    options: SetOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setDoc[T](reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T], data: WithFieldValue[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setIndexConfiguration(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore, configuration: IndexConfiguration): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setIndexConfiguration(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore, json: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def snapshotEqual[T](
    left: typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T],
    right: typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T],
    right: typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T],
    right: typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T],
    right: typingsJapgolly.firebaseFirestore.mod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def startAfter(fieldValues: Any*): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  inline def startAfter(snapshot: typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[Any]): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  
  inline def startAt(fieldValues: Any*): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  inline def startAt(snapshot: typingsJapgolly.firebaseFirestore.mod.DocumentSnapshot[Any]): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  
  inline def terminate(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def updateDoc(
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[Any],
    field: String,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc(
    reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[Any],
    field: typingsJapgolly.firebaseFirestore.mod.FieldPath,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc[T](reference: typingsJapgolly.firebaseFirestore.mod.DocumentReference[T], data: UpdateData[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def waitForPendingWrites(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPendingWrites")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  inline def where(fieldPath: typingsJapgolly.firebaseFirestore.mod.FieldPath, opStr: WhereFilterOp, value: Any): typingsJapgolly.firebaseFirestore.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.QueryConstraint]
  
  inline def writeBatch(firestore: typingsJapgolly.firebaseFirestore.mod.Firestore): typingsJapgolly.firebaseFirestore.mod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.mod.WriteBatch_]
}
