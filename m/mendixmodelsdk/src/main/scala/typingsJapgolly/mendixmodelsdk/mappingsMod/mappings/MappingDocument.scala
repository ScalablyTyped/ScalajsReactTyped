package typingsJapgolly.mendixmodelsdk.mappingsMod.mappings

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.jsonstructuresMod.jsonstructures.IJsonStructure
import typingsJapgolly.mendixmodelsdk.mappingsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinition
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.Document
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.IImportedWebService
import typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.IXmlSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.IMappingDocument because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument")
@js.native
abstract class MappingDocument protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FMappingDocument: IModel = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MMappingDocument(): FolderBase = js.native
  def importedWebService(): js.Any = js.native
  def importedWebService(newValue: IImportedWebService): js.Any = js.native
  def importedWebServiceQualifiedName(): String | Null = js.native
  @JSName("importedWebService")
  def importedWebService_Union(): IImportedWebService | Null = js.native
  def jsonStructure(): js.Any = js.native
  def jsonStructure(newValue: IJsonStructure): js.Any = js.native
  def jsonStructureQualifiedName(): String | Null = js.native
  /**
    * In version 6.4.0: introduced
    */
  @JSName("jsonStructure")
  def jsonStructure_Union(): IJsonStructure | Null = js.native
  def messageDefinition(): js.Any = js.native
  def messageDefinition(newValue: IMessageDefinition): js.Any = js.native
  def messageDefinitionQualifiedName(): String | Null = js.native
  /**
    * In version 7.6.0: introduced
    */
  @JSName("messageDefinition")
  def messageDefinition_Union(): IMessageDefinition | Null = js.native
  def operationName(): String = js.native
  def operationName(newValue: String): js.Any = js.native
  /**
    * In version 7.14.0: introduced
    */
  def publicName(): String = js.native
  def publicName(newValue: String): js.Any = js.native
  def rootElementName(): String = js.native
  def rootElementName(newValue: String): js.Any = js.native
  def rootMappingElements(): IList[ObjectMappingElement] = js.native
  def serviceName(): String = js.native
  def serviceName(newValue: String): js.Any = js.native
  def xmlSchema(): js.Any = js.native
  def xmlSchema(newValue: IXmlSchema): js.Any = js.native
  def xmlSchemaQualifiedName(): String | Null = js.native
  @JSName("xmlSchema")
  def xmlSchema_Union(): IXmlSchema | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument")
@js.native
object MappingDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

