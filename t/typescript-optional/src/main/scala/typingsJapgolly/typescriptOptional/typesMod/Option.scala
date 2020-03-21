package typingsJapgolly.typescriptOptional.typesMod

import typingsJapgolly.typescriptOptional.typescriptOptionalStrings.empty
import typingsJapgolly.typescriptOptional.typescriptOptionalStrings.present
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typescriptOptional.typesMod.Present[T]
  - typingsJapgolly.typescriptOptional.typesMod.Empty[T]
*/
trait Option[T] extends js.Object

object Option {
  @scala.inline
  def Present[T](kind: present, value: T): Option[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Option[T]]
  }
  @scala.inline
  def Empty[T](kind: empty): Option[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Option[T]]
  }
}

