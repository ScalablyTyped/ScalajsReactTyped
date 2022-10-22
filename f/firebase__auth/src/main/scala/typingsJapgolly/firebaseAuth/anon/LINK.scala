package typingsJapgolly.firebaseAuth.anon

import typingsJapgolly.firebaseAuth.firebaseAuthStrings.link
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthenticate
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.signIn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LINK extends StObject {
  
  /** Operation involving linking an additional provider to an already signed-in user. */
  val LINK: link
  
  /** Operation involving using a provider to reauthenticate an already signed-in user. */
  val REAUTHENTICATE: reauthenticate
  
  /** Operation involving signing in a user. */
  val SIGN_IN: signIn
}
object LINK {
  
  inline def apply(): LINK = {
    val __obj = js.Dynamic.literal(LINK = "link", REAUTHENTICATE = "reauthenticate", SIGN_IN = "signIn")
    __obj.asInstanceOf[LINK]
  }
  
  extension [Self <: LINK](x: Self) {
    
    inline def setLINK(value: link): Self = StObject.set(x, "LINK", value.asInstanceOf[js.Any])
    
    inline def setREAUTHENTICATE(value: reauthenticate): Self = StObject.set(x, "REAUTHENTICATE", value.asInstanceOf[js.Any])
    
    inline def setSIGN_IN(value: signIn): Self = StObject.set(x, "SIGN_IN", value.asInstanceOf[js.Any])
  }
}
