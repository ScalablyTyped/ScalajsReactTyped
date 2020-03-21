package typingsJapgolly.unzip

import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.unzip.unzipStrings.Directory
import typingsJapgolly.unzip.unzipStrings.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unzip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Entry extends Transform {
    var path: String = js.native
    var size: Double = js.native
    var `type`: Directory | File = js.native
    def autodrain(): Unit = js.native
  }
  
  def Extract(options: AnonPath): WritableStream = js.native
  def Parse(): WritableStream = js.native
}

