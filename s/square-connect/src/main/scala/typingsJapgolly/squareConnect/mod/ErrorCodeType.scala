package typingsJapgolly.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.squareConnect.squareConnectStrings.INTERNAL_SERVER_ERROR
  - typingsJapgolly.squareConnect.squareConnectStrings.UNAUTHORIZED
  - typingsJapgolly.squareConnect.squareConnectStrings.ACCESS_TOKEN_EXPIRED
  - typingsJapgolly.squareConnect.squareConnectStrings.ACCESS_TOKEN_REVOKED
  - typingsJapgolly.squareConnect.squareConnectStrings.FORBIDDEN
  - typingsJapgolly.squareConnect.squareConnectStrings.INSUFFICIENT_SCOPES
  - typingsJapgolly.squareConnect.squareConnectStrings.APPLICATION_DISABLED
  - typingsJapgolly.squareConnect.squareConnectStrings.V1_APPLICATION
  - typingsJapgolly.squareConnect.squareConnectStrings.V1_ACCESS_TOKEN
  - typingsJapgolly.squareConnect.squareConnectStrings.CARD_PROCESSING_NOT_ENABLED
  - typingsJapgolly.squareConnect.squareConnectStrings.BAD_REQUEST
  - typingsJapgolly.squareConnect.squareConnectStrings.MISSING_REQUIRED_PARAMETER
  - typingsJapgolly.squareConnect.squareConnectStrings.INCORRECT_TYPE
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_TIME
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_TIME_RANGE
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_VALUE
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_CURSOR
  - typingsJapgolly.squareConnect.squareConnectStrings.UNKNOWN_QUERY_PARAMETER
  - typingsJapgolly.squareConnect.squareConnectStrings.CONFLICTING_PARAMETERS
  - typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_JSON_BODY
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_SORT_ORDER
  - typingsJapgolly.squareConnect.squareConnectStrings.VALUE_REGEX_MISMATCH
  - typingsJapgolly.squareConnect.squareConnectStrings.VALUE_TOO_SHORT
  - typingsJapgolly.squareConnect.squareConnectStrings.VALUE_TOO_LONG
  - typingsJapgolly.squareConnect.squareConnectStrings.VALUE_TOO_LOW
  - typingsJapgolly.squareConnect.squareConnectStrings.VALUE_TOO_HIGH
  - typingsJapgolly.squareConnect.squareConnectStrings.VALUE_EMPTY
  - typingsJapgolly.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_LONG
  - typingsJapgolly.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_SHORT
  - typingsJapgolly.squareConnect.squareConnectStrings.ARRAY_EMPTY
  - typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_BOOLEAN
  - typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_INTEGER
  - typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_FLOAT
  - typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_STRING
  - typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_OBJECT
  - typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_ARRAY
  - typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_MAP
  - typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_BASE64_ENCODED_BYTE_ARRAY
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_ARRAY_VALUE
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_ENUM_VALUE
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_CONTENT_TYPE
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_FORM_VALUE
  - typingsJapgolly.squareConnect.squareConnectStrings.ONE_INSTRUMENT_EXPECTED
  - typingsJapgolly.squareConnect.squareConnectStrings.NO_FIELDS_SET
  - typingsJapgolly.squareConnect.squareConnectStrings.DEPRECATED_FIELD_SET
  - typingsJapgolly.squareConnect.squareConnectStrings.CARD_EXPIRED
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_EXPIRATION
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_EXPIRATION_YEAR
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_EXPIRATION_DATE
  - typingsJapgolly.squareConnect.squareConnectStrings.UNSUPPORTED_CARD_BRAND
  - typingsJapgolly.squareConnect.squareConnectStrings.UNSUPPORTED_ENTRY_METHOD
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_ENCRYPTED_CARD
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_CARD
  - typingsJapgolly.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_EXPIRED
  - typingsJapgolly.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CANCELED
  - typingsJapgolly.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CAPTURED
  - typingsJapgolly.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_FAILED
  - typingsJapgolly.squareConnect.squareConnectStrings.CARD_TOKEN_EXPIRED
  - typingsJapgolly.squareConnect.squareConnectStrings.CARD_TOKEN_USED
  - typingsJapgolly.squareConnect.squareConnectStrings.AMOUNT_TOO_HIGH
  - typingsJapgolly.squareConnect.squareConnectStrings.UNSUPPORTED_INSTRUMENT_TYPE
  - typingsJapgolly.squareConnect.squareConnectStrings.REFUND_AMOUNT_INVALID
  - typingsJapgolly.squareConnect.squareConnectStrings.REFUND_ALREADY_PENDING
  - typingsJapgolly.squareConnect.squareConnectStrings.PAYMENT_NOT_REFUNDABLE
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_CARD_DATA
  - typingsJapgolly.squareConnect.squareConnectStrings.LOCATION_MISMATCH
  - typingsJapgolly.squareConnect.squareConnectStrings.IDEMPOTENCY_KEY_REUSED
  - typingsJapgolly.squareConnect.squareConnectStrings.UNEXPECTED_VALUE
  - typingsJapgolly.squareConnect.squareConnectStrings.SANDBOX_NOT_SUPPORTED
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_EMAIL_ADDRESS
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_PHONE_NUMBER
  - typingsJapgolly.squareConnect.squareConnectStrings.CHECKOUT_EXPIRED
  - typingsJapgolly.squareConnect.squareConnectStrings.BAD_CERTIFICATE
  - typingsJapgolly.squareConnect.squareConnectStrings.INVALID_SQUARE_VERSION_FORMAT
  - typingsJapgolly.squareConnect.squareConnectStrings.API_VERSION_INCOMPATIBLE
  - typingsJapgolly.squareConnect.squareConnectStrings.CARD_DECLINED
  - typingsJapgolly.squareConnect.squareConnectStrings.VERIFY_CVV_FAILURE
  - typingsJapgolly.squareConnect.squareConnectStrings.VERIFY_AVS_FAILURE
  - typingsJapgolly.squareConnect.squareConnectStrings.CARD_DECLINED_CALL_ISSUER
  - typingsJapgolly.squareConnect.squareConnectStrings.NOT_FOUND
  - typingsJapgolly.squareConnect.squareConnectStrings.APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND
  - typingsJapgolly.squareConnect.squareConnectStrings.METHOD_NOT_ALLOWED
  - typingsJapgolly.squareConnect.squareConnectStrings.NOT_ACCEPTABLE
  - typingsJapgolly.squareConnect.squareConnectStrings.REQUEST_TIMEOUT
  - typingsJapgolly.squareConnect.squareConnectStrings.CONFLICT
  - typingsJapgolly.squareConnect.squareConnectStrings.REQUEST_ENTITY_TOO_LARGE
  - typingsJapgolly.squareConnect.squareConnectStrings.UNSUPPORTED_MEDIA_TYPE
  - typingsJapgolly.squareConnect.squareConnectStrings.RATE_LIMITED
  - typingsJapgolly.squareConnect.squareConnectStrings.NOT_IMPLEMENTED
  - typingsJapgolly.squareConnect.squareConnectStrings.SERVICE_UNAVAILABLE
  - typingsJapgolly.squareConnect.squareConnectStrings.GATEWAY_TIMEOUT
*/
trait ErrorCodeType extends StObject
object ErrorCodeType {
  
  inline def ACCESS_TOKEN_EXPIRED: typingsJapgolly.squareConnect.squareConnectStrings.ACCESS_TOKEN_EXPIRED = "ACCESS_TOKEN_EXPIRED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.ACCESS_TOKEN_EXPIRED]
  
  inline def ACCESS_TOKEN_REVOKED: typingsJapgolly.squareConnect.squareConnectStrings.ACCESS_TOKEN_REVOKED = "ACCESS_TOKEN_REVOKED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.ACCESS_TOKEN_REVOKED]
  
  inline def AMOUNT_TOO_HIGH: typingsJapgolly.squareConnect.squareConnectStrings.AMOUNT_TOO_HIGH = "AMOUNT_TOO_HIGH".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.AMOUNT_TOO_HIGH]
  
  inline def API_VERSION_INCOMPATIBLE: typingsJapgolly.squareConnect.squareConnectStrings.API_VERSION_INCOMPATIBLE = "API_VERSION_INCOMPATIBLE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.API_VERSION_INCOMPATIBLE]
  
  inline def APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND: typingsJapgolly.squareConnect.squareConnectStrings.APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND = "APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND]
  
  inline def APPLICATION_DISABLED: typingsJapgolly.squareConnect.squareConnectStrings.APPLICATION_DISABLED = "APPLICATION_DISABLED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.APPLICATION_DISABLED]
  
  inline def ARRAY_EMPTY: typingsJapgolly.squareConnect.squareConnectStrings.ARRAY_EMPTY = "ARRAY_EMPTY".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.ARRAY_EMPTY]
  
  inline def ARRAY_LENGTH_TOO_LONG: typingsJapgolly.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_LONG = "ARRAY_LENGTH_TOO_LONG".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_LONG]
  
  inline def ARRAY_LENGTH_TOO_SHORT: typingsJapgolly.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_SHORT = "ARRAY_LENGTH_TOO_SHORT".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_SHORT]
  
  inline def BAD_CERTIFICATE: typingsJapgolly.squareConnect.squareConnectStrings.BAD_CERTIFICATE = "BAD_CERTIFICATE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.BAD_CERTIFICATE]
  
  inline def BAD_REQUEST: typingsJapgolly.squareConnect.squareConnectStrings.BAD_REQUEST = "BAD_REQUEST".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.BAD_REQUEST]
  
  inline def CARD_DECLINED: typingsJapgolly.squareConnect.squareConnectStrings.CARD_DECLINED = "CARD_DECLINED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.CARD_DECLINED]
  
  inline def CARD_DECLINED_CALL_ISSUER: typingsJapgolly.squareConnect.squareConnectStrings.CARD_DECLINED_CALL_ISSUER = "CARD_DECLINED_CALL_ISSUER".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.CARD_DECLINED_CALL_ISSUER]
  
  inline def CARD_EXPIRED: typingsJapgolly.squareConnect.squareConnectStrings.CARD_EXPIRED = "CARD_EXPIRED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.CARD_EXPIRED]
  
  inline def CARD_PROCESSING_NOT_ENABLED: typingsJapgolly.squareConnect.squareConnectStrings.CARD_PROCESSING_NOT_ENABLED = "CARD_PROCESSING_NOT_ENABLED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.CARD_PROCESSING_NOT_ENABLED]
  
  inline def CARD_TOKEN_EXPIRED: typingsJapgolly.squareConnect.squareConnectStrings.CARD_TOKEN_EXPIRED = "CARD_TOKEN_EXPIRED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.CARD_TOKEN_EXPIRED]
  
  inline def CARD_TOKEN_USED: typingsJapgolly.squareConnect.squareConnectStrings.CARD_TOKEN_USED = "CARD_TOKEN_USED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.CARD_TOKEN_USED]
  
  inline def CHECKOUT_EXPIRED: typingsJapgolly.squareConnect.squareConnectStrings.CHECKOUT_EXPIRED = "CHECKOUT_EXPIRED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.CHECKOUT_EXPIRED]
  
  inline def CONFLICT: typingsJapgolly.squareConnect.squareConnectStrings.CONFLICT = "CONFLICT".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.CONFLICT]
  
  inline def CONFLICTING_PARAMETERS: typingsJapgolly.squareConnect.squareConnectStrings.CONFLICTING_PARAMETERS = "CONFLICTING_PARAMETERS".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.CONFLICTING_PARAMETERS]
  
  inline def DELAYED_TRANSACTION_CANCELED: typingsJapgolly.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CANCELED = "DELAYED_TRANSACTION_CANCELED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CANCELED]
  
  inline def DELAYED_TRANSACTION_CAPTURED: typingsJapgolly.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CAPTURED = "DELAYED_TRANSACTION_CAPTURED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CAPTURED]
  
  inline def DELAYED_TRANSACTION_EXPIRED: typingsJapgolly.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_EXPIRED = "DELAYED_TRANSACTION_EXPIRED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_EXPIRED]
  
  inline def DELAYED_TRANSACTION_FAILED: typingsJapgolly.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_FAILED = "DELAYED_TRANSACTION_FAILED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_FAILED]
  
  inline def DEPRECATED_FIELD_SET: typingsJapgolly.squareConnect.squareConnectStrings.DEPRECATED_FIELD_SET = "DEPRECATED_FIELD_SET".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.DEPRECATED_FIELD_SET]
  
  inline def EXPECTED_ARRAY: typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_ARRAY = "EXPECTED_ARRAY".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_ARRAY]
  
  inline def EXPECTED_BASE64_ENCODED_BYTE_ARRAY: typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_BASE64_ENCODED_BYTE_ARRAY = "EXPECTED_BASE64_ENCODED_BYTE_ARRAY".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_BASE64_ENCODED_BYTE_ARRAY]
  
  inline def EXPECTED_BOOLEAN: typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_BOOLEAN = "EXPECTED_BOOLEAN".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_BOOLEAN]
  
  inline def EXPECTED_FLOAT: typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_FLOAT = "EXPECTED_FLOAT".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_FLOAT]
  
  inline def EXPECTED_INTEGER: typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_INTEGER = "EXPECTED_INTEGER".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_INTEGER]
  
  inline def EXPECTED_JSON_BODY: typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_JSON_BODY = "EXPECTED_JSON_BODY".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_JSON_BODY]
  
  inline def EXPECTED_MAP: typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_MAP = "EXPECTED_MAP".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_MAP]
  
  inline def EXPECTED_OBJECT: typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_OBJECT = "EXPECTED_OBJECT".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_OBJECT]
  
  inline def EXPECTED_STRING: typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_STRING = "EXPECTED_STRING".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.EXPECTED_STRING]
  
  inline def FORBIDDEN: typingsJapgolly.squareConnect.squareConnectStrings.FORBIDDEN = "FORBIDDEN".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.FORBIDDEN]
  
  inline def GATEWAY_TIMEOUT: typingsJapgolly.squareConnect.squareConnectStrings.GATEWAY_TIMEOUT = "GATEWAY_TIMEOUT".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.GATEWAY_TIMEOUT]
  
  inline def IDEMPOTENCY_KEY_REUSED: typingsJapgolly.squareConnect.squareConnectStrings.IDEMPOTENCY_KEY_REUSED = "IDEMPOTENCY_KEY_REUSED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.IDEMPOTENCY_KEY_REUSED]
  
  inline def INCORRECT_TYPE: typingsJapgolly.squareConnect.squareConnectStrings.INCORRECT_TYPE = "INCORRECT_TYPE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INCORRECT_TYPE]
  
  inline def INSUFFICIENT_SCOPES: typingsJapgolly.squareConnect.squareConnectStrings.INSUFFICIENT_SCOPES = "INSUFFICIENT_SCOPES".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INSUFFICIENT_SCOPES]
  
  inline def INTERNAL_SERVER_ERROR: typingsJapgolly.squareConnect.squareConnectStrings.INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INTERNAL_SERVER_ERROR]
  
  inline def INVALID_ARRAY_VALUE: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_ARRAY_VALUE = "INVALID_ARRAY_VALUE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_ARRAY_VALUE]
  
  inline def INVALID_CARD: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_CARD = "INVALID_CARD".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_CARD]
  
  inline def INVALID_CARD_DATA: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_CARD_DATA = "INVALID_CARD_DATA".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_CARD_DATA]
  
  inline def INVALID_CONTENT_TYPE: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_CONTENT_TYPE = "INVALID_CONTENT_TYPE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_CONTENT_TYPE]
  
  inline def INVALID_CURSOR: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_CURSOR = "INVALID_CURSOR".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_CURSOR]
  
  inline def INVALID_EMAIL_ADDRESS: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_EMAIL_ADDRESS = "INVALID_EMAIL_ADDRESS".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_EMAIL_ADDRESS]
  
  inline def INVALID_ENCRYPTED_CARD: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_ENCRYPTED_CARD = "INVALID_ENCRYPTED_CARD".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_ENCRYPTED_CARD]
  
  inline def INVALID_ENUM_VALUE: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_ENUM_VALUE = "INVALID_ENUM_VALUE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_ENUM_VALUE]
  
  inline def INVALID_EXPIRATION: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_EXPIRATION = "INVALID_EXPIRATION".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_EXPIRATION]
  
  inline def INVALID_EXPIRATION_DATE: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_EXPIRATION_DATE = "INVALID_EXPIRATION_DATE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_EXPIRATION_DATE]
  
  inline def INVALID_EXPIRATION_YEAR: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_EXPIRATION_YEAR = "INVALID_EXPIRATION_YEAR".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_EXPIRATION_YEAR]
  
  inline def INVALID_FORM_VALUE: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_FORM_VALUE = "INVALID_FORM_VALUE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_FORM_VALUE]
  
  inline def INVALID_PHONE_NUMBER: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_PHONE_NUMBER = "INVALID_PHONE_NUMBER".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_PHONE_NUMBER]
  
  inline def INVALID_SORT_ORDER: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_SORT_ORDER = "INVALID_SORT_ORDER".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_SORT_ORDER]
  
  inline def INVALID_SQUARE_VERSION_FORMAT: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_SQUARE_VERSION_FORMAT = "INVALID_SQUARE_VERSION_FORMAT".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_SQUARE_VERSION_FORMAT]
  
  inline def INVALID_TIME: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_TIME = "INVALID_TIME".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_TIME]
  
  inline def INVALID_TIME_RANGE: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_TIME_RANGE = "INVALID_TIME_RANGE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_TIME_RANGE]
  
  inline def INVALID_VALUE: typingsJapgolly.squareConnect.squareConnectStrings.INVALID_VALUE = "INVALID_VALUE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.INVALID_VALUE]
  
  inline def LOCATION_MISMATCH: typingsJapgolly.squareConnect.squareConnectStrings.LOCATION_MISMATCH = "LOCATION_MISMATCH".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.LOCATION_MISMATCH]
  
  inline def METHOD_NOT_ALLOWED: typingsJapgolly.squareConnect.squareConnectStrings.METHOD_NOT_ALLOWED = "METHOD_NOT_ALLOWED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.METHOD_NOT_ALLOWED]
  
  inline def MISSING_REQUIRED_PARAMETER: typingsJapgolly.squareConnect.squareConnectStrings.MISSING_REQUIRED_PARAMETER = "MISSING_REQUIRED_PARAMETER".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.MISSING_REQUIRED_PARAMETER]
  
  inline def NOT_ACCEPTABLE: typingsJapgolly.squareConnect.squareConnectStrings.NOT_ACCEPTABLE = "NOT_ACCEPTABLE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.NOT_ACCEPTABLE]
  
  inline def NOT_FOUND: typingsJapgolly.squareConnect.squareConnectStrings.NOT_FOUND = "NOT_FOUND".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.NOT_FOUND]
  
  inline def NOT_IMPLEMENTED: typingsJapgolly.squareConnect.squareConnectStrings.NOT_IMPLEMENTED = "NOT_IMPLEMENTED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.NOT_IMPLEMENTED]
  
  inline def NO_FIELDS_SET: typingsJapgolly.squareConnect.squareConnectStrings.NO_FIELDS_SET = "NO_FIELDS_SET".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.NO_FIELDS_SET]
  
  inline def ONE_INSTRUMENT_EXPECTED: typingsJapgolly.squareConnect.squareConnectStrings.ONE_INSTRUMENT_EXPECTED = "ONE_INSTRUMENT_EXPECTED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.ONE_INSTRUMENT_EXPECTED]
  
  inline def PAYMENT_NOT_REFUNDABLE: typingsJapgolly.squareConnect.squareConnectStrings.PAYMENT_NOT_REFUNDABLE = "PAYMENT_NOT_REFUNDABLE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.PAYMENT_NOT_REFUNDABLE]
  
  inline def RATE_LIMITED: typingsJapgolly.squareConnect.squareConnectStrings.RATE_LIMITED = "RATE_LIMITED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.RATE_LIMITED]
  
  inline def REFUND_ALREADY_PENDING: typingsJapgolly.squareConnect.squareConnectStrings.REFUND_ALREADY_PENDING = "REFUND_ALREADY_PENDING".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.REFUND_ALREADY_PENDING]
  
  inline def REFUND_AMOUNT_INVALID: typingsJapgolly.squareConnect.squareConnectStrings.REFUND_AMOUNT_INVALID = "REFUND_AMOUNT_INVALID".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.REFUND_AMOUNT_INVALID]
  
  inline def REQUEST_ENTITY_TOO_LARGE: typingsJapgolly.squareConnect.squareConnectStrings.REQUEST_ENTITY_TOO_LARGE = "REQUEST_ENTITY_TOO_LARGE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.REQUEST_ENTITY_TOO_LARGE]
  
  inline def REQUEST_TIMEOUT: typingsJapgolly.squareConnect.squareConnectStrings.REQUEST_TIMEOUT = "REQUEST_TIMEOUT".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.REQUEST_TIMEOUT]
  
  inline def SANDBOX_NOT_SUPPORTED: typingsJapgolly.squareConnect.squareConnectStrings.SANDBOX_NOT_SUPPORTED = "SANDBOX_NOT_SUPPORTED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.SANDBOX_NOT_SUPPORTED]
  
  inline def SERVICE_UNAVAILABLE: typingsJapgolly.squareConnect.squareConnectStrings.SERVICE_UNAVAILABLE = "SERVICE_UNAVAILABLE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.SERVICE_UNAVAILABLE]
  
  inline def UNAUTHORIZED: typingsJapgolly.squareConnect.squareConnectStrings.UNAUTHORIZED = "UNAUTHORIZED".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.UNAUTHORIZED]
  
  inline def UNEXPECTED_VALUE: typingsJapgolly.squareConnect.squareConnectStrings.UNEXPECTED_VALUE = "UNEXPECTED_VALUE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.UNEXPECTED_VALUE]
  
  inline def UNKNOWN_QUERY_PARAMETER: typingsJapgolly.squareConnect.squareConnectStrings.UNKNOWN_QUERY_PARAMETER = "UNKNOWN_QUERY_PARAMETER".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.UNKNOWN_QUERY_PARAMETER]
  
  inline def UNSUPPORTED_CARD_BRAND: typingsJapgolly.squareConnect.squareConnectStrings.UNSUPPORTED_CARD_BRAND = "UNSUPPORTED_CARD_BRAND".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.UNSUPPORTED_CARD_BRAND]
  
  inline def UNSUPPORTED_ENTRY_METHOD: typingsJapgolly.squareConnect.squareConnectStrings.UNSUPPORTED_ENTRY_METHOD = "UNSUPPORTED_ENTRY_METHOD".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.UNSUPPORTED_ENTRY_METHOD]
  
  inline def UNSUPPORTED_INSTRUMENT_TYPE: typingsJapgolly.squareConnect.squareConnectStrings.UNSUPPORTED_INSTRUMENT_TYPE = "UNSUPPORTED_INSTRUMENT_TYPE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.UNSUPPORTED_INSTRUMENT_TYPE]
  
  inline def UNSUPPORTED_MEDIA_TYPE: typingsJapgolly.squareConnect.squareConnectStrings.UNSUPPORTED_MEDIA_TYPE = "UNSUPPORTED_MEDIA_TYPE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.UNSUPPORTED_MEDIA_TYPE]
  
  inline def V1_ACCESS_TOKEN: typingsJapgolly.squareConnect.squareConnectStrings.V1_ACCESS_TOKEN = "V1_ACCESS_TOKEN".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.V1_ACCESS_TOKEN]
  
  inline def V1_APPLICATION: typingsJapgolly.squareConnect.squareConnectStrings.V1_APPLICATION = "V1_APPLICATION".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.V1_APPLICATION]
  
  inline def VALUE_EMPTY: typingsJapgolly.squareConnect.squareConnectStrings.VALUE_EMPTY = "VALUE_EMPTY".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.VALUE_EMPTY]
  
  inline def VALUE_REGEX_MISMATCH: typingsJapgolly.squareConnect.squareConnectStrings.VALUE_REGEX_MISMATCH = "VALUE_REGEX_MISMATCH".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.VALUE_REGEX_MISMATCH]
  
  inline def VALUE_TOO_HIGH: typingsJapgolly.squareConnect.squareConnectStrings.VALUE_TOO_HIGH = "VALUE_TOO_HIGH".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.VALUE_TOO_HIGH]
  
  inline def VALUE_TOO_LONG: typingsJapgolly.squareConnect.squareConnectStrings.VALUE_TOO_LONG = "VALUE_TOO_LONG".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.VALUE_TOO_LONG]
  
  inline def VALUE_TOO_LOW: typingsJapgolly.squareConnect.squareConnectStrings.VALUE_TOO_LOW = "VALUE_TOO_LOW".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.VALUE_TOO_LOW]
  
  inline def VALUE_TOO_SHORT: typingsJapgolly.squareConnect.squareConnectStrings.VALUE_TOO_SHORT = "VALUE_TOO_SHORT".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.VALUE_TOO_SHORT]
  
  inline def VERIFY_AVS_FAILURE: typingsJapgolly.squareConnect.squareConnectStrings.VERIFY_AVS_FAILURE = "VERIFY_AVS_FAILURE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.VERIFY_AVS_FAILURE]
  
  inline def VERIFY_CVV_FAILURE: typingsJapgolly.squareConnect.squareConnectStrings.VERIFY_CVV_FAILURE = "VERIFY_CVV_FAILURE".asInstanceOf[typingsJapgolly.squareConnect.squareConnectStrings.VERIFY_CVV_FAILURE]
}
