package typingsJapgolly.firebase

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseFirestore.anon.Count
import typingsJapgolly.firebaseFirestore.anon.MockUserToken
import typingsJapgolly.firebaseFirestore.distLiteMod.AggregateSpec
import typingsJapgolly.firebaseFirestore.distLiteMod.DocumentData
import typingsJapgolly.firebaseFirestore.distLiteMod.OrderByDirection
import typingsJapgolly.firebaseFirestore.distLiteMod.PartialWithFieldValue
import typingsJapgolly.firebaseFirestore.distLiteMod.SetOptions
import typingsJapgolly.firebaseFirestore.distLiteMod.Settings
import typingsJapgolly.firebaseFirestore.distLiteMod.TransactionOptions
import typingsJapgolly.firebaseFirestore.distLiteMod.UpdateData
import typingsJapgolly.firebaseFirestore.distLiteMod.WhereFilterOp
import typingsJapgolly.firebaseFirestore.distLiteMod.WithFieldValue
import typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogLevelString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseDistFirestoreLiteMod {
  
  @JSImport("firebase/database/dist/firestore/lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/database/dist/firestore/lite", "AggregateField")
  @js.native
  open class AggregateField[T] ()
    extends typingsJapgolly.firebaseFirestore.liteMod.AggregateField[T]
  
  @JSImport("firebase/database/dist/firestore/lite", "AggregateQuerySnapshot")
  @js.native
  /* private */ open class AggregateQuerySnapshot[T /* <: AggregateSpec */] ()
    extends typingsJapgolly.firebaseFirestore.liteMod.AggregateQuerySnapshot[T]
  
  @JSImport("firebase/database/dist/firestore/lite", "Bytes")
  @js.native
  /* private */ open class Bytes ()
    extends typingsJapgolly.firebaseFirestore.liteMod.Bytes
  /* static members */
  object Bytes {
    
    @JSImport("firebase/database/dist/firestore/lite", "Bytes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new `Bytes` object from the given Base64 string, converting it to
      * bytes.
      *
      * @param base64 - The Base64 string used to create the `Bytes` object.
      */
    inline def fromBase64String(base64: String): typingsJapgolly.firebaseFirestore.distLiteMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.Bytes]
    
    /**
      * Creates a new `Bytes` object from the given Uint8Array.
      *
      * @param array - The Uint8Array used to create the `Bytes` object.
      */
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typingsJapgolly.firebaseFirestore.distLiteMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.Bytes]
  }
  
  @JSImport("firebase/database/dist/firestore/lite", "CollectionReference")
  @js.native
  /* private */ open class CollectionReference[T] ()
    extends typingsJapgolly.firebaseFirestore.liteMod.CollectionReference[T]
  
  @JSImport("firebase/database/dist/firestore/lite", "DocumentReference")
  @js.native
  /* private */ open class DocumentReference[T] ()
    extends typingsJapgolly.firebaseFirestore.liteMod.DocumentReference[T]
  
  @JSImport("firebase/database/dist/firestore/lite", "DocumentSnapshot")
  @js.native
  /* protected */ open class DocumentSnapshot[T] ()
    extends typingsJapgolly.firebaseFirestore.liteMod.DocumentSnapshot[T]
  
  @JSImport("firebase/database/dist/firestore/lite", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typingsJapgolly.firebaseFirestore.liteMod.FieldPath {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  /* note: abstract class */ @JSImport("firebase/database/dist/firestore/lite", "FieldValue")
  @js.native
  /* private */ open class FieldValue ()
    extends typingsJapgolly.firebaseFirestore.liteMod.FieldValue
  
  @JSImport("firebase/database/dist/firestore/lite", "Firestore")
  @js.native
  /* private */ open class Firestore ()
    extends typingsJapgolly.firebaseFirestore.liteMod.Firestore
  
  @JSImport("firebase/database/dist/firestore/lite", "FirestoreError")
  @js.native
  /* private */ open class FirestoreError ()
    extends typingsJapgolly.firebaseFirestore.liteMod.FirestoreError
  
  @JSImport("firebase/database/dist/firestore/lite", "GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typingsJapgolly.firebaseFirestore.liteMod.GeoPoint {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  /* note: abstract class */ @JSImport("firebase/database/dist/firestore/lite", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typingsJapgolly.firebaseFirestore.liteMod.QueryConstraint
  
  @JSImport("firebase/database/dist/firestore/lite", "QueryDocumentSnapshot")
  @js.native
  /* protected */ open class QueryDocumentSnapshot[T] ()
    extends typingsJapgolly.firebaseFirestore.liteMod.QueryDocumentSnapshot[T]
  
  @JSImport("firebase/database/dist/firestore/lite", "QuerySnapshot")
  @js.native
  /* private */ open class QuerySnapshot[T] ()
    extends typingsJapgolly.firebaseFirestore.liteMod.QuerySnapshot[T]
  
  @JSImport("firebase/database/dist/firestore/lite", "Query")
  @js.native
  /* protected */ open class Query_[T] ()
    extends typingsJapgolly.firebaseFirestore.liteMod.Query_[T]
  
  @JSImport("firebase/database/dist/firestore/lite", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typingsJapgolly.firebaseFirestore.liteMod.Timestamp {
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
    
    @JSImport("firebase/database/dist/firestore/lite", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date - The date to initialize the `Timestamp` from.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     date.
      */
    inline def fromDate(date: js.Date): typingsJapgolly.firebaseFirestore.distLiteMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds - Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): typingsJapgolly.firebaseFirestore.distLiteMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @returns a new timestamp representing the current date.
      */
    inline def now(): typingsJapgolly.firebaseFirestore.distLiteMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.Timestamp]
  }
  
  @JSImport("firebase/database/dist/firestore/lite", "Transaction")
  @js.native
  /* private */ open class Transaction ()
    extends typingsJapgolly.firebaseFirestore.liteMod.Transaction
  
  @JSImport("firebase/database/dist/firestore/lite", "WriteBatch")
  @js.native
  /* private */ open class WriteBatch_ ()
    extends typingsJapgolly.firebaseFirestore.liteMod.WriteBatch_
  
  inline def addDoc[T](
    reference: typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[T],
    data: WithFieldValue[T]
  ): js.Promise[typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T]]]
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](
    left: typingsJapgolly.firebaseFirestore.distLiteMod.AggregateQuerySnapshot[T],
    right: typingsJapgolly.firebaseFirestore.distLiteMod.AggregateQuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayRemove(elements: Any*): typingsJapgolly.firebaseFirestore.distLiteMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.FieldValue]
  
  inline def arrayUnion(elements: Any*): typingsJapgolly.firebaseFirestore.distLiteMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.FieldValue]
  
  inline def collection(
    firestore: typingsJapgolly.firebaseFirestore.distLiteMod.Firestore,
    path: String,
    pathSegments: String*
  ): typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[Any],
    path: String,
    pathSegments: String*
  ): typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[DocumentData],
    path: String,
    pathSegments: String*
  ): typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[DocumentData]]
  
  inline def collectionGroup(firestore: typingsJapgolly.firebaseFirestore.distLiteMod.Firestore, collectionId: String): typingsJapgolly.firebaseFirestore.distLiteMod.Query_[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.Query_[DocumentData]]
  
  inline def connectFirestoreEmulator(firestore: typingsJapgolly.firebaseFirestore.distLiteMod.Firestore, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectFirestoreEmulator(
    firestore: typingsJapgolly.firebaseFirestore.distLiteMod.Firestore,
    host: String,
    port: Double,
    options: MockUserToken
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteDoc(reference: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteField(): typingsJapgolly.firebaseFirestore.distLiteMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.FieldValue]
  
  inline def doc(
    firestore: typingsJapgolly.firebaseFirestore.distLiteMod.Firestore,
    path: String,
    pathSegments: String*
  ): typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[DocumentData]]
  inline def doc(
    reference: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[Any],
    path: String,
    pathSegments: String*
  ): typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[DocumentData]]
  inline def doc[T](
    reference: typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[T],
    path: String,
    pathSegments: String*
  ): typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T]]
  inline def doc[T](
    reference: typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[T],
    path: Unit,
    pathSegments: String*
  ): typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T]]
  
  inline def documentId(): typingsJapgolly.firebaseFirestore.distLiteMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.FieldPath]
  
  inline def endAt(fieldValues: Any*): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def endAt(snapshot: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentSnapshot[Any]): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def endBefore(snapshot: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentSnapshot[Any]): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def getCount(query: typingsJapgolly.firebaseFirestore.distLiteMod.Query_[Any]): js.Promise[typingsJapgolly.firebaseFirestore.distLiteMod.AggregateQuerySnapshot[Count]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.distLiteMod.AggregateQuerySnapshot[Count]]]
  
  inline def getDoc[T](reference: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T]): js.Promise[typingsJapgolly.firebaseFirestore.distLiteMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.distLiteMod.DocumentSnapshot[T]]]
  
  inline def getDocs[T](query: typingsJapgolly.firebaseFirestore.distLiteMod.Query_[T]): js.Promise[typingsJapgolly.firebaseFirestore.distLiteMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseFirestore.distLiteMod.QuerySnapshot[T]]]
  
  inline def getFirestore(): typingsJapgolly.firebaseFirestore.distLiteMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.Firestore]
  inline def getFirestore(app: FirebaseApp): typingsJapgolly.firebaseFirestore.distLiteMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.Firestore]
  
  inline def increment(n: Double): typingsJapgolly.firebaseFirestore.distLiteMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.FieldValue]
  
  inline def initializeFirestore(app: FirebaseApp, settings: Settings): typingsJapgolly.firebaseFirestore.distLiteMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.Firestore]
  
  inline def limit(limit: Double): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def orderBy(fieldPath: String): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def orderBy(fieldPath: typingsJapgolly.firebaseFirestore.distLiteMod.FieldPath): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def orderBy(fieldPath: typingsJapgolly.firebaseFirestore.distLiteMod.FieldPath, directionStr: OrderByDirection): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def query[T](
    query: typingsJapgolly.firebaseFirestore.distLiteMod.Query_[T],
    queryConstraints: typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint*
  ): typingsJapgolly.firebaseFirestore.distLiteMod.Query_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.Query_[T]]
  
  inline def queryEqual[T](
    left: typingsJapgolly.firebaseFirestore.distLiteMod.Query_[T],
    right: typingsJapgolly.firebaseFirestore.distLiteMod.Query_[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def refEqual[T](
    left: typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[T],
    right: typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[T],
    right: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T],
    right: typingsJapgolly.firebaseFirestore.distLiteMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T],
    right: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def runTransaction[T](
    firestore: typingsJapgolly.firebaseFirestore.distLiteMod.Firestore,
    updateFunction: js.Function1[
      /* transaction */ typingsJapgolly.firebaseFirestore.distLiteMod.Transaction, 
      js.Promise[T]
    ]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: typingsJapgolly.firebaseFirestore.distLiteMod.Firestore,
    updateFunction: js.Function1[
      /* transaction */ typingsJapgolly.firebaseFirestore.distLiteMod.Transaction, 
      js.Promise[T]
    ],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def serverTimestamp(): typingsJapgolly.firebaseFirestore.distLiteMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.FieldValue]
  
  inline def setDoc[T](
    reference: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T],
    data: PartialWithFieldValue[T],
    options: SetOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setDoc[T](
    reference: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T],
    data: WithFieldValue[T]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def snapshotEqual[T](
    left: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentSnapshot[T],
    right: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentSnapshot[T],
    right: typingsJapgolly.firebaseFirestore.distLiteMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typingsJapgolly.firebaseFirestore.distLiteMod.QuerySnapshot[T],
    right: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typingsJapgolly.firebaseFirestore.distLiteMod.QuerySnapshot[T],
    right: typingsJapgolly.firebaseFirestore.distLiteMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def startAfter(fieldValues: Any*): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def startAfter(snapshot: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentSnapshot[Any]): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def startAt(fieldValues: Any*): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def startAt(snapshot: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentSnapshot[Any]): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def terminate(firestore: typingsJapgolly.firebaseFirestore.distLiteMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def updateDoc(
    reference: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[Any],
    field: String,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc(
    reference: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[Any],
    field: typingsJapgolly.firebaseFirestore.distLiteMod.FieldPath,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc[T](reference: typingsJapgolly.firebaseFirestore.distLiteMod.DocumentReference[T], data: UpdateData[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def where(
    fieldPath: typingsJapgolly.firebaseFirestore.distLiteMod.FieldPath,
    opStr: WhereFilterOp,
    value: Any
  ): typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def writeBatch(firestore: typingsJapgolly.firebaseFirestore.distLiteMod.Firestore): typingsJapgolly.firebaseFirestore.distLiteMod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteMod.WriteBatch_]
}
