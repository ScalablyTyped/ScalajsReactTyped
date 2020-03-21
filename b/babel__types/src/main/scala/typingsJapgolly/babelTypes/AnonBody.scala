package typingsJapgolly.babelTypes

import typingsJapgolly.babelTypes.mod.BlockStatement_
import typingsJapgolly.babelTypes.mod.Expression
import typingsJapgolly.babelTypes.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: BlockStatement_ | Statement | Expression
}

object AnonBody {
  @scala.inline
  def apply(body: BlockStatement_ | Statement | Expression): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

