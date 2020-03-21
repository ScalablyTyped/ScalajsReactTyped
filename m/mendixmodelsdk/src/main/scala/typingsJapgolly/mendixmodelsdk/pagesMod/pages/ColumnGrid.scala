package typingsJapgolly.mendixmodelsdk.pagesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ColumnGrid")
@js.native
abstract class ColumnGrid protected () extends Grid {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FColumnGrid: IModel = js.native
  def columns(): IList[GridColumn] = js.native
  def numberOfRows(): Double = js.native
  def numberOfRows(newValue: Double): js.Any = js.native
  def showEmptyRows(): Boolean = js.native
  def showEmptyRows(newValue: Boolean): js.Any = js.native
  def tooltipPage(): js.Any = js.native
  def tooltipPage(newValue: IPage): js.Any = js.native
  def tooltipPageQualifiedName(): String | Null = js.native
  @JSName("tooltipPage")
  def tooltipPage_Union(): IPage | Null = js.native
  def widthUnit(): UnitEnum = js.native
  def widthUnit(newValue: UnitEnum): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ColumnGrid")
@js.native
object ColumnGrid extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

