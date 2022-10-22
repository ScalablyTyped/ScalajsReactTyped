package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuItemHorizontalMenuItemMod.ExpandSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsHorizontalMenuHorizontalMenuLayoutCalculatePositioningMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-layout/calculatePositioning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculatePositioning(hasExpandSizeLayoutRefRootMenuRefMaxOverflowWidthMenuItemRef: CalculatePositioningProps): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("calculatePositioning")(hasExpandSizeLayoutRefRootMenuRefMaxOverflowWidthMenuItemRef.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  trait CalculatePositioningProps extends StObject {
    
    var expandSize: ExpandSize
    
    var layoutRef: RefHandle[HTMLDivElement]
    
    var maxOverflowWidth: Double
    
    var menuItemRef: RefHandle[HTMLLIElement]
    
    var rootMenuRef: RefHandle[HTMLUListElement]
  }
  object CalculatePositioningProps {
    
    inline def apply(
      expandSize: ExpandSize,
      layoutRef: RefHandle[HTMLDivElement],
      maxOverflowWidth: Double,
      menuItemRef: RefHandle[HTMLLIElement],
      rootMenuRef: RefHandle[HTMLUListElement]
    ): CalculatePositioningProps = {
      val __obj = js.Dynamic.literal(expandSize = expandSize.asInstanceOf[js.Any], layoutRef = layoutRef.asInstanceOf[js.Any], maxOverflowWidth = maxOverflowWidth.asInstanceOf[js.Any], menuItemRef = menuItemRef.asInstanceOf[js.Any], rootMenuRef = rootMenuRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalculatePositioningProps]
    }
    
    extension [Self <: CalculatePositioningProps](x: Self) {
      
      inline def setExpandSize(value: ExpandSize): Self = StObject.set(x, "expandSize", value.asInstanceOf[js.Any])
      
      inline def setLayoutRef(value: RefHandle[HTMLDivElement]): Self = StObject.set(x, "layoutRef", value.asInstanceOf[js.Any])
      
      inline def setMaxOverflowWidth(value: Double): Self = StObject.set(x, "maxOverflowWidth", value.asInstanceOf[js.Any])
      
      inline def setMenuItemRef(value: RefHandle[HTMLLIElement]): Self = StObject.set(x, "menuItemRef", value.asInstanceOf[js.Any])
      
      inline def setRootMenuRef(value: RefHandle[HTMLUListElement]): Self = StObject.set(x, "rootMenuRef", value.asInstanceOf[js.Any])
    }
  }
}
