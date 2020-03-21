package typingsJapgolly.shpjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // All toBuffer() compatible buffers.
  type ShpJSBuffer = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.ArrayBuffer | typingsJapgolly.shpjs.AnonBuffer
}
