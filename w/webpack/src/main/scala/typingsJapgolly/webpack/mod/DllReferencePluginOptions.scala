package typingsJapgolly.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webpack.anon.Extensions
  - typingsJapgolly.webpack.anon.Content
*/
trait DllReferencePluginOptions extends StObject
object DllReferencePluginOptions {
  
  inline def Content(content: DllReferencePluginOptionsContent, name: String): typingsJapgolly.webpack.anon.Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.webpack.anon.Content]
  }
  
  inline def Extensions(manifest: String | DllReferencePluginOptionsManifest): typingsJapgolly.webpack.anon.Extensions = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.webpack.anon.Extensions]
  }
}
