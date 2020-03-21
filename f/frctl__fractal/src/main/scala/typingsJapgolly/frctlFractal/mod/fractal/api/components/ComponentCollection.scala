package typingsJapgolly.frctlFractal.mod.fractal.api.components

import typingsJapgolly.frctlFractal.mod.fractal.core.entities.EntityCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentCollection extends EntityCollection[Component] {
  def components(): this.type = js.native
  def variants(): this.type = js.native
}

