package typingsJapgolly.semanticUiVisibility

import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typingsJapgolly.semanticUiVisibility.semanticUiVisibilityStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'type'> */
trait PickImpltype extends js.Object {
  var `type`: `false` | image | fixed
}

object PickImpltype {
  @scala.inline
  def apply(`type`: `false` | image | fixed): PickImpltype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltype]
  }
}

