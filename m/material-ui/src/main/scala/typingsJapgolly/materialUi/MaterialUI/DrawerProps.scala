package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawerProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var containerClassName: js.UndefOr[String] = js.undefined
  
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var disableSwipeToOpen: js.UndefOr[Boolean] = js.undefined
  
  var docked: js.UndefOr[Boolean] = js.undefined
  
  var onRequestChange: js.UndefOr[js.Function2[/* opening */ Boolean, /* reason */ String, Unit]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var openSecondary: js.UndefOr[Boolean] = js.undefined
  
  var overlayClassName: js.UndefOr[String] = js.undefined
  
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var swipeAreaWidth: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var zDepth: js.UndefOr[Double] = js.undefined
}
object DrawerProps {
  
  inline def apply(): DrawerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerProps]
  }
  
  extension [Self <: DrawerProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
    
    inline def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setDisableSwipeToOpen(value: Boolean): Self = StObject.set(x, "disableSwipeToOpen", value.asInstanceOf[js.Any])
    
    inline def setDisableSwipeToOpenUndefined: Self = StObject.set(x, "disableSwipeToOpen", js.undefined)
    
    inline def setDocked(value: Boolean): Self = StObject.set(x, "docked", value.asInstanceOf[js.Any])
    
    inline def setDockedUndefined: Self = StObject.set(x, "docked", js.undefined)
    
    inline def setOnRequestChange(value: (/* opening */ Boolean, /* reason */ String) => Callback): Self = StObject.set(x, "onRequestChange", js.Any.fromFunction2((t0: /* opening */ Boolean, t1: /* reason */ String) => (value(t0, t1)).runNow()))
    
    inline def setOnRequestChangeUndefined: Self = StObject.set(x, "onRequestChange", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenSecondary(value: Boolean): Self = StObject.set(x, "openSecondary", value.asInstanceOf[js.Any])
    
    inline def setOpenSecondaryUndefined: Self = StObject.set(x, "openSecondary", js.undefined)
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
    
    inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
    
    inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSwipeAreaWidth(value: Double): Self = StObject.set(x, "swipeAreaWidth", value.asInstanceOf[js.Any])
    
    inline def setSwipeAreaWidthUndefined: Self = StObject.set(x, "swipeAreaWidth", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
    
    inline def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
  }
}
