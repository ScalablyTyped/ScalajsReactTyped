package typingsJapgolly.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedUrl extends StObject {
  
  /** Label to describe usage of the URL. */
  var label: js.UndefOr[String] = js.undefined
  
  /** Specific URL associated with the resource. */
  var url: js.UndefOr[String] = js.undefined
}
object RelatedUrl {
  
  inline def apply(): RelatedUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedUrl]
  }
  
  extension [Self <: RelatedUrl](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
