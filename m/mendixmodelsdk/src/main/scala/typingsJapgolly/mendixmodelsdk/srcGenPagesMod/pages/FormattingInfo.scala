package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridColumn
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DynamicLabel
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.FormattingInfo")
@js.native
open class FormattingInfo protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsClientTemplateParameter: ClientTemplateParameter = js.native
  
  def containerAsDataGridColumn: DataGridColumn = js.native
  
  def containerAsDatePicker: DatePicker = js.native
  
  def containerAsDynamicLabel: DynamicLabel = js.native
  
  def containerAsGridColumn: GridColumn = js.native
  
  def containerAsReferenceSelector: ReferenceSelector = js.native
  
  def containerAsTextBox: TextBox = js.native
  
  def customDateFormat: String = js.native
  def customDateFormat_=(newValue: String): Unit = js.native
  
  def dateFormat: DateFormat = js.native
  def dateFormat_=(newValue: DateFormat): Unit = js.native
  
  def decimalPrecision: Double = js.native
  def decimalPrecision_=(newValue: Double): Unit = js.native
  
  def enumFormat: EnumFormat = js.native
  def enumFormat_=(newValue: EnumFormat): Unit = js.native
  
  def groupDigits: Boolean = js.native
  def groupDigits_=(newValue: Boolean): Unit = js.native
}
object FormattingInfo {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FormattingInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInClientTemplateParameterUnderFormattingInfo(container: ClientTemplateParameter): FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateParameterUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    */
  /* static member */
  inline def createInDataGridColumnUnderFormattingInfo(container: DataGridColumn): FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent DatePicker element passed as argument.
    */
  /* static member */
  inline def createInDatePickerUnderFormattingInfo(container: DatePicker): FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDatePickerUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DynamicLabel element passed as argument.
    */
  /* static member */
  inline def createInDynamicLabelUnderFormattingInfo(container: DynamicLabel): FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicLabelUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent GridColumn element passed as argument.
    */
  /* static member */
  inline def createInGridColumnUnderFormattingInfo(container: GridColumn): FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ReferenceSelector element passed as argument.
    */
  /* static member */
  inline def createInReferenceSelectorUnderFormattingInfo(container: ReferenceSelector): FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSelectorUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent TextBox element passed as argument.
    */
  /* static member */
  inline def createInTextBoxUnderFormattingInfo(container: TextBox): FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextBoxUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[FormattingInfo]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FormattingInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FormattingInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
