package typingsJapgolly.mendixmodelsdk.microflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.securityMod.security.IModuleRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/nanoflows relevant section in reference guide}
  *
  * In version 7.12.0: removed experimental
  * In version 7.10.0: introduced
  */
@js.native
trait INanoflow extends IMicroflowBase {
  /**
    * In version 7.23.0: added public
    */
  val allowedModuleRoles: IList[IModuleRole] = js.native
  val allowedModuleRolesQualifiedNames: js.Array[String] = js.native
}

