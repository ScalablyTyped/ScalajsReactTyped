package typingsJapgolly.mendixmodelsdk.microflowsMod.microflows

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

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.NanoflowCallParameterMapping")
@js.native
class NanoflowCallParameterMapping protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FNanoflowCallParameterMapping: IModel = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def argument(): String = js.native
  def argument(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def argumentModel(): Expression = js.native
  def argumentModel(newValue: Expression): js.Any = js.native
  def containerAsNanoflowCall(): NanoflowCall = js.native
  def parameter(): INanoflowParameter = js.native
  def parameter(newValue: INanoflowParameter): js.Any = js.native
  def parameterQualifiedName(): String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.NanoflowCallParameterMapping")
@js.native
object NanoflowCallParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NanoflowCallParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NanoflowCallParameterMapping = js.native
  /**
    * Creates and returns a new NanoflowCallParameterMapping instance in the SDK and on the server.
    * The new NanoflowCallParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent NanoflowCall element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: NanoflowCall): NanoflowCallParameterMapping = js.native
}

