package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateConditions extends js.Object {
  var PropertyConditions: Boolean
  var PropertyConditionsDefinition: ISearchConditions
  var VBScript: Boolean
  var VBScriptDefinition: String
  def Clone(): IStateConditions
}

object IStateConditions {
  @scala.inline
  def apply(
    Clone: CallbackTo[IStateConditions],
    PropertyConditions: Boolean,
    PropertyConditionsDefinition: ISearchConditions,
    VBScript: Boolean,
    VBScriptDefinition: String
  ): IStateConditions = {
    val __obj = js.Dynamic.literal(PropertyConditions = PropertyConditions.asInstanceOf[js.Any], PropertyConditionsDefinition = PropertyConditionsDefinition.asInstanceOf[js.Any], VBScript = VBScript.asInstanceOf[js.Any], VBScriptDefinition = VBScriptDefinition.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IStateConditions]
  }
}

