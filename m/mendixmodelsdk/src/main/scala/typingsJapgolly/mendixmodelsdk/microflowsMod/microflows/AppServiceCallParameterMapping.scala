package typingsJapgolly.mendixmodelsdk.microflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.IAppServiceActionParameter
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.Expression
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.AppServiceCallParameterMapping")
@js.native
class AppServiceCallParameterMapping protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FAppServiceCallParameterMapping: IModel = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def argument(): String = js.native
  def argument(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def argumentModel(): Expression = js.native
  def argumentModel(newValue: Expression): js.Any = js.native
  def containerAsAppServiceCallAction(): AppServiceCallAction = js.native
  def parameter(): js.Any = js.native
  def parameter(newValue: IAppServiceActionParameter): js.Any = js.native
  def parameterQualifiedName(): String | Null = js.native
  @JSName("parameter")
  def parameter_Union(): IAppServiceActionParameter | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.AppServiceCallParameterMapping")
@js.native
object AppServiceCallParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AppServiceCallParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): AppServiceCallParameterMapping = js.native
  /**
    * Creates and returns a new AppServiceCallParameterMapping instance in the SDK and on the server.
    * The new AppServiceCallParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent AppServiceCallAction element passed as argument.
    */
  def createIn(container: AppServiceCallAction): AppServiceCallParameterMapping = js.native
}

