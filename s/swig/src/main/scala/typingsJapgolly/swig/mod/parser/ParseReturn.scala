package typingsJapgolly.swig.mod.parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseReturn extends js.Object {
  var blocks: js.Any
  var name: String
  var parent: js.Any
  var tokens: js.Array[_]
}

object ParseReturn {
  @scala.inline
  def apply(blocks: js.Any, name: String, parent: js.Any, tokens: js.Array[_]): ParseReturn = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseReturn]
  }
}

