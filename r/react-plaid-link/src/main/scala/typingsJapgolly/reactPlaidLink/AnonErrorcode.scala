package typingsJapgolly.reactPlaidLink

import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.API_ERROR
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.ASSET_REPORT_ERROR
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.CONNECTED
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.CREDENTIAL
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.ERROR
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.EXIT
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.INSTITUTION_ERROR
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.INVALID_INPUT
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.INVALID_REQUEST
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.ITEM_ERROR
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.LOADING
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.MFA
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.RATE_LIMIT_EXCEEDED
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.RECAPTCHA
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.SELECT_ACCOUNT
import typingsJapgolly.reactPlaidLink.reactPlaidLinkStrings.SELECT_INSTITUTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorcode extends js.Object {
  var error_code: js.UndefOr[String | Null] = js.undefined
  var error_message: js.UndefOr[String | Null] = js.undefined
  var error_type: js.UndefOr[
    INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR | Null
  ] = js.undefined
  var exit_status: js.UndefOr[String | Double | Null] = js.undefined
  var institution_id: String
  var institution_name: String
  var institution_search_query: js.UndefOr[String | Null] = js.undefined
  var link_session_id: String
  var mfa_type: js.UndefOr[String | Null] = js.undefined
  var request_id: String
  var timestamp: String
  var view_name: js.UndefOr[
    CONNECTED | CREDENTIAL | ERROR | EXIT | LOADING | MFA | RECAPTCHA | SELECT_ACCOUNT | SELECT_INSTITUTION | Null
  ] = js.undefined
}

object AnonErrorcode {
  @scala.inline
  def apply(
    institution_id: String,
    institution_name: String,
    link_session_id: String,
    request_id: String,
    timestamp: String,
    error_code: String = null,
    error_message: String = null,
    error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR = null,
    exit_status: String | Double = null,
    institution_search_query: String = null,
    mfa_type: String = null,
    view_name: CONNECTED | CREDENTIAL | ERROR | EXIT | LOADING | MFA | RECAPTCHA | SELECT_ACCOUNT | SELECT_INSTITUTION = null
  ): AnonErrorcode = {
    val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], institution_name = institution_name.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    if (error_type != null) __obj.updateDynamic("error_type")(error_type.asInstanceOf[js.Any])
    if (exit_status != null) __obj.updateDynamic("exit_status")(exit_status.asInstanceOf[js.Any])
    if (institution_search_query != null) __obj.updateDynamic("institution_search_query")(institution_search_query.asInstanceOf[js.Any])
    if (mfa_type != null) __obj.updateDynamic("mfa_type")(mfa_type.asInstanceOf[js.Any])
    if (view_name != null) __obj.updateDynamic("view_name")(view_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorcode]
  }
}

