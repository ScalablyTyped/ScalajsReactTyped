package typingsJapgolly.mendixmodelsdk.microflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.DataType
import typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.IDataType
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.Document
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined returnType, microflowReturnType */ @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowBase")
@js.native
abstract class MicroflowBase protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.9.0: introduced
    */
  @JSName("microflowReturnType")
  val microflowReturnType_FMicroflowBase: IDataType = js.native
  @JSName("model")
  var model_FMicroflowBase: IModel = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  @JSName("returnType")
  val returnType_FMicroflowBase: String | Null = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MMicroflowBase(): FolderBase = js.native
  def flows(): IList[Flow] = js.native
  def markAsUsed(): Boolean = js.native
  def markAsUsed(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.9.0: introduced
    */
  def microflowReturnType(): DataType = js.native
  def microflowReturnType(newValue: DataType): js.Any = js.native
  def objectCollection(): MicroflowObjectCollection = js.native
  def objectCollection(newValue: MicroflowObjectCollection): js.Any = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def returnType(): String = js.native
  def returnType(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowBase")
@js.native
object MicroflowBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

