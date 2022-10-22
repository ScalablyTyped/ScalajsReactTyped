package typingsJapgolly.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlateSource extends StObject {
  
  /**
    * The name of the source location where the slate VOD source is stored.
    */
  var SourceLocationName: js.UndefOr[string] = js.undefined
  
  /**
    * The slate VOD source name. The VOD source must already exist in a source location before it can be used for slate.
    */
  var VodSourceName: js.UndefOr[string] = js.undefined
}
object SlateSource {
  
  inline def apply(): SlateSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlateSource]
  }
  
  extension [Self <: SlateSource](x: Self) {
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationNameUndefined: Self = StObject.set(x, "SourceLocationName", js.undefined)
    
    inline def setVodSourceName(value: string): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceNameUndefined: Self = StObject.set(x, "VodSourceName", js.undefined)
  }
}
