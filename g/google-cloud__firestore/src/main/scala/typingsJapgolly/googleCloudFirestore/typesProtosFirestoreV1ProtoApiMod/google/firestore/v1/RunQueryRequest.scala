package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.newTransaction
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.readTime
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.structuredQuery
import typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.transaction
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RunQueryRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.RunQueryRequest")
@js.native
/**
  * Constructs a new RunQueryRequest.
  * @param [properties] Properties to set
  */
open class RunQueryRequest ()
  extends StObject
     with IRunQueryRequest {
  def this(properties: IRunQueryRequest) = this()
  
  /** RunQueryRequest consistencySelector. */
  var consistencySelector: js.UndefOr[transaction | newTransaction | readTime] = js.native
  
  /** RunQueryRequest parent. */
  @JSName("parent")
  var parent_RunQueryRequest: String = js.native
  
  /** RunQueryRequest queryType. */
  var queryType: js.UndefOr[structuredQuery] = js.native
  
  /**
    * Converts this RunQueryRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object RunQueryRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.RunQueryRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a RunQueryRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RunQueryRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): RunQueryRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RunQueryRequest]
  
  /**
    * Creates a plain object from a RunQueryRequest message. Also converts values to other types if specified.
    * @param message RunQueryRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: RunQueryRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: RunQueryRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
