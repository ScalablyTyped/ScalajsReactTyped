package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCheckAppCheckNamespaceMod.appCheck.AppCheck
import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import typingsJapgolly.firebaseAdmin.libAppCoreMod.AppOptions
import typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential
import typingsJapgolly.firebaseAdmin.libAppCredentialMod.ServiceAccount
import typingsJapgolly.firebaseAdmin.libAuthAuthNamespaceMod.auth.Auth
import typingsJapgolly.firebaseAdmin.libDatabaseDatabaseNamespaceMod.database.Database
import typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.Firestore
import typingsJapgolly.firebaseAdmin.libInstallationsInstallationsNamespaceMod.installations.Installations
import typingsJapgolly.firebaseAdmin.libInstanceIdInstanceIdNamespaceMod.instanceId.InstanceId
import typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningNamespaceMod.machineLearning.MachineLearning
import typingsJapgolly.firebaseAdmin.libMessagingMessagingNamespaceMod.messaging.Messaging
import typingsJapgolly.firebaseAdmin.libProjectManagementProjectManagementNamespaceMod.projectManagement.ProjectManagement
import typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigNamespaceMod.remoteConfig.RemoteConfig
import typingsJapgolly.firebaseAdmin.libSecurityRulesSecurityRulesNamespaceMod.securityRules.SecurityRules
import typingsJapgolly.firebaseAdmin.libStorageStorageNamespaceMod.storage.Storage
import typingsJapgolly.googleCloudFirestore.FirebaseFirestore.Settings
import typingsJapgolly.googleCloudFirestore.anon.TypeofFirestoreClient
import typingsJapgolly.googleGax.buildSrcClientInterfaceMod.ClientOptions
import typingsJapgolly.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFirebaseNamespaceApiMod {
  
  @JSImport("firebase-admin/lib/firebase-namespace-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/firebase-namespace-api", "SDK_VERSION")
  @js.native
  val SDK_VERSION: String = js.native
  
  object app {
    
    inline def apply(): App = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[App]
    inline def apply(name: String): App = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[App]
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "app")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A Firebase app holds the initialization information for a collection of
      * services.
      *
      * Do not call this constructor directly. Instead, use
      * {@link firebase-admin.app#initializeApp} to create an app.
      */
    @js.native
    trait App
      extends StObject
         with typingsJapgolly.firebaseAdmin.libAppCoreMod.App {
      
      def appCheck(): AppCheck = js.native
      
      def auth(): Auth = js.native
      
      def database(): Database = js.native
      def database(url: String): Database = js.native
      
      /**
        * Renders this local `FirebaseApp` unusable and frees the resources of
        * all associated services (though it does *not* clean up any backend
        * resources). When running the SDK locally, this method
        * must be called to ensure graceful termination of the process.
        *
        * @example
        * ```javascript
        * app.delete()
        *   .then(function() {
        *     console.log("App deleted successfully");
        *   })
        *   .catch(function(error) {
        *     console.log("Error deleting app:", error);
        *   });
        * ```
        */
      def delete(): js.Promise[Unit] = js.native
      
      def firestore(): Firestore = js.native
      
      def installations(): Installations = js.native
      
      /**
        * @deprecated Use {@link firebase-admin.installations#Installations} instead.
        */
      def instanceId(): InstanceId = js.native
      
      def machineLearning(): MachineLearning = js.native
      
      def messaging(): Messaging = js.native
      
      def projectManagement(): ProjectManagement = js.native
      
      def remoteConfig(): RemoteConfig = js.native
      
      def securityRules(): SecurityRules = js.native
      
      def storage(): Storage = js.native
    }
  }
  
  inline def appCheck(): AppCheck = ^.asInstanceOf[js.Dynamic].applyDynamic("appCheck")().asInstanceOf[AppCheck]
  inline def appCheck(app: App): AppCheck = ^.asInstanceOf[js.Dynamic].applyDynamic("appCheck")(app.asInstanceOf[js.Any]).asInstanceOf[AppCheck]
  
  @JSImport("firebase-admin/lib/firebase-namespace-api", "apps")
  @js.native
  val apps: js.Array[typingsJapgolly.firebaseAdmin.libFirebaseNamespaceApiMod.app.App | Null] = js.native
  
  inline def auth(): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("auth")().asInstanceOf[Auth]
  inline def auth(app: App): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("auth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  
  object credential {
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "credential")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof applicationDefaultFn` */
    inline def applicationDefault(): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("applicationDefault")().asInstanceOf[Credential]
    inline def applicationDefault(httpAgent: Agent): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("applicationDefault")(httpAgent.asInstanceOf[js.Any]).asInstanceOf[Credential]
    
    /* was `typeof certFn` */
    inline def cert(serviceAccountPathOrObject: String): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any]).asInstanceOf[Credential]
    inline def cert(serviceAccountPathOrObject: String, httpAgent: Agent): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[Credential]
    inline def cert(serviceAccountPathOrObject: ServiceAccount): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any]).asInstanceOf[Credential]
    inline def cert(serviceAccountPathOrObject: ServiceAccount, httpAgent: Agent): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[Credential]
    
    /* was `typeof refreshTokenFn` */
    inline def refreshToken(refreshTokenPathOrObject: String): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any]).asInstanceOf[Credential]
    inline def refreshToken(refreshTokenPathOrObject: String, httpAgent: Agent): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[Credential]
    inline def refreshToken(refreshTokenPathOrObject: js.Object): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any]).asInstanceOf[Credential]
    inline def refreshToken(refreshTokenPathOrObject: js.Object, httpAgent: Agent): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[Credential]
  }
  
  object database {
    
    inline def apply(): Database = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Database]
    inline def apply(app: App): Database = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Database]
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "database")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * {@link https://firebase.google.com/docs/reference/js/firebase.database.ServerValue | ServerValue}
      * constant from the `@firebase/database` package.
      */
    @JSImport("firebase-admin/lib/firebase-namespace-api", "database.ServerValue")
    @js.native
    val ServerValue: typingsJapgolly.firebaseDatabaseTypes.mod.ServerValue = js.native
    
    /* was `typeof rtdb.enableLogging` */
    inline def enableLogging(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")().asInstanceOf[Any]
    /* was `typeof rtdb.enableLogging` */
    inline def enableLogging(logger: js.Function1[/* a */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
    /* was `typeof rtdb.enableLogging` */
    inline def enableLogging(logger: js.Function1[/* a */ String, Any], persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
    /* was `typeof rtdb.enableLogging` */
    inline def enableLogging(logger: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
    /* was `typeof rtdb.enableLogging` */
    inline def enableLogging(logger: Boolean, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
    /* was `typeof rtdb.enableLogging` */
    inline def enableLogging(logger: Unit, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  object firestore {
    
    inline def apply(): typingsJapgolly.googleCloudFirestore.mod.Firestore = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.googleCloudFirestore.mod.Firestore]
    inline def apply(app: App): typingsJapgolly.googleCloudFirestore.mod.Firestore = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudFirestore.mod.Firestore]
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.BulkWriter")
    @js.native
    /* private */ open class BulkWriter ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.BulkWriter
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.BundleBuilder")
    @js.native
    open class BundleBuilder ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.BundleBuilder
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.CollectionGroup")
    @js.native
    /* private */ open class CollectionGroup[T] ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.CollectionGroup[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.CollectionReference")
    @js.native
    /* private */ open class CollectionReference[T] ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.CollectionReference[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.DocumentReference")
    @js.native
    /* private */ open class DocumentReference[T] ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.DocumentReference[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.DocumentSnapshot")
    @js.native
    /* protected */ open class DocumentSnapshot[T] ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.DocumentSnapshot[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.FieldPath")
    @js.native
    open class FieldPath protected ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.FieldPath {
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
      
      @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.FieldPath")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Returns a special sentinel FieldPath to refer to the ID of a document.
        * It can be used in queries to sort or filter by the document ID.
        */
      inline def documentId(): typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typingsJapgolly.googleCloudFirestore.FirebaseFirestore.FieldPath]
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.FieldValue")
    @js.native
    /* private */ open class FieldValue ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.FieldValue
    /* static members */
    object FieldValue {
      
      @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.FieldValue")
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
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.Firestore")
    @js.native
    /**
      * @param settings Configuration object. See [Firestore Documentation]
      * {@link https://firebase.google.com/docs/firestore/}
      */
    open class Firestore ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.Firestore {
      def this(settings: Settings) = this()
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.GeoPoint")
    @js.native
    open class GeoPoint protected ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.GeoPoint {
      /**
        * Creates a new immutable GeoPoint object with the provided latitude and
        * longitude values.
        * @param latitude The latitude as number between -90 and 90.
        * @param longitude The longitude as number between -180 and 180.
        */
      def this(latitude: Double, longitude: Double) = this()
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.GrpcStatus")
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
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.Query")
    @js.native
    /* protected */ open class Query[T] ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.Query[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.QueryDocumentSnapshot")
    @js.native
    /* private */ open class QueryDocumentSnapshot[T] ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.QueryDocumentSnapshot[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.QueryPartition")
    @js.native
    /* private */ open class QueryPartition[T] ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.QueryPartition[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.QuerySnapshot")
    @js.native
    /* private */ open class QuerySnapshot[T] ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.QuerySnapshot[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.Timestamp")
    @js.native
    open class Timestamp protected ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.Timestamp {
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
      
      @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.Timestamp")
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
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.Transaction")
    @js.native
    /* private */ open class Transaction ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.Transaction
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.WriteBatch")
    @js.native
    /* private */ open class WriteBatch ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.WriteBatch
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.WriteResult")
    @js.native
    /* private */ open class WriteResult ()
      extends typingsJapgolly.firebaseAdmin.libFirestoreFirestoreNamespaceMod.firestore.WriteResult
    
    /**
      * Sets or disables the log function for all active Firestore instances.
      *
      * @param logger A log function that takes a message (such as `console.log`) or
      * `null` to turn off logging.
      */
    inline def setLogFunction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogFunction")().asInstanceOf[Unit]
    inline def setLogFunction(logger: js.Function1[/* msg */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogFunction")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    object v1 {
      
      @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.v1")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.v1.FirestoreAdminClient")
      @js.native
      def FirestoreAdminClient: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_firestore_admin_client.FirestoreAdminClient */ Any = js.native
      inline def FirestoreAdminClient_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_firestore_admin_client.FirestoreAdminClient */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreAdminClient")(x.asInstanceOf[js.Any])
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.v1.FirestoreClient")
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
      @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.v1.FirestoreClient")
      @js.native
      def FirestoreClient: TypeofFirestoreClient = js.native
      inline def FirestoreClient_=(x: TypeofFirestoreClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreClient")(x.asInstanceOf[js.Any])
    }
    
    object v1beta1 {
      
      @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.v1beta1")
      @js.native
      val ^ : js.Any = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.v1beta1.FirestoreClient")
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
      @JSImport("firebase-admin/lib/firebase-namespace-api", "firestore.v1beta1.FirestoreClient")
      @js.native
      def FirestoreClient: TypeofFirestoreClient = js.native
      inline def FirestoreClient_=(x: TypeofFirestoreClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreClient")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def initializeApp(): typingsJapgolly.firebaseAdmin.libFirebaseNamespaceApiMod.app.App = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")().asInstanceOf[typingsJapgolly.firebaseAdmin.libFirebaseNamespaceApiMod.app.App]
  inline def initializeApp(options: Unit, name: String): typingsJapgolly.firebaseAdmin.libFirebaseNamespaceApiMod.app.App = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAdmin.libFirebaseNamespaceApiMod.app.App]
  inline def initializeApp(options: AppOptions): typingsJapgolly.firebaseAdmin.libFirebaseNamespaceApiMod.app.App = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libFirebaseNamespaceApiMod.app.App]
  inline def initializeApp(options: AppOptions, name: String): typingsJapgolly.firebaseAdmin.libFirebaseNamespaceApiMod.app.App = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAdmin.libFirebaseNamespaceApiMod.app.App]
  
  inline def installations(): Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("installations")().asInstanceOf[Installations]
  inline def installations(app: App): Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("installations")(app.asInstanceOf[js.Any]).asInstanceOf[Installations]
  
  inline def instanceId(): InstanceId = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceId")().asInstanceOf[InstanceId]
  inline def instanceId(app: App): InstanceId = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceId")(app.asInstanceOf[js.Any]).asInstanceOf[InstanceId]
  
  inline def machineLearning(): MachineLearning = ^.asInstanceOf[js.Dynamic].applyDynamic("machineLearning")().asInstanceOf[MachineLearning]
  inline def machineLearning(app: App): MachineLearning = ^.asInstanceOf[js.Dynamic].applyDynamic("machineLearning")(app.asInstanceOf[js.Any]).asInstanceOf[MachineLearning]
  
  inline def messaging(): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("messaging")().asInstanceOf[Messaging]
  inline def messaging(app: App): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("messaging")(app.asInstanceOf[js.Any]).asInstanceOf[Messaging]
  
  inline def projectManagement(): ProjectManagement = ^.asInstanceOf[js.Dynamic].applyDynamic("projectManagement")().asInstanceOf[ProjectManagement]
  inline def projectManagement(app: App): ProjectManagement = ^.asInstanceOf[js.Dynamic].applyDynamic("projectManagement")(app.asInstanceOf[js.Any]).asInstanceOf[ProjectManagement]
  
  inline def remoteConfig(): RemoteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("remoteConfig")().asInstanceOf[RemoteConfig]
  inline def remoteConfig(app: App): RemoteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("remoteConfig")(app.asInstanceOf[js.Any]).asInstanceOf[RemoteConfig]
  
  inline def securityRules(): SecurityRules = ^.asInstanceOf[js.Dynamic].applyDynamic("securityRules")().asInstanceOf[SecurityRules]
  inline def securityRules(app: App): SecurityRules = ^.asInstanceOf[js.Dynamic].applyDynamic("securityRules")(app.asInstanceOf[js.Any]).asInstanceOf[SecurityRules]
  
  inline def storage(): Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("storage")().asInstanceOf[Storage]
  inline def storage(app: App): Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("storage")(app.asInstanceOf[js.Any]).asInstanceOf[Storage]
}
