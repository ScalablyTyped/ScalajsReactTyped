package typingsJapgolly.mendixmodelsdk.srcGenCodeactionsMod.codeactions

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.IJavaAction
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICodeActionParameter
  extends StObject
     with IElement
     with IByNameReferrable {
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: introduced
    */
  val actionParameterType: IParameterType = js.native
  
  val containerAsCodeAction: ICodeAction = js.native
  
  val containerAsJavaAction: IJavaAction = js.native
  
  /**
    * In version 6.10.0: introduced
    */
  val description: String = js.native
  
  /**
    * In version 9.17.0: introduced
    */
  val isRequired: Boolean = js.native
  
  @JSName("model")
  val model_ICodeActionParameter: IModel = js.native
  
  val name: String = js.native
}
