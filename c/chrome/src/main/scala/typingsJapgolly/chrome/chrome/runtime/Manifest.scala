package typingsJapgolly.chrome.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chrome.chrome.runtime.ManifestV2
  - typingsJapgolly.chrome.chrome.runtime.ManifestV3
*/
trait Manifest extends StObject
object Manifest {
  
  inline def ManifestV2(name: String, version: String): typingsJapgolly.chrome.chrome.runtime.ManifestV2 = {
    val __obj = js.Dynamic.literal(manifest_version = 2, name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.chrome.chrome.runtime.ManifestV2]
  }
  
  inline def ManifestV3(name: String, version: String): typingsJapgolly.chrome.chrome.runtime.ManifestV3 = {
    val __obj = js.Dynamic.literal(manifest_version = 3, name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.chrome.chrome.runtime.ManifestV3]
  }
}
