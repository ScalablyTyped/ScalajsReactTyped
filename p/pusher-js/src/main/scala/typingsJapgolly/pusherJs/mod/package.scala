package typingsJapgolly.pusherJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Authorizer = js.Function2[
    /* channel */ typingsJapgolly.pusherJs.mod.Channel, 
    /* options */ typingsJapgolly.pusherJs.mod.Config, 
    typingsJapgolly.pusherJs.AnonAuthorize
  ]
  type EventCallback = js.Function2[/* context */ js.Any, /* data */ js.Any, scala.Unit]
}
