package typingsJapgolly.firebaseAuth.distNodeInternalMod

import typingsJapgolly.firebaseAuth.firebaseAuthStrings.emailLink
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.facebookDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.githubDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.googleDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.password
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.phone
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.twitterDotcom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SignInMethod {
  
  /** Email link sign in method */
  @JSImport("@firebase/auth/dist/node/internal", "SignInMethod.EMAIL_LINK")
  @js.native
  val EMAIL_LINK: emailLink = js.native
  
  /** Email/password sign in method */
  @JSImport("@firebase/auth/dist/node/internal", "SignInMethod.EMAIL_PASSWORD")
  @js.native
  val EMAIL_PASSWORD: password = js.native
  
  /** Facebook sign in method */
  @JSImport("@firebase/auth/dist/node/internal", "SignInMethod.FACEBOOK")
  @js.native
  val FACEBOOK: facebookDotcom = js.native
  
  /** GitHub sign in method */
  @JSImport("@firebase/auth/dist/node/internal", "SignInMethod.GITHUB")
  @js.native
  val GITHUB: githubDotcom = js.native
  
  /** Google sign in method */
  @JSImport("@firebase/auth/dist/node/internal", "SignInMethod.GOOGLE")
  @js.native
  val GOOGLE: googleDotcom = js.native
  
  /** Phone sign in method */
  @JSImport("@firebase/auth/dist/node/internal", "SignInMethod.PHONE")
  @js.native
  val PHONE: phone = js.native
  
  /** Twitter sign in method */
  @JSImport("@firebase/auth/dist/node/internal", "SignInMethod.TWITTER")
  @js.native
  val TWITTER: twitterDotcom = js.native
}
