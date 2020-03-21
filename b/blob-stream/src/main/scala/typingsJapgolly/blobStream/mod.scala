package typingsJapgolly.blobStream

import org.scalajs.dom.raw.Blob
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blob-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait IBlobStream extends WritableStream {
    def toBlob(): Blob = js.native
    def toBlob(`type`: String): Blob = js.native
    def toBlobURL(): String = js.native
    def toBlobURL(`type`: String): String = js.native
  }
  
  def apply(): IBlobStream = js.native
}

