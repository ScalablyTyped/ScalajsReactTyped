package typingsJapgolly.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queuesMod {
  type JobCallback = js.Function3[
    /* result */ js.Any, 
    /* jobData */ js.Any, 
    /* job */ typingsJapgolly.arangodb.DocumentJob, 
    scala.Unit
  ]
}
