package typingsJapgolly.semanticUiNag

import typingsJapgolly.semanticUiNag.semanticUiNagStrings.cookie
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.localstorage
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.sessionstorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'storageMethod'> */
trait PickImplstorageMethod extends js.Object {
  var storageMethod: cookie | localstorage | sessionstorage
}

object PickImplstorageMethod {
  @scala.inline
  def apply(storageMethod: cookie | localstorage | sessionstorage): PickImplstorageMethod = {
    val __obj = js.Dynamic.literal(storageMethod = storageMethod.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImplstorageMethod]
  }
}

