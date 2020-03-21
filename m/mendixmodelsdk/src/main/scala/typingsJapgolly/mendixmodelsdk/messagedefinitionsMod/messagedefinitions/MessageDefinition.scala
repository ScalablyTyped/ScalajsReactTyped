package typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.6.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinition because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsMessageDefinitionCollection, name */ @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinition")
@js.native
abstract class MessageDefinition protected ()
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
  @JSName("containerAsMessageDefinitionCollection")
  val containerAsMessageDefinitionCollection_FMessageDefinition: IMessageDefinitionCollection = js.native
  @JSName("model")
  var model_FMessageDefinition: IModel = js.native
  @JSName("name")
  val name_FMessageDefinition: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  def containerAsMessageDefinitionCollection(): MessageDefinitionCollection = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MMessageDefinition(): String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinition")
@js.native
object MessageDefinition extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

