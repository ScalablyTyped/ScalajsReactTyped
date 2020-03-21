package typingsJapgolly.azureArmResource.resourceModelsMod

import typingsJapgolly.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationListResult extends Array[Operation] {
  /**
    * URL to get the next set of operation list results if there are any.
    */
  var nextLink: js.UndefOr[String] = js.native
}

