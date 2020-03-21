package typingsJapgolly.agGrid.floatingFilterMod

import typingsJapgolly.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFloatingFilterComp[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */]
  extends IFloatingFilter[M, F, P]
     with IComponent[P]

