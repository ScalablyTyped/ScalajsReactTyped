package typingsJapgolly.mendixmodelsdk.javaactionsMod.javaactions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@js.native
trait ITypeParameter
  extends IElement
     with IByNameReferrable {
  val containerAsJavaAction: IJavaAction = js.native
  @JSName("model")
  val model_ITypeParameter: IModel = js.native
  val name: String = js.native
}

