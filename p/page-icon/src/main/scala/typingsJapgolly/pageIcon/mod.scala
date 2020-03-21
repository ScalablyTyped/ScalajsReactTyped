package typingsJapgolly.pageIcon

import typingsJapgolly.pageIcon.PageIcon.FetchOptions
import typingsJapgolly.pageIcon.PageIcon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("page-icon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(url: String): js.Promise[Icon] = js.native
  def apply(url: String, opts: FetchOptions): js.Promise[Icon] = js.native
}

