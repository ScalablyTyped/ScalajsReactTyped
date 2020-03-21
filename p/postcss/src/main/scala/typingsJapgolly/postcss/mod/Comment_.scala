package typingsJapgolly.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a comment between declarations or statements (rule and at-rules).
  * Comments inside selectors, at-rule parameters, or declaration values will
  * be stored in the Node#raws properties.
  */
@js.native
trait Comment_
  extends ChildNode
     with NodeBase {
  /**
    * Returns the comment's parent node.
    */
  var parent: Container = js.native
  /**
    * The comment's text.
    */
  var text: String = js.native
  var `type`: typingsJapgolly.postcss.postcssStrings.comment = js.native
}

