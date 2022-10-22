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
import typingsJapgolly.antDesignProUtils.esComponentsDropdownFooterMod.DropdownFooterProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsFilterDropdownMod {
  
  @JSImport("@ant-design/pro-utils/es/components/FilterDropdown", "FilterDropdown")
  @js.native
  val FilterDropdown: FC[DropdownProps] = js.native
  
  trait DropdownProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[DropdownFooterProps] = js.undefined
    
    var footerRender: js.UndefOr[FooterRender] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    /**
      * @deprecated use onOpenChange replace
      */
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    /**
      * @deprecated use open replace
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownProps {
    
    inline def apply(): DropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownProps]
    }
    
    extension [Self <: DropdownProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFooter(value: DropdownFooterProps): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterRender(value: FooterRender): Self = StObject.set(x, "footerRender", value.asInstanceOf[js.Any])
      
      inline def setFooterRenderFunction2(
        value: (/* onConfirm */ js.UndefOr[
              js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]], Unit]
            ], /* onClear */ js.UndefOr[
              js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]], Unit]
            ]) => typingsJapgolly.react.mod.global.JSX.Element | `false`
      ): Self = StObject.set(x, "footerRender", js.Any.fromFunction2(value))
      
      inline def setFooterRenderUndefined: Self = StObject.set(x, "footerRender", js.undefined)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnOpenChange(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type FooterRender = (js.Function2[
    /* onConfirm */ js.UndefOr[
      js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]], Unit]
    ], 
    /* onClear */ js.UndefOr[
      js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[org.scalajs.dom.Element]], Unit]
    ], 
    typingsJapgolly.react.mod.global.JSX.Element | `false`
  ]) | `false`
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.topLeft
    - typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.topCenter
    - typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.topRight
    - typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.bottomLeft
    - typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.bottomCenter
    - typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.bottomRight
  */
  trait Placement extends StObject
}
