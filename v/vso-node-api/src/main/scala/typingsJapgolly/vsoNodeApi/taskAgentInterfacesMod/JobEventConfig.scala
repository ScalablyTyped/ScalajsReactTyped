package typingsJapgolly.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobEventConfig extends js.Object {
  var timeout: String
}

object JobEventConfig {
  @scala.inline
  def apply(timeout: String): JobEventConfig = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobEventConfig]
  }
}

