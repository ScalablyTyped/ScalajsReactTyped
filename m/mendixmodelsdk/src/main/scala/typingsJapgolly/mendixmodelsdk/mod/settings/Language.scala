package typingsJapgolly.mendixmodelsdk.mod.settings

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "settings.Language")
@js.native
class Language protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.settings.Language {
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
@JSImport("mendixmodelsdk", "settings.Language")
@js.native
object Language extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Language instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.settingsMod.settings.Language = js.native
  /**
    * Creates and returns a new Language instance in the SDK and on the server.
    * The new Language will be automatically stored in the 'languages' property
    * of the parent LanguageSettings element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.settingsMod.settings.LanguageSettings): typingsJapgolly.mendixmodelsdk.settingsMod.settings.Language = js.native
}

