package typingsJapgolly.typescriptOptional.typesMod

import typingsJapgolly.typescriptOptional.typescriptOptionalStrings.present
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Present[T] extends Option[T] {
  var kind: present
  var value: T
}

object Present {
  @scala.inline
  def apply[T](kind: present, value: T): Present[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Present[T]]
  }
}

