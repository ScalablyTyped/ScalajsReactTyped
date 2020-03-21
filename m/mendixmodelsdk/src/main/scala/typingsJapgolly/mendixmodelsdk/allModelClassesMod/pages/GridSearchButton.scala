package typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/search-button relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSearchButton")
@js.native
class GridSearchButton protected ()
  extends typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSearchButton {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSearchButton")
@js.native
object GridSearchButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSearchButton = js.native
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * The new GridSearchButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ControlBar): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSearchButton = js.native
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * The new GridSearchButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createInControlBarUnderItems(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ControlBar): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSearchButton = js.native
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * The new GridSearchButton will be automatically stored in the 'searchButton' property
    * of the parent GridControlBar element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInGridControlBarUnderSearchButton(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridControlBar): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSearchButton = js.native
}

