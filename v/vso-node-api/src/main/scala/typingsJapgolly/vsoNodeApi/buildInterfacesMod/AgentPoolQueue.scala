package typingsJapgolly.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentPoolQueue extends js.Object {
  var _links: js.Any
  /**
    * The ID of the queue.
    */
  var id: Double
  /**
    * The name of the queue.
    */
  var name: String
  /**
    * The pool used by this queue.
    */
  var pool: TaskAgentPoolReference
  /**
    * The full http link to the resource.
    */
  var url: String
}

object AgentPoolQueue {
  @scala.inline
  def apply(_links: js.Any, id: Double, name: String, pool: TaskAgentPoolReference, url: String): AgentPoolQueue = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentPoolQueue]
  }
}

