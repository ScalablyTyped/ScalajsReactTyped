package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxAppConfigFragment extends StObject {
  
  var binaryPath: String
  
  var build: js.UndefOr[String] = js.undefined
  
  var bundleId: js.UndefOr[String] = js.undefined
  
  var launchArgs: js.UndefOr[Record[String, Any]] = js.undefined
  
  var testBinaryPath: js.UndefOr[String] = js.undefined
}
object DetoxAppConfigFragment {
  
  inline def apply(binaryPath: String): DetoxAppConfigFragment = {
    val __obj = js.Dynamic.literal(binaryPath = binaryPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetoxAppConfigFragment]
  }
  
  extension [Self <: DetoxAppConfigFragment](x: Self) {
    
    inline def setBinaryPath(value: String): Self = StObject.set(x, "binaryPath", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setLaunchArgs(value: Record[String, Any]): Self = StObject.set(x, "launchArgs", value.asInstanceOf[js.Any])
    
    inline def setLaunchArgsUndefined: Self = StObject.set(x, "launchArgs", js.undefined)
    
    inline def setTestBinaryPath(value: String): Self = StObject.set(x, "testBinaryPath", value.asInstanceOf[js.Any])
    
    inline def setTestBinaryPathUndefined: Self = StObject.set(x, "testBinaryPath", js.undefined)
  }
}
