package typingsJapgolly.hapiNes.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Client {
  type Handler = js.Function2[
    /* message */ js.Any, 
    /* flags */ typingsJapgolly.hapiNes.clientMod.Client.ClientSubscribeFlags, 
    scala.Unit
  ]
}
