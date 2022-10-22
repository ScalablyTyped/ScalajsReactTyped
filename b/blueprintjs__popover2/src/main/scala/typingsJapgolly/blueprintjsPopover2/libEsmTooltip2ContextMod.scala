package typingsJapgolly.blueprintjsPopover2

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmTooltip2ContextMod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/tooltip2Context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/popover2/lib/esm/tooltip2Context", "Tooltip2Context")
  @js.native
  val Tooltip2Context: Context[js.Tuple2[Tooltip2ContextState, Dispatch[Tooltip2Action]]] = js.native
  
  inline def Tooltip2Provider(hasChildrenForceDisable: Tooltip2ProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Tooltip2Provider")(hasChildrenForceDisable.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blueprintjsPopover2.anon.Type
    - typingsJapgolly.blueprintjsPopover2.anon.`0`
  */
  trait Tooltip2Action extends StObject
  object Tooltip2Action {
    
    inline def `0`(): typingsJapgolly.blueprintjsPopover2.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("RESET_DISABLED_STATE")
      __obj.asInstanceOf[typingsJapgolly.blueprintjsPopover2.anon.`0`]
    }
    
    inline def Type(): typingsJapgolly.blueprintjsPopover2.anon.Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("FORCE_DISABLED_STATE")
      __obj.asInstanceOf[typingsJapgolly.blueprintjsPopover2.anon.Type]
    }
  }
  
  trait Tooltip2ContextState extends StObject {
    
    var forceDisabled: js.UndefOr[Boolean] = js.undefined
  }
  object Tooltip2ContextState {
    
    inline def apply(): Tooltip2ContextState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltip2ContextState]
    }
    
    extension [Self <: Tooltip2ContextState](x: Self) {
      
      inline def setForceDisabled(value: Boolean): Self = StObject.set(x, "forceDisabled", value.asInstanceOf[js.Any])
      
      inline def setForceDisabledUndefined: Self = StObject.set(x, "forceDisabled", js.undefined)
    }
  }
  
  trait Tooltip2ProviderProps extends StObject {
    
    var children: Node | (js.Function1[/* ctxState */ Tooltip2ContextState, Node])
    
    var forceDisable: js.UndefOr[Boolean] = js.undefined
  }
  object Tooltip2ProviderProps {
    
    inline def apply(): Tooltip2ProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[Tooltip2ProviderProps]
    }
    
    extension [Self <: Tooltip2ProviderProps](x: Self) {
      
      inline def setChildren(value: Node | (js.Function1[/* ctxState */ Tooltip2ContextState, Node])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* ctxState */ Tooltip2ContextState => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setForceDisable(value: Boolean): Self = StObject.set(x, "forceDisable", value.asInstanceOf[js.Any])
      
      inline def setForceDisableUndefined: Self = StObject.set(x, "forceDisable", js.undefined)
    }
  }
}
