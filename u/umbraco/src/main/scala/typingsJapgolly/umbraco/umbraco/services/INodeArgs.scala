package typingsJapgolly.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node args
  */
trait INodeArgs extends js.Object {
  var node: js.Any
  var section: js.Any
}

object INodeArgs {
  @scala.inline
  def apply(node: js.Any, section: js.Any): INodeArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INodeArgs]
  }
}

