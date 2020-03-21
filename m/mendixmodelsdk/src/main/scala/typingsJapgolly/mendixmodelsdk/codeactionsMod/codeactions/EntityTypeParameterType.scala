package typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.IParameterType because Already inherited
- typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.IEntityTypeParameterType because var conflicts: containerAsCodeActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.EntityTypeParameterType")
@js.native
class EntityTypeParameterType protected () extends ParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEntityTypeParameterType: IModel = js.native
  @JSName("typeParameter")
  val typeParameter_FEntityTypeParameterType: ITypeParameter | Null = js.native
  @JSName("containerAsCodeActionParameter")
  def containerAsCodeActionParameter_MEntityTypeParameterType(): CodeActionParameter = js.native
  def typeParameter(): js.Any = js.native
  def typeParameter(newValue: TypeParameter): js.Any = js.native
  @JSName("typeParameter")
  def typeParameter_Union(): TypeParameter | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.EntityTypeParameterType")
@js.native
object EntityTypeParameterType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityTypeParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EntityTypeParameterType = js.native
}

