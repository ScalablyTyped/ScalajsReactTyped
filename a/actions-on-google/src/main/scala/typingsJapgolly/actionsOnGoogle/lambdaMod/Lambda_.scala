package typingsJapgolly.actionsOnGoogle.lambdaMod

import typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.Framework
import typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.StandardHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/framework/lambda", "Lambda")
@js.native
class Lambda_ () extends Framework[LambdaHandler] {
  /** @public */
  /* CompleteClass */
  override def check(args: js.Any*): Boolean = js.native
  def check(first: js.Object, second: js.Object, third: js.Object): Boolean = js.native
  /** @public */
  /* CompleteClass */
  override def handle(base: StandardHandler): LambdaHandler = js.native
  def isCallback(third: js.Object): /* is aws-lambda.aws-lambda/handler.Callback<any> */ Boolean = js.native
  def isContext(second: js.Object): /* is aws-lambda.aws-lambda/handler.Context */ Boolean = js.native
}

