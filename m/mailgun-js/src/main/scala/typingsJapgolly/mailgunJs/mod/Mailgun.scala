package typingsJapgolly.mailgunJs.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.mailgunJs.mailgunJsBooleans.`false`
import typingsJapgolly.mailgunJs.mailgunJsBooleans.`true`
import typingsJapgolly.mailgunJs.mod.validation.ParseResponse
import typingsJapgolly.mailgunJs.mod.validation.ValidateResponse
import typingsJapgolly.mailgunJs.mod.validation.ValidationCallback
import typingsJapgolly.mailgunJs.mod.validation.ValidationOptionsPrivate
import typingsJapgolly.mailgunJs.mod.validation.ValidationOptionsPublic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mailgun extends js.Object {
  var Attachment: Instantiable1[/* params */ AttachmentParams, typingsJapgolly.mailgunJs.mod.Attachment] = js.native
  @JSName("delete")
  var delete_Original: MailgunRequest = js.native
  // Generic requests
  @JSName("get")
  var get_Original: MailgunRequest = js.native
  @JSName("post")
  var post_Original: MailgunRequest = js.native
  @JSName("put")
  var put_Original: MailgunRequest = js.native
  def delete(resource: String, data: js.Any): js.Promise[_] = js.native
  def delete(
    resource: String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
  ): Unit = js.native
  // Generic requests
  def get(resource: String, data: js.Any): js.Promise[_] = js.native
  // Generic requests
  def get(
    resource: String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
  ): Unit = js.native
  def lists(list: String): Lists_ = js.native
  def messages(): Messages_ = js.native
  def parse(addressList: js.Array[String]): js.Promise[ParseResponse] = js.native
  def parse(addressList: js.Array[String], callback: ValidationCallback): js.Promise[ParseResponse] = js.native
  def post(resource: String, data: js.Any): js.Promise[_] = js.native
  def post(
    resource: String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
  ): Unit = js.native
  def put(resource: String, data: js.Any): js.Promise[_] = js.native
  def put(
    resource: String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
  ): Unit = js.native
  def validate(address: String): js.Promise[ValidateResponse] = js.native
  def validate(address: String, callback: ValidationCallback): Unit = js.native
  // tslint:disable-next-line unified-signatures
  def validate(address: String, isPrivate: Boolean, callback: ValidationCallback): Unit = js.native
  def validate(address: String, opts: ValidationOptionsPublic): js.Promise[ValidateResponse] = js.native
  def validate(address: String, opts: ValidationOptionsPublic, callback: ValidationCallback): Unit = js.native
  def validateWebhook(bodyTimestamp: Double, bodyToken: String, bodySignature: String): Boolean = js.native
  @JSName("validate")
  def validate_false(address: String, isPrivate: `false`): js.Promise[ValidateResponse] = js.native
  @JSName("validate")
  def validate_false(address: String, isPrivate: `false`, opts: ValidationOptionsPublic): js.Promise[ValidateResponse] = js.native
  @JSName("validate")
  def validate_false(address: String, isPrivate: `false`, opts: ValidationOptionsPublic, callback: ValidationCallback): Unit = js.native
  @JSName("validate")
  def validate_true(address: String, isPrivate: `true`): js.Promise[ValidateResponse] = js.native
  @JSName("validate")
  def validate_true(address: String, isPrivate: `true`, opts: ValidationOptionsPrivate): js.Promise[ValidateResponse] = js.native
  @JSName("validate")
  def validate_true(address: String, isPrivate: `true`, opts: ValidationOptionsPrivate, callback: ValidationCallback): Unit = js.native
}

