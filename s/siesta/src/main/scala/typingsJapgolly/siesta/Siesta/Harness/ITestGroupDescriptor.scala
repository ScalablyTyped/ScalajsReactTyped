package typingsJapgolly.siesta.Siesta.Harness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITestGroupDescriptor extends js.Object {
  var group: String
  var items: js.Array[_]
}

object ITestGroupDescriptor {
  @scala.inline
  def apply(group: String, items: js.Array[_]): ITestGroupDescriptor = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITestGroupDescriptor]
  }
}

