package typingsJapgolly.divaJs.anon

import typingsJapgolly.divaJs.interfacesMod.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorPage extends StObject {
  
  var anchorPage: Double
  
  var offset: Offset
}
object AnchorPage {
  
  inline def apply(anchorPage: Double, offset: Offset): AnchorPage = {
    val __obj = js.Dynamic.literal(anchorPage = anchorPage.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorPage]
  }
  
  extension [Self <: AnchorPage](x: Self) {
    
    inline def setAnchorPage(value: Double): Self = StObject.set(x, "anchorPage", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
