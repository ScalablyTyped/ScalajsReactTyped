package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloodlightActivityDynamicTag extends StObject {
  
  /** ID of this dynamic tag. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Name of this tag. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Tag code. */
  var tag: js.UndefOr[String] = js.undefined
}
object FloodlightActivityDynamicTag {
  
  inline def apply(): FloodlightActivityDynamicTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivityDynamicTag]
  }
  
  extension [Self <: FloodlightActivityDynamicTag](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
