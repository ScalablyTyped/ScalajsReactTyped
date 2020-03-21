package typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.DropDownButtonItem")
@js.native
class DropDownButtonItem protected ()
  extends typingsJapgolly.mendixmodelsdk.pagesMod.pages.DropDownButtonItem {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.DropDownButtonItem")
@js.native
object DropDownButtonItem extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DropDownButtonItem instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.DropDownButtonItem = js.native
  /**
    * Creates and returns a new DropDownButtonItem instance in the SDK and on the server.
    * The new DropDownButtonItem will be automatically stored in the 'items' property
    * of the parent DropDownButton element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DropDownButton): typingsJapgolly.mendixmodelsdk.pagesMod.pages.DropDownButtonItem = js.native
}

