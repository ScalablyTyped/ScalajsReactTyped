package typingsJapgolly.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snsMod {
  type SNSHandler = typingsJapgolly.awsLambda.handlerMod.Handler[typingsJapgolly.awsLambda.snsMod.SNSEvent, scala.Unit]
  type SNSMessageAttributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsLambda.snsMod.SNSMessageAttribute]
}
