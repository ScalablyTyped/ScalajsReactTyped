package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.hostMod.AsyncHostOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AsyncHost")
@js.native
class AsyncHost ()
  extends typingsJapgolly.grammarkdown.hostMod.AsyncHost {
  def this(hasReadFileWriteFileBaseOptions: AsyncHostOptions) = this()
}

/* static members */
@JSImport("grammarkdown", "AsyncHost")
@js.native
object AsyncHost extends js.Object {
  def forFile(content: String): typingsJapgolly.grammarkdown.hostMod.AsyncSingleFileHost = js.native
  def forFile(content: String, file: String): typingsJapgolly.grammarkdown.hostMod.AsyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: typingsJapgolly.grammarkdown.hostMod.AsyncHost): typingsJapgolly.grammarkdown.hostMod.AsyncSingleFileHost = js.native
}

