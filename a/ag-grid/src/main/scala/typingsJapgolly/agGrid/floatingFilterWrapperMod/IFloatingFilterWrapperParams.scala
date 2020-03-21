package typingsJapgolly.agGrid.floatingFilterWrapperMod

import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.floatingFilterMod.FloatingFilterChange
import typingsJapgolly.agGrid.floatingFilterMod.IFloatingFilterComp
import typingsJapgolly.agGrid.floatingFilterMod.IFloatingFilterParams
import typingsJapgolly.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFloatingFilterWrapperParams[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */] extends js.Object {
  var column: Column
  var floatingFilterComp: Promise[IFloatingFilterComp[M, F, P]]
  var suppressFilterButton: Boolean
}

object IFloatingFilterWrapperParams {
  @scala.inline
  def apply[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */](
    column: Column,
    floatingFilterComp: Promise[IFloatingFilterComp[M, F, P]],
    suppressFilterButton: Boolean
  ): IFloatingFilterWrapperParams[M, F, P] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], floatingFilterComp = floatingFilterComp.asInstanceOf[js.Any], suppressFilterButton = suppressFilterButton.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFloatingFilterWrapperParams[M, F, P]]
  }
}

