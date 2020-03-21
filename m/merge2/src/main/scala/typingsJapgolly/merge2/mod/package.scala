package typingsJapgolly.merge2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StreamType = typingsJapgolly.node.NodeJS.ReadableStream | typingsJapgolly.merge2.mod.Merge2Stream
  type Streams = typingsJapgolly.merge2.mod.StreamType | js.Array[typingsJapgolly.merge2.mod.StreamType]
}
