package typingsJapgolly.semanticUiTab

import typingsJapgolly.semanticUiTab.semanticUiTabStrings.DOM
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.html
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'cacheType'> */
trait PickImplcacheType extends js.Object {
  var cacheType: response | DOM | html
}

object PickImplcacheType {
  @scala.inline
  def apply(cacheType: response | DOM | html): PickImplcacheType = {
    val __obj = js.Dynamic.literal(cacheType = cacheType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImplcacheType]
  }
}

