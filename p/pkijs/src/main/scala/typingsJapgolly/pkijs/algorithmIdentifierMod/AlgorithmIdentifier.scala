package typingsJapgolly.pkijs.algorithmIdentifierMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmIdentifier extends js.Object {
  var algorithmId: String
  var algorithmParams: js.Any
  def fromSchema(schema: js.Any): Unit
  /**
    * Check that two "AlgorithmIdentifiers" are equal
    * @param {AlgorithmIdentifier} algorithmIdentifier
    * @returns {boolean}
    */
  def isEqual(algorithmIdentifier: AlgorithmIdentifier): Boolean
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object AlgorithmIdentifier {
  @scala.inline
  def apply(
    algorithmId: String,
    algorithmParams: js.Any,
    fromSchema: js.Any => Callback,
    isEqual: AlgorithmIdentifier => CallbackTo[Boolean],
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): AlgorithmIdentifier = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], algorithmParams = algorithmParams.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("isEqual")(js.Any.fromFunction1((t0: typingsJapgolly.pkijs.algorithmIdentifierMod.AlgorithmIdentifier) => isEqual(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[AlgorithmIdentifier]
  }
}

