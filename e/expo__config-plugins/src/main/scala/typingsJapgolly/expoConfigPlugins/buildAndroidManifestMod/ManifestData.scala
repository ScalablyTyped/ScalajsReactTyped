package typingsJapgolly.expoConfigPlugins.buildAndroidManifestMod

import typingsJapgolly.expoConfigPlugins.anon.Androidhost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestData extends StObject {
  
  @JSName("$")
  var $: Androidhost
}
object ManifestData {
  
  inline def apply($: Androidhost): ManifestData = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestData]
  }
  
  extension [Self <: ManifestData](x: Self) {
    
    inline def set$(value: Androidhost): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
