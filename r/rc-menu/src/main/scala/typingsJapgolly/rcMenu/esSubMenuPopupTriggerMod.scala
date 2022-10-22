package typingsJapgolly.rcMenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rcMenu.esInterfaceMod.MenuMode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSubMenuPopupTriggerMod {
  
  @JSImport("rc-menu/es/SubMenu/PopupTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasPrefixClsVisibleChildrenPopupPopupClassNamePopupOffsetDisabledModeOnVisibleChange: PopupTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsVisibleChildrenPopupPopupClassNamePopupOffsetDisabledModeOnVisibleChange.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait PopupTriggerProps extends StObject {
    
    var children: japgolly.scalajs.react.facade.React.Element
    
    var disabled: Boolean
    
    var mode: MenuMode
    
    def onVisibleChange(visible: Boolean): Unit
    
    var popup: Node
    
    var popupClassName: js.UndefOr[String] = js.undefined
    
    var popupOffset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var prefixCls: String
    
    var visible: Boolean
  }
  object PopupTriggerProps {
    
    inline def apply(
      children: VdomElement,
      disabled: Boolean,
      mode: MenuMode,
      onVisibleChange: Boolean => Callback,
      prefixCls: String,
      visible: Boolean
    ): PopupTriggerProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onVisibleChange = js.Any.fromFunction1((t0: Boolean) => onVisibleChange(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], popup = null)
      __obj.asInstanceOf[PopupTriggerProps]
    }
    
    extension [Self <: PopupTriggerProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setOnVisibleChange(value: Boolean => Callback): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setPopup(value: VdomNode): Self = StObject.set(x, "popup", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      inline def setPopupNull: Self = StObject.set(x, "popup", null)
      
      inline def setPopupOffset(value: js.Array[Double]): Self = StObject.set(x, "popupOffset", value.asInstanceOf[js.Any])
      
      inline def setPopupOffsetUndefined: Self = StObject.set(x, "popupOffset", js.undefined)
      
      inline def setPopupOffsetVarargs(value: Double*): Self = StObject.set(x, "popupOffset", js.Array(value*))
      
      inline def setPopupVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "popup", js.Array(value*))
      
      inline def setPopupVdomElement(value: VdomElement): Self = StObject.set(x, "popup", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
