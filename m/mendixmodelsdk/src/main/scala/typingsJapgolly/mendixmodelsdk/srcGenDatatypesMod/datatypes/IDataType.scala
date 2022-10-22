package typingsJapgolly.mendixmodelsdk.srcGenDatatypesMod.datatypes

import typingsJapgolly.mendixmodelsdk.srcGenAppservicesMod.appservices.IAppServiceAction
import typingsJapgolly.mendixmodelsdk.srcGenAppservicesMod.appservices.IAppServiceActionParameter
import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenConstantsMod.constants.IConstant
import typingsJapgolly.mendixmodelsdk.srcGenDatasetsMod.datasets.IDataSetParameter
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.IDocumentTemplateParameter
import typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.IImportMapping
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflowBase
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflowParameterBase
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.IPageParameter
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `DataTypes`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
@js.native
trait IDataType
  extends StObject
     with IElement {
  
  val containerAsAppServiceAction: IAppServiceAction = js.native
  
  val containerAsAppServiceActionParameter: IAppServiceActionParameter = js.native
  
  val containerAsConstant: IConstant = js.native
  
  val containerAsDataSetParameter: IDataSetParameter = js.native
  
  val containerAsDocumentTemplateParameter: IDocumentTemplateParameter = js.native
  
  val containerAsImportMapping: IImportMapping = js.native
  
  val containerAsMicroflowBase: IMicroflowBase = js.native
  
  val containerAsMicroflowParameterBase: IMicroflowParameterBase = js.native
  
  val containerAsPageParameter: IPageParameter = js.native
  
  @JSName("model")
  val model_IDataType: IModel = js.native
}
