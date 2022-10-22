package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.Appearance")
@js.native
open class Appearance protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object Appearance {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.Appearance")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ControlBarButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInControlBarButtonUnderAppearance(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ControlBarButton): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInGridColumnUnderAppearance(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridColumn): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInLayoutGridColumnUnderAppearance(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridColumn): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInLayoutGridRowUnderAppearance(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridRow): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridRowUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInLayoutUnderAppearance(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Layout): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInNavigationListItemUnderAppearance(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.NavigationListItem): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInPageTemplateUnderAppearance(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageTemplate): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageTemplateUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Page element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInPageUnderAppearance(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Page): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInScrollContainerRegionUnderAppearance(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInTableCellUnderAppearance(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TableCell): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInTableRowUnderAppearance(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TableRow): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableRowUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Widget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInWidgetUnderAppearance(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Widget): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.Appearance.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.Appearance.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
