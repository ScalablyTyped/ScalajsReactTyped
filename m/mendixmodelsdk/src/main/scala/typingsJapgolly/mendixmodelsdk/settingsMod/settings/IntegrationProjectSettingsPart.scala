package typingsJapgolly.mendixmodelsdk.settingsMod.settings

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.IntegrationProjectSettingsPart")
@js.native
class IntegrationProjectSettingsPart protected () extends ProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FIntegrationProjectSettingsPart: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.IntegrationProjectSettingsPart")
@js.native
object IntegrationProjectSettingsPart extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new IntegrationProjectSettingsPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): IntegrationProjectSettingsPart = js.native
  /**
    * Creates and returns a new IntegrationProjectSettingsPart instance in the SDK and on the server.
    * The new IntegrationProjectSettingsPart will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  def createIn(container: ProjectSettings): IntegrationProjectSettingsPart = js.native
}

