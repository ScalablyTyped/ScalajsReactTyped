package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/data-view-cancel-button relevant section in reference guide}
  *
  * In version 6.7.0: deleted
  */
@JSImport("mendixmodelsdk", "pages.DataViewCancelButton")
@js.native
class DataViewCancelButton protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages.DataViewCancelButton {
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
@JSImport("mendixmodelsdk", "pages.DataViewCancelButton")
@js.native
object DataViewCancelButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataViewCancelButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataViewCancelButton = js.native
  /**
    * Creates and returns a new DataViewCancelButton instance in the SDK and on the server.
    * The new DataViewCancelButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.6.0
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ControlBar): typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataViewCancelButton = js.native
}

