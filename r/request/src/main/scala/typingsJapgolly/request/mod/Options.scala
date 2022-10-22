package typingsJapgolly.request.mod

import typingsJapgolly.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.request.mod.OptionsWithUri
  - typingsJapgolly.request.mod.OptionsWithUrl
*/
trait Options extends StObject
object Options {
  
  inline def OptionsWithUri(uri: String | Url): typingsJapgolly.request.mod.OptionsWithUri = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.request.mod.OptionsWithUri]
  }
  
  inline def OptionsWithUrl(url: String | Url): typingsJapgolly.request.mod.OptionsWithUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.request.mod.OptionsWithUrl]
  }
}
