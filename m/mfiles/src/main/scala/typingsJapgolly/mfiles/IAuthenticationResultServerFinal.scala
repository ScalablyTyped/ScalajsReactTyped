package typingsJapgolly.mfiles

import typingsJapgolly.mfiles.MFiles.MFServerConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthenticationResultServerFinal extends js.Object {
  val ServerConnection: MFServerConnection
}

object IAuthenticationResultServerFinal {
  @scala.inline
  def apply(ServerConnection: MFServerConnection): IAuthenticationResultServerFinal = {
    val __obj = js.Dynamic.literal(ServerConnection = ServerConnection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAuthenticationResultServerFinal]
  }
}

