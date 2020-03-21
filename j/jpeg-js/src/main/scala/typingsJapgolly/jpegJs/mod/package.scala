package typingsJapgolly.jpegJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BufferLike = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.std.ArrayLike[scala.Double] | js.Iterable[scala.Double] | scala.scalajs.js.typedarray.ArrayBuffer
  type BufferRet = typingsJapgolly.jpegJs.mod.RawImageData[typingsJapgolly.node.Buffer]
  type ImageData = typingsJapgolly.jpegJs.mod.BufferRet | typingsJapgolly.jpegJs.mod.UintArrRet
  type UintArrRet = typingsJapgolly.jpegJs.mod.RawImageData[scala.scalajs.js.typedarray.Uint8Array]
}
