package typingsJapgolly.antdMobile.paginationMod

import typingsJapgolly.antdMobile.paginationPropsTypeMod.PaginationState
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagination
  extends Component[PaginationProps, PaginationState, js.Any] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MPagination(nextProps: PaginationProps): Unit = js.native
  def onChange(p: Double): Unit = js.native
}

