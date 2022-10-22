package typingsJapgolly.octokitAuthToken

import typingsJapgolly.octokitAuthToken.distTypesTypesMod.Authentication
import typingsJapgolly.octokitAuthToken.distTypesTypesMod.StrategyInterface
import typingsJapgolly.octokitAuthToken.distTypesTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/auth-token", "createTokenAuth")
  @js.native
  val createTokenAuth: StrategyInterface = js.native
  
  trait Types extends StObject {
    
    var Authentication: typingsJapgolly.octokitAuthToken.distTypesTypesMod.Authentication
    
    var StrategyOptions: Token
  }
  object Types {
    
    inline def apply(Authentication: Authentication, StrategyOptions: Token): Types = {
      val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any], StrategyOptions = StrategyOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types]
    }
    
    extension [Self <: Types](x: Self) {
      
      inline def setAuthentication(value: Authentication): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
      
      inline def setStrategyOptions(value: Token): Self = StObject.set(x, "StrategyOptions", value.asInstanceOf[js.Any])
    }
  }
}
