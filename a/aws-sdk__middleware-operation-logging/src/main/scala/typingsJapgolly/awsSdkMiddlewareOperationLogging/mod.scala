package typingsJapgolly.awsSdkMiddlewareOperationLogging

import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.middlewareMod.HandlerArguments
import typingsJapgolly.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-operation-logging", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def logOperationInfoMiddleware[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: Handler[Input, Output], hasLoggerModel: HandlerExecutionContext): js.Function1[/* args */ HandlerArguments[Input], js.Promise[Output]] = js.native
}

