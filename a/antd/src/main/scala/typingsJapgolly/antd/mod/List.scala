package typingsJapgolly.antd.mod

import typingsJapgolly.antd.AnonDataSource
import typingsJapgolly.antd.AnonGrid
import typingsJapgolly.antd.TypeofItem
import typingsJapgolly.antd.listMod.ListProps
import typingsJapgolly.antd.listMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "List")
@js.native
class List[T] protected () extends default[T] {
  def this(props: ListProps[T]) = this()
}

/* static members */
@JSImport("antd", "List")
@js.native
object List extends js.Object {
  var Item: TypeofItem = js.native
  var childContextTypes: AnonGrid = js.native
  var defaultProps: AnonDataSource = js.native
}

