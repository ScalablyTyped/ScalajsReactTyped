package typingsJapgolly.streamEach

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-each", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(
    stream: ReadableStream,
    iterator: js.Function2[
      /* data */ Buffer | String, 
      /* next */ js.Function1[/* error */ js.UndefOr[js.Error], Unit], 
      Unit
    ],
    cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
}

