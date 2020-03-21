package typingsJapgolly.koaWebsocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App[StateT, CustomT]
  extends typingsJapgolly.koa.mod.^[StateT, CustomT] {
  var ws: Server[StateT, CustomT] = js.native
}

