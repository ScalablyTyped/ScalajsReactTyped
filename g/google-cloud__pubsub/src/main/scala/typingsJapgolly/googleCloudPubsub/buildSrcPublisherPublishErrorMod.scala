package typingsJapgolly.googleCloudPubsub

import typingsJapgolly.grpcGrpcJs.buildSrcCallMod.ServiceError
import typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status
import typingsJapgolly.grpcGrpcJs.buildSrcMetadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPublisherPublishErrorMod {
  
  @JSImport("@google-cloud/pubsub/build/src/publisher/publish-error", "PublishError")
  @js.native
  open class PublishError protected ()
    extends StObject
       with ServiceError {
    def this(key: String, err: ServiceError) = this()
    
    /* CompleteClass */
    var code: Status = js.native
    
    /* CompleteClass */
    var details: String = js.native
    
    var error: ServiceError = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var metadata: Metadata = js.native
    @JSName("metadata")
    var metadata_PublishError: typingsJapgolly.googleGax.mod.grpc.Metadata = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var orderingKey: String = js.native
  }
}
