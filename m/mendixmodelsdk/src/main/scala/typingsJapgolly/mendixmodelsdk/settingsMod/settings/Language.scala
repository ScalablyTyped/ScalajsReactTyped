package typingsJapgolly.mendixmodelsdk.settingsMod.settings

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Language")
@js.native
class Language protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FLanguage: IModel = js.native
  def checkCompleteness(): Boolean = js.native
  def checkCompleteness(newValue: Boolean): js.Any = js.native
  def code(): String = js.native
  def code(newValue: String): js.Any = js.native
  def containerAsLanguageSettings(): LanguageSettings = js.native
  def customDateFormat(): String = js.native
  def customDateFormat(newValue: String): js.Any = js.native
  def customDateTimeFormat(): String = js.native
  def customDateTimeFormat(newValue: String): js.Any = js.native
  def customTimeFormat(): String = js.native
  def customTimeFormat(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Language")
@js.native
object Language extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Language instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Language = js.native
  /**
    * Creates and returns a new Language instance in the SDK and on the server.
    * The new Language will be automatically stored in the 'languages' property
    * of the parent LanguageSettings element passed as argument.
    */
  def createIn(container: LanguageSettings): Language = js.native
}

