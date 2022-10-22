package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSizingMediaOnlyMod {
  
  @JSImport("@react-md/utils/types/sizing/MediaOnly", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DesktopOnly(hasChildrenFallback: MediaOnlyProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("DesktopOnly")(hasChildrenFallback.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def MobileOnly(hasChildrenFallback: MediaOnlyProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("MobileOnly")(hasChildrenFallback.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def PhoneOnly(hasChildrenFallback: MediaOnlyProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("PhoneOnly")(hasChildrenFallback.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def TabletOnly(hasChildrenFallback: MediaOnlyProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("TabletOnly")(hasChildrenFallback.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait MediaOnlyProps extends StObject {
    
    /**
      * The children to display.
      */
    var children: Element | Null
    
    /**
      * An optional fallback element to show when the media queries do not match.
      */
    var fallback: js.UndefOr[Element | Null] = js.undefined
  }
  object MediaOnlyProps {
    
    inline def apply(): MediaOnlyProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[MediaOnlyProps]
    }
    
    extension [Self <: MediaOnlyProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setFallback(value: VdomElement): Self = StObject.set(x, "fallback", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
