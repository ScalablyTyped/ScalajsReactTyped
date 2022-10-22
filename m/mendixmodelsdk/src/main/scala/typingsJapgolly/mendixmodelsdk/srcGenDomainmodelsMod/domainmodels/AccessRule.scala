package typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.AccessRuleContainerBase
import typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.IModuleRole
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
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
  * Interfaces and instance classes for types from the Mendix sub meta model `DomainModels`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide/access-rules relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AccessRule")
@js.native
open class AccessRule protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def allowCreate: Boolean = js.native
  def allowCreate_=(newValue: Boolean): Unit = js.native
  
  def allowDelete: Boolean = js.native
  def allowDelete_=(newValue: Boolean): Unit = js.native
  
  def containerAsAccessRuleContainerBase: AccessRuleContainerBase = js.native
  
  def containerAsEntity: Entity = js.native
  
  def defaultMemberAccessRights: MemberAccessRights = js.native
  def defaultMemberAccessRights_=(newValue: MemberAccessRights): Unit = js.native
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  def memberAccesses: IList[MemberAccess] = js.native
  
  def moduleRoles: IList[IModuleRole] = js.native
  
  def moduleRolesQualifiedNames: js.Array[String] = js.native
  
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def xPathConstraint: String = js.native
  def xPathConstraint_=(newValue: String): Unit = js.native
}
object AccessRule {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AccessRule")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AccessRule instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): AccessRule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[AccessRule]
  
  /**
    * Creates and returns a new AccessRule instance in the SDK and on the server.
    * The new AccessRule will be automatically stored in the 'accessRules' property
    * of the parent security.AccessRuleContainerBase element passed as argument.
    */
  /* static member */
  inline def createInAccessRuleContainerBaseUnderAccessRules(container: AccessRuleContainerBase): AccessRule = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAccessRuleContainerBaseUnderAccessRules")(container.asInstanceOf[js.Any]).asInstanceOf[AccessRule]
  
  /**
    * Creates and returns a new AccessRule instance in the SDK and on the server.
    * The new AccessRule will be automatically stored in the 'accessRules' property
    * of the parent Entity element passed as argument.
    */
  /* static member */
  inline def createInEntityUnderAccessRules(container: Entity): AccessRule = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityUnderAccessRules")(container.asInstanceOf[js.Any]).asInstanceOf[AccessRule]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AccessRule.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AccessRule.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
