package typingsJapgolly.arangodb

import typingsJapgolly.arangodb.arangodbRequestMod.RequestOptions
import typingsJapgolly.arangodb.arangodbRequestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallUrlOptions extends js.Object {
  def apply(options: urlstringRequestOptions): Response = js.native
  def apply(url: String): Response = js.native
  def apply(url: String, options: RequestOptions): Response = js.native
}

