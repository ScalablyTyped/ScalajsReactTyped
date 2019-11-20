package typingsJapgolly.antd

import typingsJapgolly.antd.libTableInterfaceMod.ColumnProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/Column", JSImport.Namespace)
@js.native
object libTableColumnMod extends js.Object {
  @js.native
  class default[T] ()
    extends Component[ColumnProps[T], ComponentState, js.Any]
  
  type Column[T] = japgolly.scalajs.react.raw.React.Component[ColumnProps[T] with js.Object, js.Object]
}

