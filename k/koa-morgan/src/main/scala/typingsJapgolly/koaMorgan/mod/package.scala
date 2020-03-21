package typingsJapgolly.koaMorgan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatFn = js.Function3[
    /* tokens */ typingsJapgolly.koaMorgan.mod.TokenIndexer, 
    /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
    java.lang.String
  ]
  type StreamOptions = typingsJapgolly.morgan.mod.StreamOptions
  type TokenCallbackFn = js.Function3[
    /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
    /* arg */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean], 
    java.lang.String
  ]
  type TokenIndexer = typingsJapgolly.morgan.mod.TokenIndexer
}
