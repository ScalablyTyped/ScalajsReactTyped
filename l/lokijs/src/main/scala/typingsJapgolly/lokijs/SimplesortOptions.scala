package typingsJapgolly.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimplesortOptions extends StObject {
  
  var desc: Boolean
  
  var disableIndexIntersect: Boolean
  
  var forceIndexIntersect: Boolean
  
  var useJavascriptSorting: Boolean
}
object SimplesortOptions {
  
  inline def apply(
    desc: Boolean,
    disableIndexIntersect: Boolean,
    forceIndexIntersect: Boolean,
    useJavascriptSorting: Boolean
  ): SimplesortOptions = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], disableIndexIntersect = disableIndexIntersect.asInstanceOf[js.Any], forceIndexIntersect = forceIndexIntersect.asInstanceOf[js.Any], useJavascriptSorting = useJavascriptSorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplesortOptions]
  }
  
  extension [Self <: SimplesortOptions](x: Self) {
    
    inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDisableIndexIntersect(value: Boolean): Self = StObject.set(x, "disableIndexIntersect", value.asInstanceOf[js.Any])
    
    inline def setForceIndexIntersect(value: Boolean): Self = StObject.set(x, "forceIndexIntersect", value.asInstanceOf[js.Any])
    
    inline def setUseJavascriptSorting(value: Boolean): Self = StObject.set(x, "useJavascriptSorting", value.asInstanceOf[js.Any])
  }
}
