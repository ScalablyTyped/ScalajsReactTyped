package typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.MemberAccess")
@js.native
open class MemberAccess protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def accessRights: MemberAccessRights = js.native
  def accessRights_=(newValue: MemberAccessRights): Unit = js.native
  
  def association: IAssociationBase | Null = js.native
  
  def associationQualifiedName: String | Null = js.native
  
  def association_=(newValue: IAssociationBase | Null): Unit = js.native
  
  def attribute: IAttribute | Null = js.native
  
  def attributeQualifiedName: String | Null = js.native
  
  def attribute_=(newValue: IAttribute | Null): Unit = js.native
  
  def containerAsAccessRule: AccessRule = js.native
}
object MemberAccess {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.MemberAccess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MemberAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): MemberAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MemberAccess]
  
  /**
    * Creates and returns a new MemberAccess instance in the SDK and on the server.
    * The new MemberAccess will be automatically stored in the 'memberAccesses' property
    * of the parent AccessRule element passed as argument.
    */
  /* static member */
  inline def createIn(container: AccessRule): MemberAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MemberAccess]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.MemberAccess.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.MemberAccess.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
