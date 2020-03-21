package typingsJapgolly.actionsOnGoogle.lambdaMod

import typingsJapgolly.actionsOnGoogle.commonMod.JsonObject
import typingsJapgolly.awsLambda.handlerMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaMetadata extends js.Object {
  /** @public */
  var context: Context
  /** @public */
  var event: JsonObject
}

object LambdaMetadata {
  @scala.inline
  def apply(context: Context, event: JsonObject): LambdaMetadata = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LambdaMetadata]
  }
}

