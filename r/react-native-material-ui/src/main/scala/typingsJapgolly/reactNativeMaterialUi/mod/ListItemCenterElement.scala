package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemCenterElement extends StObject {
  
  var primaryText: String | Element
  
  var secondaryText: js.UndefOr[String] = js.undefined
  
  var tertiaryText: js.UndefOr[String] = js.undefined
}
object ListItemCenterElement {
  
  inline def apply(primaryText: String | Element): ListItemCenterElement = {
    val __obj = js.Dynamic.literal(primaryText = primaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemCenterElement]
  }
  
  extension [Self <: ListItemCenterElement](x: Self) {
    
    inline def setPrimaryText(value: String | Element): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
    
    inline def setPrimaryTextVdomElement(value: VdomElement): Self = StObject.set(x, "primaryText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
    
    inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
    
    inline def setTertiaryText(value: String): Self = StObject.set(x, "tertiaryText", value.asInstanceOf[js.Any])
    
    inline def setTertiaryTextUndefined: Self = StObject.set(x, "tertiaryText", js.undefined)
  }
}
