package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridColumn
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DynamicLabel
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.FormattingInfo")
@js.native
open class FormattingInfo protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object FormattingInfo {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.FormattingInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  inline def createInClientTemplateParameterUnderFormattingInfo(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplateParameter): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateParameterUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    */
  /* static member */
  inline def createInDataGridColumnUnderFormattingInfo(container: DataGridColumn): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent DatePicker element passed as argument.
    */
  /* static member */
  inline def createInDatePickerUnderFormattingInfo(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DatePicker): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDatePickerUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DynamicLabel element passed as argument.
    */
  /* static member */
  inline def createInDynamicLabelUnderFormattingInfo(container: DynamicLabel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicLabelUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent GridColumn element passed as argument.
    */
  /* static member */
  inline def createInGridColumnUnderFormattingInfo(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridColumn): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ReferenceSelector element passed as argument.
    */
  /* static member */
  inline def createInReferenceSelectorUnderFormattingInfo(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSelector): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSelectorUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent TextBox element passed as argument.
    */
  /* static member */
  inline def createInTextBoxUnderFormattingInfo(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TextBox): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextBoxUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.FormattingInfo]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.FormattingInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.FormattingInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
