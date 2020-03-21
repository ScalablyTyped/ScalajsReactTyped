package typingsJapgolly.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaMod {
  type LambdaHandler = js.Function3[
    /* event */ typingsJapgolly.actionsOnGoogle.commonMod.JsonObject, 
    /* context */ typingsJapgolly.awsLambda.handlerMod.Context, 
    /* callback */ typingsJapgolly.awsLambda.handlerMod.Callback[js.Any], 
    js.Promise[scala.Unit]
  ]
}
