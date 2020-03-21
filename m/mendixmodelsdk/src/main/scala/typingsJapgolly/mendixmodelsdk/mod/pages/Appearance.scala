package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.Appearance")
@js.native
class Appearance protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages.Appearance {
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
@JSImport("mendixmodelsdk", "pages.Appearance")
@js.native
object Appearance extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ControlBarButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInControlBarButtonUnderAppearance(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ControlBarButton): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInGridColumnUnderAppearance(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridColumn): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInLayoutGridColumnUnderAppearance(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInLayoutGridRowUnderAppearance(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutGridRow): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInLayoutUnderAppearance(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Layout): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNavigationListItemUnderAppearance(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.NavigationListItem): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInPageTemplateUnderAppearance(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageTemplate): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Page element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInPageUnderAppearance(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Page): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInScrollContainerRegionUnderAppearance(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInTableCellUnderAppearance(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.TableCell): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInTableRowUnderAppearance(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.TableRow): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Widget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWidgetUnderAppearance(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Widget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.Appearance = js.native
}

