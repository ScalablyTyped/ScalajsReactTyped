package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.StaticOrDynamicString")
@js.native
open class StaticOrDynamicString protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attribute: String = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def attributeRef: AttributeRef | Null = js.native
  def attributeRef_=(newValue: AttributeRef | Null): Unit = js.native
  
  def attribute_=(newValue: String): Unit = js.native
  
  def containerAsLinkButton: LinkButton = js.native
  
  def containerAsOpenLinkClientAction: OpenLinkClientAction = js.native
  
  def isDynamic: Boolean = js.native
  def isDynamic_=(newValue: Boolean): Unit = js.native
  
  def value: String = js.native
  def value_=(newValue: String): Unit = js.native
}
object StaticOrDynamicString {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.StaticOrDynamicString")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): StaticOrDynamicString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[StaticOrDynamicString]
  
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * The new StaticOrDynamicString will be automatically stored in the 'address' property
    * of the parent LinkButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  inline def createInLinkButtonUnderAddress(container: LinkButton): StaticOrDynamicString = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLinkButtonUnderAddress")(container.asInstanceOf[js.Any]).asInstanceOf[StaticOrDynamicString]
  
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * The new StaticOrDynamicString will be automatically stored in the 'address' property
    * of the parent OpenLinkClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.3.0 and higher
    */
  /* static member */
  inline def createInOpenLinkClientActionUnderAddress(container: OpenLinkClientAction): StaticOrDynamicString = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOpenLinkClientActionUnderAddress")(container.asInstanceOf[js.Any]).asInstanceOf[StaticOrDynamicString]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.StaticOrDynamicString.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.StaticOrDynamicString.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
