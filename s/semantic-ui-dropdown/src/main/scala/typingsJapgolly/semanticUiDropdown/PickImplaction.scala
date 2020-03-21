package typingsJapgolly.semanticUiDropdown

import typingsJapgolly.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.activate
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.combo
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.hide
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.nothing
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'action'> */
trait PickImplaction extends js.Object {
  var action: activate | select | combo | nothing | hide | (js.ThisFunction3[
    /* this */ JQuery, 
    /* text */ String, 
    /* value */ String | `false`, 
    /* element */ JQuery, 
    Unit
  ])
}

object PickImplaction {
  @scala.inline
  def apply(
    action: activate | select | combo | nothing | hide | (js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ])
  ): PickImplaction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImplaction]
  }
}

