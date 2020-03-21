package typingsJapgolly.reactSortableHoc.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-hoc", "SortableElement")
@js.native
object SortableElement extends js.Object {
  def apply[P](wrappedComponent: WrappedComponent[P]): ComponentClassP[P with SortableElementProps with js.Object] = js.native
  def apply[P](wrappedComponent: WrappedComponent[P], config: Config): ComponentClassP[P with SortableElementProps with js.Object] = js.native
}

