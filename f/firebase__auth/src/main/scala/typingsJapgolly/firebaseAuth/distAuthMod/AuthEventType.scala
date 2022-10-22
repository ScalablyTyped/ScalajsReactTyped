package typingsJapgolly.firebaseAuth.distAuthMod

import typingsJapgolly.firebaseAuth.firebaseAuthStrings.linkViaPopup
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.linkViaRedirect
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthViaPopup
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthViaRedirect
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.signInViaPopup
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.signInViaRedirect
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.unknown
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.verifyApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseAuth.firebaseAuthStrings.linkViaPopup
  - typingsJapgolly.firebaseAuth.firebaseAuthStrings.linkViaRedirect
  - typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthViaPopup
  - typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthViaRedirect
  - typingsJapgolly.firebaseAuth.firebaseAuthStrings.signInViaPopup
  - typingsJapgolly.firebaseAuth.firebaseAuthStrings.signInViaRedirect
  - typingsJapgolly.firebaseAuth.firebaseAuthStrings.unknown
  - typingsJapgolly.firebaseAuth.firebaseAuthStrings.verifyApp
*/
trait AuthEventType extends StObject
object AuthEventType {
  
  inline def LINK_VIA_POPUP: linkViaPopup = "linkViaPopup".asInstanceOf[linkViaPopup]
  
  inline def LINK_VIA_REDIRECT: linkViaRedirect = "linkViaRedirect".asInstanceOf[linkViaRedirect]
  
  inline def REAUTH_VIA_POPUP: reauthViaPopup = "reauthViaPopup".asInstanceOf[reauthViaPopup]
  
  inline def REAUTH_VIA_REDIRECT: reauthViaRedirect = "reauthViaRedirect".asInstanceOf[reauthViaRedirect]
  
  inline def SIGN_IN_VIA_POPUP: signInViaPopup = "signInViaPopup".asInstanceOf[signInViaPopup]
  
  inline def SIGN_IN_VIA_REDIRECT: signInViaRedirect = "signInViaRedirect".asInstanceOf[signInViaRedirect]
  
  inline def UNKNOWN: unknown = "unknown".asInstanceOf[unknown]
  
  inline def VERIFY_APP: verifyApp = "verifyApp".asInstanceOf[verifyApp]
}
