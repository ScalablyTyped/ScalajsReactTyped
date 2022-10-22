package typingsJapgolly.expoConfigPlugins.buildAndroidManifestMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestPermission extends StObject {
  
  @JSName("$")
  var $: typingsJapgolly.expoConfigPlugins.anon.AndroidManifestAttributes
}
object ManifestPermission {
  
  inline def apply($: typingsJapgolly.expoConfigPlugins.anon.AndroidManifestAttributes): ManifestPermission = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestPermission]
  }
  
  extension [Self <: ManifestPermission](x: Self) {
    
    inline def set$(value: typingsJapgolly.expoConfigPlugins.anon.AndroidManifestAttributes): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
