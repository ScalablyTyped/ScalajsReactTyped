package typingsJapgolly.mendixmodelsdk.pagesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ControlBar")
@js.native
abstract class ControlBar protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FControlBar: IModel = js.native
  def containerAsDataView(): DataView = js.native
  def containerAsGrid(): Grid = js.native
  def containerAsGridBaseSource(): GridBaseSource = js.native
  def containerAsGridDatabaseSource(): GridDatabaseSource = js.native
  def items(): IList[ControlBarItem] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ControlBar")
@js.native
object ControlBar extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

