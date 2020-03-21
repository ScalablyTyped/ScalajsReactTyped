package typingsJapgolly.yaml.mod.ast

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yaml.yamlStrings.SEQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seq
  extends SeqBase
     with SeqNode {
  @JSName("cstNode")
  var cstNode_Seq: js.UndefOr[typingsJapgolly.yaml.mod.cst.Seq] = js.undefined
  @JSName("items")
  var items_Seq: js.Array[AstNode | Null]
  @JSName("type")
  var type_Seq: SEQ
}

object Seq {
  @scala.inline
  def apply(
    items: js.Array[AstNode | Null],
    toJSON: CallbackTo[js.Any],
    `type`: SEQ,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsJapgolly.yaml.mod.cst.Seq = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): Seq = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seq]
  }
}

