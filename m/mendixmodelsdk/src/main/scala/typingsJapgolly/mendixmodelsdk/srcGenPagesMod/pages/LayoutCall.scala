package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
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
  * In version 7.17.0: added public
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ILayoutCall because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsLayout, containerAsPage, containerAsPageTemplate, containerAsWebLayoutContent, layout, layoutQualifiedName */ @JSImport("mendixmodelsdk/src/gen/pages", "pages.LayoutCall")
@js.native
open class LayoutCall protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def arguments: IList[LayoutCallArgument] = js.native
  
  def containerAsLayout: Layout = js.native
  @JSName("containerAsLayout")
  val containerAsLayout_FLayoutCall: ILayout = js.native
  
  def containerAsPage: Page = js.native
  
  def containerAsPageTemplate: PageTemplate = js.native
  @JSName("containerAsPageTemplate")
  val containerAsPageTemplate_FLayoutCall: IPageTemplate = js.native
  
  @JSName("containerAsPage")
  val containerAsPage_FLayoutCall: IPage = js.native
  
  def containerAsWebLayoutContent: WebLayoutContent = js.native
  @JSName("containerAsWebLayoutContent")
  val containerAsWebLayoutContent_FLayoutCall: IWebLayoutContent = js.native
  
  /**
    * In version 8.0.0: removed optional
    * In version 7.17.0: added public
    */
  def layout: ILayout | Null = js.native
  
  def layoutQualifiedName: String | Null = js.native
  @JSName("layoutQualifiedName")
  val layoutQualifiedName_FLayoutCall: String | Null = js.native
  
  def layout_=(newValue: ILayout | Null): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.0.0: removed optional
    * In version 7.17.0: added public
    */
  @JSName("layout")
  val layout_FLayoutCall: ILayout | Null = js.native
}
object LayoutCall {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.LayoutCall")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): LayoutCall = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[LayoutCall]
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.23.0
    */
  /* static member */
  inline def createInLayoutUnderLayoutCall(container: Layout): LayoutCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderLayoutCall")(container.asInstanceOf[js.Any]).asInstanceOf[LayoutCall]
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 and higher
    */
  /* static member */
  inline def createInPageTemplateUnderLayoutCall(container: PageTemplate): LayoutCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageTemplateUnderLayoutCall")(container.asInstanceOf[js.Any]).asInstanceOf[LayoutCall]
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Page element passed as argument.
    */
  /* static member */
  inline def createInPageUnderLayoutCall(container: Page): LayoutCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageUnderLayoutCall")(container.asInstanceOf[js.Any]).asInstanceOf[LayoutCall]
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInWebLayoutContentUnderLayoutCall(container: WebLayoutContent): LayoutCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderLayoutCall")(container.asInstanceOf[js.Any]).asInstanceOf[LayoutCall]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.LayoutCall.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.LayoutCall.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
