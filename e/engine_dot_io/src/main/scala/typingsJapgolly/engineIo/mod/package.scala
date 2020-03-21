package typingsJapgolly.engineIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AllowRequestFunction = js.Function2[
    /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* fn */ js.Function2[
      /* err */ js.UndefOr[java.lang.String | scala.Null], 
      /* success */ scala.Boolean, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type Message = java.lang.String | typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
}
