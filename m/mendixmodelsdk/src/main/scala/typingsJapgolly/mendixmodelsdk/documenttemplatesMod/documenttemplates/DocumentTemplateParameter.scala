package typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.DataType
import typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.IDataType
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.IDocumentTemplateParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDocumentTemplate, name, `type`, parameterType */ @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DocumentTemplateParameter")
@js.native
class DocumentTemplateParameter protected ()
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
  @JSName("containerAsDocumentTemplate")
  val containerAsDocumentTemplate_FDocumentTemplateParameter: IDocumentTemplate = js.native
  @JSName("model")
  var model_FDocumentTemplateParameter: IModel = js.native
  @JSName("name")
  val name_FDocumentTemplateParameter: String = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.9.0: introduced
    */
  @JSName("parameterType")
  val parameterType_FDocumentTemplateParameter: IDataType = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  @JSName("type")
  val type_FDocumentTemplateParameter: String | Null = js.native
  def containerAsDocumentTemplate(): DocumentTemplate = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  /**
    * In version 7.9.0: introduced
    */
  def parameterType(): DataType = js.native
  def parameterType(newValue: DataType): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MDocumentTemplateParameter(): String | Null = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def `type`(): String = js.native
  def `type`(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DocumentTemplateParameter")
@js.native
object DocumentTemplateParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

