package typingsJapgolly.mangopay2NodejsSdk.anon

import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/disputeDocument.disputeDocument.DocumentPageConsult> */
trait PartialDocumentPageConsul extends StObject {
  
  var ExpirationDate: js.UndefOr[Timestamp] = js.undefined
  
  var Url: js.UndefOr[String] = js.undefined
}
object PartialDocumentPageConsul {
  
  inline def apply(): PartialDocumentPageConsul = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDocumentPageConsul]
  }
  
  extension [Self <: PartialDocumentPageConsul](x: Self) {
    
    inline def setExpirationDate(value: Timestamp): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
