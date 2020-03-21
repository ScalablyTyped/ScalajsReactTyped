package typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions

import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICodeAction extends IDocument {
  /**
    * In version 7.21.0: introduced
    */
  val actionParameters: IList[ICodeActionParameter] = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: introduced
    */
  val actionReturnType: IType = js.native
  /**
    * In version 7.21.0: introduced
    */
  val actionTypeParameters: IList[ITypeParameter] = js.native
  /**
    * In version 7.21.0: introduced
    */
  val modelerActionInfo: IMicroflowActionInfo | Null = js.native
}

