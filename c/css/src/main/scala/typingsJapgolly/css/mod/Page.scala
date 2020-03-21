package typingsJapgolly.css.mod

import typingsJapgolly.css.AnonContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page
  extends Node
     with AtRule {
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.undefined
  /** The list of selectors of the rule, split on commas. Each selector is trimmed from whitespace and comments. */
  var selectors: js.UndefOr[js.Array[String]] = js.undefined
}

object Page {
  @scala.inline
  def apply(
    declarations: js.Array[Declaration | Comment] = null,
    parent: Node = null,
    position: AnonContent = null,
    selectors: js.Array[String] = null,
    `type`: String = null
  ): Page = {
    val __obj = js.Dynamic.literal()
    if (declarations != null) __obj.updateDynamic("declarations")(declarations.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

