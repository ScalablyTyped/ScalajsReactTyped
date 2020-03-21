package typingsJapgolly.fastCsv.rowTransformerValidatorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fastCsv.parserTypesMod.Row
import typingsJapgolly.fastCsv.parserTypesMod.RowTransformFunction
import typingsJapgolly.fastCsv.parserTypesMod.RowValidate
import typingsJapgolly.fastCsv.parserTypesMod.RowValidatorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowTransformerValidator extends js.Object {
  var _rowTransform: js.Any
  var _rowValidator: js.Any
  var callTransformer: js.Any
  var callValidator: js.Any
  def rowTransform(transformFunction: RowTransformFunction): js.Any
  def rowValidator(validateFunction: RowValidate): js.Any
  def transformAndValidate(row: Row, cb: RowValidatorCallback): Unit
}

object RowTransformerValidator {
  @scala.inline
  def apply(
    _rowTransform: js.Any,
    _rowValidator: js.Any,
    callTransformer: js.Any,
    callValidator: js.Any,
    rowTransform: RowTransformFunction => CallbackTo[js.Any],
    rowValidator: RowValidate => CallbackTo[js.Any],
    transformAndValidate: (Row, RowValidatorCallback) => Callback
  ): RowTransformerValidator = {
    val __obj = js.Dynamic.literal(_rowTransform = _rowTransform.asInstanceOf[js.Any], _rowValidator = _rowValidator.asInstanceOf[js.Any], callTransformer = callTransformer.asInstanceOf[js.Any], callValidator = callValidator.asInstanceOf[js.Any])
    __obj.updateDynamic("rowTransform")(js.Any.fromFunction1((t0: typingsJapgolly.fastCsv.parserTypesMod.RowTransformFunction) => rowTransform(t0).runNow()))
    __obj.updateDynamic("rowValidator")(js.Any.fromFunction1((t0: typingsJapgolly.fastCsv.parserTypesMod.RowValidate) => rowValidator(t0).runNow()))
    __obj.updateDynamic("transformAndValidate")(js.Any.fromFunction2((t0: typingsJapgolly.fastCsv.parserTypesMod.Row, t1: typingsJapgolly.fastCsv.parserTypesMod.RowValidatorCallback) => transformAndValidate(t0, t1).runNow()))
    __obj.asInstanceOf[RowTransformerValidator]
  }
}

