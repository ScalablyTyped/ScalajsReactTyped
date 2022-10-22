package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.detox.anon.DetoxIosAppConfignamestri
  - typingsJapgolly.detox.anon.DetoxAndroidAppConfigname
*/
trait DetoxAppConfig extends StObject
object DetoxAppConfig {
  
  inline def DetoxAndroidAppConfigname(binaryPath: String): typingsJapgolly.detox.anon.DetoxAndroidAppConfigname = {
    val __obj = js.Dynamic.literal(binaryPath = binaryPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("android.apk")
    __obj.asInstanceOf[typingsJapgolly.detox.anon.DetoxAndroidAppConfigname]
  }
  
  inline def DetoxIosAppConfignamestri(binaryPath: String): typingsJapgolly.detox.anon.DetoxIosAppConfignamestri = {
    val __obj = js.Dynamic.literal(binaryPath = binaryPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ios.app")
    __obj.asInstanceOf[typingsJapgolly.detox.anon.DetoxIosAppConfignamestri]
  }
}
