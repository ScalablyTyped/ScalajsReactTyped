package typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@js.native
trait IType extends IElement {
  val containerAsBasicParameterType: IBasicParameterType = js.native
  val containerAsCodeAction: ICodeAction = js.native
  val containerAsListType: IListType = js.native
  @JSName("model")
  val model_IType: IModel = js.native
}

