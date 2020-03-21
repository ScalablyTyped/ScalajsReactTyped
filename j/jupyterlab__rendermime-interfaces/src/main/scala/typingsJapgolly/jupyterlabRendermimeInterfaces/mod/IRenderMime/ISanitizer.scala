package typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that handles html sanitization.
  */
trait ISanitizer extends js.Object {
  /**
    * Sanitize an HTML string.
    */
  def sanitize(dirty: String): String
}

object ISanitizer {
  @scala.inline
  def apply(sanitize: String => CallbackTo[String]): ISanitizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sanitize")(js.Any.fromFunction1((t0: java.lang.String) => sanitize(t0).runNow()))
    __obj.asInstanceOf[ISanitizer]
  }
}

