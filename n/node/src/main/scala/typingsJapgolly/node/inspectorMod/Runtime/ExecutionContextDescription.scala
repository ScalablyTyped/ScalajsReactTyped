package typingsJapgolly.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of an isolated world.
  */
trait ExecutionContextDescription extends js.Object {
  /**
    * Embedder-specific auxiliary data.
    */
  var auxData: js.UndefOr[js.Object] = js.undefined
  /**
    * Unique id of the execution context. It can be used to specify in which execution context script evaluation should be performed.
    */
  var id: ExecutionContextId
  /**
    * Human readable name describing given context.
    */
  var name: java.lang.String
  /**
    * Execution context origin.
    */
  var origin: java.lang.String
}

object ExecutionContextDescription {
  @scala.inline
  def apply(
    id: ExecutionContextId,
    name: java.lang.String,
    origin: java.lang.String,
    auxData: js.Object = null
  ): ExecutionContextDescription = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    if (auxData != null) __obj.updateDynamic("auxData")(auxData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextDescription]
  }
}

