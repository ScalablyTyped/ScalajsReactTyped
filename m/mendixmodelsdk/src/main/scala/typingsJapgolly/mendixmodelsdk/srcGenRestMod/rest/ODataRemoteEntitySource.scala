package typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Entity
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.QueryBasedRemoteEntitySource
import typingsJapgolly.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.10.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntitySource because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IRemoteEntitySource because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IQueryBasedRemoteEntitySource because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.IODataRemoteEntitySource because var conflicts: containerAsEntity, id, isLoaded, model, structureTypeName, unit. Inlined key, countable */ @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataRemoteEntitySource")
@js.native
open class ODataRemoteEntitySource protected () extends QueryBasedRemoteEntitySource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsEntity")
  def containerAsEntity_MODataRemoteEntitySource: Entity = js.native
  
  /**
    * In version 8.16.0: introduced
    */
  def countable: Boolean = js.native
  def countable_=(newValue: Boolean): Unit = js.native
  /**
    * In version 8.16.0: introduced
    */
  @JSName("countable")
  val countable_FODataRemoteEntitySource: Boolean = js.native
  
  /**
    * In version 9.11.0: introduced
    */
  def creatable: Boolean = js.native
  def creatable_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.11.0: introduced
    */
  def deletable: Boolean = js.native
  def deletable_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.5.0: deleted
    * In version 8.11.0: introduced
    */
  def entitySet: String = js.native
  
  /**
    * In version 9.5.0: introduced
    */
  def entitySetName: String = js.native
  def entitySetName_=(newValue: String): Unit = js.native
  
  def entitySet_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.5.0: introduced
    */
  def entityTypeName: String = js.native
  def entityTypeName_=(newValue: String): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.11.0: introduced
    */
  def key: ODataKey | Null = js.native
  def key_=(newValue: ODataKey | Null): Unit = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.11.0: introduced
    */
  @JSName("key")
  val key_FODataRemoteEntitySource: IODataKey | Null = js.native
  
  /**
    * In version 9.5.0: deleted
    */
  def remoteName: String = js.native
  def remoteName_=(newValue: String): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def sourceDocument: IConsumedODataService | Null = js.native
  
  def sourceDocumentQualifiedName: String | Null = js.native
  
  def sourceDocument_=(newValue: IConsumedODataService | Null): Unit = js.native
}
object ODataRemoteEntitySource {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataRemoteEntitySource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ODataRemoteEntitySource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ODataRemoteEntitySource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ODataRemoteEntitySource]
  
  /**
    * Creates and returns a new ODataRemoteEntitySource instance in the SDK and on the server.
    * The new ODataRemoteEntitySource will be automatically stored in the 'source' property
    * of the parent domainmodels.Entity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  /* static member */
  inline def createIn(container: Entity): ODataRemoteEntitySource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ODataRemoteEntitySource]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataRemoteEntitySource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataRemoteEntitySource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
