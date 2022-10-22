package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Database.ConcurrencyMode
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Database.DatabaseType
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Database. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Database")
@js.native
/**
  * Constructs a new Database.
  * @param [properties] Properties to set
  */
open class Database ()
  extends StObject
     with IDatabase {
  def this(properties: IDatabase) = this()
  
  /** Database concurrencyMode. */
  @JSName("concurrencyMode")
  var concurrencyMode_Database: ConcurrencyMode = js.native
  
  /** Database etag. */
  @JSName("etag")
  var etag_Database: String = js.native
  
  /** Database locationId. */
  @JSName("locationId")
  var locationId_Database: String = js.native
  
  /** Database name. */
  @JSName("name")
  var name_Database: String = js.native
  
  /**
    * Converts this Database to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** Database type. */
  @JSName("type")
  var type_Database: DatabaseType = js.native
}
object Database {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Database")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Database message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Database
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Database]
  
  /**
    * Creates a plain object from a Database message. Also converts values to other types if specified.
    * @param message Database
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Database): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Database, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /** ConcurrencyMode enum. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CONCURRENCY_MODE_UNSPECIFIED
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.OPTIMISTIC
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.PESSIMISTIC
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.OPTIMISTIC_WITH_ENTITY_GROUPS
  */
  trait ConcurrencyMode extends StObject
  object ConcurrencyMode {
    
    inline def CONCURRENCY_MODE_UNSPECIFIED: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CONCURRENCY_MODE_UNSPECIFIED = "CONCURRENCY_MODE_UNSPECIFIED".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CONCURRENCY_MODE_UNSPECIFIED]
    
    inline def OPTIMISTIC: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.OPTIMISTIC = "OPTIMISTIC".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.OPTIMISTIC]
    
    inline def OPTIMISTIC_WITH_ENTITY_GROUPS: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.OPTIMISTIC_WITH_ENTITY_GROUPS = "OPTIMISTIC_WITH_ENTITY_GROUPS".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.OPTIMISTIC_WITH_ENTITY_GROUPS]
    
    inline def PESSIMISTIC: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.PESSIMISTIC = "PESSIMISTIC".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.PESSIMISTIC]
  }
  
  /** DatabaseType enum. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.DATABASE_TYPE_UNSPECIFIED
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.FIRESTORE_NATIVE
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.DATASTORE_MODE
  */
  trait DatabaseType extends StObject
  object DatabaseType {
    
    inline def DATABASE_TYPE_UNSPECIFIED: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.DATABASE_TYPE_UNSPECIFIED = "DATABASE_TYPE_UNSPECIFIED".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.DATABASE_TYPE_UNSPECIFIED]
    
    inline def DATASTORE_MODE: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.DATASTORE_MODE = "DATASTORE_MODE".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.DATASTORE_MODE]
    
    inline def FIRESTORE_NATIVE: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.FIRESTORE_NATIVE = "FIRESTORE_NATIVE".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.FIRESTORE_NATIVE]
  }
}
