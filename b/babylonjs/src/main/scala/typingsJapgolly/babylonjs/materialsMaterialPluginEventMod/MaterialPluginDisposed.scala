package typingsJapgolly.babylonjs.materialsMaterialPluginEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginDisposed extends StObject {
  
  var forceDisposeTextures: js.UndefOr[Boolean] = js.undefined
}
object MaterialPluginDisposed {
  
  inline def apply(): MaterialPluginDisposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialPluginDisposed]
  }
  
  extension [Self <: MaterialPluginDisposed](x: Self) {
    
    inline def setForceDisposeTextures(value: Boolean): Self = StObject.set(x, "forceDisposeTextures", value.asInstanceOf[js.Any])
    
    inline def setForceDisposeTexturesUndefined: Self = StObject.set(x, "forceDisposeTextures", js.undefined)
  }
}
