package typingsJapgolly.adalAngular.mod

import typingsJapgolly.adalAngular.Anon0
import typingsJapgolly.adalAngular.AnonACCESSTOKENKEY
import typingsJapgolly.adalAngular.AnonERROR
import typingsJapgolly.adalAngular.adalAngularNumbers.`483`
import typingsJapgolly.adalAngular.adalAngularNumbers.`600`
import typingsJapgolly.adalAngular.adalAngularStrings.Canceled
import typingsJapgolly.adalAngular.adalAngularStrings.Completed
import typingsJapgolly.adalAngular.adalAngularStrings.Verticalline
import typingsJapgolly.adalAngular.adalAngularStrings.`6000`
import typingsJapgolly.adalAngular.adalAngularStrings.`In Progress`
import typingsJapgolly.adalAngular.adalAngularStrings.access_token
import typingsJapgolly.adalAngular.adalAngularStrings.error_description
import typingsJapgolly.adalAngular.adalAngularStrings.expires_in
import typingsJapgolly.adalAngular.adalAngularStrings.id_token
import typingsJapgolly.adalAngular.adalAngularStrings.session_state
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum for storage constants
  */
trait Constants extends js.Object {
  var ACCESS_TOKEN: access_token
  var ERROR_DESCRIPTION: error_description
  var EXPIRES_IN: expires_in
  var ID_TOKEN: id_token
  var LEVEL_STRING_MAP: Anon0
  var LOADFRAME_TIMEOUT: `6000`
  var LOGGING_LEVEL: AnonERROR
  var POPUP_HEIGHT: `600`
  var POPUP_WIDTH: `483`
  var RESOURCE_DELIMETER: Verticalline
  var SESSION_STATE: session_state
  var STORAGE: AnonACCESSTOKENKEY
  var TOKEN_RENEW_STATUS_CANCELED: Canceled
  var TOKEN_RENEW_STATUS_COMPLETED: Completed
  var TOKEN_RENEW_STATUS_IN_PROGRESS: `In Progress`
}

object Constants {
  @scala.inline
  def apply(
    ACCESS_TOKEN: access_token,
    ERROR_DESCRIPTION: error_description,
    EXPIRES_IN: expires_in,
    ID_TOKEN: id_token,
    LEVEL_STRING_MAP: Anon0,
    LOADFRAME_TIMEOUT: `6000`,
    LOGGING_LEVEL: AnonERROR,
    POPUP_HEIGHT: `600`,
    POPUP_WIDTH: `483`,
    RESOURCE_DELIMETER: Verticalline,
    SESSION_STATE: session_state,
    STORAGE: AnonACCESSTOKENKEY,
    TOKEN_RENEW_STATUS_CANCELED: Canceled,
    TOKEN_RENEW_STATUS_COMPLETED: Completed,
    TOKEN_RENEW_STATUS_IN_PROGRESS: `In Progress`
  ): Constants = {
    val __obj = js.Dynamic.literal(ACCESS_TOKEN = ACCESS_TOKEN.asInstanceOf[js.Any], ERROR_DESCRIPTION = ERROR_DESCRIPTION.asInstanceOf[js.Any], EXPIRES_IN = EXPIRES_IN.asInstanceOf[js.Any], ID_TOKEN = ID_TOKEN.asInstanceOf[js.Any], LEVEL_STRING_MAP = LEVEL_STRING_MAP.asInstanceOf[js.Any], LOADFRAME_TIMEOUT = LOADFRAME_TIMEOUT.asInstanceOf[js.Any], LOGGING_LEVEL = LOGGING_LEVEL.asInstanceOf[js.Any], POPUP_HEIGHT = POPUP_HEIGHT.asInstanceOf[js.Any], POPUP_WIDTH = POPUP_WIDTH.asInstanceOf[js.Any], RESOURCE_DELIMETER = RESOURCE_DELIMETER.asInstanceOf[js.Any], SESSION_STATE = SESSION_STATE.asInstanceOf[js.Any], STORAGE = STORAGE.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_CANCELED = TOKEN_RENEW_STATUS_CANCELED.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_COMPLETED = TOKEN_RENEW_STATUS_COMPLETED.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_IN_PROGRESS = TOKEN_RENEW_STATUS_IN_PROGRESS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Constants]
  }
}

