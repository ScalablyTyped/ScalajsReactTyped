package typingsJapgolly.mangopay2NodejsSdk.typingsEnumsMod.enums

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BUSINESS
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ORGANIZATION
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOLETRADER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILegalPersonType extends StObject {
  
  var Business: BUSINESS
  
  var NotSpecified: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
  
  var Organization: ORGANIZATION
  
  var Soletrader: SOLETRADER
}
object ILegalPersonType {
  
  inline def apply(): ILegalPersonType = {
    val __obj = js.Dynamic.literal(Business = "BUSINESS", NotSpecified = "NotSpecified", Organization = "ORGANIZATION", Soletrader = "SOLETRADER")
    __obj.asInstanceOf[ILegalPersonType]
  }
  
  extension [Self <: ILegalPersonType](x: Self) {
    
    inline def setBusiness(value: BUSINESS): Self = StObject.set(x, "Business", value.asInstanceOf[js.Any])
    
    inline def setNotSpecified(value: NotSpecified): Self = StObject.set(x, "NotSpecified", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: ORGANIZATION): Self = StObject.set(x, "Organization", value.asInstanceOf[js.Any])
    
    inline def setSoletrader(value: SOLETRADER): Self = StObject.set(x, "Soletrader", value.asInstanceOf[js.Any])
  }
}
