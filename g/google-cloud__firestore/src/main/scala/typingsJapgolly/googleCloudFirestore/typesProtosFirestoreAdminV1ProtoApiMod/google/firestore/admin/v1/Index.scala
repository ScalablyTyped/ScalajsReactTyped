package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.arrayConfig
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.order
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.IIndexField
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.IndexField.ArrayConfig
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.IndexField.Order
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.QueryScope
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index.State
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Index. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Index")
@js.native
/**
  * Constructs a new Index.
  * @param [properties] Properties to set
  */
open class Index ()
  extends StObject
     with IIndex {
  def this(properties: IIndex) = this()
  
  /** Index fields. */
  @JSName("fields")
  var fields_Index: js.Array[IIndexField] = js.native
  
  /** Index name. */
  @JSName("name")
  var name_Index: String = js.native
  
  /** Index queryScope. */
  @JSName("queryScope")
  var queryScope_Index: QueryScope = js.native
  
  /** Index state. */
  @JSName("state")
  var state_Index: State = js.native
  
  /**
    * Converts this Index to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Index {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Index")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an IndexField. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Index.IndexField")
  @js.native
  /**
    * Constructs a new IndexField.
    * @param [properties] Properties to set
    */
  open class IndexField ()
    extends StObject
       with IIndexField {
    def this(properties: IIndexField) = this()
    
    /** IndexField fieldPath. */
    @JSName("fieldPath")
    var fieldPath_IndexField: String = js.native
    
    /**
      * Converts this IndexField to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** IndexField valueMode. */
    var valueMode: js.UndefOr[order | arrayConfig] = js.native
  }
  object IndexField {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Index.IndexField")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an IndexField message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns IndexField
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): IndexField = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[IndexField]
    
    /**
      * Creates a plain object from an IndexField message. Also converts values to other types if specified.
      * @param message IndexField
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: IndexField): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: IndexField, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /** ArrayConfig enum. */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.ARRAY_CONFIG_UNSPECIFIED
      - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CONTAINS
    */
    trait ArrayConfig extends StObject
    object ArrayConfig {
      
      inline def ARRAY_CONFIG_UNSPECIFIED: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.ARRAY_CONFIG_UNSPECIFIED = "ARRAY_CONFIG_UNSPECIFIED".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.ARRAY_CONFIG_UNSPECIFIED]
      
      inline def CONTAINS: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CONTAINS = "CONTAINS".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CONTAINS]
    }
    
    /** Order enum. */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.ORDER_UNSPECIFIED
      - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.ASCENDING
      - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.DESCENDING
    */
    trait Order extends StObject
    object Order {
      
      inline def ASCENDING: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.ASCENDING = "ASCENDING".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.ASCENDING]
      
      inline def DESCENDING: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.DESCENDING = "DESCENDING".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.DESCENDING]
      
      inline def ORDER_UNSPECIFIED: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.ORDER_UNSPECIFIED = "ORDER_UNSPECIFIED".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.ORDER_UNSPECIFIED]
    }
  }
  
  /**
    * Creates an Index message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Index
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Index = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Index]
  
  /**
    * Creates a plain object from an Index message. Also converts values to other types if specified.
    * @param message Index
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Index): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Index, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /** Properties of an IndexField. */
  trait IIndexField extends StObject {
    
    /** IndexField arrayConfig */
    var arrayConfig: js.UndefOr[ArrayConfig | Null] = js.undefined
    
    /** IndexField fieldPath */
    var fieldPath: js.UndefOr[String | Null] = js.undefined
    
    /** IndexField order */
    var order: js.UndefOr[Order | Null] = js.undefined
  }
  object IIndexField {
    
    inline def apply(): IIndexField = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIndexField]
    }
    
    extension [Self <: IIndexField](x: Self) {
      
      inline def setArrayConfig(value: ArrayConfig): Self = StObject.set(x, "arrayConfig", value.asInstanceOf[js.Any])
      
      inline def setArrayConfigNull: Self = StObject.set(x, "arrayConfig", null)
      
      inline def setArrayConfigUndefined: Self = StObject.set(x, "arrayConfig", js.undefined)
      
      inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
      
      inline def setFieldPathNull: Self = StObject.set(x, "fieldPath", null)
      
      inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /** QueryScope enum. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.QUERY_SCOPE_UNSPECIFIED
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.COLLECTION
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.COLLECTION_GROUP
  */
  trait QueryScope extends StObject
  object QueryScope {
    
    inline def COLLECTION: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.COLLECTION = "COLLECTION".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.COLLECTION]
    
    inline def COLLECTION_GROUP: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.COLLECTION_GROUP = "COLLECTION_GROUP".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.COLLECTION_GROUP]
    
    inline def QUERY_SCOPE_UNSPECIFIED: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.QUERY_SCOPE_UNSPECIFIED = "QUERY_SCOPE_UNSPECIFIED".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.QUERY_SCOPE_UNSPECIFIED]
  }
  
  /** State enum. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.STATE_UNSPECIFIED
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CREATING
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.READY
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.NEEDS_REPAIR
  */
  trait State extends StObject
  object State {
    
    inline def CREATING: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CREATING = "CREATING".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CREATING]
    
    inline def NEEDS_REPAIR: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.NEEDS_REPAIR = "NEEDS_REPAIR".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.NEEDS_REPAIR]
    
    inline def READY: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.READY = "READY".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.READY]
    
    inline def STATE_UNSPECIFIED: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.STATE_UNSPECIFIED = "STATE_UNSPECIFIED".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.STATE_UNSPECIFIED]
  }
}
