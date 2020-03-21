package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateTransitionForClient extends js.Object {
  var FromState: Double
  val ID: Double
  var Name: String
  var Selectable: Boolean
  var SelectableFlagAffectedByPseudoUsers: Boolean
  var ToState: Double
  def Clone(): IStateTransitionForClient
  def GetAsLookup(): ILookup
  def GetAsTypedValue(): ITypedValue
}

object IStateTransitionForClient {
  @scala.inline
  def apply(
    Clone: CallbackTo[IStateTransitionForClient],
    FromState: Double,
    GetAsLookup: CallbackTo[ILookup],
    GetAsTypedValue: CallbackTo[ITypedValue],
    ID: Double,
    Name: String,
    Selectable: Boolean,
    SelectableFlagAffectedByPseudoUsers: Boolean,
    ToState: Double
  ): IStateTransitionForClient = {
    val __obj = js.Dynamic.literal(FromState = FromState.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Selectable = Selectable.asInstanceOf[js.Any], SelectableFlagAffectedByPseudoUsers = SelectableFlagAffectedByPseudoUsers.asInstanceOf[js.Any], ToState = ToState.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetAsLookup")(GetAsLookup.toJsFn)
    __obj.updateDynamic("GetAsTypedValue")(GetAsTypedValue.toJsFn)
    __obj.asInstanceOf[IStateTransitionForClient]
  }
}

