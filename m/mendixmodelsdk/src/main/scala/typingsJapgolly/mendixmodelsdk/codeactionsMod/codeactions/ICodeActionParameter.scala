package typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.elementsMod.IElement
import typingsJapgolly.mendixmodelsdk.javaactionsMod.javaactions.IJavaAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICodeActionParameter
  extends IElement
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
  @JSName("model")
  val model_ICodeActionParameter: IModel = js.native
  val name: String = js.native
}

