package typingsJapgolly.awsSdkMiddlewareSdkGlacier

import typingsJapgolly.awsSdkTypes.middlewareMod.BuildHandler
import typingsJapgolly.awsSdkTypes.middlewareMod.BuildHandlerArguments
import typingsJapgolly.awsSdkTypes.middlewareMod.HandlerExecutionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-sdk-glacier", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def addGlacierApiVersion(next: BuildHandler[_, _, _], context: HandlerExecutionContext): js.Function1[/* args */ BuildHandlerArguments[_, _], js.Promise[_]] = js.native
}

