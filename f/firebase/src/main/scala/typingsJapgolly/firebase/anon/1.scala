package typingsJapgolly.firebase.anon

import typingsJapgolly.firebase.compatMod.firebase.firestore.EmulatorMockTokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var mockUserToken: js.UndefOr[EmulatorMockTokenOptions | String] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setMockUserToken(value: EmulatorMockTokenOptions | String): Self = StObject.set(x, "mockUserToken", value.asInstanceOf[js.Any])
    
    inline def setMockUserTokenUndefined: Self = StObject.set(x, "mockUserToken", js.undefined)
  }
}
