package typingsJapgolly.chromeApps.chrome.runtime

import typingsJapgolly.chromeApps.anon.Accepttlschannelid
import typingsJapgolly.chromeApps.anon.Background
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chrome.runtime.ValidKioskManifest
  - typingsJapgolly.chromeApps.chrome.runtime.ValidNonKioskManifest
  - typingsJapgolly.chromeApps.chrome.runtime.InvalidManifest
*/
trait Manifest extends StObject
object Manifest {
  
  inline def InvalidManifest(app: Background, externally_connectable: Accepttlschannelid, name: String, version: String): typingsJapgolly.chromeApps.chrome.runtime.InvalidManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = 2, name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.chromeApps.chrome.runtime.InvalidManifest]
  }
  
  inline def ValidKioskManifest(app: Background, externally_connectable: Accepttlschannelid, name: String, version: String): typingsJapgolly.chromeApps.chrome.runtime.ValidKioskManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], kiosk_enabled = true, manifest_version = 2, name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.chromeApps.chrome.runtime.ValidKioskManifest]
  }
  
  inline def ValidNonKioskManifest(app: Background, externally_connectable: Accepttlschannelid, name: String, version: String): typingsJapgolly.chromeApps.chrome.runtime.ValidNonKioskManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = 2, name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.chromeApps.chrome.runtime.ValidNonKioskManifest]
  }
}
