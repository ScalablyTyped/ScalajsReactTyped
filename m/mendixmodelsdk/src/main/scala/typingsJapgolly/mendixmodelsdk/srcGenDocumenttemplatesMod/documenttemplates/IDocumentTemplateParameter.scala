package typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDatatypesMod.datatypes.IDataType
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentTemplateParameter
  extends StObject
     with IElement
     with IByNameReferrable {
  
  val containerAsDocumentTemplate: IDocumentTemplate = js.native
  
  @JSName("model")
  val model_IDocumentTemplateParameter: IModel = js.native
  
  val name: String = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.9.0: introduced
    */
  val parameterType: IDataType = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  val `type`: String | Null = js.native
}
