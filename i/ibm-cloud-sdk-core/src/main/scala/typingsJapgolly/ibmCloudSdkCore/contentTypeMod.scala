package typingsJapgolly.ibmCloudSdkCore

import typingsJapgolly.ibmCloudSdkCore.helperMod.FileObject
import typingsJapgolly.node.Buffer
import typingsJapgolly.std.File
import typingsJapgolly.std.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm-cloud-sdk-core/lib/content-type", JSImport.Namespace)
@js.native
object contentTypeMod extends js.Object {
  @js.native
  object default extends js.Object {
    def fromFilename(file: String): String = js.native
    def fromFilename(file: FileObject): String = js.native
    def fromFilename(file: Buffer): String = js.native
    def fromFilename(file: File): String = js.native
    def fromFilename(file: ReadableStream[_]): String = js.native
    def fromHeader(buffer: Buffer): String = js.native
  }
  
}

