package typingsJapgolly.javascriptObfuscator.estreeMod

import org.scalajs.dom.raw.Node
import typingsJapgolly.javascriptObfuscator.javascriptObfuscatorStrings.`use strict`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionStatement extends BaseNode {
  var directive: js.UndefOr[`use strict`] = js.undefined
}

object ExpressionStatement {
  @scala.inline
  def apply(directive: `use strict` = null, metadata: BaseNodeMetadata = null, parentNode: Node = null): ExpressionStatement = {
    val __obj = js.Dynamic.literal()
    if (directive != null) __obj.updateDynamic("directive")(directive.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionStatement]
  }
}

