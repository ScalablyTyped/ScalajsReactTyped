package typingsJapgolly.request.mod

import typingsJapgolly.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.request.mod.UriOptions
  - typingsJapgolly.request.mod.UrlOptions
*/
trait RequiredUriUrl extends StObject
object RequiredUriUrl {
  
  inline def UriOptions(uri: String | Url): typingsJapgolly.request.mod.UriOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.request.mod.UriOptions]
  }
  
  inline def UrlOptions(url: String | Url): typingsJapgolly.request.mod.UrlOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.request.mod.UrlOptions]
  }
}
