package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf.FieldOptions.CType
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf.FieldOptions.JSType
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldOptions. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.FieldOptions")
@js.native
/**
  * Constructs a new FieldOptions.
  * @param [properties] Properties to set
  */
open class FieldOptions ()
  extends StObject
     with IFieldOptions {
  def this(properties: IFieldOptions) = this()
  
  /** FieldOptions ctype. */
  @JSName("ctype")
  var ctype_FieldOptions: CType = js.native
  
  /** FieldOptions deprecated. */
  @JSName("deprecated")
  var deprecated_FieldOptions: Boolean = js.native
  
  /** FieldOptions jstype. */
  @JSName("jstype")
  var jstype_FieldOptions: JSType = js.native
  
  /** FieldOptions lazy. */
  @JSName("lazy")
  var lazy_FieldOptions: Boolean = js.native
  
  /** FieldOptions packed. */
  @JSName("packed")
  var packed_FieldOptions: Boolean = js.native
  
  /**
    * Converts this FieldOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** FieldOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_FieldOptions: js.Array[IUninterpretedOption] = js.native
  
  /** FieldOptions weak. */
  @JSName("weak")
  var weak_FieldOptions: Boolean = js.native
}
object FieldOptions {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.FieldOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a FieldOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  
  /**
    * Creates a plain object from a FieldOptions message. Also converts values to other types if specified.
    * @param message FieldOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: FieldOptions): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: FieldOptions, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /** CType enum. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.STRING
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CORD
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.STRING_PIECE
  */
  trait CType extends StObject
  object CType {
    
    inline def CORD: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CORD = "CORD".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CORD]
    
    inline def STRING: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.STRING = "STRING".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.STRING]
    
    inline def STRING_PIECE: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.STRING_PIECE = "STRING_PIECE".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.STRING_PIECE]
  }
  
  /** JSType enum. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.JS_NORMAL
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.JS_STRING
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.JS_NUMBER
  */
  trait JSType extends StObject
  object JSType {
    
    inline def JS_NORMAL: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.JS_NORMAL = "JS_NORMAL".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.JS_NORMAL]
    
    inline def JS_NUMBER: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.JS_NUMBER = "JS_NUMBER".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.JS_NUMBER]
    
    inline def JS_STRING: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.JS_STRING = "JS_STRING".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.JS_STRING]
  }
}
