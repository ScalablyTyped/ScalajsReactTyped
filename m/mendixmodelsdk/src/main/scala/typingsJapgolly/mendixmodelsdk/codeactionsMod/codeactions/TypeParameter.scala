package typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
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
- typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.ITypeParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeAction, name */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.TypeParameter")
@js.native
class TypeParameter protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsCodeAction")
  val containerAsCodeAction_FTypeParameter: ICodeAction = js.native
  @JSName("model")
  var model_FTypeParameter: IModel = js.native
  @JSName("name")
  val name_FTypeParameter: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  def containerAsCodeAction(): CodeAction = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MTypeParameter(): String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.TypeParameter")
@js.native
object TypeParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TypeParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TypeParameter = js.native
}

