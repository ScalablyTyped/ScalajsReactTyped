package typingsJapgolly.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPoolReference extends js.Object {
  /**
    * The pool ID.
    */
  var id: Double
  /**
    * A value indicating whether or not this pool is managed by the service.
    */
  var isHosted: Boolean
  /**
    * The pool name.
    */
  var name: String
}

object TaskAgentPoolReference {
  @scala.inline
  def apply(id: Double, isHosted: Boolean, name: String): TaskAgentPoolReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskAgentPoolReference]
  }
}

