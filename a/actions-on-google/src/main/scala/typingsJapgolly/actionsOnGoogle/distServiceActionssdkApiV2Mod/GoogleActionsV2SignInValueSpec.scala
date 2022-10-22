package typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2SignInValueSpec extends StObject {
  
  /**
    * The optional context why the app needs to ask the user to sign in, as a
    * prefix of a prompt for user consent, e.g. \"To track your exercise\", or
    * \"To check your account balance\".
    */
  var optContext: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2SignInValueSpec {
  
  inline def apply(): GoogleActionsV2SignInValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SignInValueSpec]
  }
  
  extension [Self <: GoogleActionsV2SignInValueSpec](x: Self) {
    
    inline def setOptContext(value: String): Self = StObject.set(x, "optContext", value.asInstanceOf[js.Any])
    
    inline def setOptContextUndefined: Self = StObject.set(x, "optContext", js.undefined)
  }
}
