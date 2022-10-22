package typingsJapgolly.muicss.reactMod

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsProps
  extends StObject
     with HTMLAttributes[HTMLDivElement] {
  
  var defaultSelectedIndex: js.UndefOr[Double] = js.undefined
  
  var justified: js.UndefOr[Boolean] = js.undefined
  
  var selectedIndex: js.UndefOr[Double] = js.undefined
}
object TabsProps {
  
  inline def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  
  extension [Self <: TabsProps](x: Self) {
    
    inline def setDefaultSelectedIndex(value: Double): Self = StObject.set(x, "defaultSelectedIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultSelectedIndexUndefined: Self = StObject.set(x, "defaultSelectedIndex", js.undefined)
    
    inline def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
    
    inline def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
  }
}
