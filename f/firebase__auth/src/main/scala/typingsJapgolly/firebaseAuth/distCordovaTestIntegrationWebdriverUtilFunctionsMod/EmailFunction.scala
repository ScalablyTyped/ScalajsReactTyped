package typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailFunction extends StObject
@JSImport("@firebase/auth/dist/cordova/test/integration/webdriver/util/functions", "EmailFunction")
@js.native
object EmailFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EmailFunction & String] = js.native
  
  @js.native
  sealed trait CREATE_USER
    extends StObject
       with EmailFunction
  /* "email.createUser" */ val CREATE_USER: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.EmailFunction.CREATE_USER & String = js.native
}
