package typingsJapgolly.mendixmodelsdk.securityMod.security

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/user-role relevant section in reference guide}
  */
@js.native
trait IUserRole
  extends IElement
     with IByNameReferrable {
  val containerAsProjectSecurity: IProjectSecurity = js.native
  @JSName("model")
  val model_IUserRole: IModel = js.native
  val name: String = js.native
}

