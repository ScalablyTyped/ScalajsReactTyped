package typingsJapgolly.request.mod

import typingsJapgolly.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsWithUri
  extends StObject
     with UriOptions
     with CoreOptions
     with Options
object OptionsWithUri {
  
  inline def apply(uri: String | Url): OptionsWithUri = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithUri]
  }
}
