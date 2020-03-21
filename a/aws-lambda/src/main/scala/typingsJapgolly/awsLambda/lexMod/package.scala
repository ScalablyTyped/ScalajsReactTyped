package typingsJapgolly.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lexMod {
  type LexCallback = typingsJapgolly.awsLambda.handlerMod.Callback[typingsJapgolly.awsLambda.lexMod.LexResult]
  type LexHandler = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.lexMod.LexEvent, 
    typingsJapgolly.awsLambda.lexMod.LexResult
  ]
  type LexSlotDetails = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsLambda.AnonOriginalValue]
}
