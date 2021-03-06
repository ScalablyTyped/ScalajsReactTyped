package typingsJapgolly.mendixmodelsdk.microflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.5.0: removed experimental
  * In version 8.4.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.StringTemplateParameterValue")
@js.native
class StringTemplateParameterValue protected () extends CodeActionParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FStringTemplateParameterValue: IModel = js.native
  /**
    * In version 8.6.0: deleted
    */
  def template(): StringTemplate = js.native
  def template(newValue: StringTemplate): js.Any = js.native
  /**
    * In version 8.6.0: introduced
    */
  def typedTemplate(): TypedTemplate = js.native
  def typedTemplate(newValue: TypedTemplate): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.StringTemplateParameterValue")
@js.native
object StringTemplateParameterValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new StringTemplateParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): StringTemplateParameterValue = js.native
  /**
    * Creates and returns a new StringTemplateParameterValue instance in the SDK and on the server.
    * The new StringTemplateParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): StringTemplateParameterValue = js.native
  /**
    * Creates and returns a new StringTemplateParameterValue instance in the SDK and on the server.
    * The new StringTemplateParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): StringTemplateParameterValue = js.native
}

