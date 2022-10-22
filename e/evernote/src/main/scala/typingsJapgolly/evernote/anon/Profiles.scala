package typingsJapgolly.evernote.anon

import typingsJapgolly.evernote.mod.UserStore.BootstrapProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Profiles extends StObject {
  
  var profiles: js.UndefOr[js.Array[BootstrapProfile]] = js.undefined
}
object Profiles {
  
  inline def apply(): Profiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Profiles]
  }
  
  extension [Self <: Profiles](x: Self) {
    
    inline def setProfiles(value: js.Array[BootstrapProfile]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    inline def setProfilesVarargs(value: BootstrapProfile*): Self = StObject.set(x, "profiles", js.Array(value*))
  }
}
