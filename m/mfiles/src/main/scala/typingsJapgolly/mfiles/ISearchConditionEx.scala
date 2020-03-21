package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchConditionEx extends js.Object {
  var Enabled: Boolean
  var Ignored: Boolean
  var SearchCondition: ISearchCondition
  var SpecialNULL: Boolean
  def Clone(): ISearchConditionEx
  def Set(SearchCondition: ISearchCondition, Enabled: Boolean, SpecialNULL: Boolean, Ignored: Boolean): Unit
}

object ISearchConditionEx {
  @scala.inline
  def apply(
    Clone: CallbackTo[ISearchConditionEx],
    Enabled: Boolean,
    Ignored: Boolean,
    SearchCondition: ISearchCondition,
    Set: (ISearchCondition, Boolean, Boolean, Boolean) => Callback,
    SpecialNULL: Boolean
  ): ISearchConditionEx = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], Ignored = Ignored.asInstanceOf[js.Any], SearchCondition = SearchCondition.asInstanceOf[js.Any], SpecialNULL = SpecialNULL.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Set")(js.Any.fromFunction4((t0: typingsJapgolly.mfiles.ISearchCondition, t1: scala.Boolean, t2: scala.Boolean, t3: scala.Boolean) => Set(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ISearchConditionEx]
  }
}

