package typingsJapgolly.mangopay2NodejsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsSecurityInfoMod {
  
  object securityInfo {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_CHECK
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_MATCH
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_MATCH_ONLY
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.POSTAL_CODE_MATCH_ONLY
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FULL_MATCH
    */
    trait AVSResult extends StObject
    object AVSResult {
      
      inline def ADDRESS_MATCH_ONLY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_MATCH_ONLY = "ADDRESS_MATCH_ONLY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_MATCH_ONLY]
      
      inline def FULL_MATCH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FULL_MATCH = "FULL_MATCH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FULL_MATCH]
      
      inline def NO_CHECK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_CHECK = "NO_CHECK".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_CHECK]
      
      inline def NO_MATCH: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_MATCH = "NO_MATCH".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO_MATCH]
      
      inline def POSTAL_CODE_MATCH_ONLY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.POSTAL_CODE_MATCH_ONLY = "POSTAL_CODE_MATCH_ONLY".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.POSTAL_CODE_MATCH_ONLY]
    }
    
    trait SecurityInfoData extends StObject {
      
      var AVSResult: typingsJapgolly.mangopay2NodejsSdk.typingsModelsSecurityInfoMod.securityInfo.AVSResult
    }
    object SecurityInfoData {
      
      inline def apply(AVSResult: AVSResult): SecurityInfoData = {
        val __obj = js.Dynamic.literal(AVSResult = AVSResult.asInstanceOf[js.Any])
        __obj.asInstanceOf[SecurityInfoData]
      }
      
      extension [Self <: SecurityInfoData](x: Self) {
        
        inline def setAVSResult(value: AVSResult): Self = StObject.set(x, "AVSResult", value.asInstanceOf[js.Any])
      }
    }
  }
}
