package typingsJapgolly.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqsMod {
  type SQSHandler = typingsJapgolly.awsLambda.handlerMod.Handler[typingsJapgolly.awsLambda.sqsMod.SQSEvent, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.String
    - typingsJapgolly.awsLambda.awsLambdaStrings.Number
    - typingsJapgolly.awsLambda.awsLambdaStrings.Binary
    - java.lang.String
  */
  type SQSMessageAttributeDataType = typingsJapgolly.awsLambda.sqsMod._SQSMessageAttributeDataType | java.lang.String
  type SQSMessageAttributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsLambda.sqsMod.SQSMessageAttribute]
}
