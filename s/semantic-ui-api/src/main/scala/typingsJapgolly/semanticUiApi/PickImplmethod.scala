package typingsJapgolly.semanticUiApi

import typingsJapgolly.semanticUiApi.semanticUiApiStrings.delete
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.get
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.head
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.options
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.patch
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.post
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'method'> */
trait PickImplmethod extends js.Object {
  var method: post | get | put | delete | head | options | patch
}

object PickImplmethod {
  @scala.inline
  def apply(method: post | get | put | delete | head | options | patch): PickImplmethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImplmethod]
  }
}

