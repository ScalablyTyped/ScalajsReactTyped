package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.GridDatabaseSource")
@js.native
class GridDatabaseSource protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages.GridDatabaseSource {
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
@JSImport("mendixmodelsdk", "pages.GridDatabaseSource")
@js.native
object GridDatabaseSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridDatabaseSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridDatabaseSource = js.native
  /**
    * Creates and returns a new GridDatabaseSource instance in the SDK and on the server.
    * The new GridDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.2.0
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.EntityWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridDatabaseSource = js.native
  /**
    * Creates and returns a new GridDatabaseSource instance in the SDK and on the server.
    * The new GridDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  def createInEntityWidgetUnderDataSource(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.EntityWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridDatabaseSource = js.native
  /**
    * Creates and returns a new GridDatabaseSource instance in the SDK and on the server.
    * The new GridDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: WidgetValue): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridDatabaseSource = js.native
}

