package typingsJapgolly.mendixmodelsdk.allModelClassesMod.customwidgets

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.EntityWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.5.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource")
@js.native
class CustomWidgetDatabaseSource protected ()
  extends typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetDatabaseSource {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource")
@js.native
object CustomWidgetDatabaseSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetDatabaseSource = js.native
  /**
    * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
    * The new CustomWidgetDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent pages.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInEntityWidgetUnderDataSource(container: EntityWidget): typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetDatabaseSource = js.native
  /**
    * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
    * The new CustomWidgetDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue): typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetDatabaseSource = js.native
}

