package typingsJapgolly.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeychainConfig extends StObject {
  
  var DEK: js.UndefOr[typingsJapgolly.ipfsCoreTypes.distSrcConfigMod.DEK] = js.undefined
}
object KeychainConfig {
  
  inline def apply(): KeychainConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeychainConfig]
  }
  
  extension [Self <: KeychainConfig](x: Self) {
    
    inline def setDEK(value: DEK): Self = StObject.set(x, "DEK", value.asInstanceOf[js.Any])
    
    inline def setDEKUndefined: Self = StObject.set(x, "DEK", js.undefined)
  }
}
