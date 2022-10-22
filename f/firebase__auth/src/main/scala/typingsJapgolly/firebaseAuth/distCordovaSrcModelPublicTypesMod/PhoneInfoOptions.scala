package typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.PhoneSingleFactorInfoOptions
  - typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions
  - typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions
*/
trait PhoneInfoOptions extends StObject
object PhoneInfoOptions {
  
  inline def PhoneMultiFactorEnrollInfoOptions(phoneNumber: String, session: MultiFactorSession): typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions]
  }
  
  inline def PhoneMultiFactorSignInInfoOptions(session: MultiFactorSession): typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions]
  }
  
  inline def PhoneSingleFactorInfoOptions(phoneNumber: String): typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.PhoneSingleFactorInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.PhoneSingleFactorInfoOptions]
  }
}
