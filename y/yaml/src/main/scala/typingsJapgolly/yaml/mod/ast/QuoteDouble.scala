package typingsJapgolly.yaml.mod.ast

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yaml.yamlStrings.BIN
import typingsJapgolly.yaml.yamlStrings.HEX
import typingsJapgolly.yaml.yamlStrings.OCT
import typingsJapgolly.yaml.yamlStrings.QUOTE_DOUBLE
import typingsJapgolly.yaml.yamlStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuoteDouble
  extends Scalar
     with ScalarNode {
  @JSName("cstNode")
  var cstNode_QuoteDouble: js.UndefOr[typingsJapgolly.yaml.mod.cst.QuoteDouble] = js.undefined
  @JSName("type")
  var type_QuoteDouble: QUOTE_DOUBLE
}

object QuoteDouble {
  @scala.inline
  def apply(
    toJSON: CallbackTo[js.Any],
    `type`: QUOTE_DOUBLE,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsJapgolly.yaml.mod.cst.QuoteDouble = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    value: Boolean | Double | String = null
  ): QuoteDouble = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuoteDouble]
  }
}

