package typingsJapgolly.semanticUiApi

import typingsJapgolly.semanticUiApi.SemanticUI.ApiSettings
import typingsJapgolly.semanticUiApi.semanticUiApiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'responseAsync'> */
trait PickImplresponseAsync extends js.Object {
  var responseAsync: (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false`
}

object PickImplresponseAsync {
  @scala.inline
  def apply(
    responseAsync: (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`
  ): PickImplresponseAsync = {
    val __obj = js.Dynamic.literal(responseAsync = responseAsync.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImplresponseAsync]
  }
}

