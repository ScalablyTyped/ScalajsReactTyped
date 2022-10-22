package typingsJapgolly.detox.anon

import typingsJapgolly.detox.detoxStrings.iosDotapp
import typingsJapgolly.detox.mod.global.Detox.DetoxAppConfig
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined detox.detox.<global>.Detox.DetoxIosAppConfig & {  name :string | undefined} */
trait DetoxIosAppConfignamestri
  extends StObject
     with DetoxAppConfig {
  
  var binaryPath: String
  
  var build: js.UndefOr[String] = js.undefined
  
  var bundleId: js.UndefOr[String] = js.undefined
  
  var launchArgs: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
    * App name to use with device.selectApp(appName) calls.
    * Can be omitted if you have a single app under the test.
    *
    * @see Device#selectApp
    */
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: iosDotapp
}
object DetoxIosAppConfignamestri {
  
  inline def apply(binaryPath: String): DetoxIosAppConfignamestri = {
    val __obj = js.Dynamic.literal(binaryPath = binaryPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ios.app")
    __obj.asInstanceOf[DetoxIosAppConfignamestri]
  }
  
  extension [Self <: DetoxIosAppConfignamestri](x: Self) {
    
    inline def setBinaryPath(value: String): Self = StObject.set(x, "binaryPath", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setLaunchArgs(value: Record[String, Any]): Self = StObject.set(x, "launchArgs", value.asInstanceOf[js.Any])
    
    inline def setLaunchArgsUndefined: Self = StObject.set(x, "launchArgs", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: iosDotapp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
