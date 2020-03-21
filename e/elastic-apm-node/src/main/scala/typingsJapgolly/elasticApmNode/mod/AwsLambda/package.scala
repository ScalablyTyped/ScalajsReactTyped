package typingsJapgolly.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AwsLambda {
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null | java.lang.String], 
    /* result */ js.UndefOr[TResult], 
    scala.Unit
  ]
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ typingsJapgolly.elasticApmNode.mod.AwsLambda.Context, 
    /* callback */ typingsJapgolly.elasticApmNode.mod.AwsLambda.Callback[TResult], 
    scala.Unit | js.Promise[TResult]
  ]
}
