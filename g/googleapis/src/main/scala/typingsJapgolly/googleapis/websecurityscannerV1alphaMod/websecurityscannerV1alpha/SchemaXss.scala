package typingsJapgolly.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information reported for an XSS.
  */
@js.native
trait SchemaXss extends js.Object {
  /**
    * An error message generated by a javascript breakage.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Stack traces leading to the point where the XSS occurred.
    */
  var stackTraces: js.UndefOr[js.Array[String]] = js.native
}

object SchemaXss {
  @scala.inline
  def apply(errorMessage: String = null, stackTraces: js.Array[String] = null): SchemaXss = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (stackTraces != null) __obj.updateDynamic("stackTraces")(stackTraces.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaXss]
  }
}

