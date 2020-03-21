package typingsJapgolly.awsSdkMiddlewareExpectContinue

import typingsJapgolly.awsSdkTypes.middlewareMod.BuildHandler
import typingsJapgolly.awsSdkTypes.middlewareMod.BuildHandlerArguments
import typingsJapgolly.awsSdkTypes.middlewareMod.HandlerExecutionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-expect-continue", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def addExpectContinue(next: BuildHandler[_, _, _], context: HandlerExecutionContext): js.Function1[/* args */ BuildHandlerArguments[_, _], js.Promise[_]] = js.native
}

