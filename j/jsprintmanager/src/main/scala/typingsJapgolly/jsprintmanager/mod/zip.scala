package typingsJapgolly.jsprintmanager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "zip")
@js.native
object zip extends js.Object {
  @js.native
  class Reader () extends js.Object {
    var size: Double = js.native
    def init(callback: js.Function0[Unit], onerror: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    def readUint8Array(
      index: Double,
      length: Double,
      callback: js.Function1[/* result */ scala.scalajs.js.typedarray.Uint8Array, Unit]
    ): Unit = js.native
    def readUint8Array(
      index: Double,
      length: Double,
      callback: js.Function1[/* result */ scala.scalajs.js.typedarray.Uint8Array, Unit],
      onerror: js.Function1[/* error */ js.Any, Unit]
    ): Unit = js.native
  }
  
}

