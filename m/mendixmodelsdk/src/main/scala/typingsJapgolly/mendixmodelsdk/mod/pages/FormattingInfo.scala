package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.FormattingInfo")
@js.native
class FormattingInfo protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages.FormattingInfo {
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
@JSImport("mendixmodelsdk", "pages.FormattingInfo")
@js.native
object FormattingInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInClientTemplateParameterUnderFormattingInfo(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplateParameter): typingsJapgolly.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    */
  def createInDataGridColumnUnderFormattingInfo(container: DataGridColumn): typingsJapgolly.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent DatePicker element passed as argument.
    */
  def createInDatePickerUnderFormattingInfo(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DatePicker): typingsJapgolly.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DynamicLabel element passed as argument.
    */
  def createInDynamicLabelUnderFormattingInfo(container: DynamicLabel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent GridColumn element passed as argument.
    */
  def createInGridColumnUnderFormattingInfo(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridColumn): typingsJapgolly.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ReferenceSelector element passed as argument.
    */
  def createInReferenceSelectorUnderFormattingInfo(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ReferenceSelector): typingsJapgolly.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent TextBox element passed as argument.
    */
  def createInTextBoxUnderFormattingInfo(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.TextBox): typingsJapgolly.mendixmodelsdk.pagesMod.pages.FormattingInfo = js.native
}

