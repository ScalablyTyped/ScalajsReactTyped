package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItem
import typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.ImageIcon")
@js.native
class ImageIcon protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages.ImageIcon {
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
@JSImport("mendixmodelsdk", "pages.ImageIcon")
@js.native
object ImageIcon extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ImageIcon = js.native
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInBottomBarItemUnderIcon(container: BottomBarItem): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ImageIcon = js.native
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent Button element passed as argument.
    */
  def createInButtonUnderIcon(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Button): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ImageIcon = js.native
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent ControlBarButton element passed as argument.
    */
  def createInControlBarButtonUnderIcon(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ControlBarButton): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ImageIcon = js.native
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent menus.MenuItem element passed as argument.
    */
  def createInMenuItemUnderIcon(container: MenuItem): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ImageIcon = js.native
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWidgetValueUnderIcon(container: WidgetValue): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ImageIcon = js.native
}

