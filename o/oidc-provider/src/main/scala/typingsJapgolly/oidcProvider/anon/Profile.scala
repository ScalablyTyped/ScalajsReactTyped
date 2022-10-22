package typingsJapgolly.oidcProvider.anon

import typingsJapgolly.oidcProvider.mod.FapiProfile
import typingsJapgolly.oidcProvider.mod.KoaContextWithOIDC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Profile extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var profile: js.UndefOr[
    FapiProfile | (js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      FapiProfile
    ])
  ] = js.undefined
}
object Profile {
  
  inline def apply(): Profile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Profile]
  }
  
  extension [Self <: Profile](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setProfile(
      value: FapiProfile | (js.Function2[
          /* ctx */ KoaContextWithOIDC, 
          /* client */ typingsJapgolly.oidcProvider.mod.Client, 
          FapiProfile
        ])
    ): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileFunction2(
      value: (/* ctx */ KoaContextWithOIDC, /* client */ typingsJapgolly.oidcProvider.mod.Client) => FapiProfile
    ): Self = StObject.set(x, "profile", js.Any.fromFunction2(value))
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
  }
}
