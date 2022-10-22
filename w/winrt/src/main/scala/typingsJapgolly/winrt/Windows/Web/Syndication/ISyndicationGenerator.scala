package typingsJapgolly.winrt.Windows.Web.Syndication

import typingsJapgolly.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyndicationGenerator extends StObject {
  
  var text: String
  
  var uri: Uri
  
  var version: String
}
object ISyndicationGenerator {
  
  inline def apply(text: String, uri: Uri, version: String): ISyndicationGenerator = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationGenerator]
  }
  
  extension [Self <: ISyndicationGenerator](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
