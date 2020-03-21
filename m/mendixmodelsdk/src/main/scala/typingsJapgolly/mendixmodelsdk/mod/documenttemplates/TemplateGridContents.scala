package typingsJapgolly.mendixmodelsdk.mod.documenttemplates

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents")
@js.native
class TemplateGridContents protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.documenttemplates.TemplateGridContents {
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
@JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents")
@js.native
object TemplateGridContents extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents = js.native
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * The new TemplateGridContents will be automatically stored in the 'evenRowsContents' property
    * of the parent TemplateGrid element passed as argument.
    */
  def createInTemplateGridUnderEvenRowsContents(container: typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGrid): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents = js.native
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * The new TemplateGridContents will be automatically stored in the 'oddRowsContents' property
    * of the parent TemplateGrid element passed as argument.
    */
  def createInTemplateGridUnderOddRowsContents(container: typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGrid): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.TemplateGridContents = js.native
}

