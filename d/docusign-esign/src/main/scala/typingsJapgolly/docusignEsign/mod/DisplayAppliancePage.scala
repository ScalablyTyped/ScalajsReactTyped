package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayAppliancePage extends StObject {
  
  var documentId: js.UndefOr[String] = js.undefined
  
  var documentName: js.UndefOr[String] = js.undefined
  
  var externalDocumentId: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var isFirstPage: js.UndefOr[Boolean] = js.undefined
  
  var pageId: js.UndefOr[String] = js.undefined
  
  var pageNo: js.UndefOr[Double] = js.undefined
  
  var pageStatus: js.UndefOr[String] = js.undefined
  
  var pageType: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DisplayAppliancePage {
  
  inline def apply(): DisplayAppliancePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayAppliancePage]
  }
  
  extension [Self <: DisplayAppliancePage](x: Self) {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentNameUndefined: Self = StObject.set(x, "documentName", js.undefined)
    
    inline def setExternalDocumentId(value: String): Self = StObject.set(x, "externalDocumentId", value.asInstanceOf[js.Any])
    
    inline def setExternalDocumentIdUndefined: Self = StObject.set(x, "externalDocumentId", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIsFirstPage(value: Boolean): Self = StObject.set(x, "isFirstPage", value.asInstanceOf[js.Any])
    
    inline def setIsFirstPageUndefined: Self = StObject.set(x, "isFirstPage", js.undefined)
    
    inline def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    inline def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
    
    inline def setPageNo(value: Double): Self = StObject.set(x, "pageNo", value.asInstanceOf[js.Any])
    
    inline def setPageNoUndefined: Self = StObject.set(x, "pageNo", js.undefined)
    
    inline def setPageStatus(value: String): Self = StObject.set(x, "pageStatus", value.asInstanceOf[js.Any])
    
    inline def setPageStatusUndefined: Self = StObject.set(x, "pageStatus", js.undefined)
    
    inline def setPageType(value: String): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
    
    inline def setPageTypeUndefined: Self = StObject.set(x, "pageType", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
