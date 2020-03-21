package typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Details. */
trait IDetails extends js.Object {
  /** Details operationName */
  var operationName: js.UndefOr[String | Null] = js.undefined
  /** Details rawQuery */
  var rawQuery: js.UndefOr[String | Null] = js.undefined
  /** Details variables */
  var variables: js.UndefOr[StringDictionary[scala.scalajs.js.typedarray.Uint8Array] | Null] = js.undefined
  /** Details variablesJson */
  var variablesJson: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}

object IDetails {
  @scala.inline
  def apply(
    operationName: String = null,
    rawQuery: String = null,
    variables: StringDictionary[scala.scalajs.js.typedarray.Uint8Array] = null,
    variablesJson: StringDictionary[String] = null
  ): IDetails = {
    val __obj = js.Dynamic.literal()
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (rawQuery != null) __obj.updateDynamic("rawQuery")(rawQuery.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    if (variablesJson != null) __obj.updateDynamic("variablesJson")(variablesJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetails]
  }
}

