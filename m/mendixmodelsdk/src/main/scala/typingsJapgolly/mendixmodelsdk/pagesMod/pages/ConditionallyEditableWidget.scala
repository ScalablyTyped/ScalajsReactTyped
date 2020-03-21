package typingsJapgolly.mendixmodelsdk.pagesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionallyEditableWidget")
@js.native
abstract class ConditionallyEditableWidget protected () extends ConditionallyVisibleWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FConditionallyEditableWidget: IModel = js.native
  def conditionalEditabilitySettings(): js.Any = js.native
  def conditionalEditabilitySettings(newValue: ConditionalEditabilitySettings): js.Any = js.native
  @JSName("conditionalEditabilitySettings")
  def conditionalEditabilitySettings_Union(): ConditionalEditabilitySettings | Null = js.native
  def editable(): EditableEnum = js.native
  def editable(newValue: EditableEnum): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionallyEditableWidget")
@js.native
object ConditionallyEditableWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

