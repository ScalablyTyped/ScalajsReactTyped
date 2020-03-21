package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidationResult extends js.Object {
  var Children: js.Array[IValidationResult]
  var ErrorCount: Double
  var ErrorMessage: String
  var HasErrors: Boolean
  var HasErrorsDirty: Boolean
  var Name: String
  var Optional: js.UndefOr[IOptional] = js.undefined
  var TranslateArgs: js.UndefOr[js.Array[IErrorTranslateArgs]] = js.undefined
  def Add(validationResult: IValidationResult): Unit
  def Remove(index: Double): Unit
}

object IValidationResult {
  @scala.inline
  def apply(
    Add: IValidationResult => Callback,
    Children: js.Array[IValidationResult],
    ErrorCount: Double,
    ErrorMessage: String,
    HasErrors: Boolean,
    HasErrorsDirty: Boolean,
    Name: String,
    Remove: Double => Callback,
    Optional: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    TranslateArgs: js.Array[IErrorTranslateArgs] = null
  ): IValidationResult = {
    val __obj = js.Dynamic.literal(Children = Children.asInstanceOf[js.Any], ErrorCount = ErrorCount.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], HasErrors = HasErrors.asInstanceOf[js.Any], HasErrorsDirty = HasErrorsDirty.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction1((t0: typingsJapgolly.businessRulesEngine.mod.IValidationResult) => Add(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    Optional.foreach(p => __obj.updateDynamic("Optional")(p.toJsFn))
    if (TranslateArgs != null) __obj.updateDynamic("TranslateArgs")(TranslateArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationResult]
  }
}

