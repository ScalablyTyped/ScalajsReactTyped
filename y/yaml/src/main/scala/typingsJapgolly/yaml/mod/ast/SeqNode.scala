package typingsJapgolly.yaml.mod.ast

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yaml.yamlStrings.FLOW_SEQ
import typingsJapgolly.yaml.yamlStrings.SEQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.yaml.mod.ast.FlowSeq
  - typingsJapgolly.yaml.mod.ast.Seq
*/
trait SeqNode extends AstNode

object SeqNode {
  @scala.inline
  def FlowSeq(
    items: js.Array[AstNode | Pair],
    toJSON: CallbackTo[js.Any],
    `type`: FLOW_SEQ,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsJapgolly.yaml.mod.cst.FlowSeq = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): SeqNode = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeqNode]
  }
  @scala.inline
  def Seq(
    items: js.Array[AstNode | Null],
    toJSON: CallbackTo[js.Any],
    `type`: SEQ,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsJapgolly.yaml.mod.cst.Seq = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): SeqNode = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeqNode]
  }
}

