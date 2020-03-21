package typingsJapgolly.mendixmodelsdk.pagesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayoutParameter
  extends IElement
     with IByNameReferrable {
  val containerAsLayout: ILayout = js.native
  @JSName("model")
  val model_ILayoutParameter: IModel = js.native
  val name: String = js.native
}

