package typingsJapgolly.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOperationReference extends js.Object {
  var id: String
  var status: String
  var url: String
}

object TestOperationReference {
  @scala.inline
  def apply(id: String, status: String, url: String): TestOperationReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestOperationReference]
  }
}

