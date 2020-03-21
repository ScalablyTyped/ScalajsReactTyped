package typingsJapgolly.mendixmodelsdk.pagesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/drop-down-search-field relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDownSearchField")
@js.native
class DropDownSearchField protected () extends SingleSearchField {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDropDownSearchField: IModel = js.native
  def allowMultipleSelect(): Boolean = js.native
  def allowMultipleSelect(newValue: Boolean): js.Any = js.native
  def sortBar(): GridSortBar = js.native
  def sortBar(newValue: GridSortBar): js.Any = js.native
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def xPathConstraint(): String = js.native
  def xPathConstraint(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDownSearchField")
@js.native
object DropDownSearchField extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DropDownSearchField instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DropDownSearchField = js.native
  /**
    * Creates and returns a new DropDownSearchField instance in the SDK and on the server.
    * The new DropDownSearchField will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createIn(container: ControlBar): DropDownSearchField = js.native
}

