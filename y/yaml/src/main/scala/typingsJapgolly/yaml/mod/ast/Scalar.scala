package typingsJapgolly.yaml.mod.ast

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yaml.yamlStrings.BIN
import typingsJapgolly.yaml.yamlStrings.BLOCK_FOLDED
import typingsJapgolly.yaml.yamlStrings.BLOCK_LITERAL
import typingsJapgolly.yaml.yamlStrings.HEX
import typingsJapgolly.yaml.yamlStrings.OCT
import typingsJapgolly.yaml.yamlStrings.PLAIN
import typingsJapgolly.yaml.yamlStrings.QUOTE_DOUBLE
import typingsJapgolly.yaml.yamlStrings.QUOTE_SINGLE
import typingsJapgolly.yaml.yamlStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scalar extends Node {
  /**
    * By default (undefined), numbers use decimal notation.
    * The YAML 1.2 core schema only supports 'HEX' and 'OCT'.
    */
  var format: js.UndefOr[BIN | HEX | OCT | TIME] = js.undefined
  var `type`: js.UndefOr[BLOCK_FOLDED | BLOCK_LITERAL | PLAIN | QUOTE_DOUBLE | QUOTE_SINGLE] = js.undefined
  var value: Null | Boolean | Double | String
}

object Scalar {
  @scala.inline
  def apply(
    toJSON: CallbackTo[js.Any],
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsJapgolly.yaml.mod.cst.Node = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    `type`: BLOCK_FOLDED | BLOCK_LITERAL | PLAIN | QUOTE_DOUBLE | QUOTE_SINGLE = null,
    value: Boolean | Double | String = null
  ): Scalar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scalar]
  }
}

