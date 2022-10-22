package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentHeight extends StObject {
  
  var contentHeight: Double
  
  var contentWidth: Double
}
object ContentHeight {
  
  inline def apply(contentHeight: Double, contentWidth: Double): ContentHeight = {
    val __obj = js.Dynamic.literal(contentHeight = contentHeight.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentHeight]
  }
  
  extension [Self <: ContentHeight](x: Self) {
    
    inline def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
    
    inline def setContentWidth(value: Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
  }
}
