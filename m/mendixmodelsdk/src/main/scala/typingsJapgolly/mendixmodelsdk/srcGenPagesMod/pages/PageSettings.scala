package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ShowPageAction
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.TextTemplate
import typingsJapgolly.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text
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
  * See: {@link https://docs.mendix.com/refguide/on-click-event relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.PageSettings")
@js.native
open class PageSettings protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAssociationWidget: AssociationWidget = js.native
  
  def containerAsCreateObjectClientAction: CreateObjectClientAction = js.native
  
  def containerAsDataGridAddButton: DataGridAddButton = js.native
  
  def containerAsGridEditButton: GridEditButton = js.native
  
  def containerAsGridNewButton: GridNewButton = js.native
  
  def containerAsNavigationProfile: NavigationProfile = js.native
  
  def containerAsNewButton: NewButton = js.native
  
  def containerAsPageClientAction: PageClientAction = js.native
  
  def containerAsPageForSpecialization: PageForSpecialization = js.native
  
  def containerAsReferenceSelector: ReferenceSelector = js.native
  
  def containerAsShowPageAction: ShowPageAction = js.native
  
  /**
    * In version 8.12.0: deleted
    */
  def formTitle: Text | Null = js.native
  def formTitle_=(newValue: Text | Null): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def location: FormLocation = js.native
  def location_=(newValue: FormLocation): Unit = js.native
  
  def page: IPage | Null = js.native
  
  def pageQualifiedName: String | Null = js.native
  
  def page_=(newValue: IPage | Null): Unit = js.native
  
  /**
    * In version 9.7.0: introduced
    */
  def parameterMappings: IList[PageParameterMapping] = js.native
  
  /**
    * In version 8.12.0: introduced
    */
  def titleOverride: TextTemplate | Null = js.native
  def titleOverride_=(newValue: TextTemplate | Null): Unit = js.native
}
object PageSettings {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): PageSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PageSettings]
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'selectPageSettings' property
    * of the parent AssociationWidget element passed as argument.
    */
  /* static member */
  inline def createInAssociationWidgetUnderSelectPageSettings(container: AssociationWidget): PageSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderSelectPageSettings")(container.asInstanceOf[js.Any]).asInstanceOf[PageSettings]
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInCreateObjectClientActionUnderPageSettings(container: CreateObjectClientAction): PageSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateObjectClientActionUnderPageSettings")(container.asInstanceOf[js.Any]).asInstanceOf[PageSettings]
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent DataGridAddButton element passed as argument.
    */
  /* static member */
  inline def createInDataGridAddButtonUnderPageSettings(container: DataGridAddButton): PageSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridAddButtonUnderPageSettings")(container.asInstanceOf[js.Any]).asInstanceOf[PageSettings]
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridEditButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  /* static member */
  inline def createInGridEditButtonUnderPageSettings(container: GridEditButton): PageSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridEditButtonUnderPageSettings")(container.asInstanceOf[js.Any]).asInstanceOf[PageSettings]
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridNewButton element passed as argument.
    */
  /* static member */
  inline def createInGridNewButtonUnderPageSettings(container: GridNewButton): PageSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridNewButtonUnderPageSettings")(container.asInstanceOf[js.Any]).asInstanceOf[PageSettings]
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'loginPageSettings' property
    * of the parent navigation.NavigationProfile element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  /* static member */
  inline def createInNavigationProfileUnderLoginPageSettings(container: NavigationProfile): PageSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationProfileUnderLoginPageSettings")(container.asInstanceOf[js.Any]).asInstanceOf[PageSettings]
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  /* static member */
  inline def createInNewButtonUnderPageSettings(container: NewButton): PageSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNewButtonUnderPageSettings")(container.asInstanceOf[js.Any]).asInstanceOf[PageSettings]
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageClientAction element passed as argument.
    */
  /* static member */
  inline def createInPageClientActionUnderPageSettings(container: PageClientAction): PageSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageClientActionUnderPageSettings")(container.asInstanceOf[js.Any]).asInstanceOf[PageSettings]
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageForSpecialization element passed as argument.
    */
  /* static member */
  inline def createInPageForSpecializationUnderPageSettings(container: PageForSpecialization): PageSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageForSpecializationUnderPageSettings")(container.asInstanceOf[js.Any]).asInstanceOf[PageSettings]
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'gotoPageSettings' property
    * of the parent ReferenceSelector element passed as argument.
    */
  /* static member */
  inline def createInReferenceSelectorUnderGotoPageSettings(container: ReferenceSelector): PageSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSelectorUnderGotoPageSettings")(container.asInstanceOf[js.Any]).asInstanceOf[PageSettings]
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent microflows.ShowPageAction element passed as argument.
    */
  /* static member */
  inline def createInShowPageActionUnderPageSettings(container: ShowPageAction): PageSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInShowPageActionUnderPageSettings")(container.asInstanceOf[js.Any]).asInstanceOf[PageSettings]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
