package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.arrayValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.booleanValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.bytesValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.doubleValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.geoPointValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.integerValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.mapValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.nullValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.referenceValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.stringValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.timestampValue
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Value. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.Value")
@js.native
/**
  * Constructs a new Value.
  * @param [properties] Properties to set
  */
open class Value ()
  extends StObject
     with IValue {
  def this(properties: IValue) = this()
  
  /**
    * Converts this Value to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** Value valueType. */
  var valueType: js.UndefOr[
    nullValue | booleanValue | integerValue | doubleValue | timestampValue | stringValue | bytesValue | referenceValue | geoPointValue | arrayValue | mapValue
  ] = js.native
}
object Value {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.Value")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Value message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Value
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  /**
    * Creates a plain object from a Value message. Also converts values to other types if specified.
    * @param message Value
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Value): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Value, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
