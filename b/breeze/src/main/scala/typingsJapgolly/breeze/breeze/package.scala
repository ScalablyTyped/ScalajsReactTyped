package typingsJapgolly.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object breeze {
  type ExecuteQueryErrorCallback = js.Function1[/* error */ typingsJapgolly.breeze.AnonEntityManager, scala.Unit]
  type ExecuteQuerySuccessCallback = js.Function1[/* data */ typingsJapgolly.breeze.breeze.QueryResult, scala.Unit]
  type SaveChangesErrorCallback = js.Function1[/* error */ typingsJapgolly.breeze.AnonEntityErrors, scala.Unit]
  type SaveChangesSuccessCallback = js.Function1[/* saveResult */ typingsJapgolly.breeze.breeze.SaveResult, scala.Unit]
  type ValidatorFunction = js.Function2[
    /* value */ js.Any, 
    /* context */ typingsJapgolly.breeze.breeze.ValidatorFunctionContext, 
    scala.Unit
  ]
}
