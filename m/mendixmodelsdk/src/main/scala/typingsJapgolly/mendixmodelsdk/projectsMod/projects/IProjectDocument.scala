package typingsJapgolly.mendixmodelsdk.projectsMod.projects

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
  */
@js.native
trait IProjectDocument extends IModelUnit {
  val containerAsProject: IProject = js.native
  @JSName("model")
  val model_IProjectDocument: IModel = js.native
}

