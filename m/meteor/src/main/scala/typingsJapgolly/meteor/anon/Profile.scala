package typingsJapgolly.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Profile extends StObject {
  
  var profile: js.UndefOr[js.Object] = js.undefined
}
object Profile {
  
  inline def apply(): Profile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Profile]
  }
  
  extension [Self <: Profile](x: Self) {
    
    inline def setProfile(value: js.Object): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
  }
}
