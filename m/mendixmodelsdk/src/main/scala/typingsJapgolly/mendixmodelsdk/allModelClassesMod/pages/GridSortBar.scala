package typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/sort-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSortBar")
@js.native
class GridSortBar protected ()
  extends typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSortBar {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSortBar")
@js.native
object GridSortBar extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent DropDownSearchField element passed as argument.
    */
  def createInDropDownSearchFieldUnderSortBar(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DropDownSearchField): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorDatabaseSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.2.0 and higher
    */
  def createInSelectorDatabaseSourceUnderSortBar(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.SelectorDatabaseSource): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorXPathSource element passed as argument.
    */
  def createInSelectorXPathSourceUnderSortBar(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.SelectorXPathSource): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SortableEntityPathSource element passed as argument.
    */
  def createInSortableEntityPathSourceUnderSortBar(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.SortableEntityPathSource): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
}

