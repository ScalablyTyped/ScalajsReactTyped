package typingsJapgolly.memFs

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mem-fs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Store extends EventEmitter {
    def add(file: File): this.type = js.native
    def each(callback: js.Function2[/* file */ File, /* index */ Double, Unit]): this.type = js.native
    def get(filepath: String): File = js.native
    def stream(): Transform = js.native
  }
  
  def create(): Store = js.native
}

