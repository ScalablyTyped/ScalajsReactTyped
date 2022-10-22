package typingsJapgolly.firebaseAuth.mod

import typingsJapgolly.firebaseAuth.firebaseAuthStrings.facebookDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.githubDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.googleDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.password
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.phone
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.twitterDotcom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProviderId {
  
  /** Facebook provider ID */
  @JSImport("@firebase/auth", "ProviderId.FACEBOOK")
  @js.native
  val FACEBOOK: facebookDotcom = js.native
  
  /** GitHub provider ID */
  @JSImport("@firebase/auth", "ProviderId.GITHUB")
  @js.native
  val GITHUB: githubDotcom = js.native
  
  /** Google provider ID */
  @JSImport("@firebase/auth", "ProviderId.GOOGLE")
  @js.native
  val GOOGLE: googleDotcom = js.native
  
  /** Password provider */
  @JSImport("@firebase/auth", "ProviderId.PASSWORD")
  @js.native
  val PASSWORD: password = js.native
  
  /** Phone provider */
  @JSImport("@firebase/auth", "ProviderId.PHONE")
  @js.native
  val PHONE: phone = js.native
  
  /** Twitter provider ID */
  @JSImport("@firebase/auth", "ProviderId.TWITTER")
  @js.native
  val TWITTER: twitterDotcom = js.native
}
