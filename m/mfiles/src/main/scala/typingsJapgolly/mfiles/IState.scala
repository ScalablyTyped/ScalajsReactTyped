package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  val ID: Double
  var Name: String
  var Selectable: Boolean
  var SelectableFlagAffectedByPseudoUsers: Boolean
  def GetAsLookup(): ILookup
  def GetAsTypedValue(): ITypedValue
}

object IState {
  @scala.inline
  def apply(
    GetAsLookup: CallbackTo[ILookup],
    GetAsTypedValue: CallbackTo[ITypedValue],
    ID: Double,
    Name: String,
    Selectable: Boolean,
    SelectableFlagAffectedByPseudoUsers: Boolean
  ): IState = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Selectable = Selectable.asInstanceOf[js.Any], SelectableFlagAffectedByPseudoUsers = SelectableFlagAffectedByPseudoUsers.asInstanceOf[js.Any])
    __obj.updateDynamic("GetAsLookup")(GetAsLookup.toJsFn)
    __obj.updateDynamic("GetAsTypedValue")(GetAsTypedValue.toJsFn)
    __obj.asInstanceOf[IState]
  }
}

