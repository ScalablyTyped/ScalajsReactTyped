package typingsJapgolly.mendixmodelsdk.mod.documenttemplates

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/style relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.Style")
@js.native
class Style protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.documenttemplates.Style {
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
@JSImport("mendixmodelsdk", "documenttemplates.Style")
@js.native
object Style extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridCell element passed as argument.
    */
  def createInDataGridCellUnderStyle(container: typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridColumn element passed as argument.
    */
  def createInDataGridColumnUnderStyle(container: typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderStyle(container: typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DynamicLabel element passed as argument.
    */
  def createInDynamicLabelUnderStyle(container: typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Grid element passed as argument.
    */
  def createInGridUnderStyle(container: typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Grid): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent StaticLabel element passed as argument.
    */
  def createInStaticLabelUnderStyle(container: typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.StaticLabel): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent TableCell element passed as argument.
    */
  def createInTableCellUnderStyle(container: typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.TableCell): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Table element passed as argument.
    */
  def createInTableUnderStyle(container: typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Table): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Title element passed as argument.
    */
  def createInTitleUnderStyle(container: typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Title): typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
}

