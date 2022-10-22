package typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.PhoneSingleFactorInfoOptions
  - typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions
  - typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions
*/
trait PhoneInfoOptions extends StObject
object PhoneInfoOptions {
  
  inline def PhoneMultiFactorEnrollInfoOptions(phoneNumber: String, session: MultiFactorSession): typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions]
  }
  
  inline def PhoneMultiFactorSignInInfoOptions(session: MultiFactorSession): typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions]
  }
  
  inline def PhoneSingleFactorInfoOptions(phoneNumber: String): typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.PhoneSingleFactorInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.PhoneSingleFactorInfoOptions]
  }
}
