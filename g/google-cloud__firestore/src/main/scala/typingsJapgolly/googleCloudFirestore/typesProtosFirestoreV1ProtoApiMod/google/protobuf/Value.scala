package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.boolValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.listValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.nullValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.numberValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.stringValue
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.structValue
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Value. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.Value")
@js.native
/**
  * Constructs a new Value.
  * @param [properties] Properties to set
  */
open class Value ()
  extends StObject
     with IValue {
  def this(properties: IValue) = this()
  
  /** Value kind. */
  var kind: js.UndefOr[nullValue | numberValue | stringValue | boolValue | structValue | listValue] = js.native
  
  /**
    * Converts this Value to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
}
object Value {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.Value")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Value message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Value
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  /**
    * Creates a plain object from a Value message. Also converts values to other types if specified.
    * @param message Value
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Value): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: Value, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
