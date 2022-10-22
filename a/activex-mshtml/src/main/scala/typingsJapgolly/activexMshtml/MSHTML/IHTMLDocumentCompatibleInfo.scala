package typingsJapgolly.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLDocumentCompatibleInfo extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLDocumentCompatibleInfo_typekey")
  var MSHTMLDotIHTMLDocumentCompatibleInfo_typekey: IHTMLDocumentCompatibleInfo
  
  val userAgent: String
  
  val version: String
}
object IHTMLDocumentCompatibleInfo {
  
  inline def apply(
    MSHTMLDotIHTMLDocumentCompatibleInfo_typekey: IHTMLDocumentCompatibleInfo,
    userAgent: String,
    version: String
  ): IHTMLDocumentCompatibleInfo = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDocumentCompatibleInfo_typekey")(MSHTMLDotIHTMLDocumentCompatibleInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDocumentCompatibleInfo]
  }
  
  extension [Self <: IHTMLDocumentCompatibleInfo](x: Self) {
    
    inline def setMSHTMLDotIHTMLDocumentCompatibleInfo_typekey(value: IHTMLDocumentCompatibleInfo): Self = StObject.set(x, "MSHTML.IHTMLDocumentCompatibleInfo_typekey", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
