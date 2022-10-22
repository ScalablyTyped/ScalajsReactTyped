package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.anon.PickMenuPropsmode
import typingsJapgolly.rcMenu.esInterfaceMod.MenuMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMenuOverrideContextMod {
  
  trait OverrideContextProps extends StObject {
    
    var expandIcon: js.UndefOr[Node] = js.undefined
    
    var mode: js.UndefOr[MenuMode] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var validator: js.UndefOr[js.Function1[/* menuProps */ PickMenuPropsmode, Unit]] = js.undefined
  }
  object OverrideContextProps {
    
    inline def apply(): OverrideContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverrideContextProps]
    }
    
    extension [Self <: OverrideContextProps](x: Self) {
      
      inline def setExpandIcon(value: VdomNode): Self = StObject.set(x, "expandIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExpandIconNull: Self = StObject.set(x, "expandIcon", null)
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setExpandIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "expandIcon", js.Array(value*))
      
      inline def setExpandIconVdomElement(value: VdomElement): Self = StObject.set(x, "expandIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setValidator(value: /* menuProps */ PickMenuPropsmode => Callback): Self = StObject.set(x, "validator", js.Any.fromFunction1((t0: /* menuProps */ PickMenuPropsmode) => value(t0).runNow()))
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
}
