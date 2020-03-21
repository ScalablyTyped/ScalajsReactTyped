package typingsJapgolly.lwip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BufferCallback = js.Function2[/* err */ js.Any, /* buffer */ typingsJapgolly.node.Buffer, scala.Unit]
  type Color = java.lang.String | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | typingsJapgolly.lwip.mod.ColorObject
  type ImageCallback = js.Function2[/* err */ js.Any, /* image */ typingsJapgolly.lwip.mod.Image, scala.Unit]
}
