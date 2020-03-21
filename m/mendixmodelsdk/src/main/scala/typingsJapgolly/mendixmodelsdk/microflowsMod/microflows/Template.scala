package typingsJapgolly.mendixmodelsdk.microflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Template")
@js.native
abstract class Template protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FTemplate: IModel = js.native
  def arguments(): IList[TemplateArgument] = js.native
  def containerAsCustomRequestHandling(): CustomRequestHandling = js.native
  def containerAsHttpConfiguration(): HttpConfiguration = js.native
  def containerAsLogMessageAction(): LogMessageAction = js.native
  def containerAsShowMessageAction(): ShowMessageAction = js.native
  def containerAsStringTemplateParameterValue(): StringTemplateParameterValue = js.native
  def containerAsValidationFeedbackAction(): ValidationFeedbackAction = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Template")
@js.native
object Template extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

