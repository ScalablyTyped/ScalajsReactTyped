package typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes

import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.IAppServiceAction
import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.IAppServiceActionParameter
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.constantsMod.constants.IConstant
import typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.IDataSetParameter
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.IDocumentTemplateParameter
import typingsJapgolly.mendixmodelsdk.elementsMod.IElement
import typingsJapgolly.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameterBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `DataTypes`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
@js.native
trait IDataType extends IElement {
  val containerAsAppServiceAction: IAppServiceAction = js.native
  val containerAsAppServiceActionParameter: IAppServiceActionParameter = js.native
  val containerAsConstant: IConstant = js.native
  val containerAsDataSetParameter: IDataSetParameter = js.native
  val containerAsDocumentTemplateParameter: IDocumentTemplateParameter = js.native
  val containerAsImportMapping: IImportMapping = js.native
  val containerAsMicroflowBase: IMicroflowBase = js.native
  val containerAsMicroflowParameterBase: IMicroflowParameterBase = js.native
  @JSName("model")
  val model_IDataType: IModel = js.native
}

