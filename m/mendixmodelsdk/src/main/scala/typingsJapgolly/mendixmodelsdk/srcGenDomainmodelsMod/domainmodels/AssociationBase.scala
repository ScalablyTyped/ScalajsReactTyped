package typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.ExportLevel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/associations relevant section in reference guide}
  */
/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAssociationBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, `type`, owner, parent, documentation, remoteSourceDocument, remoteSourceDocumentQualifiedName, source, capabilities */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AssociationBase")
@js.native
open class AssociationBase protected ()
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
  
  /**
    * In version 9.0.1: deleted
    * In version 8.11.0: introduced
    */
  def capabilities: AssociationCapabilities = js.native
  def capabilities_=(newValue: AssociationCapabilities): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.0.1: deleted
    * In version 8.11.0: introduced
    */
  @JSName("capabilities")
  val capabilities_FAssociationBase: IAssociationCapabilities = js.native
  
  def containerAsDomainModel: DomainModel = js.native
  @JSName("containerAsDomainModel")
  val containerAsDomainModel_FAssociationBase: IDomainModel = js.native
  
  def dataStorageGuid: String = js.native
  def dataStorageGuid_=(newValue: String): Unit = js.native
  
  def deleteBehavior: AssociationDeleteBehavior = js.native
  def deleteBehavior_=(newValue: AssociationDeleteBehavior): Unit = js.native
  
  /**
    * In version 9.10.0: added public
    */
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  /**
    * In version 9.10.0: added public
    */
  @JSName("documentation")
  val documentation_FAssociationBase: String = js.native
  
  /**
    * In version 9.3.0: introduced
    */
  def exportLevel: ExportLevel = js.native
  def exportLevel_=(newValue: ExportLevel): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FAssociationBase: String = js.native
  
  def owner: AssociationOwner = js.native
  def owner_=(newValue: AssociationOwner): Unit = js.native
  @JSName("owner")
  val owner_FAssociationBase: AssociationOwner = js.native
  
  def parent: Entity = js.native
  def parent_=(newValue: Entity): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("parent")
  val parent_FAssociationBase: IEntity = js.native
  
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  @JSName("qualifiedName")
  def qualifiedName_MAssociationBase: String | Null = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.10.0: deleted
    * In version 8.3.0: introduced
    */
  def remoteSourceDocument: IRemoteEntitySourceDocument | Null = js.native
  
  def remoteSourceDocumentQualifiedName: String | Null = js.native
  @JSName("remoteSourceDocumentQualifiedName")
  val remoteSourceDocumentQualifiedName_FAssociationBase: String | Null = js.native
  
  def remoteSourceDocument_=(newValue: IRemoteEntitySourceDocument | Null): Unit = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.10.0: deleted
    * In version 8.3.0: introduced
    */
  @JSName("remoteSourceDocument")
  val remoteSourceDocument_FAssociationBase: IRemoteEntitySourceDocument | Null = js.native
  
  /**
    * In version 8.10.0: introduced
    */
  def source: AssociationSource | Null = js.native
  def source_=(newValue: AssociationSource | Null): Unit = js.native
  /**
    * In version 8.10.0: introduced
    */
  @JSName("source")
  val source_FAssociationBase: IAssociationSource | Null = js.native
  
  def `type`: AssociationType = js.native
  def type_=(newValue: AssociationType): Unit = js.native
  @JSName("type")
  val type_FAssociationBase: AssociationType = js.native
}
object AssociationBase {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AssociationBase")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AssociationBase.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AssociationBase.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
