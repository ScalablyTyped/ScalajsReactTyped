package typingsJapgolly.fmWebsync.fm.websync

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait initializeFailureArgs extends baseArgs {
  /**
    * The error generated while initializing.
    */
  var error: String
}

object initializeFailureArgs {
  @scala.inline
  def apply(error: String, StringDictionary: StringDictionary[js.Any] = null): initializeFailureArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[initializeFailureArgs]
  }
}

