package typingsJapgolly.twit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function3[
    /* err */ js.Error, 
    /* result */ typingsJapgolly.twit.mod.Response, 
    /* response */ typingsJapgolly.node.httpMod.IncomingMessage, 
    scala.Unit
  ]
  type Response = js.Object
}
