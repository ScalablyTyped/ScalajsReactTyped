package typingsJapgolly.firebaseAuth.distAuthMod

import typingsJapgolly.firebaseAuth.firebaseAuthStrings.anonymous
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.custom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.facebookDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.firebase
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.githubDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.googleDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.password
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.phone
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.twitterDotcom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2021 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
/**
  * Enumeration of supported providers.
  * @internal
  */
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
trait ProviderId2 extends StObject
object ProviderId2 {
  
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
