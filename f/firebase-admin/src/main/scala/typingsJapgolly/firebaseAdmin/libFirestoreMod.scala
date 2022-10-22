package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import typingsJapgolly.googleCloudFirestore.FirebaseFirestore.Settings
import typingsJapgolly.googleCloudFirestore.anon.TypeofFirestoreClient
import typingsJapgolly.googleGax.buildSrcClientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFirestoreMod {
  
  @JSImport("firebase-admin/lib/firestore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/firestore", "BulkWriter")
  @js.native
  /* private */ open class BulkWriter ()
    extends typingsJapgolly.googleCloudFirestore.mod.BulkWriter
  
  @JSImport("firebase-admin/lib/firestore", "BundleBuilder")
  @js.native
  open class BundleBuilder ()
    extends typingsJapgolly.googleCloudFirestore.mod.BundleBuilder
  
  @JSImport("firebase-admin/lib/firestore", "CollectionGroup")
  @js.native
  /* private */ open class CollectionGroup[T] ()
    extends typingsJapgolly.googleCloudFirestore.mod.CollectionGroup[T]
  
  @JSImport("firebase-admin/lib/firestore", "CollectionReference")
  @js.native
  /* private */ open class CollectionReference[T] ()
    extends typingsJapgolly.googleCloudFirestore.mod.CollectionReference[T]
  
  @JSImport("firebase-admin/lib/firestore", "DocumentReference")
  @js.native
  /* private */ open class DocumentReference[T] ()
    extends typingsJapgolly.googleCloudFirestore.mod.DocumentReference[T]
  
  @JSImport("firebase-admin/lib/firestore", "DocumentSnapshot")
  @js.native
  /* protected */ open class DocumentSnapshot[T] ()
    extends typingsJapgolly.googleCloudFirestore.mod.DocumentSnapshot[T]
  
  @JSImport("firebase-admin/lib/firestore", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typingsJapgolly.googleCloudFirestore.mod.FieldPath {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  /* static members */
  object FieldPath {
    
    @JSImport("firebase-admin/lib/firestore", "FieldPath")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a special sentinel FieldPath to refer to the ID of a document.
      * It can be used in queries to sort or filter by the document ID.
      */
    inline def documentId(): typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldPath]
  }
  
  @JSImport("firebase-admin/lib/firestore", "FieldValue")
  @js.native
  /* private */ open class FieldValue ()
    extends typingsJapgolly.googleCloudFirestore.mod.FieldValue
  /* static members */
  object FieldValue {
    
    @JSImport("firebase-admin/lib/firestore", "FieldValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a special value that can be used with set(), create() or update()
      * that tells the server to remove the given elements from any array value
      * that already exists on the server. All instances of each element
      * specified will be removed from the array. If the field being modified is
      * not already an array it will be overwritten with an empty array.
      *
      * @param elements The elements to remove from the array.
      * @return The FieldValue sentinel for use in a call to set(), create() or
      * update().
      */
    inline def arrayRemove(elements: Any*): typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldValue]
    
    /**
      * Returns a special value that can be used with set(), create() or update()
      * that tells the server to union the given elements with any array value
      * that already exists on the server. Each specified element that doesn't
      * already exist in the array will be added to the end. If the field being
      * modified is not already an array it will be overwritten with an array
      * containing exactly the specified elements.
      *
      * @param elements The elements to union into the array.
      * @return The FieldValue sentinel for use in a call to set(), create() or
      * update().
      */
    inline def arrayUnion(elements: Any*): typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldValue]
    
    /**
      * Returns a sentinel for use with update() or set() with {merge:true} to
      * mark a field for deletion.
      *
      * @return The FieldValue sentinel for use in a call to set() or update().
      */
    inline def delete(): typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldValue]
    
    /**
      * Returns a special value that can be used with set(), create() or update()
      * that tells the server to increment the field's current value by the given
      * value.
      *
      * If either current field value or the operand uses floating point
      * precision, both values will be interpreted as floating point numbers and
      * all arithmetic will follow IEEE 754 semantics. Otherwise, integer
      * precision is kept and the result is capped between -2^63 and 2^63-1.
      *
      * If the current field value is not of type 'number', or if the field does
      * not yet exist, the transformation will set the field to the given value.
      *
      * @param n The value to increment by.
      * @return The FieldValue sentinel for use in a call to set(), create() or
      * update().
      */
    inline def increment(n: Double): typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldValue]
    
    /**
      * Returns a sentinel used with set(), create() or update() to include a
      * server-generated timestamp in the written data.
      *
      * @return The FieldValue sentinel for use in a call to set(), create() or
      * update().
      */
    inline def serverTimestamp(): typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldValue]
  }
  
  @JSImport("firebase-admin/lib/firestore", "Firestore")
  @js.native
  /**
    * @param settings Configuration object. See [Firestore Documentation]
    * {@link https://firebase.google.com/docs/firestore/}
    */
  open class Firestore ()
    extends typingsJapgolly.googleCloudFirestore.mod.Firestore {
    def this(settings: Settings) = this()
  }
  
  @JSImport("firebase-admin/lib/firestore", "GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typingsJapgolly.googleCloudFirestore.mod.GeoPoint {
    /**
      * Creates a new immutable GeoPoint object with the provided latitude and
      * longitude values.
      * @param latitude The latitude as number between -90 and 90.
      * @param longitude The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @JSImport("firebase-admin/lib/firestore", "GrpcStatus")
  @js.native
  object GrpcStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus & Double] = js.native
    
    /* 10 */ val ABORTED: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.ABORTED & Double = js.native
    
    /* 6 */ val ALREADY_EXISTS: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.ALREADY_EXISTS & Double = js.native
    
    /* 1 */ val CANCELLED: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.CANCELLED & Double = js.native
    
    /* 15 */ val DATA_LOSS: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.DATA_LOSS & Double = js.native
    
    /* 4 */ val DEADLINE_EXCEEDED: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.DEADLINE_EXCEEDED & Double = js.native
    
    /* 9 */ val FAILED_PRECONDITION: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.FAILED_PRECONDITION & Double = js.native
    
    /* 13 */ val INTERNAL: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.INTERNAL & Double = js.native
    
    /* 3 */ val INVALID_ARGUMENT: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.INVALID_ARGUMENT & Double = js.native
    
    /* 5 */ val NOT_FOUND: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.NOT_FOUND & Double = js.native
    
    /* 0 */ val OK: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.OK & Double = js.native
    
    /* 11 */ val OUT_OF_RANGE: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.OUT_OF_RANGE & Double = js.native
    
    /* 7 */ val PERMISSION_DENIED: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.PERMISSION_DENIED & Double = js.native
    
    /* 8 */ val RESOURCE_EXHAUSTED: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.RESOURCE_EXHAUSTED & Double = js.native
    
    /* 16 */ val UNAUTHENTICATED: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNAUTHENTICATED & Double = js.native
    
    /* 14 */ val UNAVAILABLE: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNAVAILABLE & Double = js.native
    
    /* 12 */ val UNIMPLEMENTED: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNIMPLEMENTED & Double = js.native
    
    /* 2 */ val UNKNOWN: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNKNOWN & Double = js.native
  }
  
  @JSImport("firebase-admin/lib/firestore", "Query")
  @js.native
  /* protected */ open class Query[T] ()
    extends typingsJapgolly.googleCloudFirestore.mod.Query[T]
  
  @JSImport("firebase-admin/lib/firestore", "QueryDocumentSnapshot")
  @js.native
  /* private */ open class QueryDocumentSnapshot[T] ()
    extends typingsJapgolly.googleCloudFirestore.mod.QueryDocumentSnapshot[T]
  
  @JSImport("firebase-admin/lib/firestore", "QueryPartition")
  @js.native
  /* private */ open class QueryPartition[T] ()
    extends typingsJapgolly.googleCloudFirestore.mod.QueryPartition[T]
  
  @JSImport("firebase-admin/lib/firestore", "QuerySnapshot")
  @js.native
  /* private */ open class QuerySnapshot[T] ()
    extends typingsJapgolly.googleCloudFirestore.mod.QuerySnapshot[T]
  
  @JSImport("firebase-admin/lib/firestore", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typingsJapgolly.googleCloudFirestore.mod.Timestamp {
    /**
      * Creates a new timestamp.
      *
      * @param seconds The number of seconds of UTC time since Unix epoch
      * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
      * 9999-12-31T23:59:59Z inclusive.
      * @param nanoseconds The non-negative fractions of a second at nanosecond
      * resolution. Negative second values with fractions must still have
      * non-negative nanoseconds values that count forward in time. Must be from
      * 0 to 999,999,999 inclusive.
      */
    def this(seconds: Double, nanoseconds: Double) = this()
  }
  /* static members */
  object Timestamp {
    
    @JSImport("firebase-admin/lib/firestore", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date The date to initialize the `Timestamp` from.
      * @return A new `Timestamp` representing the same point in time as the
      * given date.
      */
    inline def fromDate(date: js.Date): typingsJapgolly.googleCloudFirestore.FirebaseFirestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudFirestore.FirebaseFirestore.Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds Number of milliseconds since Unix epoch
      * 1970-01-01T00:00:00Z.
      * @return A new `Timestamp` representing the same point in time as the
      * given number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): typingsJapgolly.googleCloudFirestore.FirebaseFirestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudFirestore.FirebaseFirestore.Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @return A new `Timestamp` representing the current date.
      */
    inline def now(): typingsJapgolly.googleCloudFirestore.FirebaseFirestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.googleCloudFirestore.FirebaseFirestore.Timestamp]
  }
  
  @JSImport("firebase-admin/lib/firestore", "Transaction")
  @js.native
  /* private */ open class Transaction ()
    extends typingsJapgolly.googleCloudFirestore.mod.Transaction
  
  @JSImport("firebase-admin/lib/firestore", "WriteBatch")
  @js.native
  /* private */ open class WriteBatch ()
    extends typingsJapgolly.googleCloudFirestore.mod.WriteBatch
  
  @JSImport("firebase-admin/lib/firestore", "WriteResult")
  @js.native
  /* private */ open class WriteResult ()
    extends typingsJapgolly.googleCloudFirestore.mod.WriteResult
  
  inline def getFirestore(): typingsJapgolly.googleCloudFirestore.mod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[typingsJapgolly.googleCloudFirestore.mod.Firestore]
  inline def getFirestore(app: App): typingsJapgolly.googleCloudFirestore.mod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudFirestore.mod.Firestore]
  
  /**
    * Sets or disables the log function for all active Firestore instances.
    *
    * @param logger A log function that takes a message (such as `console.log`) or
    * `null` to turn off logging.
    */
  inline def setLogFunction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogFunction")().asInstanceOf[Unit]
  inline def setLogFunction(logger: js.Function1[/* msg */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogFunction")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object v1 {
    
    @JSImport("firebase-admin/lib/firestore", "v1")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("firebase-admin/lib/firestore", "v1.FirestoreAdminClient")
    @js.native
    def FirestoreAdminClient: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_firestore_admin_client.FirestoreAdminClient */ Any = js.native
    inline def FirestoreAdminClient_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_firestore_admin_client.FirestoreAdminClient */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreAdminClient")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("firebase-admin/lib/firestore", "v1.FirestoreClient")
    @js.native
    /**
      * Construct an instance of FirestoreClient.
      *
      * @param {object} [options] - The configuration object.
      * The options accepted by the constructor are described in detail
      * in [this document](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#creating-the-client-instance).
      * The common options are:
      * @param {object} [options.credentials] - Credentials object.
      * @param {string} [options.credentials.client_email]
      * @param {string} [options.credentials.private_key]
      * @param {string} [options.email] - Account email address. Required when
      *     using a .pem or .p12 keyFilename.
      * @param {string} [options.keyFilename] - Full path to the a .json, .pem, or
      *     .p12 key downloaded from the Google Developers Console. If you provide
      *     a path to a JSON file, the projectId option below is not necessary.
      *     NOTE: .pem and .p12 require you to specify options.email as well.
      * @param {number} [options.port] - The port on which to connect to
      *     the remote host.
      * @param {string} [options.projectId] - The project ID from the Google
      *     Developer's Console, e.g. 'grape-spaceship-123'. We will also check
      *     the environment variable GCLOUD_PROJECT for your project ID. If your
      *     app is running in an environment which supports
      *     {@link https://developers.google.com/identity/protocols/application-default-credentials Application Default Credentials},
      *     your project ID will be detected automatically.
      * @param {string} [options.apiEndpoint] - The domain name of the
      *     API remote host.
      * @param {gax.ClientConfig} [options.clientConfig] - Client configuration override.
      *     Follows the structure of {@link gapicConfig}.
      * @param {boolean} [options.fallback] - Use HTTP fallback mode.
      *     In fallback mode, a special browser-compatible transport implementation is used
      *     instead of gRPC transport. In browser context (if the `window` object is defined)
      *     the fallback mode is enabled automatically; set `options.fallback` to `false`
      *     if you need to override this behavior.
      */
    open class FirestoreClient ()
      extends typingsJapgolly.googleCloudFirestore.typesV1beta1FirestoreClientMod.FirestoreClient {
      /**
        * Construct an instance of FirestoreClient.
        *
        * @param {object} [options] - The configuration object.
        * The options accepted by the constructor are described in detail
        * in [this document](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#creating-the-client-instance).
        * The common options are:
        * @param {object} [options.credentials] - Credentials object.
        * @param {string} [options.credentials.client_email]
        * @param {string} [options.credentials.private_key]
        * @param {string} [options.email] - Account email address. Required when
        *     using a .pem or .p12 keyFilename.
        * @param {string} [options.keyFilename] - Full path to the a .json, .pem, or
        *     .p12 key downloaded from the Google Developers Console. If you provide
        *     a path to a JSON file, the projectId option below is not necessary.
        *     NOTE: .pem and .p12 require you to specify options.email as well.
        * @param {number} [options.port] - The port on which to connect to
        *     the remote host.
        * @param {string} [options.projectId] - The project ID from the Google
        *     Developer's Console, e.g. 'grape-spaceship-123'. We will also check
        *     the environment variable GCLOUD_PROJECT for your project ID. If your
        *     app is running in an environment which supports
        *     {@link https://developers.google.com/identity/protocols/application-default-credentials Application Default Credentials},
        *     your project ID will be detected automatically.
        * @param {string} [options.apiEndpoint] - The domain name of the
        *     API remote host.
        * @param {gax.ClientConfig} [options.clientConfig] - Client configuration override.
        *     Follows the structure of {@link gapicConfig}.
        * @param {boolean} [options.fallback] - Use HTTP fallback mode.
        *     In fallback mode, a special browser-compatible transport implementation is used
        *     instead of gRPC transport. In browser context (if the `window` object is defined)
        *     the fallback mode is enabled automatically; set `options.fallback` to `false`
        *     if you need to override this behavior.
        */
      def this(opts: ClientOptions) = this()
    }
    @JSImport("firebase-admin/lib/firestore", "v1.FirestoreClient")
    @js.native
    def FirestoreClient: TypeofFirestoreClient = js.native
    inline def FirestoreClient_=(x: TypeofFirestoreClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreClient")(x.asInstanceOf[js.Any])
  }
}
