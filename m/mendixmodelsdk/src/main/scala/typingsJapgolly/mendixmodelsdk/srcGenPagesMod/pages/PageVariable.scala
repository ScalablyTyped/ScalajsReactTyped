package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
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

/**
  * In version 8.4.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.PageVariable")
@js.native
open class PageVariable protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAttributeWidget: AttributeWidget = js.native
  
  def containerAsMicroflowParameterMapping: MicroflowParameterMapping = js.native
  
  def containerAsNanoflowParameterMapping: NanoflowParameterMapping = js.native
  
  def containerAsPageParameterMapping: PageParameterMapping = js.native
  
  def containerAsWidgetValue: WidgetValue = js.native
  
  /**
    * In version 9.5.0: introduced
    */
  def pageParameter: PageParameter | Null = js.native
  
  def pageParameterLocalName: String | Null = js.native
  
  def pageParameter_=(newValue: PageParameter | Null): Unit = js.native
  
  def useAllPages: Boolean = js.native
  def useAllPages_=(newValue: Boolean): Unit = js.native
  
  def widget: Widget | Null = js.native
  
  def widgetLocalName: String | Null = js.native
  
  def widget_=(newValue: Widget | Null): Unit = js.native
}
object PageVariable {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageVariable")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderSourceVariable(container: AttributeWidget): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent MicroflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  /* static member */
  inline def createInMicroflowParameterMappingUnderVariable(container: MicroflowParameterMapping): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent NanoflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  /* static member */
  inline def createInNanoflowParameterMappingUnderVariable(container: NanoflowParameterMapping): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNanoflowParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent PageParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.7.0 and higher
    */
  /* static member */
  inline def createInPageParameterMappingUnderVariable(container: PageParameterMapping): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterMappingUnderVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderSourceVariable(container: WidgetValue): PageVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderSourceVariable")(container.asInstanceOf[js.Any]).asInstanceOf[PageVariable]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageVariable.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageVariable.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
