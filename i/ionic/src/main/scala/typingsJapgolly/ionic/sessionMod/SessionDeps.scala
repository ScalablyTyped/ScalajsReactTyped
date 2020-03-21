package typingsJapgolly.ionic.sessionMod

import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDeps extends js.Object {
  val client: IClient
  val config: IConfig
}

object SessionDeps {
  @scala.inline
  def apply(client: IClient, config: IConfig): SessionDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SessionDeps]
  }
}

