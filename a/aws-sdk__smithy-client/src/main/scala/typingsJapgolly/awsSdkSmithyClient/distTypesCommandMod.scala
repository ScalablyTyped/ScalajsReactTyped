package typingsJapgolly.awsSdkSmithyClient

import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandMod {
  
  /* note: abstract class */ @JSImport("@aws-sdk/smithy-client/dist-types/command", "Command")
  @js.native
  open class Command[Input /* <: ClientInput */, Output /* <: ClientOutput */, ResolvedClientConfiguration, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */] ()
    extends StObject
       with typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command[ClientInput, Input, ClientOutput, Output, ResolvedClientConfiguration] {
    
    /* CompleteClass */
    override val input: Input = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[Input, Output] = js.native
    
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[ClientInput, ClientOutput],
      configuration: ResolvedClientConfiguration,
      options: Any
    ): Handler[Input, Output] = js.native
  }
}
