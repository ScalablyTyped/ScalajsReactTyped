package typingsJapgolly.jsdom.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsdom", "ResourceLoader")
@js.native
class ResourceLoader () extends js.Object {
  def this(obj: ResourceLoaderConstructorOptions) = this()
  def fetch(url: String, options: FetchOptions): js.Promise[Buffer] = js.native
}

