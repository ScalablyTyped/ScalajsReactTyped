package typingsJapgolly.firebase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `FirebaseError` is a subclass of the standard JavaScript `Error` object. In
  * addition to a message string and stack trace, it contains a string code.
  */
trait FirebaseError extends js.Object {
  /**
    * Error codes are strings using the following format: `"service/string-code"`.
    * Some examples include `"app/no-app"` and `"auth/user-not-found"`.
    *
    * While the message for a given error can change, the code will remain the same
    * between backward-compatible versions of the Firebase SDK.
    */
  var code: String
  /**
    * An explanatory message for the error that just occurred.
    *
    * This message is designed to be helpful to you, the developer. Because
    * it generally does not convey meaningful information to end users,
    * this message should not be displayed in your application.
    */
  var message: String
  /**
    * The name of the class of errors, which is `"FirebaseError"`.
    */
  var name: String
  /**
    * A string value containing the execution backtrace when the error originally
    * occurred. This may not always be available.
    *
    * When it is available, this information can be sent to
    * {@link https://firebase.google.com/support/ Firebase Support} to help
    * explain the cause of an error.
    */
  var stack: js.UndefOr[String] = js.undefined
}

object FirebaseError {
  @scala.inline
  def apply(code: String, message: String, name: String, stack: String = null): FirebaseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseError]
  }
}

