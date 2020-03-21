package typingsJapgolly.activedirectory2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activedirectory2.activedirectory2Strings.distinguishedName
  - typingsJapgolly.activedirectory2.activedirectory2Strings.objectCategory
  - typingsJapgolly.activedirectory2.activedirectory2Strings.cn
  - typingsJapgolly.activedirectory2.activedirectory2Strings.description
*/
trait GroupAttributes extends js.Object

object GroupAttributes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cn: typingsJapgolly.activedirectory2.activedirectory2Strings.cn = this.cast("cn")
  @scala.inline
  def description: typingsJapgolly.activedirectory2.activedirectory2Strings.description = this.cast("description")
  @scala.inline
  def distinguishedName: typingsJapgolly.activedirectory2.activedirectory2Strings.distinguishedName = this.cast("distinguishedName")
  @scala.inline
  def objectCategory: typingsJapgolly.activedirectory2.activedirectory2Strings.objectCategory = this.cast("objectCategory")
}

