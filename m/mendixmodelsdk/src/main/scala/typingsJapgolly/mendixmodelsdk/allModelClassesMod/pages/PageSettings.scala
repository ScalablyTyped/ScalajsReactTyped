package typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.ShowPageAction
import typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/opening-pages relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PageSettings")
@js.native
class PageSettings protected ()
  extends typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PageSettings")
@js.native
object PageSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'selectPageSettings' property
    * of the parent AssociationWidget element passed as argument.
    */
  def createInAssociationWidgetUnderSelectPageSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.AssociationWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInCreateObjectClientActionUnderPageSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.CreateObjectClientAction): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent DataGridAddButton element passed as argument.
    */
  def createInDataGridAddButtonUnderPageSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataGridAddButton): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridEditButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  def createInGridEditButtonUnderPageSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridEditButton): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridNewButton element passed as argument.
    */
  def createInGridNewButtonUnderPageSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridNewButton): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'loginPageSettings' property
    * of the parent navigation.NavigationProfile element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInNavigationProfileUnderLoginPageSettings(container: NavigationProfile): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  def createInNewButtonUnderPageSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.NewButton): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageClientAction element passed as argument.
    */
  def createInPageClientActionUnderPageSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageForSpecialization element passed as argument.
    */
  def createInPageForSpecializationUnderPageSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageForSpecialization): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'gotoPageSettings' property
    * of the parent ReferenceSelector element passed as argument.
    */
  def createInReferenceSelectorUnderGotoPageSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ReferenceSelector): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent microflows.ShowPageAction element passed as argument.
    */
  def createInShowPageActionUnderPageSettings(container: ShowPageAction): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
}

