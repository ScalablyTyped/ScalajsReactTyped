package typingsJapgolly.mendixmodelsdk.allModelClassesMod.settings

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.ModelerSettings")
@js.native
class ModelerSettings protected ()
  extends typingsJapgolly.mendixmodelsdk.settingsMod.settings.ModelerSettings {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.ModelerSettings")
@js.native
object ModelerSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ModelerSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.settingsMod.settings.ModelerSettings = js.native
  /**
    * Creates and returns a new ModelerSettings instance in the SDK and on the server.
    * The new ModelerSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.settingsMod.settings.ProjectSettings): typingsJapgolly.mendixmodelsdk.settingsMod.settings.ModelerSettings = js.native
}

