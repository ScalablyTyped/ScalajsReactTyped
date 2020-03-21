package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawQueryModify extends js.Object {
  def AppendAnd(): IFieldExpression
  def AppendOr(): IFieldExpression
}

object IRawQueryModify {
  @scala.inline
  def apply(AppendAnd: CallbackTo[IFieldExpression], AppendOr: CallbackTo[IFieldExpression]): IRawQueryModify = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AppendAnd")(AppendAnd.toJsFn)
    __obj.updateDynamic("AppendOr")(AppendOr.toJsFn)
    __obj.asInstanceOf[IRawQueryModify]
  }
}

