package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkAccountInfoWithFingerprint extends StObject {
  
  /**
    * The Sidewalk Amazon ID.
    */
  var AmazonId: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.AmazonId] = js.undefined
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[PartnerAccountArn] = js.undefined
  
  /**
    * The fingerprint of the Sidewalk application server private key.
    */
  var Fingerprint: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.Fingerprint] = js.undefined
}
object SidewalkAccountInfoWithFingerprint {
  
  inline def apply(): SidewalkAccountInfoWithFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkAccountInfoWithFingerprint]
  }
  
  extension [Self <: SidewalkAccountInfoWithFingerprint](x: Self) {
    
    inline def setAmazonId(value: AmazonId): Self = StObject.set(x, "AmazonId", value.asInstanceOf[js.Any])
    
    inline def setAmazonIdUndefined: Self = StObject.set(x, "AmazonId", js.undefined)
    
    inline def setArn(value: PartnerAccountArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setFingerprint(value: Fingerprint): Self = StObject.set(x, "Fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "Fingerprint", js.undefined)
  }
}
