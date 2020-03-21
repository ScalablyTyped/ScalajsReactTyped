package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomaticMetadataResult extends js.Object {
  val PropertyValueSuggestions: IPropertyValueSuggestions
  def Clone(): IAutomaticMetadataResult
}

object IAutomaticMetadataResult {
  @scala.inline
  def apply(Clone: CallbackTo[IAutomaticMetadataResult], PropertyValueSuggestions: IPropertyValueSuggestions): IAutomaticMetadataResult = {
    val __obj = js.Dynamic.literal(PropertyValueSuggestions = PropertyValueSuggestions.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IAutomaticMetadataResult]
  }
}

