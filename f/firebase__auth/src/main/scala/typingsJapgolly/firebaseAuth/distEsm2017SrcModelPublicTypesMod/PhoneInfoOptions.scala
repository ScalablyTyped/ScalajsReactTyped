package typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.PhoneSingleFactorInfoOptions
  - typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions
  - typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions
*/
trait PhoneInfoOptions extends StObject
object PhoneInfoOptions {
  
  inline def PhoneMultiFactorEnrollInfoOptions(phoneNumber: String, session: MultiFactorSession): typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions]
  }
  
  inline def PhoneMultiFactorSignInInfoOptions(session: MultiFactorSession): typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions]
  }
  
  inline def PhoneSingleFactorInfoOptions(phoneNumber: String): typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.PhoneSingleFactorInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.PhoneSingleFactorInfoOptions]
  }
}
