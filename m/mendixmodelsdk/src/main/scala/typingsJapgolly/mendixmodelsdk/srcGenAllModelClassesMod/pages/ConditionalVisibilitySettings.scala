package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ConditionalVisibilitySettings")
@js.native
open class ConditionalVisibilitySettings protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ConditionalVisibilitySettings {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ConditionalVisibilitySettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ConditionallyVisibleWidget element passed as argument.
    */
  /* static member */
  inline def createInConditionallyVisibleWidgetUnderConditionalVisibilitySettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionallyVisibleWidget): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionallyVisibleWidgetUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  inline def createInControlBarButtonUnderConditionalVisibilitySettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ControlBarButton): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  /* static member */
  inline def createInCustomWidgetUnderConditionalVisibilitySettings(container: CustomWidget): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent LayoutGridRow element passed as argument.
    */
  /* static member */
  inline def createInLayoutGridRowUnderConditionalVisibilitySettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridRow): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridRowUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent NavigationListItem element passed as argument.
    */
  /* static member */
  inline def createInNavigationListItemUnderConditionalVisibilitySettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.NavigationListItem): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TabPage element passed as argument.
    */
  /* static member */
  inline def createInTabPageUnderConditionalVisibilitySettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TabPage): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TableRow element passed as argument.
    */
  /* static member */
  inline def createInTableRowUnderConditionalVisibilitySettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TableRow): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableRowUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ConditionalVisibilitySettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.ConditionalVisibilitySettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
