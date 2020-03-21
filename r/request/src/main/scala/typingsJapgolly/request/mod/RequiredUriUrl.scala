package typingsJapgolly.request.mod

import typingsJapgolly.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.request.mod.UriOptions
  - typingsJapgolly.request.mod.UrlOptions
*/
trait RequiredUriUrl extends js.Object

object RequiredUriUrl {
  @scala.inline
  def UriOptions(uri: String | Url): RequiredUriUrl = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequiredUriUrl]
  }
  @scala.inline
  def UrlOptions(url: String | Url): RequiredUriUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequiredUriUrl]
  }
}

