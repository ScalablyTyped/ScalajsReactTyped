package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawQuery extends js.Object {
  def ModifyWhere(): IRawQueryModify
  /** Change Where clause */
  def ReplaceWhere(): IFieldExpression
}

object IRawQuery {
  @scala.inline
  def apply(ModifyWhere: CallbackTo[IRawQueryModify], ReplaceWhere: CallbackTo[IFieldExpression]): IRawQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ModifyWhere")(ModifyWhere.toJsFn)
    __obj.updateDynamic("ReplaceWhere")(ReplaceWhere.toJsFn)
    __obj.asInstanceOf[IRawQuery]
  }
}

