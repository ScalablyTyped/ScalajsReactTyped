package typingsJapgolly.semanticUiApi

import typingsJapgolly.semanticUiApi.SemanticUI.ApiSettings
import typingsJapgolly.semanticUiApi.semanticUiApiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'mockResponseAsync'> */
trait PickImplmockResponseAsync extends js.Object {
  var mockResponseAsync: (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false`
}

object PickImplmockResponseAsync {
  @scala.inline
  def apply(
    mockResponseAsync: (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`
  ): PickImplmockResponseAsync = {
    val __obj = js.Dynamic.literal(mockResponseAsync = mockResponseAsync.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImplmockResponseAsync]
  }
}

