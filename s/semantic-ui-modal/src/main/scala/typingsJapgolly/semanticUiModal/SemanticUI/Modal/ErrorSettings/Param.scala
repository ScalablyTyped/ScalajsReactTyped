package typingsJapgolly.semanticUiModal.SemanticUI.Modal.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.ErrorSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.ErrorSettings._Impl>> */
trait Param extends js.Object {
  var method: js.UndefOr[String] = js.undefined
}

object Param {
  @scala.inline
  def apply(method: String = null): Param = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
}

