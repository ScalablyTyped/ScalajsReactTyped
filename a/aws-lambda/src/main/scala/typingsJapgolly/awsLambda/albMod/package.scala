package typingsJapgolly.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object albMod {
  type ALBCallback = typingsJapgolly.awsLambda.handlerMod.Callback[typingsJapgolly.awsLambda.albMod.ALBResult]
  type ALBHandler = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.albMod.ALBEvent, 
    typingsJapgolly.awsLambda.albMod.ALBResult
  ]
}
