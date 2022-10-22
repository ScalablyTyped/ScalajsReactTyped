package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificatesResult extends StObject {
  
  /**
    * A list of certificates with basic details including certificate ID, certificate common name, certificate state.
    */
  var CertificatesInfo: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.CertificatesInfo] = js.undefined
  
  /**
    * Indicates whether another page of certificates is available when the number of available certificates exceeds the page limit.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}
object ListCertificatesResult {
  
  inline def apply(): ListCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesResult]
  }
  
  extension [Self <: ListCertificatesResult](x: Self) {
    
    inline def setCertificatesInfo(value: CertificatesInfo): Self = StObject.set(x, "CertificatesInfo", value.asInstanceOf[js.Any])
    
    inline def setCertificatesInfoUndefined: Self = StObject.set(x, "CertificatesInfo", js.undefined)
    
    inline def setCertificatesInfoVarargs(value: CertificateInfo*): Self = StObject.set(x, "CertificatesInfo", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
