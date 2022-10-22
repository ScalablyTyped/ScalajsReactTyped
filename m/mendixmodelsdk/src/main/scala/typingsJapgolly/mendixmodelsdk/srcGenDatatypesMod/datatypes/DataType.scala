package typingsJapgolly.mendixmodelsdk.srcGenDatatypesMod.datatypes

import typingsJapgolly.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceAction
import typingsJapgolly.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceActionParameter
import typingsJapgolly.mendixmodelsdk.srcGenAppservicesMod.appservices.IAppServiceAction
import typingsJapgolly.mendixmodelsdk.srcGenAppservicesMod.appservices.IAppServiceActionParameter
import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenConstantsMod.constants.Constant
import typingsJapgolly.mendixmodelsdk.srcGenConstantsMod.constants.IConstant
import typingsJapgolly.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetColumn
import typingsJapgolly.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter
import typingsJapgolly.mendixmodelsdk.srcGenDatasetsMod.datasets.IDataSetParameter
import typingsJapgolly.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.IDocumentTemplateParameter
import typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.IImportMapping
import typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportMapping
import typingsJapgolly.mendixmodelsdk.srcGenMappingsMod.mappings.ValueMappingElement
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.CreateVariableAction
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflowBase
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflowParameterBase
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MLModelCallParameterMapping
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowBase
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowParameterBase
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowParameterObject
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ResultHandling
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.IPageParameter
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageParameter
import typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.RestOperationParameter
import typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedOperation
import typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedParameter
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenDatatypesMod.datatypes.IDataType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, containerAsPageParameter */ @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.DataType")
@js.native
open class DataType protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAppServiceAction: AppServiceAction = js.native
  
  def containerAsAppServiceActionParameter: AppServiceActionParameter = js.native
  @JSName("containerAsAppServiceActionParameter")
  val containerAsAppServiceActionParameter_FDataType: IAppServiceActionParameter = js.native
  
  @JSName("containerAsAppServiceAction")
  val containerAsAppServiceAction_FDataType: IAppServiceAction = js.native
  
  def containerAsConstant: Constant = js.native
  @JSName("containerAsConstant")
  val containerAsConstant_FDataType: IConstant = js.native
  
  def containerAsCreateVariableAction: CreateVariableAction = js.native
  
  def containerAsDataSetColumn: DataSetColumn = js.native
  
  def containerAsDataSetParameter: DataSetParameter = js.native
  @JSName("containerAsDataSetParameter")
  val containerAsDataSetParameter_FDataType: IDataSetParameter = js.native
  
  def containerAsDocumentTemplateParameter: DocumentTemplateParameter = js.native
  @JSName("containerAsDocumentTemplateParameter")
  val containerAsDocumentTemplateParameter_FDataType: IDocumentTemplateParameter = js.native
  
  def containerAsImportMapping: ImportMapping = js.native
  @JSName("containerAsImportMapping")
  val containerAsImportMapping_FDataType: IImportMapping = js.native
  
  def containerAsMLModelCallParameterMapping: MLModelCallParameterMapping = js.native
  
  def containerAsMicroflowBase: MicroflowBase = js.native
  @JSName("containerAsMicroflowBase")
  val containerAsMicroflowBase_FDataType: IMicroflowBase = js.native
  
  def containerAsMicroflowParameterBase: MicroflowParameterBase = js.native
  @JSName("containerAsMicroflowParameterBase")
  val containerAsMicroflowParameterBase_FDataType: IMicroflowParameterBase = js.native
  
  def containerAsMicroflowParameterObject: MicroflowParameterObject = js.native
  
  def containerAsPageParameter: PageParameter = js.native
  @JSName("containerAsPageParameter")
  val containerAsPageParameter_FDataType: IPageParameter = js.native
  
  def containerAsPublishedOperation: PublishedOperation = js.native
  
  def containerAsPublishedParameter: PublishedParameter = js.native
  
  def containerAsRestOperationParameter: RestOperationParameter = js.native
  
  def containerAsResultHandling: ResultHandling = js.native
  
  def containerAsValueMappingElement: ValueMappingElement = js.native
}
object DataType {
  
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.DataType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.DataType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.DataType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
