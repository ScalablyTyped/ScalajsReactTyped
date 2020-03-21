package typingsJapgolly.asyncBusboy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncBusboy = js.Function2[
    /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* options */ js.UndefOr[typingsJapgolly.asyncBusboy.mod.Options], 
    js.Promise[typingsJapgolly.asyncBusboy.AnonFields]
  ]
}
