package typingsJapgolly.awsSdkTypes.distTypesEventStreamMod

import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandlerArguments
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandlerOutput
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStreamPayloadHandler extends StObject {
  
  def handle[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: FinalizeHandler[Input, Output], args: FinalizeHandlerArguments[Input]): js.Promise[FinalizeHandlerOutput[Output]] = js.native
  def handle[Input /* <: js.Object */, Output /* <: MetadataBearer */](
    next: FinalizeHandler[Input, Output],
    args: FinalizeHandlerArguments[Input],
    context: HandlerExecutionContext
  ): js.Promise[FinalizeHandlerOutput[Output]] = js.native
}
