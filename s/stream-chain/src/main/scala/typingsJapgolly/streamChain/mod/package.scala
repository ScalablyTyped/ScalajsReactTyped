package typingsJapgolly.streamChain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Stream = typingsJapgolly.node.streamMod.Readable | typingsJapgolly.node.streamMod.Writable | typingsJapgolly.node.streamMod.Duplex | typingsJapgolly.node.streamMod.Transform
  type StreamItem = typingsJapgolly.streamChain.mod.Stream | typingsJapgolly.streamChain.mod.TransformFunction
  type TransformFunction = js.Function2[/* chunk */ js.Any, /* encoding */ js.UndefOr[java.lang.String], js.Any]
}
