package typingsJapgolly.pkijs.tstinfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTInfo extends js.Object {
  var accuracy: js.UndefOr[typingsJapgolly.pkijs.accuracyMod.default] = js.undefined
  var extensions: js.UndefOr[js.Array[typingsJapgolly.pkijs.extensionMod.default]] = js.undefined
  var genTime: js.Date
  var messageImprint: typingsJapgolly.pkijs.messageImprintMod.default
  var nonce: js.UndefOr[Integer] = js.undefined
  var ordering: js.UndefOr[Boolean] = js.undefined
  var policy: String
  var serialNumber: Integer
  var tsa: js.UndefOr[typingsJapgolly.pkijs.generalNameMod.default] = js.undefined
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
  def verify(params: VerifyParams): js.Thenable[Boolean]
}

object TSTInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    genTime: js.Date,
    messageImprint: typingsJapgolly.pkijs.messageImprintMod.default,
    policy: String,
    serialNumber: Integer,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    verify: VerifyParams => CallbackTo[js.Thenable[Boolean]],
    version: Double,
    accuracy: typingsJapgolly.pkijs.accuracyMod.default = null,
    extensions: js.Array[typingsJapgolly.pkijs.extensionMod.default] = null,
    nonce: Integer = null,
    ordering: js.UndefOr[Boolean] = js.undefined,
    tsa: typingsJapgolly.pkijs.generalNameMod.default = null
  ): TSTInfo = {
    val __obj = js.Dynamic.literal(genTime = genTime.asInstanceOf[js.Any], messageImprint = messageImprint.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.updateDynamic("verify")(js.Any.fromFunction1((t0: typingsJapgolly.pkijs.tstinfoMod.VerifyParams) => verify(t0).runNow()))
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(ordering)) __obj.updateDynamic("ordering")(ordering.asInstanceOf[js.Any])
    if (tsa != null) __obj.updateDynamic("tsa")(tsa.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTInfo]
  }
}

