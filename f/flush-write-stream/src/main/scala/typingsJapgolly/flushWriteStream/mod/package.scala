package typingsJapgolly.flushWriteStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* error */ js.UndefOr[js.Error], scala.Unit]
  type Flush = js.Function1[/* callback */ typingsJapgolly.flushWriteStream.mod.Callback, scala.Unit]
  type Write = js.Function3[
    /* chunk */ js.Any, 
    /* encoding */ java.lang.String, 
    /* callback */ typingsJapgolly.flushWriteStream.mod.Callback, 
    scala.Unit
  ]
}
