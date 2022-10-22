package typingsJapgolly.reactNativeShare.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareSheetProps extends StObject {
  
  var children: Node
  
  def onCancel(): Unit
  
  var overlayStyle: js.UndefOr[StyleProp[ViewProps]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewProps]] = js.undefined
  
  var visible: Boolean
}
object ShareSheetProps {
  
  inline def apply(onCancel: Callback, visible: Boolean): ShareSheetProps = {
    val __obj = js.Dynamic.literal(onCancel = onCancel.toJsFn, visible = visible.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[ShareSheetProps]
  }
  
  extension [Self <: ShareSheetProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnCancel(value: Callback): Self = StObject.set(x, "onCancel", value.toJsFn)
    
    inline def setOverlayStyle(value: StyleProp[ViewProps]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
    
    inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewProps]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
