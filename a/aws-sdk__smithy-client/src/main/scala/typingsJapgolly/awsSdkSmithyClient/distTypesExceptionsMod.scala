package typingsJapgolly.awsSdkSmithyClient

import typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.$metadata
import typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.client
import typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.message
import typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.server
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpResponse
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import typingsJapgolly.awsSdkTypes.distTypesShapesMod.RetryableTrait
import typingsJapgolly.awsSdkTypes.distTypesShapesMod.SmithyException
import typingsJapgolly.std.Error
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesExceptionsMod {
  
  @JSImport("@aws-sdk/smithy-client/dist-types/exceptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.awsSdkTypes.distTypesShapesMod.SmithyException because var conflicts: name. Inlined $service, $fault, $retryable, $response */ @JSImport("@aws-sdk/smithy-client/dist-types/exceptions", "ServiceException")
  @js.native
  open class ServiceException protected ()
    extends StObject
       with Error
       with MetadataBearer {
    def this(options: ServiceExceptionOptions) = this()
    
    @JSName("$fault")
    val $fault: client | typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.client | server | typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.server = js.native
    
    /**
      * Metadata pertaining to this request.
      */
    /* CompleteClass */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    @JSName("$response")
    var $response: js.UndefOr[HttpResponse] = js.native
    
    @JSName("$retryable")
    var $retryable: js.UndefOr[RetryableTrait] = js.native
    
    /**
      * The service that encountered the exception.
      */
    @JSName("$service")
    val $service: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def decorateServiceException[E /* <: ServiceException */](exception: E): E = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateServiceException")(exception.asInstanceOf[js.Any]).asInstanceOf[E]
  inline def decorateServiceException[E /* <: ServiceException */](exception: E, additions: Record[String, Any]): E = (^.asInstanceOf[js.Dynamic].applyDynamic("decorateServiceException")(exception.asInstanceOf[js.Any], additions.asInstanceOf[js.Any])).asInstanceOf[E]
  
  type ExceptionOptionType[ExceptionType /* <: js.Error */, BaseExceptionType /* <: js.Error */] = Omit[ExceptionType, Exclude[/* keyof BaseExceptionType */ String, $metadata | message]]
  
  trait ServiceExceptionOptions
    extends StObject
       with SmithyException
       with MetadataBearer {
    
    var message: js.UndefOr[String] = js.undefined
  }
  object ServiceExceptionOptions {
    
    inline def apply(
      $fault: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.client | typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.server,
      $metadata: ResponseMetadata,
      name: String
    ): ServiceExceptionOptions = {
      val __obj = js.Dynamic.literal($fault = $fault.asInstanceOf[js.Any], $metadata = $metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceExceptionOptions]
    }
    
    extension [Self <: ServiceExceptionOptions](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
