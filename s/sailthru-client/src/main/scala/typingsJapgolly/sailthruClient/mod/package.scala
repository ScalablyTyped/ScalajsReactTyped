package typingsJapgolly.sailthruClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SailthruCallback = js.Function2[
    /* err */ typingsJapgolly.sailthruClient.mod.SailthruError, 
    /* response */ typingsJapgolly.sailthruClient.mod.SailthruResponse, 
    scala.Unit
  ]
  type SailthruError = typingsJapgolly.sailthruClient.AnonError | scala.Null
  type SailthruResponse = js.Object | java.lang.String
}
