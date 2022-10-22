package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Label
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldDescriptorProto. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.FieldDescriptorProto")
@js.native
/**
  * Constructs a new FieldDescriptorProto.
  * @param [properties] Properties to set
  */
open class FieldDescriptorProto ()
  extends StObject
     with IFieldDescriptorProto {
  def this(properties: IFieldDescriptorProto) = this()
  
  /** FieldDescriptorProto defaultValue. */
  @JSName("defaultValue")
  var defaultValue_FieldDescriptorProto: String = js.native
  
  /** FieldDescriptorProto extendee. */
  @JSName("extendee")
  var extendee_FieldDescriptorProto: String = js.native
  
  /** FieldDescriptorProto jsonName. */
  @JSName("jsonName")
  var jsonName_FieldDescriptorProto: String = js.native
  
  /** FieldDescriptorProto label. */
  @JSName("label")
  var label_FieldDescriptorProto: Label = js.native
  
  /** FieldDescriptorProto name. */
  @JSName("name")
  var name_FieldDescriptorProto: String = js.native
  
  /** FieldDescriptorProto number. */
  @JSName("number")
  var number_FieldDescriptorProto: Double = js.native
  
  /** FieldDescriptorProto oneofIndex. */
  @JSName("oneofIndex")
  var oneofIndex_FieldDescriptorProto: Double = js.native
  
  /**
    * Converts this FieldDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** FieldDescriptorProto typeName. */
  @JSName("typeName")
  var typeName_FieldDescriptorProto: String = js.native
  
  /** FieldDescriptorProto type. */
  @JSName("type")
  var type_FieldDescriptorProto: Type = js.native
}
object FieldDescriptorProto {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.FieldDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a FieldDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldDescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldDescriptorProto]
  
  /**
    * Creates a plain object from a FieldDescriptorProto message. Also converts values to other types if specified.
    * @param message FieldDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: FieldDescriptorProto): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: FieldDescriptorProto, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /** Label enum. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.LABEL_OPTIONAL
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.LABEL_REQUIRED
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.LABEL_REPEATED
  */
  trait Label extends StObject
  object Label {
    
    inline def LABEL_OPTIONAL: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.LABEL_OPTIONAL = "LABEL_OPTIONAL".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.LABEL_OPTIONAL]
    
    inline def LABEL_REPEATED: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.LABEL_REPEATED = "LABEL_REPEATED".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.LABEL_REPEATED]
    
    inline def LABEL_REQUIRED: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.LABEL_REQUIRED = "LABEL_REQUIRED".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.LABEL_REQUIRED]
  }
  
  /** Type enum. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_DOUBLE
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_FLOAT
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_INT64
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_UINT64
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_INT32
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_FIXED64
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_FIXED32
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_BOOL
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_STRING
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_GROUP
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_MESSAGE
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_BYTES
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_UINT32
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_ENUM
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_SFIXED32
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_SFIXED64
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_SINT32
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_SINT64
  */
  trait Type extends StObject
  object Type {
    
    inline def TYPE_BOOL: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_BOOL = "TYPE_BOOL".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_BOOL]
    
    inline def TYPE_BYTES: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_BYTES = "TYPE_BYTES".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_BYTES]
    
    inline def TYPE_DOUBLE: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_DOUBLE = "TYPE_DOUBLE".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_DOUBLE]
    
    inline def TYPE_ENUM: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_ENUM = "TYPE_ENUM".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_ENUM]
    
    inline def TYPE_FIXED32: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_FIXED32 = "TYPE_FIXED32".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_FIXED32]
    
    inline def TYPE_FIXED64: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_FIXED64 = "TYPE_FIXED64".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_FIXED64]
    
    inline def TYPE_FLOAT: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_FLOAT = "TYPE_FLOAT".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_FLOAT]
    
    inline def TYPE_GROUP: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_GROUP = "TYPE_GROUP".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_GROUP]
    
    inline def TYPE_INT32: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_INT32 = "TYPE_INT32".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_INT32]
    
    inline def TYPE_INT64: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_INT64 = "TYPE_INT64".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_INT64]
    
    inline def TYPE_MESSAGE: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_MESSAGE = "TYPE_MESSAGE".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_MESSAGE]
    
    inline def TYPE_SFIXED32: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_SFIXED32 = "TYPE_SFIXED32".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_SFIXED32]
    
    inline def TYPE_SFIXED64: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_SFIXED64 = "TYPE_SFIXED64".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_SFIXED64]
    
    inline def TYPE_SINT32: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_SINT32 = "TYPE_SINT32".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_SINT32]
    
    inline def TYPE_SINT64: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_SINT64 = "TYPE_SINT64".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_SINT64]
    
    inline def TYPE_STRING: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_STRING = "TYPE_STRING".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_STRING]
    
    inline def TYPE_UINT32: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_UINT32 = "TYPE_UINT32".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_UINT32]
    
    inline def TYPE_UINT64: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_UINT64 = "TYPE_UINT64".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.TYPE_UINT64]
  }
}
