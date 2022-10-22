package typingsJapgolly.dwt.anon

import typingsJapgolly.dwt.dwtInts.`11`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceVisibility extends StObject {
  
  // Example: 'viewMenu'
  var iconClass: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var onButtonClick: js.UndefOr[String] = js.undefined
  
  // Example: 'icon-reset'
  var sequence: js.UndefOr[`11`] = js.undefined
  
  var visibility: js.UndefOr[Boolean] = js.undefined
}
object SequenceVisibility {
  
  inline def apply(): SequenceVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceVisibility]
  }
  
  extension [Self <: SequenceVisibility](x: Self) {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOnButtonClick(value: String): Self = StObject.set(x, "onButtonClick", value.asInstanceOf[js.Any])
    
    inline def setOnButtonClickUndefined: Self = StObject.set(x, "onButtonClick", js.undefined)
    
    inline def setSequence(value: `11`): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
