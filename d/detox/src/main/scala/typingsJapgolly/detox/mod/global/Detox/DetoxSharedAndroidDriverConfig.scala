package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxSharedAndroidDriverConfig extends StObject {
  
  var forceAdbInstall: js.UndefOr[Boolean] = js.undefined
  
  var utilBinaryPaths: js.UndefOr[js.Array[String]] = js.undefined
}
object DetoxSharedAndroidDriverConfig {
  
  inline def apply(): DetoxSharedAndroidDriverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetoxSharedAndroidDriverConfig]
  }
  
  extension [Self <: DetoxSharedAndroidDriverConfig](x: Self) {
    
    inline def setForceAdbInstall(value: Boolean): Self = StObject.set(x, "forceAdbInstall", value.asInstanceOf[js.Any])
    
    inline def setForceAdbInstallUndefined: Self = StObject.set(x, "forceAdbInstall", js.undefined)
    
    inline def setUtilBinaryPaths(value: js.Array[String]): Self = StObject.set(x, "utilBinaryPaths", value.asInstanceOf[js.Any])
    
    inline def setUtilBinaryPathsUndefined: Self = StObject.set(x, "utilBinaryPaths", js.undefined)
    
    inline def setUtilBinaryPathsVarargs(value: String*): Self = StObject.set(x, "utilBinaryPaths", js.Array(value*))
  }
}
