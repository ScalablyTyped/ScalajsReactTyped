package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qIo {
  type QioBufferStream = js.Function2[
    /* buffer */ typingsJapgolly.node.Buffer, 
    /* encoding */ java.lang.String, 
    typingsJapgolly.qIo.Qio.Stream
  ]
}
