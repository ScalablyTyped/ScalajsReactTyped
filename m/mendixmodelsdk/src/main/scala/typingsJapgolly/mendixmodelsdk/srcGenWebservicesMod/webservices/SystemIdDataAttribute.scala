package typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 6.7.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/webservices", "webservices.SystemIdDataAttribute")
@js.native
open class SystemIdDataAttribute protected () extends DataMember {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 8.5.0: introduced
    */
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def entity: IEntity | Null = js.native
  
  def entityQualifiedName: String | Null = js.native
  
  def entity_=(newValue: IEntity | Null): Unit = js.native
  
  /**
    * In version 8.5.0: introduced
    */
  def summary: String = js.native
  def summary_=(newValue: String): Unit = js.native
}
object SystemIdDataAttribute {
  
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.SystemIdDataAttribute")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): SystemIdDataAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[SystemIdDataAttribute]
  
  /**
    * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
    * The new SystemIdDataAttribute will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 and higher
    */
  /* static member */
  inline def createIn(container: DataEntityBase): SystemIdDataAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[SystemIdDataAttribute]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.SystemIdDataAttribute.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.SystemIdDataAttribute.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
