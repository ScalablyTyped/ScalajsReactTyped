package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.firebaseAuthStrings.anonymous
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.custom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.emailLink
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.facebookDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.firebase
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.githubDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.googleDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.link
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.password
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.phone
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthenticate
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.signIn
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.twitterDotcom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcModelEnumsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.link
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthenticate
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.signIn
  */
  trait OperationType extends StObject
  object OperationType {
    
    /** Operation involving linking an additional provider to an already signed-in user. */
    inline def LINK: link = "link".asInstanceOf[link]
    
    /** Operation involving using a provider to reauthenticate an already signed-in user. */
    inline def REAUTHENTICATE: reauthenticate = "reauthenticate".asInstanceOf[reauthenticate]
    
    /** Operation involving signing in a user. */
    inline def SIGN_IN: signIn = "signIn".asInstanceOf[signIn]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.anonymous
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.custom
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.facebookDotcom
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.firebase
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.githubDotcom
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.googleDotcom
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.password
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.phone
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.twitterDotcom
  */
  trait ProviderId extends StObject
  object ProviderId {
    
    /** @internal */
    inline def ANONYMOUS: anonymous = "anonymous".asInstanceOf[anonymous]
    
    /** @internal */
    inline def CUSTOM: custom = "custom".asInstanceOf[custom]
    
    /** Facebook provider ID */
    inline def FACEBOOK: facebookDotcom = "facebook.com".asInstanceOf[facebookDotcom]
    
    /** @internal */
    inline def FIREBASE: firebase = "firebase".asInstanceOf[firebase]
    
    /** GitHub provider ID */
    inline def GITHUB: githubDotcom = "github.com".asInstanceOf[githubDotcom]
    
    /** Google provider ID */
    inline def GOOGLE: googleDotcom = "google.com".asInstanceOf[googleDotcom]
    
    /** Password provider */
    inline def PASSWORD: password = "password".asInstanceOf[password]
    
    /** Phone provider */
    inline def PHONE: phone = "phone".asInstanceOf[phone]
    
    /** Twitter provider ID */
    inline def TWITTER: twitterDotcom = "twitter.com".asInstanceOf[twitterDotcom]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.anonymous
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.emailLink
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.password
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.facebookDotcom
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.githubDotcom
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.googleDotcom
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.phone
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.twitterDotcom
  */
  trait SignInMethod extends StObject
  object SignInMethod {
    
    /** @internal */
    inline def ANONYMOUS: anonymous = "anonymous".asInstanceOf[anonymous]
    
    /** Email link sign in method */
    inline def EMAIL_LINK: emailLink = "emailLink".asInstanceOf[emailLink]
    
    /** Email/password sign in method */
    inline def EMAIL_PASSWORD: password = "password".asInstanceOf[password]
    
    /** Facebook sign in method */
    inline def FACEBOOK: facebookDotcom = "facebook.com".asInstanceOf[facebookDotcom]
    
    /** GitHub sign in method */
    inline def GITHUB: githubDotcom = "github.com".asInstanceOf[githubDotcom]
    
    /** Google sign in method */
    inline def GOOGLE: googleDotcom = "google.com".asInstanceOf[googleDotcom]
    
    /** Phone sign in method */
    inline def PHONE: phone = "phone".asInstanceOf[phone]
    
    /** Twitter sign in method */
    inline def TWITTER: twitterDotcom = "twitter.com".asInstanceOf[twitterDotcom]
  }
}
