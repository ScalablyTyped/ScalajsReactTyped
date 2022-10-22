package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateDatabaseRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.UpdateDatabaseRequest")
@js.native
/**
  * Constructs a new UpdateDatabaseRequest.
  * @param [properties] Properties to set
  */
open class UpdateDatabaseRequest ()
  extends StObject
     with IUpdateDatabaseRequest {
  def this(properties: IUpdateDatabaseRequest) = this()
  
  /**
    * Converts this UpdateDatabaseRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object UpdateDatabaseRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.UpdateDatabaseRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an UpdateDatabaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateDatabaseRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): UpdateDatabaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UpdateDatabaseRequest]
  
  /**
    * Creates a plain object from an UpdateDatabaseRequest message. Also converts values to other types if specified.
    * @param message UpdateDatabaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UpdateDatabaseRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: UpdateDatabaseRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
