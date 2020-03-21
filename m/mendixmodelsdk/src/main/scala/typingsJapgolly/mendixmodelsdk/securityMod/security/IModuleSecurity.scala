package typingsJapgolly.mendixmodelsdk.securityMod.security

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModule
import typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
  */
@js.native
trait IModuleSecurity extends IModelUnit {
  val containerAsModule: IModule = js.native
  @JSName("model")
  val model_IModuleSecurity: IModel = js.native
  val moduleRoles: IList[IModuleRole] = js.native
}

