package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1.TargetChange.TargetChangeType
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TargetChange. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.TargetChange")
@js.native
/**
  * Constructs a new TargetChange.
  * @param [properties] Properties to set
  */
open class TargetChange ()
  extends StObject
     with ITargetChange {
  def this(properties: ITargetChange) = this()
  
  /** TargetChange resumeToken. */
  @JSName("resumeToken")
  var resumeToken_TargetChange: js.typedarray.Uint8Array = js.native
  
  /** TargetChange targetChangeType. */
  @JSName("targetChangeType")
  var targetChangeType_TargetChange: TargetChangeType = js.native
  
  /** TargetChange targetIds. */
  @JSName("targetIds")
  var targetIds_TargetChange: js.Array[Double] = js.native
  
  /**
    * Converts this TargetChange to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object TargetChange {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.TargetChange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a TargetChange message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TargetChange
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): TargetChange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TargetChange]
  
  /**
    * Creates a plain object from a TargetChange message. Also converts values to other types if specified.
    * @param message TargetChange
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: TargetChange): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: TargetChange, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /** TargetChangeType enum. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.NO_CHANGE
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.ADD
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.REMOVE
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CURRENT
    - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.RESET
  */
  trait TargetChangeType extends StObject
  object TargetChangeType {
    
    inline def ADD: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.ADD = "ADD".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.ADD]
    
    inline def CURRENT: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CURRENT = "CURRENT".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.CURRENT]
    
    inline def NO_CHANGE: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.NO_CHANGE = "NO_CHANGE".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.NO_CHANGE]
    
    inline def REMOVE: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.REMOVE = "REMOVE".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.REMOVE]
    
    inline def RESET: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.RESET = "RESET".asInstanceOf[typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.RESET]
  }
}
