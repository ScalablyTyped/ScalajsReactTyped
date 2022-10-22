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
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.Appearance")
@js.native
open class Appearance protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  
  def containerAsControlBarButton: ControlBarButton = js.native
  
  def containerAsGridColumn: GridColumn = js.native
  
  def containerAsLayout: Layout = js.native
  
  def containerAsLayoutGridColumn: LayoutGridColumn = js.native
  
  def containerAsLayoutGridRow: LayoutGridRow = js.native
  
  def containerAsNavigationListItem: NavigationListItem = js.native
  
  def containerAsPage: Page = js.native
  
  def containerAsPageTemplate: PageTemplate = js.native
  
  def containerAsScrollContainerRegion: ScrollContainerRegion = js.native
  
  def containerAsTableCell: TableCell = js.native
  
  def containerAsTableRow: TableRow = js.native
  
  def containerAsWidget: Widget = js.native
  
  def designProperties: IList[DesignPropertyValue] = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.13.0: introduced
    */
  def dynamicClasses: String = js.native
  def dynamicClasses_=(newValue: String): Unit = js.native
  
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
}
object Appearance {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.Appearance")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ControlBarButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInControlBarButtonUnderAppearance(container: ControlBarButton): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInGridColumnUnderAppearance(container: GridColumn): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInLayoutGridColumnUnderAppearance(container: LayoutGridColumn): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInLayoutGridRowUnderAppearance(container: LayoutGridRow): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridRowUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInLayoutUnderAppearance(container: Layout): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInNavigationListItemUnderAppearance(container: NavigationListItem): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInPageTemplateUnderAppearance(container: PageTemplate): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageTemplateUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Page element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInPageUnderAppearance(container: Page): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInScrollContainerRegionUnderAppearance(container: ScrollContainerRegion): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInTableCellUnderAppearance(container: TableCell): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInTableRowUnderAppearance(container: TableRow): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableRowUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Widget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInWidgetUnderAppearance(container: Widget): Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[Appearance]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.Appearance.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.Appearance.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
