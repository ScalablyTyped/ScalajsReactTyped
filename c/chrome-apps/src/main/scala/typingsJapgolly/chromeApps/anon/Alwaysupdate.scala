package typingsJapgolly.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alwaysupdate extends StObject {
  
  /**
    * If the key is specified and its value is true, it allows the app to
    * be always updated regardless of whether the underlying platform is
    * compliant or not. If the value is false or the key is not specified,
    * the required platform version is respected and the app update is
    * deferred until the underlying platform becomes compliant.
    */
  var always_update: js.UndefOr[Boolean] = js.undefined
  
  var required_platform_version: js.UndefOr[String] = js.undefined
}
object Alwaysupdate {
  
  inline def apply(): Alwaysupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alwaysupdate]
  }
  
  extension [Self <: Alwaysupdate](x: Self) {
    
    inline def setAlways_update(value: Boolean): Self = StObject.set(x, "always_update", value.asInstanceOf[js.Any])
    
    inline def setAlways_updateUndefined: Self = StObject.set(x, "always_update", js.undefined)
    
    inline def setRequired_platform_version(value: String): Self = StObject.set(x, "required_platform_version", value.asInstanceOf[js.Any])
    
    inline def setRequired_platform_versionUndefined: Self = StObject.set(x, "required_platform_version", js.undefined)
  }
}
