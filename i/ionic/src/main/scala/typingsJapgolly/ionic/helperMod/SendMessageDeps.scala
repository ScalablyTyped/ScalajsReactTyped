package typingsJapgolly.ionic.helperMod

import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.IonicContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessageDeps extends js.Object {
  var config: IConfig
  var ctx: IonicContext
}

object SendMessageDeps {
  @scala.inline
  def apply(config: IConfig, ctx: IonicContext): SendMessageDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendMessageDeps]
  }
}

