package typingsJapgolly.mendixmodelsdk.mod.settings

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.0.0: deleted
  * In version 6.9.0: introduced
  */
@JSImport("mendixmodelsdk", "settings.JavaActionsSettings")
@js.native
class JavaActionsSettings protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.settings.JavaActionsSettings {
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
@JSImport("mendixmodelsdk", "settings.JavaActionsSettings")
@js.native
object JavaActionsSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new JavaActionsSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.settingsMod.settings.JavaActionsSettings = js.native
  /**
    * Creates and returns a new JavaActionsSettings instance in the SDK and on the server.
    * The new JavaActionsSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 to 7.23.0
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.settingsMod.settings.ProjectSettings): typingsJapgolly.mendixmodelsdk.settingsMod.settings.JavaActionsSettings = js.native
}

