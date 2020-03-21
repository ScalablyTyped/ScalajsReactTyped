package typingsJapgolly.mendixmodelsdk.deltaUtilsMod

import typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.unitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "getElement")
@js.native
object getElement extends js.Object {
  def apply(model: AbstractModel, unit: ModelUnit, elementId: String): AbstractElement = js.native
}

