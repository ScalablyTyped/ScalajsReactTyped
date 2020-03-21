package typingsJapgolly.easyXHeaders

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SlowBuffer")
@js.native
class SlowBuffer protected ()
  extends typingsJapgolly.node.Buffer {
  def this(array: js.Array[_]) = this()
  def this(size: Double) = this()
  def this(size: scala.scalajs.js.typedarray.Uint8Array) = this()
  def this(str: String) = this()
  def this(str: String, encoding: String) = this()
}

@JSGlobal("SlowBuffer")
@js.native
object SlowBuffer
  extends Instantiable1[
      (/* array */ js.Array[js.Any]) | (/* size */ Double) | (/* str */ String) | (/* size */ Uint8Array), 
      typingsJapgolly.node.Buffer
    ]
     with Instantiable2[/* str */ String, /* encoding */ String, typingsJapgolly.node.Buffer] {
  def byteLength(string: String): Double = js.native
  def byteLength(string: String, encoding: String): Double = js.native
  def concat(list: js.Array[typingsJapgolly.node.Buffer]): typingsJapgolly.node.Buffer = js.native
  def concat(list: js.Array[typingsJapgolly.node.Buffer], totalLength: Double): typingsJapgolly.node.Buffer = js.native
  def isBuffer(obj: js.Any): Boolean = js.native
}

