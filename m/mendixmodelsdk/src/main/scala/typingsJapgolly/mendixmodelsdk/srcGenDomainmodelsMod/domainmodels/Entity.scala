package typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IPoint
import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.IImage
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ExportLevel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/entities relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, location, documentation, generalization, attributes, isRemote, remoteSourceDocument, remoteSourceDocumentQualifiedName, source, capabilities */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Entity")
@js.native
open class Entity protected ()
  extends Element[IModel]
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def accessRules: IList[AccessRule] = js.native
  
  def attributes: IList[Attribute] = js.native
  @JSName("attributes")
  val attributes_FEntity: IList[IAttribute] = js.native
  
  /**
    * In version 9.0.1: deleted
    * In version 8.12.0: introduced
    */
  def capabilities: EntityCapabilities = js.native
  def capabilities_=(newValue: EntityCapabilities): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.0.1: deleted
    * In version 8.12.0: introduced
    */
  @JSName("capabilities")
  val capabilities_FEntity: IEntityCapabilities = js.native
  
  def containerAsDomainModel: DomainModel = js.native
  @JSName("containerAsDomainModel")
  val containerAsDomainModel_FEntity: IDomainModel = js.native
  
  def dataStorageGuid: String = js.native
  def dataStorageGuid_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.10.0: added public
    */
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  /**
    * In version 9.10.0: added public
    */
  @JSName("documentation")
  val documentation_FEntity: String = js.native
  
  def eventHandlers: IList[EventHandler] = js.native
  
  /**
    * In version 9.3.0: introduced
    */
  def exportLevel: ExportLevel = js.native
  def exportLevel_=(newValue: ExportLevel): Unit = js.native
  
  def generalization: GeneralizationBase = js.native
  def generalization_=(newValue: GeneralizationBase): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("generalization")
  val generalization_FEntity: IGeneralizationBase = js.native
  
  def image: IImage | Null = js.native
  
  /**
    * In version 9.17.0: introduced
    */
  def imageData: String | Null = js.native
  def imageData_=(newValue: String | Null): Unit = js.native
  
  def imageQualifiedName: String | Null = js.native
  
  def image_=(newValue: IImage | Null): Unit = js.native
  
  def indexes: IList[Index] = js.native
  
  /**
    * In version 8.10.0: deleted
    * In version 8.2.0: added public
    * In version 7.17.0: introduced
    */
  def isRemote: Boolean = js.native
  def isRemote_=(newValue: Boolean): Unit = js.native
  /**
    * In version 8.10.0: deleted
    * In version 8.2.0: added public
    * In version 7.17.0: introduced
    */
  @JSName("isRemote")
  val isRemote_FEntity: Boolean = js.native
  
  /**
    * In version 9.10.0: added public
    */
  def location: IPoint = js.native
  def location_=(newValue: IPoint): Unit = js.native
  /**
    * In version 9.10.0: added public
    */
  @JSName("location")
  val location_FEntity: IPoint = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FEntity: String = js.native
  
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  @JSName("qualifiedName")
  def qualifiedName_MEntity: String | Null = js.native
  
  /**
    * In version 8.10.0: deleted
    * In version 7.17.0: introduced
    */
  def remoteSource: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.10.0: deleted
    * In version 8.2.0: introduced
    */
  def remoteSourceDocument: IRemoteEntitySourceDocument | Null = js.native
  
  def remoteSourceDocumentQualifiedName: String | Null = js.native
  @JSName("remoteSourceDocumentQualifiedName")
  val remoteSourceDocumentQualifiedName_FEntity: String | Null = js.native
  
  def remoteSourceDocument_=(newValue: IRemoteEntitySourceDocument | Null): Unit = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.10.0: deleted
    * In version 8.2.0: introduced
    */
  @JSName("remoteSourceDocument")
  val remoteSourceDocument_FEntity: IRemoteEntitySourceDocument | Null = js.native
  
  def remoteSource_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.10.0: introduced
    */
  def source: EntitySource | Null = js.native
  def source_=(newValue: EntitySource | Null): Unit = js.native
  /**
    * In version 8.10.0: introduced
    */
  @JSName("source")
  val source_FEntity: IEntitySource | Null = js.native
  
  def validationRules: IList[ValidationRule] = js.native
}
object Entity {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Entity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Entity]
  
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * The new Entity will be automatically stored in the 'entities' property
    * of the parent DomainModel element passed as argument.
    */
  /* static member */
  inline def createIn(container: DomainModel): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Entity]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Entity.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Entity.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
