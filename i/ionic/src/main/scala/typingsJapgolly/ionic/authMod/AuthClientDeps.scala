package typingsJapgolly.ionic.authMod

import typingsJapgolly.ionic.definitionsMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthClientDeps extends js.Object {
  val client: IClient
}

object AuthClientDeps {
  @scala.inline
  def apply(client: IClient): AuthClientDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthClientDeps]
  }
}

