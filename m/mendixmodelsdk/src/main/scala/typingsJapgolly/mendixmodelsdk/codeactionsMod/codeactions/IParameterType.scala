package typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `CodeActions`.
  */
/**
  * In version 7.21.0: introduced
  */
@js.native
trait IParameterType extends IElement {
  val containerAsCodeActionParameter: ICodeActionParameter = js.native
  @JSName("model")
  val model_IParameterType: IModel = js.native
}

