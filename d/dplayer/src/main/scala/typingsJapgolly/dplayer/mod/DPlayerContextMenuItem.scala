package typingsJapgolly.dplayer.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DPlayerContextMenuItem extends StObject {
  
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var link: js.UndefOr[String] = js.undefined
  
  var text: String
}
object DPlayerContextMenuItem {
  
  inline def apply(text: String): DPlayerContextMenuItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerContextMenuItem]
  }
  
  extension [Self <: DPlayerContextMenuItem](x: Self) {
    
    inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
