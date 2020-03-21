package typingsJapgolly.pkijs.timeStampReqMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeStampReq extends js.Object {
  var certReq: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[js.Array[typingsJapgolly.pkijs.extensionMod.default]] = js.undefined
  var messageImprint: typingsJapgolly.pkijs.messageImprintMod.default
  var nonce: js.UndefOr[Integer] = js.undefined
  var reqPolicy: js.UndefOr[String] = js.undefined
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object TimeStampReq {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    messageImprint: typingsJapgolly.pkijs.messageImprintMod.default,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    version: Double,
    certReq: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[typingsJapgolly.pkijs.extensionMod.default] = null,
    nonce: Integer = null,
    reqPolicy: String = null
  ): TimeStampReq = {
    val __obj = js.Dynamic.literal(messageImprint = messageImprint.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (!js.isUndefined(certReq)) __obj.updateDynamic("certReq")(certReq.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (reqPolicy != null) __obj.updateDynamic("reqPolicy")(reqPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeStampReq]
  }
}

