package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.`50Percentsign`
import typingsJapgolly.baseui.baseuiStrings.`8px`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRadius extends StObject {
  
  val borderRadius: `50Percentsign`
  
  val height: `8px`
  
  val width: `8px`
}
object BorderRadius {
  
  inline def apply(): BorderRadius = {
    val __obj = js.Dynamic.literal(borderRadius = "50%", height = "8px", width = "8px")
    __obj.asInstanceOf[BorderRadius]
  }
  
  extension [Self <: BorderRadius](x: Self) {
    
    inline def setBorderRadius(value: `50Percentsign`): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: `8px`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: `8px`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
