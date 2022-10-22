package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.IModuleRole
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.ConditionalVisibilitySettings")
@js.native
open class ConditionalVisibilitySettings protected () extends ConditionalSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def ignoreSecurity: Boolean = js.native
  def ignoreSecurity_=(newValue: Boolean): Unit = js.native
  
  def moduleRoles: IList[IModuleRole] = js.native
  
  def moduleRolesQualifiedNames: js.Array[String] = js.native
}
object ConditionalVisibilitySettings {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ConditionalVisibilitySettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ConditionallyVisibleWidget element passed as argument.
    */
  /* static member */
  inline def createInConditionallyVisibleWidgetUnderConditionalVisibilitySettings(container: ConditionallyVisibleWidget): ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionallyVisibleWidgetUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  inline def createInControlBarButtonUnderConditionalVisibilitySettings(container: ControlBarButton): ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  /* static member */
  inline def createInCustomWidgetUnderConditionalVisibilitySettings(container: CustomWidget): ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent LayoutGridRow element passed as argument.
    */
  /* static member */
  inline def createInLayoutGridRowUnderConditionalVisibilitySettings(container: LayoutGridRow): ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridRowUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent NavigationListItem element passed as argument.
    */
  /* static member */
  inline def createInNavigationListItemUnderConditionalVisibilitySettings(container: NavigationListItem): ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TabPage element passed as argument.
    */
  /* static member */
  inline def createInTabPageUnderConditionalVisibilitySettings(container: TabPage): ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[ConditionalVisibilitySettings]
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TableRow element passed as argument.
    */
  /* static member */
  inline def createInTableRowUnderConditionalVisibilitySettings(container: TableRow): ConditionalVisibilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableRowUnderConditionalVisibilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[ConditionalVisibilitySettings]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ConditionalVisibilitySettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ConditionalVisibilitySettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
