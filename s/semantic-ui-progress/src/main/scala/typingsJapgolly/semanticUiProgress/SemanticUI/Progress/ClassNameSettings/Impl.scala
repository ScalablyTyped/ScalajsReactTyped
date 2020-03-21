package typingsJapgolly.semanticUiProgress.SemanticUI.Progress.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String
  /**
    * @default 'error'
    */
  var error: String
  /**
    * @default 'success'
    */
  var success: String
  /**
    * @default 'warning'
    */
  var warning: String
}

object Impl {
  @scala.inline
  def apply(active: String, error: String, success: String, warning: String): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

