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
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.PrimitiveTypedTemplateArgument")
@js.native
class PrimitiveTypedTemplateArgument protected () extends TypedTemplateArgument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FPrimitiveTypedTemplateArgument: IModel = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def expression(): String = js.native
  def expression(newValue: String): js.Any = js.native
  def `type`(): TypedTemplateArgumentType = js.native
  def `type`(newValue: TypedTemplateArgumentType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.PrimitiveTypedTemplateArgument")
@js.native
object PrimitiveTypedTemplateArgument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PrimitiveTypedTemplateArgument instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PrimitiveTypedTemplateArgument = js.native
  /**
    * Creates and returns a new PrimitiveTypedTemplateArgument instance in the SDK and on the server.
    * The new PrimitiveTypedTemplateArgument will be automatically stored in the 'arguments' property
    * of the parent TypedTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  def createIn(container: TypedTemplate): PrimitiveTypedTemplateArgument = js.native
}

