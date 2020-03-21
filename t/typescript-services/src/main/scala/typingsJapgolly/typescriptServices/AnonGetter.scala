package typingsJapgolly.typescriptServices

import typingsJapgolly.typescriptServices.TypeScript.GetAccessor
import typingsJapgolly.typescriptServices.TypeScript.SetAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetter extends js.Object {
  var getter: GetAccessor
  var setter: SetAccessor
}

object AnonGetter {
  @scala.inline
  def apply(getter: GetAccessor, setter: SetAccessor): AnonGetter = {
    val __obj = js.Dynamic.literal(getter = getter.asInstanceOf[js.Any], setter = setter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGetter]
  }
}

