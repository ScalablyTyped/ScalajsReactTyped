package typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/sort-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.GridSortBar")
@js.native
class GridSortBar protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FGridSortBar: IModel = js.native
  def containerAsGrid(): Grid = js.native
  def sortItems(): IList[GridSortItem] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.GridSortBar")
@js.native
object GridSortBar extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): GridSortBar = js.native
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent Grid element passed as argument.
    */
  def createIn(container: Grid): GridSortBar = js.native
}

