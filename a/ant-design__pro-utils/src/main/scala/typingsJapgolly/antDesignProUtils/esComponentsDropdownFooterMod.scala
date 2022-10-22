package typingsJapgolly.antDesignProUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignProUtils.antDesignProUtilsBooleans.`false`
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsDropdownFooterMod {
  
  @JSImport("@ant-design/pro-utils/es/components/DropdownFooter", "DropdownFooter")
  @js.native
  val DropdownFooter: FC[DropdownFooterProps] = js.native
  
  trait DropdownFooterProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var footerRender: js.UndefOr[LightFilterFooterRender] = js.undefined
    
    var onClear: js.UndefOr[OnClick] = js.undefined
    
    var onConfirm: js.UndefOr[OnClick] = js.undefined
  }
  object DropdownFooterProps {
    
    inline def apply(): DropdownFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownFooterProps]
    }
    
    extension [Self <: DropdownFooterProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFooterRender(value: LightFilterFooterRender): Self = StObject.set(x, "footerRender", value.asInstanceOf[js.Any])
      
      inline def setFooterRenderFunction2(
        value: (/* onConfirm */ js.UndefOr[
              js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]], Unit]
            ], /* onClear */ js.UndefOr[
              js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]], Unit]
            ]) => typingsJapgolly.react.mod.global.JSX.Element | `false`
      ): Self = StObject.set(x, "footerRender", js.Any.fromFunction2(value))
      
      inline def setFooterRenderUndefined: Self = StObject.set(x, "footerRender", js.undefined)
      
      inline def setOnClear(value: /* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]] => Callback): Self = StObject.set(x, "onClear", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]]) => value(t0).runNow()))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnConfirm(value: /* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]] => Callback): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]]) => value(t0).runNow()))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    }
  }
  
  type LightFilterFooterRender = (js.Function2[
    /* onConfirm */ js.UndefOr[
      js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]], Unit]
    ], 
    /* onClear */ js.UndefOr[
      js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]], Unit]
    ], 
    typingsJapgolly.react.mod.global.JSX.Element | `false`
  ]) | `false`
  
  type OnClick = js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]], Unit]
}
