package typingsJapgolly.semanticUiDropdown

import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.both
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.text
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'match'> */
trait PickImplmatch extends js.Object {
  var `match`: both | value | text
}

object PickImplmatch {
  @scala.inline
  def apply(`match`: both | value | text): PickImplmatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmatch]
  }
}

