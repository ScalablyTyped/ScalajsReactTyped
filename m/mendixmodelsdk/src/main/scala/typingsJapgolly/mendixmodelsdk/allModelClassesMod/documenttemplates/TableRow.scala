package typingsJapgolly.mendixmodelsdk.allModelClassesMod.documenttemplates

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/row-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.TableRow")
@js.native
class TableRow protected ()
  extends typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.TableRow {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.TableRow")
@js.native
object TableRow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TableRow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.TableRow = js.native
  /**
    * Creates and returns a new TableRow instance in the SDK and on the server.
    * The new TableRow will be automatically stored in the 'rows' property
    * of the parent Table element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Table): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.TableRow = js.native
}

