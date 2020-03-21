package typingsJapgolly.parse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse", "Error")
@js.native
class Error protected ()
  extends typingsJapgolly.parse.mod._Global_.Parse.Error {
  def this(code: ErrorCode, message: String) = this()
}

/* static members */
@JSImport("parse", "Error")
@js.native
object Error extends js.Object {
  var ACCOUNT_ALREADY_LINKED: typingsJapgolly.parse.mod.ErrorCode.ACCOUNT_ALREADY_LINKED = js.native
  var AGGREGATE_ERROR: typingsJapgolly.parse.mod.ErrorCode.AGGREGATE_ERROR = js.native
  var CACHE_MISS: typingsJapgolly.parse.mod.ErrorCode.CACHE_MISS = js.native
  var COMMAND_UNAVAILABLE: typingsJapgolly.parse.mod.ErrorCode.COMMAND_UNAVAILABLE = js.native
  var CONNECTION_FAILED: typingsJapgolly.parse.mod.ErrorCode.CONNECTION_FAILED = js.native
  var DUPLICATE_VALUE: typingsJapgolly.parse.mod.ErrorCode.DUPLICATE_VALUE = js.native
  var EMAIL_MISSING: typingsJapgolly.parse.mod.ErrorCode.EMAIL_MISSING = js.native
  var EMAIL_NOT_FOUND: typingsJapgolly.parse.mod.ErrorCode.EMAIL_NOT_FOUND = js.native
  var EMAIL_TAKEN: typingsJapgolly.parse.mod.ErrorCode.EMAIL_TAKEN = js.native
  var EXCEEDED_QUOTA: typingsJapgolly.parse.mod.ErrorCode.EXCEEDED_QUOTA = js.native
  var FILE_DELETE_ERROR: typingsJapgolly.parse.mod.ErrorCode.FILE_DELETE_ERROR = js.native
  var FILE_READ_ERROR: typingsJapgolly.parse.mod.ErrorCode.FILE_READ_ERROR = js.native
  var FILE_SAVE_ERROR: typingsJapgolly.parse.mod.ErrorCode.FILE_SAVE_ERROR = js.native
  var FILE_TOO_LARGE: typingsJapgolly.parse.mod.ErrorCode.FILE_TOO_LARGE = js.native
  var INCORRECT_TYPE: typingsJapgolly.parse.mod.ErrorCode.INCORRECT_TYPE = js.native
  var INTERNAL_SERVER_ERROR: typingsJapgolly.parse.mod.ErrorCode.INTERNAL_SERVER_ERROR = js.native
  var INVALID_ACL: typingsJapgolly.parse.mod.ErrorCode.INVALID_ACL = js.native
  var INVALID_CHANNEL_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_CHANNEL_NAME = js.native
  var INVALID_CLASS_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_CLASS_NAME = js.native
  var INVALID_CONTENT_LENGTH: typingsJapgolly.parse.mod.ErrorCode.INVALID_CONTENT_LENGTH = js.native
  var INVALID_EMAIL_ADDRESS: typingsJapgolly.parse.mod.ErrorCode.INVALID_EMAIL_ADDRESS = js.native
  var INVALID_EVENT_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_EVENT_NAME = js.native
  var INVALID_FILE_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_FILE_NAME = js.native
  var INVALID_IMAGE_DATA: typingsJapgolly.parse.mod.ErrorCode.INVALID_IMAGE_DATA = js.native
  var INVALID_JSON: typingsJapgolly.parse.mod.ErrorCode.INVALID_JSON = js.native
  var INVALID_KEY_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_KEY_NAME = js.native
  var INVALID_LINKED_SESSION: typingsJapgolly.parse.mod.ErrorCode.INVALID_LINKED_SESSION = js.native
  var INVALID_NESTED_KEY: typingsJapgolly.parse.mod.ErrorCode.INVALID_NESTED_KEY = js.native
  var INVALID_POINTER: typingsJapgolly.parse.mod.ErrorCode.INVALID_POINTER = js.native
  var INVALID_PUSH_TIME_ERROR: typingsJapgolly.parse.mod.ErrorCode.INVALID_PUSH_TIME_ERROR = js.native
  var INVALID_QUERY: typingsJapgolly.parse.mod.ErrorCode.INVALID_QUERY = js.native
  var INVALID_ROLE_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_ROLE_NAME = js.native
  var INVALID_SESSION_TOKEN: typingsJapgolly.parse.mod.ErrorCode.INVALID_SESSION_TOKEN = js.native
  var LINKED_ID_MISSING: typingsJapgolly.parse.mod.ErrorCode.LINKED_ID_MISSING = js.native
  var MISSING_CONTENT_LENGTH: typingsJapgolly.parse.mod.ErrorCode.MISSING_CONTENT_LENGTH = js.native
  var MISSING_CONTENT_TYPE: typingsJapgolly.parse.mod.ErrorCode.MISSING_CONTENT_TYPE = js.native
  var MISSING_OBJECT_ID: typingsJapgolly.parse.mod.ErrorCode.MISSING_OBJECT_ID = js.native
  var MUST_CREATE_USER_THROUGH_SIGNUP: typingsJapgolly.parse.mod.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP = js.native
  var NOT_INITIALIZED: typingsJapgolly.parse.mod.ErrorCode.NOT_INITIALIZED = js.native
  var OBJECT_NOT_FOUND: typingsJapgolly.parse.mod.ErrorCode.OBJECT_NOT_FOUND = js.native
  var OBJECT_TOO_LARGE: typingsJapgolly.parse.mod.ErrorCode.OBJECT_TOO_LARGE = js.native
  var OPERATION_FORBIDDEN: typingsJapgolly.parse.mod.ErrorCode.OPERATION_FORBIDDEN = js.native
  var OTHER_CAUSE: typingsJapgolly.parse.mod.ErrorCode.OTHER_CAUSE = js.native
  var PASSWORD_MISSING: typingsJapgolly.parse.mod.ErrorCode.PASSWORD_MISSING = js.native
  var PUSH_MISCONFIGURED: typingsJapgolly.parse.mod.ErrorCode.PUSH_MISCONFIGURED = js.native
  var REQUEST_LIMIT_EXCEEDED: typingsJapgolly.parse.mod.ErrorCode.REQUEST_LIMIT_EXCEEDED = js.native
  var SCRIPT_FAILED: typingsJapgolly.parse.mod.ErrorCode.SCRIPT_FAILED = js.native
  var SESSION_MISSING: typingsJapgolly.parse.mod.ErrorCode.SESSION_MISSING = js.native
  var TIMEOUT: typingsJapgolly.parse.mod.ErrorCode.TIMEOUT = js.native
  var UNSAVED_FILE_ERROR: typingsJapgolly.parse.mod.ErrorCode.UNSAVED_FILE_ERROR = js.native
  var UNSUPPORTED_SERVICE: typingsJapgolly.parse.mod.ErrorCode.UNSUPPORTED_SERVICE = js.native
  var USERNAME_MISSING: typingsJapgolly.parse.mod.ErrorCode.USERNAME_MISSING = js.native
  var USERNAME_TAKEN: typingsJapgolly.parse.mod.ErrorCode.USERNAME_TAKEN = js.native
  var VALIDATION_ERROR: typingsJapgolly.parse.mod.ErrorCode.VALIDATION_ERROR = js.native
  var X_DOMAIN_REQUEST: typingsJapgolly.parse.mod.ErrorCode.X_DOMAIN_REQUEST = js.native
}

